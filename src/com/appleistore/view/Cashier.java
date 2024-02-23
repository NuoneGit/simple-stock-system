package com.appleistore.view;

import com.appleistore.database.db_connection;
import com.appleistore.controller.Cashier_controller;
import com.appleistore.controller.InventoryUtils;
import com.appleistore.controller.Manager_controller;
import com.appleistore.controller.OpenPdf;
import static com.appleistore.controller.OpenPdf.OpenById;
import com.appleistore.models.CashierMdl;
import com.appleistore.models.ManagerMdl;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.itextpdf.text.BaseColor;

public class Cashier extends javax.swing.JFrame {

    private double finalTotal = 0;
    private String orderId = "";

    public Cashier() {
        initComponents();
        loadTable();

    }

    public void loadAllDataIntoTable(List<CashierMdl> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblItm.getModel();
        dtm.setRowCount(0);

        for (CashierMdl cmdl : list) {
            Vector v = new Vector();
            v.add(cmdl.getItm_id());
            v.add(cmdl.getItm_name());
            v.add(cmdl.getItm_qty());
            v.add(cmdl.getItm_price());

            dtm.addRow(v);
        }
    }

    public void loadTable() {
        Cashier_controller cmcl = new Cashier_controller();
        List list = cmcl.loadItemDatatoCashier();
        loadAllDataIntoTable(list);
    }

    private void Clear() {

        txtItmId.setText("");
        txtItmName.setText("");
        txtItmPrice.setText("");
        txtItmQty.setText("");
        txtItmSrch.setText("");
    }

    public String getUniqueId(String prefix) {
        return prefix + System.nanoTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtItmQty = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        txtItmName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtItmPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddBill = new javax.swing.JButton();
        txtItmId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        btnprint = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCrt = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItm = new javax.swing.JTable();
        txtItmSrch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 236, 239));

        jPanel3.setBackground(new java.awt.Color(11, 37, 69));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Billing");

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Pit-Tux-Crystal-Bw-Apple.32.png"))); // NOI18N
        jLabel11.setText("Apple iStore");

        lblLogout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Custom-Icon-Design-Pretty-Office-11-Logout.32.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(330, 330, 330)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(236, 534));

        txtItmQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnclear.setBackground(new java.awt.Color(164, 19, 60));
        btnclear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.setMaximumSize(new java.awt.Dimension(72, 35));
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        txtItmName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(11, 37, 69));
        jLabel4.setText("Product Qty");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(11, 37, 69));
        jLabel6.setText("Product Price");

        txtItmPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 37, 69));
        jLabel3.setText("Product Name");

        btnAddBill.setBackground(new java.awt.Color(11, 37, 69));
        btnAddBill.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddBill.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBill.setText("Add to Cart");
        btnAddBill.setMaximumSize(new java.awt.Dimension(72, 35));
        btnAddBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBillMouseClicked(evt);
            }
        });
        btnAddBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBillActionPerformed(evt);
            }
        });

        txtItmId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(11, 37, 69));
        jLabel13.setText("Product ID");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(11, 37, 69));
        jLabel9.setText("Total Amount Rs.");

        lbltotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(11, 37, 69));
        lbltotal.setText("0000");

        btnprint.setBackground(new java.awt.Color(11, 37, 69));
        btnprint.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setText("Print");
        btnprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprintMouseClicked(evt);
            }
        });
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(11, 37, 69));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Emey87-Trainee-Billing.32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtItmId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnAddBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtItmQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItmPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItmName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lbltotal))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(99, 99, 99))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItmId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItmPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txtItmQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lbltotal)
                .addGap(43, 43, 43)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(516, 496));

        tblCrt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product name", "Product qty", "Product price", "Sub total"
            }
        ));
        tblCrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCrtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCrt);

        tblItm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product name", "Product qty", "Product price"
            }
        ));
        tblItm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItmMouseClicked(evt);
            }
        });
        tblItm.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblItmComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblItm);

        txtItmSrch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtItmSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItmSrchActionPerformed(evt);
            }
        });
        txtItmSrch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItmSrchKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 37, 69));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Github-Octicons-Search-16.32.png"))); // NOI18N
        jLabel5.setText("Search");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 37, 69));
        jLabel1.setText("Cart table");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 37, 69));
        jLabel2.setText("Product stock details");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItmSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtItmSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(11, 37, 69));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Apple iStore");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int result = JOptionPane.showConfirmDialog(Cashier.this, "Are you sure to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            Cashier.this.dispose();
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void txtItmSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItmSrchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItmSrchActionPerformed

    private void txtItmSrchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItmSrchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) tblItm.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tblItm.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtItmSrch.getText()));
    }//GEN-LAST:event_txtItmSrchKeyReleased

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        Clear();
    }//GEN-LAST:event_btnclearMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed

    }//GEN-LAST:event_btnclearActionPerformed

    private void tblItmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItmMouseClicked
        int index = tblItm.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblItm.getModel();

        String itmIdString = model.getValueAt(index, 0).toString();
        try {
            int Itm_id = Integer.parseInt(itmIdString);
            txtItmId.setText(String.valueOf(Itm_id));
        } catch (NumberFormatException e) {
            txtItmId.setText("Invalid ID");
        }

        String Itm_name = model.getValueAt(index, 1).toString();
        txtItmName.setText(Itm_name);

        String itmPriceString = model.getValueAt(index, 3).toString();
        try {
            double Itm_price = Double.parseDouble(itmPriceString);
            txtItmPrice.setText(String.valueOf(Itm_price));
        } catch (NumberFormatException e) {
            txtItmPrice.setText("Invalid Price");
        }
    }//GEN-LAST:event_tblItmMouseClicked

    private void btnprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprintMouseClicked

        if (finalTotal != 0) {
            orderId = getUniqueId("Bill-");

            DefaultTableModel dtm = (DefaultTableModel) tblCrt.getModel();
            if (tblCrt.getRowCount() != 0) {
                for (int i = 0; i < tblCrt.getRowCount(); i++) {
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/istore_db", "root", "")) {
                        Statement st = con.createStatement();
                        String sql = "UPDATE items_tbl SET Itm_qty = Itm_qty - " + Integer.parseInt(dtm.getValueAt(i, 2).toString())
                                + " WHERE Itm_id = " + Integer.parseInt(dtm.getValueAt(i, 0).toString());

                        int rowsAffected = st.executeUpdate(sql);

                        
                        if (rowsAffected > 0) {
                            System.out.println("Update successful. Rows affected: " + rowsAffected);
                        } else {
                            System.out.println("No rows were updated.");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/istore_db", "root", "")) {
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar calendar = Calendar.getInstance();
                PreparedStatement ps = con.prepareStatement("insert into orderdetails_tbl(orderId,orderDate,totalPaid) values(?,?,?)");
                ps.setString(1, orderId);
                ps.setString(2, myFormat.format(calendar.getTime()));
                ps.setDouble(3, finalTotal);
                ps.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //creating doc
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

            try {
                PdfWriter.getInstance(doc, new FileOutputStream(InventoryUtils.billPath + "" + orderId + ".pdf"));
                doc.open();
                Paragraph projectName = new Paragraph("                                               Apple iStore\n");
                doc.add(projectName);
                Paragraph strLine = new Paragraph("************************************************************************************************************");
                doc.add(strLine);
                Paragraph details = new Paragraph("\tOrder ID: " + orderId + "\nDate: " + new Date() + "\nTotal Paid: " + finalTotal);
                doc.add(details);
                doc.add(strLine);
                PdfPTable tb1 = new PdfPTable(4);
                PdfPCell nameCell = new PdfPCell(new Phrase("Product Name"));
                PdfPCell qtyCell = new PdfPCell(new Phrase("Product qty"));
                PdfPCell priceCell = new PdfPCell(new Phrase("Product price"));
                PdfPCell subTotalCell = new PdfPCell(new Phrase("Sub Total"));
                BaseColor bgcolor = new BaseColor(233, 236, 239);
                nameCell.setBackgroundColor(bgcolor);
                qtyCell.setBackgroundColor(bgcolor);
                priceCell.setBackgroundColor(bgcolor);
                subTotalCell.setBackgroundColor(bgcolor);
                tb1.addCell(nameCell);
                tb1.addCell(qtyCell);
                tb1.addCell(priceCell);
                tb1.addCell(subTotalCell);

                for (int i = 0; i < tblCrt.getRowCount(); i++) {
                    tb1.addCell(tblCrt.getValueAt(i, 1).toString());
                    tb1.addCell(tblCrt.getValueAt(i, 2).toString());
                    tb1.addCell(tblCrt.getValueAt(i, 3).toString());
                    tb1.addCell(tblCrt.getValueAt(i, 4).toString());
                }

                doc.add(tb1);
                doc.add(strLine);
                Paragraph tnxMsg = new Paragraph("ThankYou, please visit again..");
                doc.add(tnxMsg);
                OpenPdf.OpenById(orderId);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new Cashier().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Please add some product to cart");
        }
    }//GEN-LAST:event_btnprintMouseClicked

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnAddBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBillMouseClicked

    private void btnAddBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBillActionPerformed
        int Itm_qty = Integer.parseInt(txtItmQty.getText());

        if (Itm_qty > 0) {
            String Itm_id = txtItmId.getText();
            String Itm_name = txtItmName.getText();

            try {
                double Itm_price = Double.parseDouble(txtItmPrice.getText());
                double total = Itm_qty * Itm_price;

                int checkStock = 0;
                int checkProductAlreadyExistInCart = 0;

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/istore_db", "root", "")) {
                    Statement st = con.createStatement();
                    String sql = "select * from items_tbl where Itm_id = " + Itm_id;
                    ResultSet rs = st.executeQuery(sql);

                    if (rs.next()) {
                        if (rs.getInt("Itm_qty") >= Itm_qty) {
                            checkStock = 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "Product is out of stock ");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Product not found in the database");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                if (checkStock == 1) {
                    DefaultTableModel model = (DefaultTableModel) tblCrt.getModel();
                    if (tblCrt.getRowCount() != 0) {
                        for (int i = 0; i < tblCrt.getRowCount(); i++) {
                            if (model.getValueAt(i, 0) != null && model.getValueAt(i, 0).toString().equals(Itm_id)) {
                                checkProductAlreadyExistInCart = 1;
                                JOptionPane.showMessageDialog(null, "Product already exists in the cart");
                            }
                        }
                    }

                    if (checkProductAlreadyExistInCart == 0) {
                        model.addRow(new Object[]{Itm_id, Itm_name, Itm_qty, Itm_price, total});
                        finalTotal = Double.parseDouble(lbltotal.getText()) + total;
                        lbltotal.setText(String.valueOf(finalTotal));
                        JOptionPane.showMessageDialog(null, "Added Successfully");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid quantity or price format");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid quantity entered");
        }
    }//GEN-LAST:event_btnAddBillActionPerformed

    private void tblItmComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblItmComponentShown
        txtItmId.setEditable(false);
        txtItmName.setEditable(false);
        txtItmPrice.setEditable(false);


    }//GEN-LAST:event_tblItmComponentShown

    private void tblCrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCrtMouseClicked
//        int index = tblCrt.getSelectedRow();
//    int a = JOptionPane.showConfirmDialog(null, "Do you want to remove this product?", "Confirmation", JOptionPane.YES_NO_OPTION);
//    if (a == 0) {
//        DefaultTableModel model = (DefaultTableModel) tblCrt.getModel();
//        
//
//        if (index >= 0 && index < model.getRowCount()) {
//            String subTotalStr = model.getValueAt(index, 5).toString();
//            double subTotal = Double.parseDouble(subTotalStr);
//            finalTotal -= subTotal;
//            lbltotal.setText(String.valueOf(finalTotal));
//            model.removeRow(index);
//        }
//    }

    }//GEN-LAST:event_tblCrtMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBill;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblCrt;
    private javax.swing.JTable tblItm;
    private javax.swing.JTextField txtItmId;
    private javax.swing.JTextField txtItmName;
    private javax.swing.JTextField txtItmPrice;
    private javax.swing.JTextField txtItmQty;
    private javax.swing.JTextField txtItmSrch;
    // End of variables declaration//GEN-END:variables

}
