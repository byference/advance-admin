package io.github.byference.admin.core.oss;

import io.github.byference.admin.constant.AdvanceAdminConst;
import io.github.byference.admin.constant.SystemCommonEnum;
import io.github.byference.admin.exception.AdvanceAdminException;
import io.minio.MinioClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * OSSService
 *
 * @author byference
 * @since 2020-03-03
 */
public class OSSService {

    @Value("${spring.profiles.active:dev}")
    private String profile;

    private final MinioClient minioClient;

    public OSSService(MinioClient minioClient) {
        this.minioClient = minioClient;
    }

    /**
     * Removes an object from a bucket.
     * @param bucketName Bucket name.
     * @param objectName Object name in the bucket.
     */
    public void removeObject(String bucketName, String objectName) {
        try {
            minioClient.removeObject(bucketName, objectName);
        } catch (Exception e) {
            throw new AdvanceAdminException(SystemCommonEnum.OSS_REMOVE_OBJECT_ERROR, e);
        }
    }

    /**
     * Removes multiple objects from a bucket. objects removal lazily,
     * its required o iterate the returned Iterable.
     *
     * @param bucketName Bucket name.
     * @param objectNames List of Object names in the bucket.
     */
    public void removeObjects(String bucketName, List<String> objectNames) {
        minioClient.removeObjects(bucketName, objectNames);
    }

    /**
     * Gets an entire object's data as {@link InputStream} in given bucket.
     * The InputStream must be closed after use else the connection will remain open.
     *
     * @param bucketName Bucket name.
     * @param objectName Object name in the bucket.
     * @return {@link InputStream} containing the object data.
     */
    public InputStream getObject(String bucketName, String objectName) {

        InputStream inputStream;
        try {
            // Check whether the object exists using statObject().  If the object not found,
            // statObject() throws an exception.  It means that the object exists when statObject()
            // execution is successful.
            minioClient.statObject(bucketName, objectName);
            // Get input stream to have content of 'bucketName' from 'objectName'
            inputStream = minioClient.getObject(bucketName, objectName);
        } catch (Exception e) {
            throw new AdvanceAdminException(SystemCommonEnum.OSS_GET_OBJECT_ERROR, e);
        }
        return inputStream;
    }

    /**
     * upload file to oss
     *
     * @param file {@link MultipartFile}
     * @param bucketName single letter, not allowed including <code>/</code>
     * @return bucketName + objectName
     */
    public String putObject(MultipartFile file, String bucketName) {

        // handle bucket name
        bucketName = handleBucketName(bucketName);

        // handle object name
        String objectName = String.format("%s/%s/%s", profile, generatePathByTime(), generateFileName(file.getOriginalFilename()));

        try {
            if (!minioClient.bucketExists(bucketName)) {
                minioClient.makeBucket(bucketName);
            }
            minioClient.putObject(bucketName, objectName, file.getInputStream(), Long.valueOf(file.getInputStream().available()),
                    null, null, file.getContentType());
        } catch (Exception e) {
            throw new AdvanceAdminException(SystemCommonEnum.OSS_PUT_OBJECT_ERROR, e);
        }
        return String.format("%s/%s", bucketName, objectName);
    }

    /**
     * generate file path by time
     */
    private String generatePathByTime() {
        LocalDateTime now = LocalDateTime.now();
        return String.format("%s/%s", now.getYear(), now.getMonthValue());
    }

    /**
     * check and handle bucket name
     *
     * @param bucketName source bucketName
     * @return bucketName
     */
    private String handleBucketName(String bucketName) {
        if (StringUtils.isBlank(bucketName)) {
            return AdvanceAdminConst.DEFAULT_PUBLIC_BUCKET;
        }
        if (StringUtils.contains(bucketName, "/")) {
            throw new AdvanceAdminException("illegal bucket name [ " + bucketName + " ]");
        }
        return bucketName;
    }

    /**
     * generateFileName
     */
    private String generateFileName(String fileName) {
        return UUID.randomUUID().toString().replaceAll("-", "") + "_" + fileName;
    }

}
