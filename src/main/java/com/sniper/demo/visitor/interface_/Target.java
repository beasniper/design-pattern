package com.sniper.demo.visitor.interface_;

/**
 * @author sniper
 * @date 2021/8/3 22:16
 **/
public interface Target {
    void accept(Visitor visitor);
}
