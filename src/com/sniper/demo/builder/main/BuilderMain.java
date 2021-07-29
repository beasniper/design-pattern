package com.sniper.demo.builder.main;

import com.sniper.demo.builder.entity.sql.SelectSqlBuilder;

/**
 * @author sniper
 * @date 2021/7/28 22:26
 **/
public class BuilderMain {
    public static void main(String[] args) {
//        Builder builder = new ConcreteBuilder();
//        Director director = new Director(builder);
//        Product product = director.buildProduct();
//        product.show();

        SelectSqlBuilder builder = new SelectSqlBuilder();

        String sql = builder
                .tableName("TEST")
                .eq("name", "小明")
                .like("address", "北京市")
                .getSql();

        System.out.println(sql);
    }
}
