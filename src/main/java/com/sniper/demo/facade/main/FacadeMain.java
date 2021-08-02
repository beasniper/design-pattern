package com.sniper.demo.facade.main;

import com.sniper.demo.facade.entity.Circle;
import com.sniper.demo.facade.entity.Facade;
import com.sniper.demo.facade.entity.Shape;
import com.sniper.demo.facade.entity.Square;

/**
 * @author sniper
 * @date 2021/8/2 22:06
 **/
public class FacadeMain {
    public static void main(String[] args) {
        //普通
        Shape circle = new Circle();
        Shape square = new Square();
        circle.draw();
        square.draw();

        //外观模式
        Facade facade = new Facade(new Circle(), new Square());
        facade.drawCircle();
        facade.drawSquare();
    }
}
