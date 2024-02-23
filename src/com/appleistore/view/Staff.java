package com.appleistore.view;

import com.appleistore.controller.Manager_controller;
import com.appleistore.models.ManagerMdl;
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

public class Staff extends javax.swing.JFrame {

    public Staff() {
        initComponents();
        loadUserTable();

    }

    private void Clear() {
        txtUserId.setText("");
        txtUserName.setText("");
        txtUserPassword.setText("");
        txtUserPhone.setText("");
        rdbtn.setSelected(false);
    }

    public void loadDataIntoTable(List<ManagerMdl> list2) {
        DefaultTableModel dtm2 = (DefaultTableModel) tblStaff.getModel();
        dtm2.setRowCount(0);

        for (ManagerMdl mdl2 : list2) {
            Vector v2 = new Vector();
            v2.add(mdl2.getUser_id());
            v2.add(mdl2.getUser_name());
            v2.add(mdl2.getUser_password());
            v2.add(mdl2.getPhone());
            v2.add(mdl2.getisManager());

            dtm2.addRow(v2);
        }
    }

    public void loadUserTable() {
        Manager_controller mcl2 = new Manager_controller();
        List list2 = mcl2.loadUserData();
        loadDataIntoTable(list2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblitemsDash = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtUserPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUserPhone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        rdbtn = new javax.swing.JRadioButton();
        btnStaffAdd = new javax.swing.JButton();
        btnStaffEdit = new javax.swing.JButton();
        btnStaffDelete = new javax.swing.JButton();
        btnStaffClear = new javax.swing.JButton();
        txtUserId = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtStaffSrch = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 236, 239));

        jPanel3.setBackground(new java.awt.Color(11, 37, 69));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manage Users");

        lblitemsDash.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblitemsDash.setForeground(new java.awt.Color(255, 255, 255));
        lblitemsDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Custom-Icon-Design-Pretty-Office-11-Add-item.32.png"))); // NOI18N
        lblitemsDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblitemsDashMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Pit-Tux-Crystal-Bw-Apple.32.png"))); // NOI18N
        jLabel11.setText("Apple iStore");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(269, 269, 269)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(lblitemsDash)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblitemsDash)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(11, 37, 69));
        jLabel15.setText("User Name");

        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(11, 37, 69));
        jLabel16.setText("User Password");

        txtUserPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPasswordActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(11, 37, 69));
        jLabel9.setText("User Phone");

        txtUserPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPhoneActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(11, 37, 69));
        jLabel17.setText("isManager");

        rdbtn.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        rdbtn.setForeground(new java.awt.Color(0, 0, 51));

        btnStaffAdd.setBackground(new java.awt.Color(11, 37, 69));
        btnStaffAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStaffAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnStaffAdd.setText("Add");
        btnStaffAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStaffAddMouseClicked(evt);
            }
        });
        btnStaffAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffAddActionPerformed(evt);
            }
        });

        btnStaffEdit.setBackground(new java.awt.Color(11, 37, 69));
        btnStaffEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStaffEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnStaffEdit.setText("Update");
        btnStaffEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffEditActionPerformed(evt);
            }
        });

        btnStaffDelete.setBackground(new java.awt.Color(164, 19, 60));
        btnStaffDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStaffDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnStaffDelete.setText("Delete");
        btnStaffDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStaffDeleteMouseClicked(evt);
            }
        });
        btnStaffDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffDeleteActionPerformed(evt);
            }
        });

        btnStaffClear.setBackground(new java.awt.Color(11, 37, 69));
        btnStaffClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStaffClear.setForeground(new java.awt.Color(255, 255, 255));
        btnStaffClear.setText("Clear");
        btnStaffClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStaffClearMouseClicked(evt);
            }
        });
        btnStaffClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffClearActionPerformed(evt);
            }
        });

        txtUserId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 37, 69));
        jLabel18.setText("User ID");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 37, 69));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Custom-Icon-Design-Pretty-Office-13-Users.32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnStaffAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnStaffEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnStaffDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnStaffClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel9)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtn))
                            .addComponent(txtUserId)
                            .addComponent(txtUserName)
                            .addComponent(txtUserPassword)
                            .addComponent(txtUserPhone)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel19)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(rdbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStaffAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStaffEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStaffDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStaffClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(728, 309));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 37, 69));
        jLabel1.setText("User Details");

        tblStaff.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "User Name", "User Password", "User Phone", "Position (isManager)"
            }
        ));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appleistore/view/icons/Github-Octicons-Search-16.32.png"))); // NOI18N
        jLabel5.setText("Search User");

        txtStaffSrch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStaffSrch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStaffSrchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStaffSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(11, 37, 69));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Apple iStore");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(434, 434, 434))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblitemsDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblitemsDashMouseClicked

            new Manager().setVisible(true);
            Staff.this.dispose();
        

    }//GEN-LAST:event_lblitemsDashMouseClicked

    private void txtUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPasswordActionPerformed

    private void txtUserPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPhoneActionPerformed

    private void btnStaffAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffAddMouseClicked

    }//GEN-LAST:event_btnStaffAddMouseClicked

    private void btnStaffAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffAddActionPerformed

        if (txtUserId.getText().isEmpty() || txtUserName.getText().isEmpty() || txtUserPassword.getText().isEmpty() || txtUserPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            int user_id = Integer.parseInt(txtUserId.getText());
            String user_name = txtUserName.getText();
            String user_password = txtUserPassword.getText();
            int phone = Integer.parseInt(txtUserPhone.getText());
            boolean isManager = rdbtn.isSelected();

            ManagerMdl mdl2 = new ManagerMdl(user_id, user_name, user_password, phone, isManager);
            Manager_controller mc2 = new Manager_controller();
            mc2.addUser(mdl2);
            loadUserTable();
            Clear();
        }
    }//GEN-LAST:event_btnStaffAddActionPerformed

    private void btnStaffEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffEditActionPerformed


        DefaultTableModel model = (DefaultTableModel) tblStaff.getModel();
        int selectedIndex = tblStaff.getSelectedRow();

        if (selectedIndex != -1) {
            int user_id = Integer.parseInt(txtUserId.getText());
            String user_name = txtUserName.getText();
            String user_password = txtUserPassword.getText();
            int phone = Integer.parseInt(txtUserPhone.getText());
            boolean isManager = rdbtn.isSelected();

            ManagerMdl mdl2 = new ManagerMdl(user_id, user_name, user_password, phone, isManager);
            Manager_controller mc = new Manager_controller();
            mc.updateUser(mdl2);
            loadUserTable();
            Clear();
        }
    }//GEN-LAST:event_btnStaffEditActionPerformed

    private void btnStaffDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffDeleteMouseClicked
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_btnStaffDeleteMouseClicked

    private void btnStaffDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffDeleteActionPerformed
        int key;
        DefaultTableModel model = (DefaultTableModel) tblStaff.getModel();
        int selectedIndex = tblStaff.getSelectedRow();

        if (selectedIndex != -1) {
            key = Integer.valueOf(model.getValueAt(selectedIndex, 0).toString());
            Manager_controller d = new Manager_controller();
            d.deleteUser(key);

        }
        loadUserTable();
        Clear();
    }//GEN-LAST:event_btnStaffDeleteActionPerformed

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked


        DefaultTableModel model = (DefaultTableModel) tblStaff.getModel();
        int selectedIndex = tblStaff.getSelectedRow();

        if (selectedIndex != -1 && selectedIndex < model.getRowCount()) {
            txtUserId.setText(model.getValueAt(selectedIndex, 0).toString());
            txtUserName.setText(model.getValueAt(selectedIndex, 1).toString());
            txtUserPassword.setText(model.getValueAt(selectedIndex, 2).toString());
            txtUserPhone.setText(model.getValueAt(selectedIndex, 3).toString());
            boolean isManager = Boolean.parseBoolean(model.getValueAt(selectedIndex, 4).toString());
            rdbtn.setSelected(isManager);
        }

    }//GEN-LAST:event_tblStaffMouseClicked

    private void txtStaffSrchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStaffSrchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) tblStaff.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tblStaff.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtStaffSrch.getText()));
    }//GEN-LAST:event_txtStaffSrchKeyReleased

    private void btnStaffClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffClearActionPerformed
        Clear();
    }//GEN-LAST:event_btnStaffClearActionPerformed

    private void btnStaffClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffClearMouseClicked

    }//GEN-LAST:event_btnStaffClearMouseClicked

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStaffAdd;
    private javax.swing.JButton btnStaffClear;
    private javax.swing.JButton btnStaffDelete;
    private javax.swing.JButton btnStaffEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblitemsDash;
    private javax.swing.JRadioButton rdbtn;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtStaffSrch;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassword;
    private javax.swing.JTextField txtUserPhone;
    // End of variables declaration//GEN-END:variables
}
