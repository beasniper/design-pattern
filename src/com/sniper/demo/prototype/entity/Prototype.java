package com.sniper.demo.prototype.entity;

import com.sniper.demo.factory.factory_method.entity.Duck;

import java.io.*;

/**
 * @author sniper
 * @date 2021/7/29 21:07
 * 浅拷贝：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型指向的还是原对象
 * 深拷贝：将一个对象复制后，基本类型数据和引用类型都会重新创建
 **/
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;




    private Integer intValue;

    private Duck duck;

    @Override
    //浅拷贝
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();//Object的clone方法
    }


    //深拷贝
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Duck getDuck() {
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }
}
