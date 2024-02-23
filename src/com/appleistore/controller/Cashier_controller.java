
package com.appleistore.controller;
import com.appleistore.database.db_connection;
import com.appleistore.models.CashierMdl;
import com.appleistore.models.ManagerMdl;
import com.appleistore.view.Cashier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cashier_controller extends db_connection {
    public List<CashierMdl> loadItemDatatoCashier() {
        List<CashierMdl> list3 = new ArrayList<CashierMdl>();
        try {
            String query = "select * from items_tbl";
            PreparedStatement ps3 = connection().prepareStatement(query);
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {
                int Itm_id = rs3.getInt("Itm_id");
                String Itm_name = rs3.getString("Itm_name");
                int Itm_qty = rs3.getInt("Itm_qty");
                double Itm_price = rs3.getDouble("Itm_price");
                String Itm_cat = rs3.getString("Itm_cat");

                CashierMdl cmdl = new CashierMdl(Itm_id, Itm_name, Itm_qty, Itm_price);
                list3.add(cmdl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list3;
    }
    
//     public List<CashierMdl> loadItemDatatoInvoice() {
//        List<CashierMdl> list4 = new ArrayList<CashierMdl>();
//        try {
//            String query = "select * from invoice_tbl";
//            PreparedStatement ps4 = connection().prepareStatement(query);
//            ResultSet rs4 = ps4.executeQuery();
//            while (rs4.next()) {
//
//                int itm_id = rs4.getInt("itm_id");
//                String itm_name = rs4.getString("itm_name");
//                double itm_price = rs4.getDouble("itm_price");
//                int itm_qty = rs4.getInt("itm_qty");
//
//                CashierMdl cmdl = new CashierMdl(itm_id, itm_name, itm_qty, itm_price);
//                list4.add(cmdl);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return list4;
//    }
//    
//    public void addItem(CashierMdl cmdl) {
//        try {
//            String query = "INSERT INTO invoice_tbl (billing_id,itm_id,itm_name,  itm_price, itm_qty) VALUES (?,?,?,?,?)";
//            PreparedStatement add = connection().prepareStatement(query);
//            add.setInt(1, cmdl.getBilling_id());
//            add.setInt(2, cmdl.getItm_id());
//            add.setString(3, cmdl.getItm_name());
//            add.setDouble(4, cmdl.getItm_price());
//            add.setInt(5, cmdl.getItm_qty());
//            
//            int row = add.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Item added");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
