package com.buraxta.learnspringframework;

import com.buraxta.learnspringframework.game.GameRunner;
import com.buraxta.learnspringframework.game.GamingConsole;
import com.buraxta.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(GamingConfigurations.class);

    context.getBean(GamingConsole.class).up();
    }
}
