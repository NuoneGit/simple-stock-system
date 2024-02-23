package com.appleistore.view;

import com.appleistore.controller.Manager_controller;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import com.appleistore.controller.Manager_controller;
import com.appleistore.models.ManagerMdl;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class Manager extends javax.swing.JFrame {

    public Manager() {
        initComponents();
        loadTable();
    }

    private void Clear() {
        txtItmId.setText("");
        txtItmName.setText("");
        txtItmQty.setText("");
        txtItmPrice.setText("");
        CmbItmCat.setSelectedIndex(0);
    }

    public void loadAllDataIntoTable(List<ManagerMdl> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblItm.getModel();
        dtm.setRowCount(0);

        for (ManagerMdl mdl : list) {
            Vector v = new Vector();
            v.add(mdl.getItm_id());
            v.add(mdl.getItm_name());
            v.add(mdl.getItm_qty());
            v.add(mdl.getItm_price());
            v.add(mdl.getItm_cat());

            dtm.addRow(v);
        }
    }

    public void loadTable() {
        Manager_controller mcl = new Manager_controller();
        List list = mcl.loadItemData();
        loadAllDataIntoTable(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblStaffDash = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CmbItmCat = new javax.swing.JComboBox<>();
        txtItmPrice = new javax.swing.JTextField();
        txtItmQty = new javax.swing.JTextField();
        txtItmName = new javax.swing.JTextField();
        btnItmAdd = new javax.swing.JButton();
        btnItmEdit = new javax.swing.JButton();
        btnItmDelete = new javax.swing.JButton();
        btnItmClear = new javax.swing.JButton();
        txtItmId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItm = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtItmSrch = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(233, 236, 239));
        jPanel4.setForeground(new java.awt.Color(0, 0, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel3.setBackground(new java.awt.Color(11, 37, 69));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manage Products");

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Pit-Tux-Crystal-Bw-Apple.32.png"))); // NOI18N
        jLabel11.setText("Apple iStore");

        lblStaffDash.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblStaffDash.setForeground(new java.awt.Color(255, 255, 255));
        lblStaffDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Custom-Icon-Design-Pretty-Office-13-Users.32.png"))); // NOI18N
        lblStaffDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStaffDashMouseClicked(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(261, 261, 261)
                .addComponent(lblStaffDash)
                .addGap(32, 32, 32)
                .addComponent(lblLogout)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStaffDash)
                    .addComponent(lblLogout)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 37, 69));
        jLabel3.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(11, 37, 69));
        jLabel4.setText("Product Quantity");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(11, 37, 69));
        jLabel6.setText("Product Price");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(11, 37, 69));
        jLabel7.setText("Product Category");

        CmbItmCat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CmbItmCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iPhone", "iPad", "Airpods", "Mac", "Accosseries", "Speakers" }));
        CmbItmCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbItmCatActionPerformed(evt);
            }
        });

        txtItmPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtItmQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtItmName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnItmAdd.setBackground(new java.awt.Color(11, 37, 69));
        btnItmAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnItmAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnItmAdd.setText("Add");
        btnItmAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItmAddMouseClicked(evt);
            }
        });
        btnItmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItmAddActionPerformed(evt);
            }
        });

        btnItmEdit.setBackground(new java.awt.Color(11, 37, 69));
        btnItmEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnItmEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnItmEdit.setText("Update");
        btnItmEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItmEditActionPerformed(evt);
            }
        });

        btnItmDelete.setBackground(new java.awt.Color(164, 19, 60));
        btnItmDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnItmDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnItmDelete.setText("Delete");
        btnItmDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItmDeleteMouseClicked(evt);
            }
        });
        btnItmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItmDeleteActionPerformed(evt);
            }
        });

        btnItmClear.setBackground(new java.awt.Color(11, 37, 69));
        btnItmClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnItmClear.setForeground(new java.awt.Color(255, 255, 255));
        btnItmClear.setText("Clear");
        btnItmClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItmClearMouseClicked(evt);
            }
        });
        btnItmClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItmClearActionPerformed(evt);
            }
        });

        txtItmId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtItmId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItmIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(11, 37, 69));
        jLabel9.setText("Product ID");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(11, 37, 69));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Custom-Icon-Design-Pretty-Office-11-Add-item.32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CmbItmCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnItmAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnItmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnItmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnItmClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtItmName)
                    .addComponent(txtItmId)
                    .addComponent(txtItmQty)
                    .addComponent(txtItmPrice)
                    .addComponent(jLabel9))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(97, 97, 97))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItmId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtItmQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItmPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmbItmCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnItmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItmAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnItmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItmClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tblItm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblItm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product qty", "Product Price", "Product Category"
            }
        ));
        tblItm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItm);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 37, 69));
        jLabel1.setText("Product stock details");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Github-Octicons-Search-16.32.png"))); // NOI18N
        jLabel5.setText("Search Product");

        txtItmSrch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtItmSrch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItmSrchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtItmSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtItmSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(434, 434, 434))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int result = JOptionPane.showConfirmDialog(Manager.this, "Are you sure to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            Manager.this.dispose();
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblStaffDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStaffDashMouseClicked
        new Staff().setVisible(true);
        Manager.this.dispose();
    }//GEN-LAST:event_lblStaffDashMouseClicked

    private void tblItmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItmMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblItm.getModel();
        int selectedIndex = tblItm.getSelectedRow();

        if (selectedIndex != -1 && selectedIndex < model.getRowCount()) {
            txtItmId.setText(model.getValueAt(selectedIndex, 0).toString());
            txtItmName.setText(model.getValueAt(selectedIndex, 1).toString());
            txtItmQty.setText(model.getValueAt(selectedIndex, 2).toString());
            txtItmPrice.setText(model.getValueAt(selectedIndex, 3).toString());
            CmbItmCat.setSelectedItem(model.getValueAt(selectedIndex, 4).toString());
        }
    }//GEN-LAST:event_tblItmMouseClicked

    private void txtItmSrchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItmSrchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) tblItm.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tblItm.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtItmSrch.getText()));
    }//GEN-LAST:event_txtItmSrchKeyReleased

    private void CmbItmCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbItmCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbItmCatActionPerformed

    private void btnItmAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItmAddMouseClicked
        if (txtItmId.getText().isEmpty() || txtItmName.getText().isEmpty() || txtItmQty.getText().isEmpty() || txtItmPrice.getText().isEmpty() || CmbItmCat.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            int Itm_id = Integer.parseInt(txtItmId.getText());
            String Itm_name = txtItmName.getText();
            int Itm_qty = Integer.parseInt(txtItmQty.getText());
            double Itm_price = Double.parseDouble(txtItmPrice.getText());
            String Itm_cat = (String) CmbItmCat.getSelectedItem();

            ManagerMdl mdl = new ManagerMdl(Itm_id, Itm_name, Itm_qty, Itm_price, Itm_cat);
            Manager_controller mc = new Manager_controller();
            mc.addItem(mdl);
            loadTable();
            Clear();
        }
    }//GEN-LAST:event_btnItmAddMouseClicked

    private void btnItmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItmAddActionPerformed

    }//GEN-LAST:event_btnItmAddActionPerformed

    private void btnItmEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItmEditActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblItm.getModel();
        int selectedIndex = tblItm.getSelectedRow();

        if (selectedIndex != -1) {
            int Itm_id = Integer.parseInt(txtItmId.getText());
            String Itm_name = txtItmName.getText();
            int Itm_qty = Integer.parseInt(txtItmQty.getText());
            double Itm_price = Double.parseDouble(txtItmPrice.getText());
            String Itm_cat = (String) CmbItmCat.getSelectedItem();

            ManagerMdl mdl = new ManagerMdl(Itm_id, Itm_name, Itm_qty, Itm_price, Itm_cat);
            Manager_controller mc = new Manager_controller();
            mc.updateItem(mdl);
            loadTable();
            Clear();
        }
    }//GEN-LAST:event_btnItmEditActionPerformed

    private void btnItmDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItmDeleteMouseClicked

        int key;
        DefaultTableModel model = (DefaultTableModel) tblItm.getModel();
        int selectedIndex = tblItm.getSelectedRow();

        if (selectedIndex != -1) {
            key = Integer.valueOf(model.getValueAt(selectedIndex, 0).toString());
            Manager_controller d = new Manager_controller();
            d.deleteItem(key);

        }
        loadTable();
        Clear();
    }//GEN-LAST:event_btnItmDeleteMouseClicked

    private void btnItmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItmDeleteActionPerformed

    }//GEN-LAST:event_btnItmDeleteActionPerformed

    private void btnItmClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItmClearMouseClicked
        Clear();
    }//GEN-LAST:event_btnItmClearMouseClicked

    private void btnItmClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItmClearActionPerformed

    }//GEN-LAST:event_btnItmClearActionPerformed

    private void txtItmIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItmIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItmIdActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CmbItmCat;
    private javax.swing.JButton btnItmAdd;
    private javax.swing.JButton btnItmClear;
    private javax.swing.JButton btnItmDelete;
    private javax.swing.JButton btnItmEdit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblStaffDash;
    public javax.swing.JTable tblItm;
    private javax.swing.JTextField txtItmId;
    public javax.swing.JTextField txtItmName;
    public javax.swing.JTextField txtItmPrice;
    public javax.swing.JTextField txtItmQty;
    public javax.swing.JTextField txtItmSrch;
    // End of variables declaration//GEN-END:variables

}
