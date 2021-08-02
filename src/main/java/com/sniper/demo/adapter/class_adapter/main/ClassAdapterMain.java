package com.sniper.demo.adapter.class_adapter.main;

import com.sniper.demo.adapter.class_adapter.entity.ClassAdapter;

/**
 * @author sniper
 * @date 2021/7/29 22:05
 **/
public class ClassAdapterMain {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.classDoSomething();
        classAdapter.interfaceDoSomething();
    }
}
