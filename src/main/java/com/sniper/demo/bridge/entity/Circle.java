package com.sniper.demo.bridge.entity;

import com.sniper.demo.bridge.interface_.DrawAPI;

/**
 * @author sniper
 * @date 2021/7/31 9:48
 **/
public class Circle extends Shape{

    private int radius;

    public Circle(DrawAPI drawAPI, int radius) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius);
    }
}
