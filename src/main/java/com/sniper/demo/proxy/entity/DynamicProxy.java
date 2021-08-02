package com.sniper.demo.proxy.entity;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author sniper
 * @date 2021/7/31 10:20
 **/
public class DynamicProxy {

    public static Object getJDKProxyObject(final Object obj){

        /* 三个参数: ClassLoader loader，Class<?>[] interfaces, InvocationHandler*/
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("=== JDK Dynamic Proxy @before===");
                Object result = method.invoke(obj,args);
                System.out.println("=== JDK Dynamic Proxy @after===");
                return result;
            }
        });
    }



    /* 两个参数 Class type, Callback callback */
    public static Object getCglibProxyObject(final Object obj){
        return Enhancer.create(obj.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("=== Cglib Dynamic Proxy @before ");
                Object result = method.invoke(obj, objects);
                System.out.println("=== Cglib Dynamic Proxy @after ");
                return result;
            }
        });
    }
}
