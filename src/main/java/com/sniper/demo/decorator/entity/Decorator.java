package com.sniper.demo.decorator.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author sniper
 * @date 2021/8/2 21:48
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class Decorator extends Target{

    private Target target;

    public Decorator(Target target) {
        this.target = target;
    }


    @Override
    public void method() {
        target.method();
        System.out.println(" === Decorator Working === ");
    }


}
