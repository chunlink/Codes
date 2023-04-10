package com.chunlink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Client {
    public void save(Student stu){
        String sql = "INSERT INTO t_student(name,age) VALUEs(?,?)";
        Connection connection = null;
        Statement st = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///jdbc_demo","root","root");
        }catch(Exception e){

        }
    }
}
