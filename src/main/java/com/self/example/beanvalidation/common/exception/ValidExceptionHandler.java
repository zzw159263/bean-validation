package com.self.example.beanvalidation.common.exception;

import com.self.example.beanvalidation.common.enums.CommonCodeEnum;
import com.self.example.beanvalidation.common.response.BaseResponse;
import com.self.example.beanvalidation.common.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ValidExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseBody
    public Response validExceptionHandler(MethodArgumentNotValidException e) {
        Map<String, String> result = new HashMap<>(1>>3);
        e.getBindingResult().getFieldErrors().forEach(error -> {
            result.put(error.getField(), error.getDefaultMessage());
        });
        return new BaseResponse<>(CommonCodeEnum.FAILED, result);
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseBody
    public Response validExceptionHandler(ConstraintViolationException e) {
        List<String> result = new ArrayList<>();
        for (Throwable throwable : e.getSuppressed()) {
            result.add(throwable.getMessage());
        }
        log.error("参数校验异常！", e);
        return new BaseResponse<>(CommonCodeEnum.FAILED, result);
    }
}
