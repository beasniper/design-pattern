package com.sniper.demo.strategy.entity;

import com.sniper.demo.strategy.interface_.Strategy;

/**
 * @author sniper
 * @date 2021/8/2 22:32
 **/
public class StrategyC implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("=== 使用方式C === ");
    }
}
