    package com.buraxta.learnspringframework.homework;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Business {

    private DataService dataService;

    public Business(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
