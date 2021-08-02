package com.sniper.demo.builder.entity;

/**
 * @author sniper
 * @date 2021/7/28 22:23
 **/
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("AAAAA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("BBBBB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("CCCCC");
    }

    @Override
    public void buildPartD() {
        product.setPartD("DDDDD");
    }
}
