package com.sniper.demo.bridge.main;

import com.sniper.demo.bridge.entity.Circle;
import com.sniper.demo.bridge.entity.GreenCircle;
import com.sniper.demo.bridge.entity.RedCircle;

/**
 * @author sniper
 * @date 2021/7/31 9:52
 **/
public class BridgeMain {
    public static void main(String[] args) {
        Circle greenCircle = new Circle(new GreenCircle(), 100);
        Circle redCircle = new Circle(new RedCircle(), 50);

        greenCircle.draw();
        System.out.println("=====================================");
        redCircle.draw();
    }
}
