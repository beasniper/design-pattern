package sniper.demo.factory.simple_factory.entity;

import sniper.demo.factory.simple_factory.interface_.ISwim;

public class SimpleFactory {

    public ISwim findCanSwimAnimal(String type) {
        if ("duck".equals(type)){
            return new Duck();
        }else if ("fish".equals(type)) {
            return new Fish();
        }else {
            return null;
        }
    }


    public static ISwim findDuck(){
        return new Duck();
    }

    public static ISwim findFish(){
        return new Fish();
    }
}
