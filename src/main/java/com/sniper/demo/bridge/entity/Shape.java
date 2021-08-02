package com.sniper.demo.bridge.entity;

import com.sniper.demo.bridge.interface_.DrawAPI;

/**
 * @author sniper
 * @date 2021/7/31 9:47
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
