package com.self.example.beanvalidation.common.exception;

import com.self.example.beanvalidation.common.enums.CommonCodeEnum;
import com.self.example.beanvalidation.common.response.BaseResponse;
import com.self.example.beanvalidation.common.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = {"com.self.example.beanvalidation.controller",
                                  "com.self.example.beanvalidation.service"})
@Slf4j
public class ValidExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseBody
    public Response validExceptionHandler(MethodArgumentNotValidException e) {
        Map<String, String> result = new HashMap<>(1<<3);
        e.getBindingResult().getFieldErrors().forEach( error ->
            result.put(error.getField(), error.getDefaultMessage())
        );
        return new BaseResponse<>(CommonCodeEnum.VALID_FAILED, result);
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseBody
    public Response validExceptionHandler(ConstraintViolationException e) {
        Map<String, String> result = new HashMap<>(1<<3);
        e.getConstraintViolations().forEach( error -> {
            String message = error.getMessage();
            String propertyPath = error.getPropertyPath().toString();
            result.put(propertyPath, message);
        });
        return new BaseResponse<>(CommonCodeEnum.VALID_FAILED, result);
    }

}
