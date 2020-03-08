package io.github.byference.admin.core.oss;

import io.github.byference.admin.constant.SystemErrorEnum;
import io.github.byference.admin.core.properties.AdvanceAdminProperties;
import io.github.byference.admin.core.properties.MinioProperties;
import io.github.byference.admin.exception.AdvanceAdminException;
import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OSSConfig
 *
 * @author byference
 * @since 2020-03-03
 */
@Slf4j
@Configuration
@ConditionalOnProperty(value = "advance.minio.enable", havingValue = "true")
public class OSSConfig {

    private final AdvanceAdminProperties advanceAdminProperties;

    public OSSConfig(AdvanceAdminProperties advanceAdminProperties) {
        this.advanceAdminProperties = advanceAdminProperties;
    }


    @Bean
    public MinioClient minioClient() {
        MinioProperties minio = advanceAdminProperties.getMinio();
        MinioClient minioClient;
        try {
            minioClient = new MinioClient(minio.getUrl(), minio.getAccessKey(), minio.getSecretKey());
        } catch (Exception e) {
            log.error("initialize MinioClient error, path: " + minio.getUrl(), e);
            throw new AdvanceAdminException(SystemErrorEnum.MINIO_CLIENT_INITIALIZE_ERROR, e);
        }
        return minioClient;
    }

    @Bean
    public OSSService ossService() {
        return new OSSService(minioClient());
    }
}
