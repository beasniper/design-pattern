package com.sniper.demo.state.main;

import com.sniper.demo.state.entity.Context;
import com.sniper.demo.state.entity.EndState;
import com.sniper.demo.state.entity.StartState;

/**
 * @author sniper
 * @date 2021/8/3 22:06
 **/
public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        EndState endState = new EndState();
        endState.doAction(context);

        System.out.println("当前Context状态为："+context.getState().toString());
    }
}
