package com.sniper.demo.chain_of_responsibility.entity;

/**
 * @author sniper
 * @date 2021/8/3 21:37
 **/
public abstract class AbstractValidateHandler{
    private AbstractValidateHandler handler;

    public abstract void validate(String content);

    public AbstractValidateHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractValidateHandler handler) {
        this.handler = handler;
    }
}
