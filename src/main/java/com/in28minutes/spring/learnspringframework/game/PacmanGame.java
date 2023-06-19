package com.in28minutes.spring.learnspringframework.game;

public class PacmanGame implements GamingConsole{
    public void up()
    {
        System.out.println("PACMAN: UP");
    }
    public void down()
    {
        System.out.println("PACMAN: DOWN");
    }
    public void left()
    {
        System.out.println("PACMAN: LEFT");
    }
    public void right()
    {
        System.out.println("PACMAN: RIGHT");
    }
}
