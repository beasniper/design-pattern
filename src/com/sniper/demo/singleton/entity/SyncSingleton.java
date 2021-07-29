package com.sniper.demo.singleton.entity;

public class SyncSingleton {
    private static SyncSingleton instance = null;

    private SyncSingleton() {

    }

    private static synchronized void syncSingletonInit () {
        if (instance == null) {
            instance = new SyncSingleton();
        }
    }

    private static SyncSingleton getInstance() {
        if (instance == null) {
            syncSingletonInit();
        }
        return instance;
    }
}
