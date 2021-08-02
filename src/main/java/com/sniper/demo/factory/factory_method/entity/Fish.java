package com.sniper.demo.factory.factory_method.entity;

import com.sniper.demo.factory.factory_method.interface_.ISwim;

public class Fish implements ISwim {
    @Override
    public void swim() {
        System.out.println("I`m fish,I`m swimming");
    }
}
