package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
    public void up()
    {
        System.out.println("SCG: UP");
    }
    public void down()
    {
        System.out.println("SCG: DOWN");
    }
    public void left()
    {
        System.out.println("SCG: LEFT");
    }
    public void right()
    {
        System.out.println("SCG: RIGHT");
    }
}
