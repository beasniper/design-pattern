package com.sniper.demo.mediator.entity;

/**
 * @author sniper
 * @date 2021/8/3 22:39
 **/
public class Mediator extends AbstractMediator{
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;
    @Override
    public void action(Colleague colleague,String message) {
        if (colleague == colleagueA){
            colleagueB.response(message);
        }
        if (colleague == colleagueB){
            colleagueA.response(message);
        }
    }

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
