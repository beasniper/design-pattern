package com.sniper.demo.template.entity;

/**
 * @author sniper
 * @date 2021/8/3 21:54
 **/
public class SubTemplateA extends AbstractTemplate{
    @Override
    protected void action() {
        System.out.println(" SubTemplateA action");
    }
}
