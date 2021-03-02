package com.self.example.beanvalidation.service;

import com.self.example.beanvalidation.common.request.SysLoginForm;
import com.self.example.beanvalidation.strategy.AbsLoginStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public interface ILoginService {
    public void doLogin(SysLoginForm form);
}
