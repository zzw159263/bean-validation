package com.self.example.beanvalidation.listener;

import com.self.example.beanvalidation.listener.event.LoginEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 推荐逻辑
 */
@Slf4j
@Component
public class RecommendListener {

    @Async
    @EventListener
    public void itemRecommend(LoginEvent event){
        //执行推荐逻辑
        log.info("推荐商品");
    }
}
