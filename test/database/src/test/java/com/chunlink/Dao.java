package com.chunlink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Dao {
    DBUtil dbUtil;
    Connection connection;
    Statement st;
    public Dao(DBUtil db){
        dbUtil = db;
        connection = dbUtil.getConnection();
    }
    public void tip(){
        dbUtil.tip();
    }
    public void save(Student stu){
        String sql = "INSERT INTO t_student(name,age) VALUEs(?,?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setObject(1,stu.name);
            ps.setObject(2,stu.age);
            System.out.println("this is dao!");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        tip();
    }
}
