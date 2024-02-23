package com.appleistore.controller;

import com.appleistore.database.db_connection;
import com.appleistore.view.Manager;
import com.appleistore.view.Cashier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_controller  {

    private final String name, password;

    public Login_controller(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Boolean getLoginUser() {
        db_connection d1=new  db_connection();
        try {
            String getUserQuery = "select * from user where user_name=? and user_password=?";
            PreparedStatement getUserStatement = d1.connection().prepareStatement(getUserQuery);
            getUserStatement.setString(1, name);
            getUserStatement.setString(2, password);
            ResultSet getUserResult = getUserStatement.executeQuery();

            boolean isManager;

            if (getUserResult.next()) {
                isManager = getUserResult.getBoolean("isManager");
                if (isManager) {
                    new Manager().setVisible(true);
                } else {
                    new Cashier().setVisible(true);
                }
                return true;
            } else {
                System.out.println("User not found");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
