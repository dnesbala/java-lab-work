package com.company;

import java.sql.*;

public class DBCrud {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/students";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int roll = resultSet.getInt("roll");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("Roll = " + roll);
                System.out.println("Name = " + name);
                System.out.println("Age = " + age);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


