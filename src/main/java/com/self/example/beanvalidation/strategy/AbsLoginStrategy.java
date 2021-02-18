package com.self.example.beanvalidation.strategy;

import com.self.example.beanvalidation.common.request.Request;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public abstract class AbsLoginStrategy {


    public abstract Map<String,Object> doLogin(Request request);


}
