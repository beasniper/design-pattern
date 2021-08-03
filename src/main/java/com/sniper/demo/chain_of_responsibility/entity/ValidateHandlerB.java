package com.sniper.demo.chain_of_responsibility.entity;

/**
 * @author sniper
 * @date 2021/8/3 21:37
 **/
public class ValidateHandlerB extends AbstractValidateHandler{
    @Override
    public void validate(String content) {
        System.out.println("Rule B Validated:"+content);
        if (getHandler() != null){
            getHandler().validate(content);
        }
    }
}
