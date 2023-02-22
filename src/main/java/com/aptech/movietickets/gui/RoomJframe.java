package com.aptech.movietickets.gui;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.IRoomDAO;
import com.aptech.movietickets.dao.ISeatDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.RoomDAO;
import com.aptech.movietickets.dao.impl.SeatDAO;
import com.aptech.movietickets.model.BookingModel;
import com.aptech.movietickets.model.RoomModel;
import com.aptech.movietickets.model.SeatModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoomJframe extends javax.swing.JFrame {

    private IRoomDAO roomDAO = new RoomDAO();
    private ISeatDAO seatDAO = new SeatDAO();
    private IBookingDAO bookingDAO = new BookingDAO();

    DefaultTableModel seatModel;
    DefaultTableModel roomModel;

    int currentIndex = -1;
    List<RoomModel> roomList;
    List<SeatModel> seatList;

    public RoomJframe() {
        initComponents();
        this.setLocationRelativeTo(null);
        seatModel = (DefaultTableModel) tbl_seat.getModel();
//        roomModel = (DefaultTableModel) tb.getModel();

        showRoom();
        showSeat();
    }

    private void resetForm() {
        txt_seat_column.setSelectedIndex(1);
        txt_seat_row.setSelectedIndex(1);
        txt_seat_type.setSelectedIndex(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        btn_add = new java.awt.Button();
        label5 = new java.awt.Label();
        txt_seat_type = new javax.swing.JComboBox<>();
        txt_seat_row = new javax.swing.JComboBox<>();
        txt_seat_column = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_seat = new javax.swing.JTable();
        btn_delete = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        btn_clear = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 248, 221));

        jPanel1.setBackground(new java.awt.Color(253, 248, 221));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label2.setText("Seat row");

        label4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label4.setText("Seat column (number)");

        btn_add.setBackground(new java.awt.Color(0, 153, 153));
        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_add.setLabel("Save");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label5.setText("Seat type");

        txt_seat_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Vip" }));
        txt_seat_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_seat_typeActionPerformed(evt);
            }
        });

        txt_seat_row.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A", "B", "C", "D", "E", "F", "G" }));
        txt_seat_row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_seat_rowActionPerformed(evt);
            }
        });

        txt_seat_column.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        txt_seat_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_seat_columnActionPerformed(evt);
            }
        });

        tbl_seat.setBackground(new java.awt.Color(66, 62, 61));
        tbl_seat.setForeground(new java.awt.Color(253, 248, 221));
        tbl_seat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Seat Row", "Seat Column", "Seat type", "Seat code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_seat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_seatMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_seat);

        btn_delete.setBackground(new java.awt.Color(228, 31, 37));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_delete.setLabel("Delete");
        btn_delete.setName("Delete"); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(66, 62, 61));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Manager");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238)
                .addComponent(backBtn2)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btn_clear.setBackground(new java.awt.Color(204, 255, 0));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_clear.setLabel("Clear");
        btn_clear.setName("reset"); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_seat_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_seat_column, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_seat_row, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(204, 204, 204)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_seat_row, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_seat_column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_seat_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String seat_row = txt_seat_row.getSelectedItem().toString();
        int seat_column = Integer.parseInt(txt_seat_column.getSelectedItem().toString());
        String seat_type = (String) this.txt_seat_type.getSelectedItem();
        String seat_code = seat_row + seat_column;

        SeatModel seat = new SeatModel();
        seat.setRow(seat_row);
        seat.setColumn(seat_row);
        seat.setType(seat_type);
        seat.setCode(seat_code);

        if (currentIndex >= 0) {
            seat = seatList.get(currentIndex);
            currentIndex = -1;
            seatDAO.update(seat);
        } else {
            if (seatDAO.save(seat) != -1) {
            } else {
                JOptionPane.showMessageDialog(rootPane, "Add seat failed");
            }
        }

        seatList = seatDAO.findAll();
        showSeat();
        btn_clearActionPerformed(evt);
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_seat_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_seat_typeActionPerformed
    }//GEN-LAST:event_txt_seat_typeActionPerformed

    private void txt_seat_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_seat_rowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_seat_rowActionPerformed

    private void txt_seat_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_seat_columnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_seat_columnActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJframe home = new HomeJframe();
        home.setVisible(true);
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        currentIndex = tbl_seat.getSelectedRow();
        if (currentIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "You haven't choose anything to delete");
            return;
        }
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this customer?");
        if (option == 0 && currentIndex >= 0) {

            BookingModel bookingModel = bookingDAO.findBySeatId(seatList.get(currentIndex).getId());

            if (bookingModel == null) {
                seatDAO.delete(seatList.get(currentIndex).getId());
            } else {
                JOptionPane.showMessageDialog(rootPane, "This customer is currently airing. Cannot delete!!");
            }
            currentIndex = -1;
            seatDAO.findAll();
            showSeat();
        }
        btn_clearActionPerformed(evt);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_seatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_seatMouseClicked
        //        int position = TblSchedule.getSelectedRow();
        //        showRow(position);
    }//GEN-LAST:event_tbl_seatMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_seat_column.setSelectedIndex(1);
        txt_seat_row.setSelectedIndex(1);
        txt_seat_type.setSelectedIndex(1);
    }//GEN-LAST:event_btn_clearActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomJframe().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_add;
    private java.awt.Button btn_clear;
    private java.awt.Button btn_delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTable tbl_seat;
    private javax.swing.JComboBox<String> txt_seat_column;
    private javax.swing.JComboBox<String> txt_seat_row;
    private javax.swing.JComboBox<String> txt_seat_type;
    // End of variables declaration//GEN-END:variables

    private void showSeat() {
        seatList = seatDAO.findAll();

        seatModel.setRowCount(0);

        for (SeatModel seat : seatList) {
            seatModel.addRow(new Object[]{
                seat.getId(),
                seat.getRow(),
                seat.getColumn(),
                seat.getType(),
                seat.getCode()
            });
        }
    }

    private void showRoom() {
        roomList = roomDAO.findAll();

        seatModel.setRowCount(0);

        if (roomList.isEmpty()) {
            for (RoomModel room : roomList) {
                roomModel.addRow(new Object[]{});
            }
        }
    }
}
