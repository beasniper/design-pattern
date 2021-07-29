package com.sniper.demo.singleton.entity;

import java.util.Vector;

/**
 * 影子实例
 */
@SuppressWarnings("rawtypes")
public class ShadowSyncSingleton {
    private static ShadowSyncSingleton instance = null;
    private Vector properties = null;

    private ShadowSyncSingleton() {
        // 设置 properties
    }

    private static synchronized void shadowSyncSingletonInit() {
        if (instance == null) {
            instance = new ShadowSyncSingleton();
        }
    }

    public static ShadowSyncSingleton getInstance() {
        shadowSyncSingletonInit();
        return instance;
    }

    public Vector getProperties() {
        return properties;
    }

    public void updateProperties() {
        // 通过创建新对象更新properties
        ShadowSyncSingleton singleton = new ShadowSyncSingleton();
        properties = singleton.getProperties();
    }
}
