package com.self.example.beanvalidation.strategy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Lazy
public class LoginService {

    private Map<String, AbsLoginStrategy> loginStrategyMap = new ConcurrentHashMap<>();

    public LoginService(Map<String, AbsLoginStrategy> map) {
        map.clear();
        map.forEach(loginStrategyMap::put);
    }

    public AbsLoginStrategy getLoginStrategy(String key){
        return loginStrategyMap.get(key);
    }

}
