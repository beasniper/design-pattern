package com.sniper.demo.template.main;

import com.sniper.demo.template.entity.SubTemplateA;
import com.sniper.demo.template.entity.SubTemplateB;

/**
 * @author sniper
 * @date 2021/8/3 21:55
 **/
public class TemplateMain {
    public static void main(String[] args) {
        SubTemplateA subTemplateA = new SubTemplateA();
        subTemplateA.execute();

        System.out.println("==============================");
        SubTemplateB subTemplateB = new SubTemplateB();
        subTemplateB.execute();
    }
}
