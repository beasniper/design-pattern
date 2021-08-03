package com.sniper.demo.visitor.entity;

import com.sniper.demo.visitor.interface_.Target;
import com.sniper.demo.visitor.interface_.Visitor;

/**
 * @author sniper
 * @date 2021/8/3 22:19
 **/
public class SubVisitor implements Visitor {
    @Override
    public void visit(Target target) {
        System.out.println("当前观察对象为："+target.toString());
    }
}
