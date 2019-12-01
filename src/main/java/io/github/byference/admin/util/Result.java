package io.github.byference.admin.util;

import io.github.byference.admin.constant.ResponseCodeConst;
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
public class Result<T> {

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
        return new Result<>(ResponseCodeConst.SUCCESS, "", data);
    }

    public static <T> Result<T> fail() {
        return fail(null);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(ResponseCodeConst.FAIL, message, null);
    }

}
