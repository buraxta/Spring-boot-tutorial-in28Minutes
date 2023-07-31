package com.buraxta.learnspringframework;

import com.buraxta.learnspringframework.game.GameRunner;
import com.buraxta.learnspringframework.game.GamingConsole;
import com.buraxta.learnspringframework.game.PacmanGame;
import com.buraxta.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;

public class GamingConfigurations {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
