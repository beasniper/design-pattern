package com.sniper.demo.visitor.entity;

import com.sniper.demo.visitor.interface_.Target;
import com.sniper.demo.visitor.interface_.Visitor;

/**
 * @author sniper
 * @date 2021/8/3 22:18
 **/
public class SubTarget implements Target {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
