package com.sniper.demo.state.entity;

import com.sniper.demo.state.interface_.State;

/**
 * @author sniper
 * @date 2021/8/3 22:04
 **/
public class EndState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("=== End ===");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "END";
    }
}
