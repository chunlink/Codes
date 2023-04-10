package com.chunlink;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtil extends DBUtil{
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception ee){

        }
    }
    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("");
        }catch (Exception ee){

        }
        return null;
    }

    @Override
    public void tip() {
        System.out.println("mysqlutil!");
    }
}
