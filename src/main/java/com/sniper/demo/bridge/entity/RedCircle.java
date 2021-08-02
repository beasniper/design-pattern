package com.sniper.demo.bridge.entity;

import com.sniper.demo.bridge.interface_.DrawAPI;

/**
 * @author sniper
 * @date 2021/7/31 9:45
 **/
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius) {
        System.out.println("===Red Circle===");
        System.out.println("===Radius "+radius+"===");
    }
}
