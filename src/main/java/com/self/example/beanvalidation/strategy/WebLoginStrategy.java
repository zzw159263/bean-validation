package com.self.example.beanvalidation.strategy;

import com.self.example.beanvalidation.common.request.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component("SYSTEM")
public class WebLoginStrategy extends AbsLoginStrategy {
    @Override
    public Map<String, Object> doLogin(Request request) {
        log.info("web登录");
        return null;
    }
}
