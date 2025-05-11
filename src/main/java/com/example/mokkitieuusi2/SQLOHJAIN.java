package com.example.mokkitieuusi2;

import java.sql.*;

public class SQLOHJAIN {
    public static void main(String arg[]) {
        String url = "jdbc:mysql://localhost:3306/Mokkitie";
        String username = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * mokki");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }

        }
        catch (Exception e) {
            System.out.println("Joku meni vikaan");
        }
    }
}
