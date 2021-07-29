package com.sniper.demo.prototype.main;

import com.sniper.demo.prototype.entity.Prototype;
import com.sniper.demo.factory.factory_method.entity.Duck;

import java.io.IOException;

/**
 * @author sniper
 * @date 2021/7/29 21:17
 **/
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        prototype.setIntValue(1);
        prototype.setDuck(new Duck());

        System.out.println(prototype.getDuck().toString());

        Prototype clone = prototype.clone();
        System.out.println(clone.getDuck().toString());

        Prototype deepClone = (Prototype) prototype.deepClone();
        System.out.println(prototype == clone); // F
        System.out.println(deepClone == clone); // F
        System.out.println(prototype.getIntValue() == clone.getIntValue());//T
        System.out.println(deepClone.getIntValue() == prototype.getIntValue()); //F
        System.out.println(clone.getDuck() == prototype.getDuck()); // T
        System.out.println(deepClone.getDuck() == prototype.getDuck()); // F



    }
}
