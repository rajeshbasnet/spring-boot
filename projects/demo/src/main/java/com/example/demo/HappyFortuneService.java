package com.example.demo;

import org.springframework.stereotype.Component;

@Component("happyFortune")
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is Happy fortune Service";
    }
}
