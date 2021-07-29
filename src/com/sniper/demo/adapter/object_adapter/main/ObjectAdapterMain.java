package com.sniper.demo.adapter.object_adapter.main;

import com.sniper.demo.adapter.object_adapter.entity.WildCock;
import com.sniper.demo.adapter.object_adapter.interface_.Cock;
import com.sniper.demo.adapter.object_adapter.interface_.Duck;
import com.sniper.demo.adapter.object_adapter.entity.CockAdapter;

/**
 * @author sniper
 * @date 2021/7/29 21:55
 **/
public class ObjectAdapterMain {
    public static void main(String[] args) {
        Cock cock = new WildCock();
        cock.gobble();
        cock.fly();

        Duck duck = new CockAdapter(cock);
        duck.quack();
        duck.fly();
    }
}
