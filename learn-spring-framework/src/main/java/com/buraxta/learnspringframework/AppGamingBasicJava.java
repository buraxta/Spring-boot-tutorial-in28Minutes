package com.buraxta.learnspringframework;

import com.buraxta.learnspringframework.game.GameRunner;
import com.buraxta.learnspringframework.game.MarioGame;
import com.buraxta.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
