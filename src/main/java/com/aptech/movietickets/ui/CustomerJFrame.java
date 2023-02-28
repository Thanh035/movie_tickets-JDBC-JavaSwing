package com.aptech.movietickets.ui;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.model.CustomerModel;
import com.aptech.movietickets.service.ICustomerService;
import com.aptech.movietickets.service.impl.CustomerService;
import com.aptech.movietickets.utils.EventsUtil;
import com.aptech.movietickets.utils.FileUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerJFrame extends javax.swing.JFrame {

    private ICustomerService customerService = new CustomerService();
    private IBookingDAO bookingDAO = new BookingDAO();
    DefaultTableModel tableModel;
    int currentIndex = -1;
    List<CustomerModel> customers;

    public CustomerJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tbl_customer.getModel();
        showCustomer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fullname = new javax.swing.JTextField();
        txt_phone_number = new javax.swing.JTextField();
        txt_point = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        btn_save = new java.awt.Button();
        btn_delete = new java.awt.Button();
        btn_clear = new java.awt.Button();
        btn_find = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 248, 221));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setText("Customer Info");

        backBtn2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        backBtn2.setText("Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227)
                .addComponent(backBtn2)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jLabel2.setText("Full Name:");

        jLabel3.setText("Phone Number:");

        jLabel4.setText("Point:");

        txt_phone_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phone_numberKeyPressed(evt);
            }
        });

        txt_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pointActionPerformed(evt);
            }
        });
        txt_point.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pointKeyPressed(evt);
            }
        });

        tbl_customer.setBackground(new java.awt.Color(255, 153, 51));
        tbl_customer.setForeground(new java.awt.Color(253, 248, 221));
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Full Name", "Phone Number", "Point", "Created Date", "Modified Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_customer);
        if (tbl_customer.getColumnModel().getColumnCount() > 0) {
            tbl_customer.getColumnModel().getColumn(0).setMinWidth(30);
            tbl_customer.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_customer.getColumnModel().getColumn(3).setMinWidth(50);
            tbl_customer.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        btn_save.setBackground(new java.awt.Color(0, 153, 153));
        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_save.setLabel("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(228, 31, 37));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_delete.setLabel("Delete");
        btn_delete.setName("Delete"); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(204, 255, 0));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_clear.setLabel("Clear");
        btn_clear.setName("Delete"); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_find.setBackground(new java.awt.Color(102, 102, 255));
        btn_find.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setText("Find");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 255, 51));
        button1.setLabel("Export file");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of users:");

        txt_quantity.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(131, 131, 131))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_point, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_find)
                                    .addGap(26, 26, 26)))
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_point, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_quantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(23, 23, 23))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pointKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pointKeyPressed
        EventsUtil.validateKeyPressed(evt, txt_point);
    }//GEN-LAST:event_txt_pointKeyPressed

    private void txt_phone_numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phone_numberKeyPressed
        EventsUtil.validateKeyPressed(evt, txt_phone_number);
    }//GEN-LAST:event_txt_phone_numberKeyPressed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        String input = JOptionPane.showInputDialog("Enter the phone number you are looking for ?");
        if (input != null && input.length() > 0) {
            List<CustomerModel> findCustomer = customers.stream()
                    .filter(u -> u.getPhone_number().equalsIgnoreCase(input))
                    .toList();
            tableModel.setRowCount(0);
            if (!findCustomer.isEmpty()) {
                showData(findCustomer);
            }
            return;
        }
        showCustomer();
    }//GEN-LAST:event_btn_findActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        FileUtil.writeExcel(tbl_customer);
    }//GEN-LAST:event_button1ActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJFrame home = new HomeJFrame();
        home.setVisible(true);
    }// GEN-LAST:event_backBtn2ActionPerformed

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_customerMouseClicked
        int position = tbl_customer.getSelectedRow();
        showRow(position);
    }// GEN-LAST:event_tbl_customerMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_saveActionPerformed
        if (!Validate()) {
            return;
        }
        currentIndex = tbl_customer.getSelectedRow();
        CustomerModel customer = new CustomerModel();

        String fullname = txt_fullname.getText();
        String phone_number = txt_phone_number.getText();
        int point = Integer.parseInt(txt_point.getText());

        customer.setFullname(fullname);
        customer.setPhone_number(phone_number);
        customer.setPoint(point);

        if (currentIndex >= 0) {
            customer.setId(customers.get(currentIndex).getId());
            currentIndex = -1;
            customerService.update(customer);
            JOptionPane.showMessageDialog(rootPane, "Update customer successfully");
        } else {
            if (customerService.save(customer) == null) {
                JOptionPane.showMessageDialog(rootPane, "Add customer failed");
            }
        }

        customers = customerService.findAll();
        showCustomer();
        btn_clearActionPerformed(evt);
    }// GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleteActionPerformed
        currentIndex = tbl_customer.getSelectedRow();
        if (currentIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "You haven't choose anything to delete");
            return;
        }
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this customer?");
        if (option == 0 && currentIndex >= 0) {

            if (!customerService.delete(customers.get(currentIndex).getId())) {
                JOptionPane.showMessageDialog(rootPane, "This customer is currently airing. Cannot delete!!");
            }
            currentIndex = -1;
            customers = customerService.findAll();
            showCustomer();
            btn_clearActionPerformed(evt);
        }
        btn_clearActionPerformed(evt);
    }// GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_clearActionPerformed
        txt_fullname.setText("");
        txt_phone_number.setText("");
        txt_point.setText("");
        showCustomer();
    }// GEN-LAST:event_btn_clearActionPerformed

    private void txt_pointActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_pointActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_pointActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_clear;
    private java.awt.Button btn_delete;
    private javax.swing.JButton btn_find;
    private java.awt.Button btn_save;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_phone_number;
    private javax.swing.JTextField txt_point;
    private javax.swing.JLabel txt_quantity;
    // End of variables declaration//GEN-END:variables

    private void showCustomer() {
        customers = customerService.findAll();

        tableModel.setRowCount(0);

        showData(customers);
        txt_quantity.setText(String.valueOf(customerService.getTotalItem()));
    }

    private boolean Validate() {
        try {
            if (txt_fullname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid fullname");
                return false;
            }
            if (txt_phone_number.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Invalid phone number");
                return false;
            }
            if (txt_point.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid point");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }

    private void showRow(int position) {
        CustomerModel customer = customers.get(position);
        txt_fullname.setText(customer.getFullname());
        txt_point.setText(String.valueOf(customer.getPoint()));
        txt_phone_number.setText(customer.getPhone_number());
    }

    private void showData(List<CustomerModel> customers) {
        for (CustomerModel customer : customers) {
            tableModel.addRow(new Object[]{
                tableModel.getRowCount() + 1,
                customer.getFullname(),
                customer.getPhone_number(),
                customer.getPoint(),
                customer.getCreatedDate(),
                customer.getModifiedDate()
            });
        }
    }
}
