package com.sniper.demo.bridge.entity;

import com.sniper.demo.bridge.interface_.DrawAPI;

/**
 * @author sniper
 * @date 2021/7/31 9:46
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println("===Green Circle===");
        System.out.println("===Radius "+radius+"===");
    }
}
