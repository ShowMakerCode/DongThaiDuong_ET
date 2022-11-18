package com.smk.problem02.dao;

import com.smk.problem02.connection.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO<T> {
    Connection connection = JDBC.getConnection();
    public ResultSet findBySeri(Class<T> tClass, Long seri){
        StringBuilder query = new StringBuilder();
        query.append("Select * from ").append(tClass.getSimpleName()).append(" o ").append("where o.seri = ?");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(String.valueOf(query));
            preparedStatement.setLong(1,seri);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



}
