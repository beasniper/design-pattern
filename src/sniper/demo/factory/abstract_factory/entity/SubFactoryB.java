package sniper.demo.factory.abstract_factory.entity;

import sniper.demo.factory.abstract_factory.interface_.IFactory;

public class SubFactoryB implements IFactory {
    @Override
    public Computer produceComputer() {
        return new ComputerB();
    }

    @Override
    public Mouse produceMouse() {
        return new MouseB();
    }
}
