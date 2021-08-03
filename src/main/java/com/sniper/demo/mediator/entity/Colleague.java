package com.sniper.demo.mediator.entity;

/**
 * @author sniper
 * @date 2021/8/3 22:35
 **/
public abstract class Colleague {
    protected AbstractMediator mediator;

    public Colleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
