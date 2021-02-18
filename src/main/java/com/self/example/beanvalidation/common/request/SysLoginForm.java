package com.self.example.beanvalidation.common.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SysLoginForm extends BaseRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String captcha;
    @NotBlank
    private String uuid;
    @NotBlank
    private String source;
}
