package com.buraxta.learnspringframework.game;

public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("go into a hole");
    }
    public void left() {
        System.out.println("go back");
    }
    public void right() {
        System.out.println("accelerate");
    }


}
