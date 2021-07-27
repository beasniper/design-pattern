package sniper.demo.factory.abstract_factory.main;

import sniper.demo.factory.abstract_factory.entity.Computer;
import sniper.demo.factory.abstract_factory.entity.Mouse;
import sniper.demo.factory.abstract_factory.entity.SubFactoryA;
import sniper.demo.factory.abstract_factory.entity.SubFactoryB;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        SubFactoryA subFactoryA = new SubFactoryA();
        Computer computer = subFactoryA.produceComputer();
        Mouse mouse = subFactoryA.produceMouse();
        computer.run();
        mouse.run();


        SubFactoryB subFactoryB = new SubFactoryB();
        Computer computerB = subFactoryB.produceComputer();
        Mouse mouseB = subFactoryB.produceMouse();
        computerB.run();
        mouseB.run();
    }
}
