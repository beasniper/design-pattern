package com.sniper.demo.builder.entity;

/**
 * @author sniper
 * @date 2021/7/28 22:24
 **/
@SuppressWarnings("FieldMayBeFinal")
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product buildProduct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        builder.buildPartD();
        return builder.getProduct();
    }
}
