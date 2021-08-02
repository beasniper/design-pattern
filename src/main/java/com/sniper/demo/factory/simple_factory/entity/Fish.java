package com.sniper.demo.factory.simple_factory.entity;

import com.sniper.demo.factory.simple_factory.interface_.ISwim;

public class Fish implements ISwim {
    @Override
    public void swim() {
        System.out.println("I`m fish,I`m swimming");
    }
}
