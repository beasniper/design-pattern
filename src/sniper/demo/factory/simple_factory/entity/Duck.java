package sniper.demo.factory.simple_factory.entity;

import sniper.demo.factory.simple_factory.interface_.ISwim;

public class Duck implements ISwim {

    @Override
    public void swim() {
        System.out.println("I`m a duck,I`m swimming");
    }
}
