package com.self.example.beanvalidation.common.request;

import com.self.example.beanvalidation.domain.valid.PasswordChecks;
import com.self.example.beanvalidation.domain.valid.UsernameChecks;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SysLoginForm extends BaseRequest {
    @NotBlank(groups = UsernameChecks.class)
    @Size(max = 10, min = 2)
    private String username;
    @NotBlank(groups = PasswordChecks.class)
    private String password;
    private String captcha;
    private String uuid;
    private String source;
}
