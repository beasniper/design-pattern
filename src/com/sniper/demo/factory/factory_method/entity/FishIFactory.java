package com.sniper.demo.factory.factory_method.entity;

import com.sniper.demo.factory.factory_method.interface_.IFactory;
import com.sniper.demo.factory.factory_method.interface_.ISwim;

public class FishIFactory implements IFactory {
    @Override
    public ISwim findCanSwimAnimal() {
        return new Fish();
    }
}
