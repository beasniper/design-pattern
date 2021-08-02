package com.sniper.demo.builder.entity.sql;

/**
 * @author sniper
 * @date 2021/7/28 22:46
 **/
@SuppressWarnings("FieldCanBeLocal")
public class SelectSqlBuilder extends SqlBuilder {
    private final String SELECT_SQL = "SELECT * FROM %s";
    private final String WHERE = " WHERE ";
    private final String AND = " AND ";
    private final String EQUALS = " = ";
    private final String LIKE = " LIKE ";


    @Override
    public SqlBuilder tableName(String tableName) {
        if (null == sqlEntity.getSql()) {
            sqlEntity.setSql(String.format(SELECT_SQL, tableName));
        }
        return this;
    }

    @Override
    public SqlBuilder eq(String fieldName, String value) {
        if (null != sqlEntity.getSql()) {
            String sql = sqlEntity.getSql() + (sqlEntity.getSql().contains(WHERE) ? AND : WHERE) + fieldName + EQUALS + value;
            sqlEntity.setSql(sql);
        }
        return this;
    }

    @Override
    public SqlBuilder like(String fieldName, String value) {
        if (null != sqlEntity.getSql()) {
            String sql = sqlEntity.getSql() + (sqlEntity.getSql().contains(WHERE) ? AND : WHERE) + fieldName + LIKE + "%" + value + "%";
            sqlEntity.setSql(sql);
        }
        return this;
    }
}
