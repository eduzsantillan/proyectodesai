package com.isil.sesion1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/TEST",
                "root",
                "budakar01"
        );

        Statement stmt= con.createStatement();

        ResultSet result = stmt.executeQuery("select * from Users");

        while(result.next()){
            System.out.println(result.getString(2));
        }

    }

}
