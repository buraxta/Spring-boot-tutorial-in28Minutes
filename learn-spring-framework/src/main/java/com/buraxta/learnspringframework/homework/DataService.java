package com.buraxta.learnspringframework.homework;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
