package com.sniper.demo.strategy.main;

import com.sniper.demo.strategy.entity.*;

/**
 * @author sniper
 * @date 2021/8/2 22:35
 **/
public class StrategyMain {
    public static void main(String[] args) {
        Execution execution;

        execution = new Execution(new StrategyA());
        execution.execute();


        execution = new Execution(new StrategyB());
        execution.execute();


        execution = new Execution(new StrategyC());
        execution.execute();

    }
}
