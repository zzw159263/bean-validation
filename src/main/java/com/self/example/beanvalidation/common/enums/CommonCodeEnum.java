package com.self.example.beanvalidation.common.enums;

public enum CommonCodeEnum implements ResultCode{
    SUCCESS(200, true, "成功"),
    FAILED(500, false, "失败"),
    VALID_FAILED(422, false, "参数校验失败")
    ;

    private int code;
    private boolean success;
    private String message;

    CommonCodeEnum(int code, boolean success, String message) {
        this.code = code;
        this.success = success;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
