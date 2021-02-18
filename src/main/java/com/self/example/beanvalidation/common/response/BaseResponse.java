package com.self.example.beanvalidation.common.response;

import com.self.example.beanvalidation.common.enums.CommonCodeEnum;
import com.self.example.beanvalidation.common.enums.ResultCode;

public class BaseResponse<T> implements Response{

    private int code;
    private boolean success;
    private String message;
    private T data;

    public BaseResponse(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.success = resultCode.isSuccess();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public BaseResponse(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.success = resultCode.isSuccess();
        this.message = resultCode.getMessage();
    }

    public static BaseResponse<Void> SUCCESS(){
        return new BaseResponse<>(CommonCodeEnum.SUCCESS);
    }

    public static BaseResponse<Void> ERROR(){
        return new BaseResponse<>(CommonCodeEnum.FAILED);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
