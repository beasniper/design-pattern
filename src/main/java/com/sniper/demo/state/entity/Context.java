package com.sniper.demo.state.entity;

import com.sniper.demo.state.interface_.State;

/**
 * @author sniper
 * @date 2021/8/3 22:02
 **/
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
