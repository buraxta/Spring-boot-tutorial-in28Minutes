package com.buraxta.learnspringframework.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class main {
    public static void main(String[] args) {
        var context = new  AnnotationConfigApplicationContext(main.class);
        System.out.println(context.getBean(Business.class).findMax());
    }
}

