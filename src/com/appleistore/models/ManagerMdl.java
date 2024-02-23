package com.appleistore.models;

public class ManagerMdl {

    private int Itm_id;
    private String Itm_name;
    private int Itm_qty;
    private double Itm_price;
    private String Itm_cat;
    private int user_id;
    private String user_name;
    private String user_password;
    private int phone;
    private boolean isManager;

    public ManagerMdl(int Itm_id, String Itm_name, int Itm_qty, double Itm_price, String Itm_cat) {
        this.Itm_id = Itm_id;
        this.Itm_name = Itm_name;
        this.Itm_qty = Itm_qty;
        this.Itm_price = Itm_price;
        this.Itm_cat = Itm_cat;
    }

    public ManagerMdl(int user_id, String user_name, String user_password, int phone, boolean isManager) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.phone = phone;
        this.isManager = isManager;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public boolean getisManager() {
        return isManager;
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }

    public int getItm_id() {
        return Itm_id;
    }

    public void setItm_id(int Itm_id) {
        this.Itm_id = Itm_id;
    }

    public String getItm_name() {
        return Itm_name;
    }

    public void setItm_name(String Itm_name) {
        this.Itm_name = Itm_name;
    }

    public int getItm_qty() {
        return Itm_qty;
    }

    public void setItm_qty(int Itm_qty) {
        this.Itm_qty = Itm_qty;
    }

    public double getItm_price() {
        return Itm_price;
    }

    public void setItm_price(double Itm_price) {
        this.Itm_price = Itm_price;
    }

    public String getItm_cat() {
        return Itm_cat;
    }

    public void setItm_cat(String Itm_cat) {
        this.Itm_cat = Itm_cat;
    }

}
