package com.sniper.demo.mediator.main;

import com.sniper.demo.mediator.entity.ColleagueA;
import com.sniper.demo.mediator.entity.ColleagueB;
import com.sniper.demo.mediator.entity.Mediator;

/**
 * @author sniper
 * @date 2021/8/3 22:45
 **/
public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.sendMsg("To B");

        colleagueB.sendMsg("To A");

    }
}
