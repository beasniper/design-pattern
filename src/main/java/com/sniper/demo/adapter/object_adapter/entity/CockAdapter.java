package com.sniper.demo.adapter.object_adapter.entity;

import com.sniper.demo.adapter.object_adapter.interface_.Cock;
import com.sniper.demo.adapter.object_adapter.interface_.Duck;

/**
 * @author sniper
 * @date 2021/7/29 21:53
 * 对象适配器采用组合方式适配，属于组合的动态实现，需要多实例化一个类
 **/
public class CockAdapter implements Duck {

    private Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
