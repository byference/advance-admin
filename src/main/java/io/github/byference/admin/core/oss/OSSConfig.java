package io.github.byference.admin.core.oss;

import io.github.byference.admin.constant.SystemCommonEnum;
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

    private final OSSProperties ossProperties;

    public OSSConfig(OSSProperties ossProperties) {
        this.ossProperties = ossProperties;
    }

    @Bean
    public MinioClient minioClient() {
        MinioClient minioClient;
        try {
            minioClient = new MinioClient(ossProperties.getUrl(), ossProperties.getAccessKey(), ossProperties.getSecretKey());
        } catch (Exception e) {
            log.error("initialize MinioClient error, path: " + ossProperties.getUrl(), e);
            throw new AdvanceAdminException(SystemCommonEnum.MINIO_CLIENT_INITIALIZE_ERROR, e);
        }
        return minioClient;
    }

    @Bean
    public OSSService ossService() {
        return new OSSService(minioClient());
    }
}
