package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(sportsConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        coach.getFortune();
        coach.getDailyWorkout();
    }
}
