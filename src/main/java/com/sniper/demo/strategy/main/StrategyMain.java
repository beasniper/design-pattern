package com.sniper.demo.strategy.main;

import com.sniper.demo.strategy.entity.Execution;
import com.sniper.demo.strategy.entity.StrategyA;
import com.sniper.demo.strategy.entity.StrategyB;
import com.sniper.demo.strategy.entity.StrategyC;

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
