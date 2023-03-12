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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/customer.png"))); // NOI18N
        jLabel1.setText("  Customer Info");

        backBtn2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
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
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(backBtn2)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 836, 150));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel2.setText("Full Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 82, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel3.setText("Phone Number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel4.setText("Point:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 82, -1));
        jPanel1.add(txt_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 201, -1));

        txt_phone_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phone_numberKeyPressed(evt);
            }
        });
        jPanel1.add(txt_phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 201, -1));

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
        jPanel1.add(txt_point, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 201, -1));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 770, 280));

        btn_save.setBackground(new java.awt.Color(0, 153, 153));
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_save.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(253, 248, 221));
        btn_save.setLabel("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 72, 35));

        btn_delete.setBackground(new java.awt.Color(228, 31, 37));
        btn_delete.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(253, 248, 221));
        btn_delete.setLabel("Delete");
        btn_delete.setName("Delete"); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 72, 35));

        btn_clear.setBackground(new java.awt.Color(255, 153, 0));
        btn_clear.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(253, 248, 221));
        btn_clear.setLabel("Clear");
        btn_clear.setName("Delete"); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 72, 35));

        btn_find.setBackground(new java.awt.Color(126, 171, 208));
        btn_find.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btn_find.setForeground(new java.awt.Color(253, 248, 221));
        btn_find.setText("Find");
        btn_find.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        jPanel1.add(btn_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 72, 35));

        button1.setBackground(new java.awt.Color(255, 204, 0));
        button1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(253, 248, 221));
        button1.setLabel("Export file");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 90, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Number of users:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        txt_quantity.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txt_quantity.setText("0");
        jPanel1.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 21, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4039, Short.MAX_VALUE))
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
