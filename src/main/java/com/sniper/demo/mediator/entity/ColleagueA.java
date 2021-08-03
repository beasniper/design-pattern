package com.sniper.demo.mediator.entity;

/**
 * @author sniper
 * @date 2021/8/3 22:36
 **/
public class ColleagueA extends Colleague{

    public ColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    public void sendMsg(String message){
        mediator.action(this,message);
    }

    public void response(String message){
        System.out.println("ColleagueA got message:"+message);
    }
}
