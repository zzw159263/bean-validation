package com.self.example.beanvalidation.service.impl;

import com.self.example.beanvalidation.adapter.DefaultPipeline;
import com.self.example.beanvalidation.adapter.Pipeline;
import com.self.example.beanvalidation.common.request.BaseRequest;
import com.self.example.beanvalidation.common.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationContext context;

    public void mockedClient() {
        BaseRequest request = new BaseRequest();
        Pipeline pipeline = newPipeline(request);
        try {
            pipeline.fireTaskReceived();
            pipeline.fireTaskFiltered();
            pipeline.fireTaskExecuted();
        }finally {
            pipeline.fireAfterCompletion();
        }
    }

    private Pipeline newPipeline(Request request){
        return context.getBean(DefaultPipeline.class, request);
    }
}
