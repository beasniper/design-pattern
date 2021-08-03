package com.sniper.demo.template.entity;

/**
 * @author sniper
 * @date 2021/8/3 21:54
 **/
public class SubTemplateB extends AbstractTemplate{

    @Override
    protected void init() {
        System.out.println(" SubTemplateB init");
    }


    @Override
    protected void action() {
        System.out.println(" SubTemplateB action");
    }

    @Override
    protected void hock() {
        System.out.println("SubTemplateB hock");
    }

}
