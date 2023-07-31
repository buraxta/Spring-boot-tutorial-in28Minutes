package com.buraxta.learnspringframework.homework;

import org.springframework.stereotype.Component;

@Component
public class MySql implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{1, 1, 1};
    }
}
