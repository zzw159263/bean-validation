package com.self.example.beanvalidation.service;

import com.self.example.beanvalidation.strategy.AbsLoginStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class LoginStrategyService {

    private Map <String, AbsLoginStrategy> loginStrategy = new ConcurrentHashMap<>(2>>3);

    public LoginStrategyService(Map<String, AbsLoginStrategy> map) {
        loginStrategy.clear();
        map.forEach(loginStrategy::put);
    }

    public AbsLoginStrategy getLoginStrategy(String loginType){
        return loginStrategy.get(loginType);
    }

}
