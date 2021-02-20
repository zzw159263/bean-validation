package com.self.example.beanvalidation.controller;

import com.self.example.beanvalidation.common.request.SysLoginForm;
import com.self.example.beanvalidation.domain.valid.LoginChecks;
import com.self.example.beanvalidation.listener.event.LoginEvent;
import com.self.example.beanvalidation.service.LoginStrategyService;
import com.self.example.beanvalidation.strategy.AbsLoginStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 登录项管操作
 */

@RestController
@RequestMapping("/sys")
@Slf4j
@Validated
public class SysLoginController {

    @Autowired
    private LoginStrategyService loginService;

    @Autowired
    private ApplicationContext applicationContext;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody @Validated(LoginChecks.class) SysLoginForm form){

        AbsLoginStrategy loginStrategy = loginService.getLoginStrategy(form.getSource());
        loginStrategy.doLogin(form);

        applicationContext.publishEvent(new LoginEvent(this, form.getUsername()));
        return null;
    }
}
