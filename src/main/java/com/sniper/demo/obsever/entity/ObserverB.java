package com.sniper.demo.obsever.entity;

import com.sniper.demo.obsever.interface_.Observer;

/**
 * @author sniper
 * @date 2021/8/3 21:22
 **/
public class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("B updated");
    }
}
