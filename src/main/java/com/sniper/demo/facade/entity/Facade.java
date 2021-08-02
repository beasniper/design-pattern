package com.sniper.demo.facade.entity;

import lombok.Data;

/**
 * @author sniper
 * @date 2021/8/2 22:07
 **/
@Data
public class Facade {
    private Shape circle;
    private Shape square;

    public Facade(Shape circle, Shape square) {
        this.circle = circle;
        this.square = square;
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
