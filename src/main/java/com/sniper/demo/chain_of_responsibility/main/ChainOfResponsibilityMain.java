package com.sniper.demo.chain_of_responsibility.main;

import com.sniper.demo.chain_of_responsibility.entity.AbstractValidateHandler;
import com.sniper.demo.chain_of_responsibility.entity.ValidateHandlerA;
import com.sniper.demo.chain_of_responsibility.entity.ValidateHandlerB;

/**
 * @author sniper
 * @date 2021/8/3 21:41
 **/
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        String content = "I`m content";

        AbstractValidateHandler validateHandlerA = new ValidateHandlerA();
        AbstractValidateHandler validateHandlerB = new ValidateHandlerB();

        validateHandlerA.setHandler(validateHandlerB);
        validateHandlerA.validate(content);
    }
}
