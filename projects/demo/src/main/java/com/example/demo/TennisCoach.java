package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{

    private FortuneService service;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Autowired
    public TennisCoach(@Qualifier("happyFortune") FortuneService service) {
        this.service = service;
    }

    public void getFortune() {
        System.out.println(service.getFortune());
        System.out.println(email);
        System.out.println(team);
    }

    @Override
    public void getDailyWorkout() {
        System.out.println("I am working out bro");
    }

    public void initBean() {
        System.out.println("Been has been initialized");
    }

    public void destroyBean() {
        System.out.println("Been is getting Destroyed");
    }
}
