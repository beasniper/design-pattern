package com.sniper.demo.obsever.entity;

import com.sniper.demo.obsever.interface_.Observer;

/**
 * @author sniper
 * @date 2021/8/3 21:25
 **/
public class Target extends BaseTarget {
    public void update(){
        System.out.println("Target updated");
        notifyAllObservers();
    }
}
