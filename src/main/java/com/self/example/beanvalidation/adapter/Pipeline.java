package com.self.example.beanvalidation.adapter;

public interface Pipeline {

    Pipeline fireTaskReceived();

    Pipeline fireTaskFiltered();

    Pipeline fireTaskExecuted();

    Pipeline fireAfterCompletion();
}
