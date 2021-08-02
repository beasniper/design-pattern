package com.sniper.demo.strategy.entity;

import com.sniper.demo.strategy.interface_.Strategy;

/**
 * @author sniper
 * @date 2021/8/2 22:34
 **/
public class Execution {
    private Strategy strategy;

    public Execution(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doSomething();
    }
}
