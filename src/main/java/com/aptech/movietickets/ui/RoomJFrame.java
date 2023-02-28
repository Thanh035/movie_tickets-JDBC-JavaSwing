package com.aptech.movietickets.ui;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.model.SeatModel;
import com.aptech.movietickets.service.impl.SeatService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.aptech.movietickets.service.ISeatService;
import com.aptech.movietickets.utils.FileUtil;

public class RoomJFrame extends javax.swing.JFrame {

    private IBookingDAO bookingDAO = new BookingDAO();
    private ISeatService seatService = new SeatService();

    DefaultTableModel tableModel;

    int currentIndex = -1;
    List<SeatModel> seatList;

    public RoomJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tbl_seat.getModel();

        showSeat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        Save = new java.awt.Button();
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
        button1 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JLabel();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 248, 221));

        jPanel1.setBackground(new java.awt.Color(253, 248, 221));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label2.setText("Seat row");

        label4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label4.setText("Seat column (number)");

        Save.setBackground(new java.awt.Color(0, 153, 153));
        Save.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Save.setLabel("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Seat Row", "Seat Column", "Seat type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        btn_clear.setBackground(new java.awt.Color(255, 255, 51));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_clear.setLabel("Clear");
        btn_clear.setName("Clear"); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 204, 0));
        button1.setLabel("Export file");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Number of seats");

        txt_quantity.setBackground(new java.awt.Color(255, 51, 0));
        txt_quantity.setText("0");

        button2.setLabel("Import file");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(153, 153, 0));
        button3.setLabel("Wipe all data");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
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
                        .addGap(122, 122, 122)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_seat_row, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_seat_column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_seat_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_quantity))
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
//        FileUtil.writeExcel(tbl_seat);
        FileUtil.exportSeat(seatList);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        List<SeatModel> seats = FileUtil.importSeat();
        if (!seats.isEmpty()) {
            for (SeatModel seat : seats) {
                seatService.save(seat);
            }
            seatList = seatService.findAll();
            showSeat();
            return;
        }
        JOptionPane.showMessageDialog(null, "Error!!");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to wipe all data?");
        if (option == 0) {
            if (!seatService.removeAll()) {
                JOptionPane.showMessageDialog(null, "Remove failed by booking page");
            }
            seatList = seatService.findAll();
            showSeat();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if (!Validate()) {
            return;
        }
        currentIndex = tbl_seat.getSelectedRow();

        String seat_row = txt_seat_row.getSelectedItem().toString();
        String seat_column = txt_seat_column.getSelectedItem().toString();
        String seat_type = txt_seat_type.getSelectedItem().toString();
        String seat_code = seat_row + seat_column;

        SeatModel seat = new SeatModel();
        seat.setRow(seat_row);
        seat.setColumn(seat_column);
        seat.setType(seat_type);
        seat.setCode(seat_code);

        if (currentIndex >= 0) {
            seat.setId(seatList.get(currentIndex).getId());
            currentIndex = -1;
            seatService.update(seat);
        } else {
            if (seatService.save(seat) == null) {
                JOptionPane.showMessageDialog(rootPane, "Add seat failed");
            }
        }

        seatList = seatService.findAll();
        showSeat();
        btn_clearActionPerformed(evt);
    }//GEN-LAST:event_SaveActionPerformed

    private void txt_seat_typeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_seat_typeActionPerformed
    }// GEN-LAST:event_txt_seat_typeActionPerformed

    private void txt_seat_rowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_seat_rowActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_seat_rowActionPerformed

    private void txt_seat_columnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_seat_columnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_seat_columnActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJFrame home = new HomeJFrame();
        home.setVisible(true);
    }// GEN-LAST:event_backBtn2ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleteActionPerformed
        currentIndex = tbl_seat.getSelectedRow();
        if (currentIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "You haven't choose anything to delete");
            return;
        }
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this customer?");
        if (option == 0 && currentIndex >= 0) {

            if (!seatService.delete(seatList.get(currentIndex).getId())) {
                JOptionPane.showMessageDialog(rootPane, "This customer is currently airing. Cannot delete!!");
            }
            currentIndex = -1;
            seatList = seatService.findAll();
            showSeat();
        }
        btn_clearActionPerformed(evt);
    }// GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_seatMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_seatMouseClicked
        int position = tbl_seat.getSelectedRow();
        showRow(position);
    }// GEN-LAST:event_tbl_seatMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_clearActionPerformed
        txt_seat_column.setSelectedItem("Select");
        txt_seat_row.setSelectedItem("Select");
        txt_seat_type.setSelectedItem("Normal");
        showSeat();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomJFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Save;
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_clear;
    private java.awt.Button btn_delete;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTable tbl_seat;
    private javax.swing.JLabel txt_quantity;
    private javax.swing.JComboBox<String> txt_seat_column;
    private javax.swing.JComboBox<String> txt_seat_row;
    private javax.swing.JComboBox<String> txt_seat_type;
    // End of variables declaration//GEN-END:variables

    private void showSeat() {
        seatList = seatService.findAll();

        tableModel.setRowCount(0);

        if (!seatList.isEmpty()) {
            for (SeatModel seat : seatList) {
                tableModel.addRow(new Object[]{
                    seat.getCode(),
                    seat.getRow(),
                    seat.getColumn(),
                    seat.getType()});
            }
        }

        txt_quantity.setText(String.valueOf(seatService.getTotalItem()));
    }

    private void showRow(int position) {
        SeatModel seat = seatList.get(position);
        txt_seat_column.setSelectedItem(seat.getColumn());
        txt_seat_row.setSelectedItem(seat.getRow());
        txt_seat_type.setSelectedItem(seat.getType());
    }

    private boolean Validate() {
        try {
            if (txt_seat_column.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid seat's column");
                return false;
            }
            if (txt_seat_row.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid seat's row");
                return false;
            }
            if (txt_seat_type.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid seat's type");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }
}
