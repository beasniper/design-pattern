package com.sniper.demo.obsever.entity;

import com.sniper.demo.obsever.interface_.Observer;

import java.util.List;
import java.util.Vector;

/**
 * @author sniper
 * @date 2021/8/3 21:20
 **/
public class BaseTarget {
    public Vector<Observer> obs = new Vector<>();

    public void addObserver(Observer observer){
        obs.add(observer);
    }

    public void removeObserver(Observer observer){
        obs.remove(observer);
    }

    public void notifyAllObservers(){
        obs.forEach(Observer::update);
    };
}
