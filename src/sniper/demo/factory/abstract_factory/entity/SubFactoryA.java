package sniper.demo.factory.abstract_factory.entity;

import sniper.demo.factory.abstract_factory.interface_.IFactory;

public class SubFactoryA implements IFactory {
    @Override
    public Computer produceComputer() {
        return new ComputerA();
    }

    @Override
    public Mouse produceMouse() {
        return new MouseA();
    }
}
