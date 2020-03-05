package io.github.byference.admin.security.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * AdvanceSecurityProperties
 *
 * @author byference
 * @since 2020-03-05
 */
@Data
@ConfigurationProperties(prefix = "advance.security")
public class AdvanceSecurityProperties {

    /**
     * permit urls
     */
    private String[] permitUrls = {};

}
