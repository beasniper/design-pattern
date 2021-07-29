package com.sniper.demo.adapter.default_adapter.main;

import com.sniper.demo.adapter.default_adapter.entity.PartialABHandler;
import com.sniper.demo.adapter.default_adapter.entity.PartialCDHandler;

/**
 * @author sniper
 * @date 2021/7/29 21:45
 **/
public class DefaultAdapterMain {
    public static void main(String[] args) {
        PartialABHandler partialABHandler = new PartialABHandler();
        PartialCDHandler partialCDHandler = new PartialCDHandler();

        partialABHandler.methodA();
        partialABHandler.methodC();

        partialCDHandler.methodB();
        partialCDHandler.methodD();
    }
}
