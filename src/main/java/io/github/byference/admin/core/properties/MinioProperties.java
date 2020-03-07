package io.github.byference.admin.core.properties;

import lombok.Data;

/**
 * MinioProperties
 *
 * @author byference
 * @since 2020-03-03
 */
@Data
public class MinioProperties {

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
