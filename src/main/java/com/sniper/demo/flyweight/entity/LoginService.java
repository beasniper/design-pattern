package com.sniper.demo.flyweight.entity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sniper
 * @date 2021/8/2 22:19
 **/
public class LoginService {
    public static Map<String,String> users = new ConcurrentHashMap<>();

    public void onLine(String userId,String userName){
        users.put(userId,userName);
    }

    public void offLine(String userId){
        users.remove(userId);
    }
}
