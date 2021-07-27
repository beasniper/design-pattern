package sniper.demo.factory.factory_method.entity;

import sniper.demo.factory.factory_method.interface_.ISwim;

public class Duck implements ISwim {

    @Override
    public void swim() {
        System.out.println("I`m a duck,I`m swimming");
    }
}
