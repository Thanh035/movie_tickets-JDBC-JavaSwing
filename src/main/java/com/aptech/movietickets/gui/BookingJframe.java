package com.aptech.movietickets.gui;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IScheduleDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.ScheduleDAO;

public class BookingJframe extends javax.swing.JFrame {

//    @Inject
    private IScheduleDAO scheduleDAO = new ScheduleDAO();
//    @Inject
    private IMovieDAO movieDAO = new MovieDAO();
//    @Inject
    private IBookingDAO bookingDAO = new BookingDAO();
//    @Inject
//    private ICustomerDAO customerDAO = new CustomerDAO();F

    public BookingJframe() {
        initComponents();
//        showComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_add = new java.awt.Button();
        btn_reset = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        txt_room_name = new javax.swing.JComboBox<>();
        txt_movie_name = new javax.swing.JComboBox<>();
        txt_normal_ticket = new javax.swing.JTextField();
        txt_vip_ticket = new javax.swing.JTextField();
        txt_schedule_end = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_movie = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_room_name1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 248, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Full name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 85, 35));

        jLabel4.setText("Price:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 85, 35));

        jLabel5.setText("Movie:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 85, 35));

        jLabel6.setText("Room");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 85, 35));

        btn_add.setBackground(new java.awt.Color(0, 153, 153));
        btn_add.setForeground(new java.awt.Color(253, 248, 221));
        btn_add.setLabel("Save");
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 65, 32));

        btn_reset.setBackground(new java.awt.Color(228, 31, 37));
        btn_reset.setForeground(new java.awt.Color(253, 248, 221));
        btn_reset.setLabel("Delete");
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 64, 32));

        jLabel8.setText("Phone number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 85, 35));

        txt_room_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Room 1", "Room 2", "Room 3", "Room 4" }));
        jPanel1.add(txt_room_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 103, -1));

        txt_movie_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txt_movie_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_movie_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_movie_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 103, -1));

        txt_normal_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_normal_ticketActionPerformed(evt);
            }
        });
        jPanel1.add(txt_normal_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 291, -1));

        txt_vip_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vip_ticketActionPerformed(evt);
            }
        });
        jPanel1.add(txt_vip_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 291, -1));

        txt_schedule_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_schedule_endActionPerformed(evt);
            }
        });
        jPanel1.add(txt_schedule_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 291, -1));

        tbl_movie.setBackground(new java.awt.Color(255, 215, 65));
        tbl_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", " Full name", "Phone number", "Movie", "Room", "Seat", "Start time", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_movie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_movieMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_movie);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 450, 405));

        jPanel2.setBackground(new java.awt.Color(255, 215, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setText("Booking Page");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 33, -1, -1));

        backBtn2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        backBtn2.setText("Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 28, -1, 44));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 924, 90));

        jLabel9.setText("Start time:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 85, 35));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 291, -1));

        jLabel7.setText("Seat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 85, 35));

        txt_room_name1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Room 1", "Room 2", "Room 3", "Room 4" }));
        txt_room_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_room_name1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_room_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 103, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_movie_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_movie_nameActionPerformed

    }//GEN-LAST:event_txt_movie_nameActionPerformed

    private void txt_normal_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_normal_ticketActionPerformed

    }//GEN-LAST:event_txt_normal_ticketActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
//        String fullname = txt_fullname.getText().toString();
//        String phone_number = txt_phone_number.getText().toString();
//        CustomerModel customerModel = new CustomerModel();
//        customerModel.setFullname(fullname);
//        customerModel.setPhone_number(phone_number);

//        int customer_id = customerDAO.save(customerModel);
//        int schedule_id = txt_schedule_name.getSelectedIndex();
//        BookingModel bookingModel = new BookingModel();
//        bookingModel.setCustomer_id(customer_id);
//        bookingModel.setSchedule_id(schedule_id);
//        bookingDAO.save(bookingModel);
    }//GEN-LAST:event_btn_addActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJframe home = new HomeJframe();
        home.setVisible(true);
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void txt_seatcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_seatcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_seatcodeActionPerformed

    private void txt_room_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_room_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_room_name1ActionPerformed

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
            java.util.logging.Logger.getLogger(BookingJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_add;
    private java.awt.Button btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_movie;
    private javax.swing.JComboBox<String> txt_movie_name;
    private javax.swing.JTextField txt_normal_ticket;
    private javax.swing.JComboBox<String> txt_room_name;
    private javax.swing.JComboBox<String> txt_room_name1;
    private javax.swing.JTextField txt_schedule_end;
    private javax.swing.JTextField txt_vip_ticket;
    // End of variables declaration//GEN-END:variables

//    private void showComboBox() {
//        List<ScheduleModel> schedules = scheduleDAO.findAll();
//        for (ScheduleModel schedule : schedules) {
//            MovieModel model = movieDAO.findOne(schedule.getId());
//            txt_schedule_name.insertItemAt(model.getTitle() + " - " + schedule.getSchedule_start(), schedule.getId());
////            txt_schedule_name.addItem(schedule.getName() + "(" + model.getName() + ") - " + schedule.getId());
//        }
//    }
//
//    private void resetForm() {
//        txt_fullname.setText("");
//        txt_phone_number.setText("");
//        txt_schedule_name.setSelectedItem("Select");
//    }
}
