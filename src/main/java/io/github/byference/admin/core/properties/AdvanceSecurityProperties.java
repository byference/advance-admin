package io.github.byference.admin.core.properties;

import lombok.Data;

/**
 * AdvanceSecurityProperties
 *
 * @author byference
 * @since 2020-03-05
 */
@Data
public class AdvanceSecurityProperties {

    /**
     * permit urls
     */
    private String[] permitUrls = {};

}
