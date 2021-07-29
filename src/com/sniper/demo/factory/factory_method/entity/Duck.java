package com.sniper.demo.factory.factory_method.entity;

import com.sniper.demo.factory.factory_method.interface_.ISwim;

import java.io.Serializable;

public class Duck implements ISwim, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public void swim() {
        System.out.println("I`m a duck,I`m swimming");
    }
}
