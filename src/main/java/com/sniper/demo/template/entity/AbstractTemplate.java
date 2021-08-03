package com.sniper.demo.template.entity;

/**
 * @author sniper
 * @date 2021/8/3 21:51
 **/
public abstract class AbstractTemplate {

    public final void execute() {
        init();
        action();
        hock();
    }

    protected void init() {
        System.out.println(" AbstractTemplate init");
    }

    protected abstract void action();

    protected void hock(){
        System.out.println(" AbstractTemplate hock");
    }

}
