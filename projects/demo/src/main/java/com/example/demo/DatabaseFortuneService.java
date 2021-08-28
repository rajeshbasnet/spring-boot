package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is Database Fortune Service";
    }
}
