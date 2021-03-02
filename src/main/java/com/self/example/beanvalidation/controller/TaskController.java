package com.self.example.beanvalidation.controller;

import com.self.example.beanvalidation.service.impl.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/do")
    public void taskTest() {
        applicationService.mockedClient();
    }
}
