package io.github.byference.admin.core;

import io.github.byference.admin.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * GlobalExceptionHandler
 *
 * @author byference
 * @since 2019-11-05
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<String> defaultExceptionHandler(Exception exception) {
        log.error("defaultExceptionHandler: ", exception);
        return Result.fail(exception.getMessage());
    }


    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<String> bindExceptionHandler(BindException bindException) {
        BindingResult bindingResult = bindException.getBindingResult();
        String errorMessage = null;
        if (bindingResult.hasErrors()) {
            errorMessage = bindingResult.getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(","));
        }
        return Result.fail(errorMessage);
    }
}
