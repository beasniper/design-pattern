package sniper.demo.factory.abstract_factory.interface_;

import sniper.demo.factory.abstract_factory.entity.Computer;
import sniper.demo.factory.abstract_factory.entity.Mouse;

public interface IFactory {
    Computer produceComputer();
    Mouse produceMouse();
}
