package com.sniper.demo.flyweight.entity;

import java.util.Map;

/**
 * @author sniper
 * @date 2021/8/2 22:24
 **/
public class UserService {
    public Map<String,String> getOnLineUser(){
        return LoginService.users;
    }
}
