package io.github.byference.admin.core.oss;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * OSSProperties
 *
 * @author byference
 * @since 2020-03-03
 */
@Data
@EnableConfigurationProperties(OSSProperties.class)
@ConfigurationProperties(prefix = "advance.minio")
public class OSSProperties {

    /**
     * enable minio oss
     */
    private boolean enable;

    /**
     * oss url, eg: http://127.0.0.1:9000
     */
    private String url;

    /**
     * username
     */
    private String accessKey;

    /**
     * password
     */
    private String secretKey;

}
