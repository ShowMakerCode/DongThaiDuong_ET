package com.smk.problem02.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/entrytest";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,"root","123456");
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
    return null;
    }
}
