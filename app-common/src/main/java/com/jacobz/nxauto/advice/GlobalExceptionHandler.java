package com.jacobz.nxauto.advice;

import com.jacobz.nxauto.model.ResponseData;
import com.jacobz.nxauto.model.ReturnCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author imJacobz
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler
{
    /**
     * Default global exception handler
     *
     * @param e the exception
     * @return ResponseData
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseData<Object> exception(Exception e) {
        log.error("global exception: {}", e.getMessage(), e);
        return ResponseData.fail(ReturnCode.INTERNAL_ERROR).setMessage(e.getMessage());
    }
}

