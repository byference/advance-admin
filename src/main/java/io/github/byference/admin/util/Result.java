package io.github.byference.admin.util;

import io.github.byference.admin.constant.EnumVisitor;
import io.github.byference.admin.constant.SystemErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RestBody
 *
 * @author byference
 * @since 2019-11-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Result<T> {

    /**
     * response code
     */
    private int code;

    /**
     * response message
     */
    private String message;

    /**
     * response data
     */
    private T data;

    public static <T> Result<T> ok() {
        return ok(null);
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>(SystemErrorEnum.SUCCESS.getCode(), SystemErrorEnum.SUCCESS.getDescription(), data);
    }

    public static <T> Result<T> fail() {
        return fail(SystemErrorEnum.FAIL);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(SystemErrorEnum.FAIL.getCode(), message, null);
    }

    public static <T> Result<T> fail(EnumVisitor<Integer> enumVisitor) {
        return new Result<>(enumVisitor.getCode(), enumVisitor.getDescription(), null);
    }

}
