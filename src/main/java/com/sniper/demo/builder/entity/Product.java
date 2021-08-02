package com.sniper.demo.builder.entity;


/**
 * @author sniper
 * @date 2021/7/28 22:15
 **/
public class Product {
    private String partA;
    private String partB;
    private String partC;
    private String partD;

    public void show() {
        System.out.println("A:"+partA);
        System.out.println("B:"+partB);
        System.out.println("C:"+partC);
        System.out.println("d:"+partD);
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public String getPartD() {
        return partD;
    }

    public void setPartD(String partD) {
        this.partD = partD;
    }


}
