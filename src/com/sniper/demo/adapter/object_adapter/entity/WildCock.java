package com.sniper.demo.adapter.object_adapter.entity;

import com.sniper.demo.adapter.object_adapter.interface_.Cock;

/**
 * @author sniper
 * @date 2021/7/29 21:51
 **/
public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("===我是野鸡，我会咕咕叫===");
    }

    @Override
    public void fly() {
        System.out.println("===我是野鸡，我会飞===");
    }
}
