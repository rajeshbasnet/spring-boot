package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is rest Fortune Service";
    }
}
