package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    FortuneService happyFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }

    public void getDailyWorkout() {
        System.out.println("This is swimming daily workout method");
    }

    public void getFortune() {
        System.out.println(happyFortuneService.getFortune());
        System.out.println("Email : " + email);
        System.out.println("Team : " + team);
    }
}
