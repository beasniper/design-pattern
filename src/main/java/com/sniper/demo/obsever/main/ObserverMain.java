package com.sniper.demo.obsever.main;

import com.sniper.demo.obsever.entity.ObserverA;
import com.sniper.demo.obsever.entity.ObserverB;
import com.sniper.demo.obsever.entity.Target;
import com.sniper.demo.obsever.interface_.Observer;

/**
 * @author sniper
 * @date 2021/8/3 21:26
 **/
public class ObserverMain {
    public static void main(String[] args) {
        Target target = new Target();
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        target.addObserver(observerA);
        target.addObserver(observerB);
        target.update();
    }
}
