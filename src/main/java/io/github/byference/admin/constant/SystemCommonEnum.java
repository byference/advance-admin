package io.github.byference.admin.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SystemCommonEnum
 *
 * @author byference
 * @since 2020-03-02
 */
@AllArgsConstructor
@Getter
public enum SystemCommonEnum implements EnumVisitor<Integer> {

    FAIL(0, "fail"),
    SUCCESS(1, "success")
    ;

    private Integer code;

    private String description;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
