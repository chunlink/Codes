package com.chunlink;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUtil extends DBUtil{
    static {
        try{
            Class.forName("com.Oracle.jdbc.Driver");
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
        System.out.println("oracle!");
    }
}
