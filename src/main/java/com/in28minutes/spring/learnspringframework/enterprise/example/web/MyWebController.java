package com.in28minutes.spring.learnspringframework.enterprise.example.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
    @Autowired
    private BusinessService bussinService;
    public long returnValueFromBusinessService(){
        return bussinService.calculateSum();
    }
}

