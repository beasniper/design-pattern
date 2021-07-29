package com.sniper.demo.builder.entity;

/**
 * @author sniper
 * @date 2021/7/28 22:21
 **/
public abstract class Builder {
    protected Product product = new Product();

    //构建
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public abstract void buildPartD();

    //表达
    public Product getProduct(){
        return product;
    }
}
