package com.self.example.beanvalidation.listener;

import com.self.example.beanvalidation.listener.event.LoginEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @EventListener
    public void sendEmail(LoginEvent event){
        //执行消息逻辑
        log.info("发送用户登录成功消息（何时何地，通过什么方式登录）");
    }
}
