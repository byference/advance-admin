package io.github.byference.admin.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SystemCommonEnum
 * [0 ~ 20000)
 *
 * @author byference
 * @since 2020-03-02
 */
@AllArgsConstructor
@Getter
public enum SystemErrorEnum implements EnumVisitor<Integer> {

    FAIL(0, "fail"),
    SUCCESS(1, "success"),
    MINIO_CLIENT_INITIALIZE_ERROR(100, "minio client initialize error"),
    OSS_REMOVE_OBJECT_ERROR(101, "oss remove object error"),
    OSS_GET_OBJECT_ERROR(102, "oss get object error"),
    OSS_PUT_OBJECT_ERROR(103, "oss put object error")
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
