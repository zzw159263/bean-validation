package com.self.example.beanvalidation.adapter;

import com.self.example.beanvalidation.common.request.Request;
import com.self.example.beanvalidation.domain.po.TaskPO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HandlerContext {

    HandlerContext prev;
    HandlerContext next;
    Handler handler;

    private TaskPO task;

    public void fireTaskReceived(Request request) {
        invokeTaskReceived(next(), request);
    }

    static void invokeTaskReceived(HandlerContext ctx, Request request) {
        if (ctx != null) {
            try {
                ctx.handler().receiveTask(ctx, request);
            } catch (Exception e) {
                ctx.handler().exceptionCaught(ctx, e);
            }
        }
    }

    public void fireTaskFiltered(TaskPO task) {
        invokeTaskFiltered(next(), task);
    }

    static void invokeTaskFiltered(HandlerContext ctx, TaskPO task) {
        if (null != ctx) {
            try {
                ctx.handler().filterTask(ctx, task);
            } catch (Exception e) {
                ctx.handler().exceptionCaught(ctx, e);
            }
        }
    }

    public void fireTaskExecuted(TaskPO task) {
        invokeTaskExecuted(next(), task);
    }

    /**
     * 处理执行任务事件
     */
    static void invokeTaskExecuted(HandlerContext ctx, TaskPO task) {
        if (ctx != null) {
            try {
                ctx.handler().executeTask(ctx, task);
            } catch (Exception e) {
                ctx.handler().exceptionCaught(ctx, e);
            }
        }
    }

    public void fireAfterCompletion(HandlerContext ctx) {
        invokeAfterCompletion(next());
    }

    static void invokeAfterCompletion(HandlerContext ctx) {
        if (ctx != null) {
            ctx.handler().afterCompletion(ctx);
        }
    }

    private Handler handler() {
        return handler;
    }

    private HandlerContext next() {
        return next;
    }
}
