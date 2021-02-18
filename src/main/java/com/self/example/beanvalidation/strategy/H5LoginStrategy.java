package com.self.example.beanvalidation.strategy;

import com.self.example.beanvalidation.common.request.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("H5")
@Slf4j
public class H5LoginStrategy extends AbsLoginStrategy{

    @Override
    public Map<String, Object> doLogin(Request request) {
        log.info("H5登录逻辑");
        return null;
    }
}
