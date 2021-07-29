package com.sniper.demo.factory.abstract_factory.interface_;

import com.sniper.demo.factory.abstract_factory.entity.Computer;
import com.sniper.demo.factory.abstract_factory.entity.Mouse;

public interface IFactory {
    Computer produceComputer();
    Mouse produceMouse();
}
