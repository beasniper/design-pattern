package com.sniper.demo.adapter.class_adapter.entity;

import com.sniper.demo.adapter.class_adapter.interface_.TargetInterface;

/**
 * @author sniper
 * @date 2021/7/29 22:03
 **/
public class ClassAdapter extends TargetClass implements TargetInterface {

    @Override
    public void interfaceDoSomething() {
        System.out.println("TargetInterface do something");
    }
}
