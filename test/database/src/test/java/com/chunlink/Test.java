package com.chunlink;

public class Test {
    public static void main(String[] args) {
        Dao dao = new Dao(new MysqlUtil());
        dao.save(new Student());
        Dao dao1 = new Dao(new OracleUtil());
        dao1.save(new Student());
    }
}
