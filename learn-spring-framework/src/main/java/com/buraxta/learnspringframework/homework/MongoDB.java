package com.buraxta.learnspringframework.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDB implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{0, 1, 2};
    }
}
