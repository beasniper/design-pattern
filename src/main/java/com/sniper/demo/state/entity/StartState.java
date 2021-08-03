package com.sniper.demo.state.entity;

import com.sniper.demo.state.interface_.State;

/**
 * @author sniper
 * @date 2021/8/3 22:04
 **/
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("=== Start ===");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "START";
    }
}
