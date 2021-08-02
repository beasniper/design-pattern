package com.sniper.demo.decorator.main;

import com.sniper.demo.decorator.entity.Decorator;
import com.sniper.demo.decorator.entity.SubTargetA;
import com.sniper.demo.decorator.entity.Target;

/**
 * @author sniper
 * @date 2021/8/2 21:50
 **/
public class DecoratorMain {
    public static void main(String[] args) {

        Target subTargetA = new SubTargetA();
        Decorator decorator = new Decorator(subTargetA);
        decorator.method();

        System.out.println("============================");

        Decorator decoratorDouble = new Decorator(decorator);
        decoratorDouble.method();

    }
}
