package com.appleistore.controller;

import com.appleistore.database.db_connection;
import com.appleistore.models.LoginMdl;
import com.appleistore.models.ManagerMdl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.appleistore.view.Manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class Manager_controller extends db_connection {

    public List<ManagerMdl> loadItemData() {
        List<ManagerMdl> list = new ArrayList<ManagerMdl>();
        try {
            String query = "select * from items_tbl";
            PreparedStatement ps = connection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int Itm_id = rs.getInt("Itm_id");
                String Itm_name = rs.getString("Itm_name");
                int Itm_qty = rs.getInt("Itm_qty");
                double Itm_price = rs.getDouble("Itm_price");
                String Itm_cat = rs.getString("Itm_cat");

                ManagerMdl mdl = new ManagerMdl(Itm_id, Itm_name, Itm_qty, Itm_price, Itm_cat);
                list.add(mdl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public List<ManagerMdl> loadUserData() {
        List<ManagerMdl> list2 = new ArrayList<ManagerMdl>();
        try {
            String query = "select * from user";
            PreparedStatement ps2 = connection().prepareStatement(query);
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                int user_id = rs2.getInt("user_id");
                String user_name = rs2.getString("user_name");
                String user_password = rs2.getString("user_password");
                int phone = rs2.getInt("phone");
                boolean isManager = rs2.getBoolean("isManager");

                ManagerMdl mdl2 = new ManagerMdl(user_id, user_name, user_password, phone, isManager);
                list2.add(mdl2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list2;
    }

    public void addItem(ManagerMdl mdl) {
        try {
            String query = "INSERT INTO items_tbl (Itm_id,Itm_name, Itm_qty, Itm_price, Itm_cat) VALUES (?,?,?,?,?)";
            PreparedStatement add = connection().prepareStatement(query);
            
            add.setInt(1, mdl.getItm_id());
            add.setString(2, mdl.getItm_name());
            add.setInt(3, mdl.getItm_qty());
            add.setDouble(4, mdl.getItm_price());
            add.setString(5, mdl.getItm_cat());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(null, "New Product added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteItem(int Itm_id) {

        try {
            String query = "DELETE FROM items_tbl WHERE Itm_id=?";
            PreparedStatement delete = connection().prepareStatement(query);

            delete.setInt(1, Itm_id);
            delete.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prodcut is deleted");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void updateItem(ManagerMdl mdl) {
        try {
            String query = "update items_tbl set Itm_name=?,Itm_qty=?,Itm_price=?,Itm_cat=? where Itm_id=?";
            PreparedStatement update = connection().prepareStatement(query);
            
            update.setString(1, mdl.getItm_name());
            update.setInt(2, mdl.getItm_qty());
            update.setDouble(3, mdl.getItm_price());
            update.setString(4, mdl.getItm_cat());
            update.setInt(5, mdl.getItm_id());
            int row = update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record has been updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addUser(ManagerMdl mdl2) {
        try {
            String query = "INSERT INTO user(user_id, user_name, user_password, phone, isManager)  VALUES (?,?,?,?,?)";
            PreparedStatement add = connection().prepareStatement(query);

            add.setInt(1, mdl2.getUser_id());
            add.setString(2, mdl2.getUser_name());
            add.setString(3, mdl2.getUser_password());
            add.setInt(4, mdl2.getPhone());
            add.setBoolean(5, mdl2.getisManager());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(null, "New user added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUser(ManagerMdl mdl2) {
        try {
            String query = "update user set user_name=?,user_password=?,phone=?,isManager=? where user_id=?";
            PreparedStatement update = connection().prepareStatement(query);

            update.setString(1, mdl2.getUser_name());
            update.setString(2, mdl2.getUser_password());
            update.setInt(3, mdl2.getPhone());
            update.setBoolean(4, mdl2.getisManager());
            update.setInt(5, mdl2.getUser_id());
            int row = update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record has been updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void deleteUser(int user_id) {

        try {
            String query = "DELETE FROM user WHERE user_id=?";
            PreparedStatement delete = connection().prepareStatement(query);

            delete.setInt(1, user_id);
            delete.executeUpdate();
            JOptionPane.showMessageDialog(null, "User deleted");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
}
