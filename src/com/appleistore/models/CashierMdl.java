package com.appleistore.models;

public class CashierMdl {

    private int itm_id;
    private String itm_name;
    private int itm_qty;
    private double itm_price;

    public CashierMdl(int itm_id, String itm_name, int itm_qty, double itm_price) {
        this.itm_id = itm_id;
        this.itm_name = itm_name;
        this.itm_qty = itm_qty;
        this.itm_price = itm_price;
    }

    public int getItm_id() {
        return itm_id;
    }

    public void setItm_id(int itm_id) {
        this.itm_id = itm_id;
    }

    public String getItm_name() {
        return itm_name;
    }

    public void setItm_name(String itm_name) {
        this.itm_name = itm_name;
    }

    public int getItm_qty() {
        return itm_qty;
    }

    public void setItm_qty(int itm_qty) {
        this.itm_qty = itm_qty;
    }

    public double getItm_price() {
        return itm_price;
    }

    public void setItm_price(double itm_price) {
        this.itm_price = itm_price;
    }

    
}
