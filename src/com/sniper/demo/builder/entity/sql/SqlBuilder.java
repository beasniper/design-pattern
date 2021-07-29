package com.sniper.demo.builder.entity.sql;

/**
 * @author sniper
 * @date 2021/7/28 22:42
 **/
public abstract class SqlBuilder {
    protected SimpleSqlEntity sqlEntity = new SimpleSqlEntity();

    public abstract SqlBuilder tableName(String tableName);
    public abstract SqlBuilder eq(String fieldName, String value);
    public abstract SqlBuilder like(String fieldName,String like);

    public String getSql(){
        return sqlEntity.getSql();
    }
}
