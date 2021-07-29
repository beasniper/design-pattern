package com.sniper.demo.singleton.entity;

/**
 * 单例模式(懒汉式)的简单实现，由于JVM的特性，可能在 new 之前就分配空间，所以并发时可能出错
 * https://juejin.cn/post/6844903475197771790#heading-17
 */
public class SimpleSingleton {
    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;

//        if (instance == null) {
//            synchronized (instance) {
//                if (instance == null) {
//                    instance = new SimpleSingleton();
//                    return instance;
//                }
//            }
//        }
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

}
