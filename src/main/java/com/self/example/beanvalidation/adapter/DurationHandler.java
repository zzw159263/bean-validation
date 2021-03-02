package com.self.example.beanvalidation.adapter;

import com.self.example.beanvalidation.domain.po.TaskPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DurationHandler implements Handler {

    @Override
    public void filterTask(HandlerContext ctx, TaskPO task) {
        log.info("时效性校验");
        ctx.fireTaskFiltered(task);
    }
}
