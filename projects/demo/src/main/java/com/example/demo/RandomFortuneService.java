package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService  implements FortuneService{
    @Override
    public String getFortune() {
        return "This is random Fortune Service";
    }
}
