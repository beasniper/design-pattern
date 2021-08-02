package com.sniper.demo.factory.simple_factory.main;

import com.sniper.demo.factory.simple_factory.interface_.ISwim;
import com.sniper.demo.factory.simple_factory.entity.SimpleFactory;

/**
 * 简单工厂模式
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        //单个方法创建(静态工厂)
        SimpleFactory factory = new SimpleFactory();
        ISwim duck = factory.findCanSwimAnimal("duck");
        ISwim fish = factory.findCanSwimAnimal("fish");
        duck.swim();
        fish.swim();

        //多个方法创建(静态工厂)
        ISwim duck_duck = SimpleFactory.findDuck();
        ISwim fish_fish = SimpleFactory.findFish();
        duck_duck.swim();
        fish_fish.swim();



    }
}
