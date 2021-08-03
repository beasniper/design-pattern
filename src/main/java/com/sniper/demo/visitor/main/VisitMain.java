package com.sniper.demo.visitor.main;

import com.sniper.demo.visitor.entity.SubTarget;
import com.sniper.demo.visitor.entity.SubVisitor;
import com.sniper.demo.visitor.interface_.Target;
import com.sniper.demo.visitor.interface_.Visitor;

/**
 * @author sniper
 * @date 2021/8/3 22:21
 **/
public class VisitMain {
    public static void main(String[] args) {
        Target target = new SubTarget();
        Visitor visitor = new SubVisitor();
        target.accept(visitor);

        Target target2 = new SubTarget();
        target2.accept(visitor);
    }
}
