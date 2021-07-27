package sniper.demo.factory.factory_method.main;

import sniper.demo.factory.factory_method.entity.DuckIFactory;
import sniper.demo.factory.factory_method.entity.FishIFactory;
import sniper.demo.factory.factory_method.interface_.ISwim;

public class FactoryMethodMain {
    public static void main(String[] args) {
        DuckIFactory duckFactory = new DuckIFactory();
        ISwim duck = duckFactory.findCanSwimAnimal();

        FishIFactory fishFactory = new FishIFactory();
        ISwim fish = fishFactory.findCanSwimAnimal();

        duck.swim();
        fish.swim();
    }
}
