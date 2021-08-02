package com.sniper.demo.singleton.entity;

/**
 * 饿汉式
 */
@SuppressWarnings({"InstantiationOfUtilityClass", "FieldMayBeFinal"})
public class SimpleSingletonHungry {
    private static SimpleSingletonHungry instance = new SimpleSingletonHungry();

    private SimpleSingletonHungry() {

    }

    public static SimpleSingletonHungry getInstance() {
        return instance;
    }

}
