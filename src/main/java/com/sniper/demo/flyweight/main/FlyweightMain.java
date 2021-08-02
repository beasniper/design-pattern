package com.sniper.demo.flyweight.main;

import com.sniper.demo.flyweight.entity.LoginService;
import com.sniper.demo.flyweight.entity.UserService;

/**
 * @author sniper
 * @date 2021/8/2 22:24
 **/
public class FlyweightMain {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        UserService userService = new UserService();



        loginService.onLine("USER_001","小明");
        loginService.onLine("USER_002","小王");
        loginService.onLine("USER_003","小李");
        loginService.onLine("USER_004","小刘");

        loginService.offLine("USER_002");

        System.out.println(userService.getOnLineUser());

    }
}
