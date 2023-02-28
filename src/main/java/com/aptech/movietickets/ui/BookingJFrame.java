package com.aptech.movietickets.ui;

import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IRoomDAO;
import com.aptech.movietickets.dao.ISeatDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.RoomDAO;
import com.aptech.movietickets.dao.impl.SeatDAO;
import com.aptech.movietickets.model.BookingModel;
import com.aptech.movietickets.model.ScheduleModel;
import com.aptech.movietickets.model.SeatModel;
import com.aptech.movietickets.service.IBookingService;
import com.aptech.movietickets.service.ICustomerService;
import com.aptech.movietickets.service.IScheduleService;
import com.aptech.movietickets.service.impl.BookingService;
import com.aptech.movietickets.service.impl.CustomerService;
import com.aptech.movietickets.service.impl.ScheduleService;
import com.aptech.movietickets.utils.DisplayUtil;
import com.aptech.movietickets.utils.EventsUtil;
import com.aptech.movietickets.utils.FileUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookingJFrame extends javax.swing.JFrame {

    private IMovieDAO movieDAO = new MovieDAO();
    private ICustomerService customerService = new CustomerService();
    private ISeatDAO seatDAO = new SeatDAO();
    private IRoomDAO roomDAO = new RoomDAO();
    private IBookingService bookingService = new BookingService();
    private IScheduleService scheduleService = new ScheduleService();

    DefaultTableModel tableModel;

    int currentIndex = -1;
    List<BookingModel> bookings;

    public BookingJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        showComboBox();
        tableModel = (DefaultTableModel) tbl_booking.getModel();
        showBooking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_save = new java.awt.Button();
        btn_delete = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_schedule = new javax.swing.JComboBox<>();
        txt_fullname = new javax.swing.JTextField();
        txt_phoneNumber = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_booking = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        txt_seatCode = new javax.swing.JComboBox<>();
        btn_clear = new java.awt.Button();
        button1 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        txt_totals = new javax.swing.JLabel();
        btn_removeAll = new java.awt.Button();
        txt_sort = new javax.swing.JComboBox<>();
        btn_sort = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 248, 221));

        jLabel3.setText("Phone number");

        jLabel5.setText("Seat code");

        btn_save.setBackground(new java.awt.Color(0, 153, 153));
        btn_save.setForeground(new java.awt.Color(253, 248, 221));
        btn_save.setLabel("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(228, 31, 37));
        btn_delete.setForeground(new java.awt.Color(253, 248, 221));
        btn_delete.setLabel("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Fullname");

        jLabel8.setText("Schedule ");

        txt_schedule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        txt_phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneNumberActionPerformed(evt);
            }
        });
        txt_phoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneNumberKeyPressed(evt);
            }
        });

        tbl_booking.setBackground(new java.awt.Color(255, 215, 65));
        tbl_booking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Fullname", "Phone number", "Room", "Movie", "Seat", "Price", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bookingMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_booking);
        if (tbl_booking.getColumnModel().getColumnCount() > 0) {
            tbl_booking.getColumnModel().getColumn(6).setMinWidth(70);
            tbl_booking.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        jPanel2.setBackground(new java.awt.Color(255, 215, 65));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setText("Booking Page");

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
                .addGap(203, 203, 203)
                .addComponent(backBtn2)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        txt_seatCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txt_seatCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_seatCodeActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(255, 153, 0));
        btn_clear.setForeground(new java.awt.Color(253, 248, 221));
        btn_clear.setLabel("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 0, 153));
        button1.setLabel("Export");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Total price:");

        txt_totals.setText("0");

        btn_removeAll.setBackground(new java.awt.Color(153, 153, 0));
        btn_removeAll.setLabel("Wipe all data");
        btn_removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeAllActionPerformed(evt);
            }
        });

        txt_sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        btn_sort.setLabel("Sort");
        btn_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_seatCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_sort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_removeAll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_totals, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_seatCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_totals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_removeAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (!Validate()) {
            return;
        }
        String fullname = txt_fullname.getText();
        String phone_number = txt_phoneNumber.getText();
        String seat_code = txt_seatCode.getSelectedItem().toString();
        String schedule = txt_schedule.getSelectedItem().toString();
        BookingModel booking = new BookingModel(fullname, phone_number, seat_code, schedule);

        currentIndex = tbl_booking.getSelectedRow();

        if (currentIndex >= 0) {
            booking.setId(bookings.get(currentIndex).getId());
            if (bookingService.update(booking) == null) {
                JOptionPane.showMessageDialog(rootPane, "update failed,seat already exist");
            }
            currentIndex = -1;
        } else {
            if (bookingService.save(booking) == null) {
                JOptionPane.showMessageDialog(rootPane, "seat already exist");
            }
        }
        bookings = bookingService.findAll();
        showBooking();

        btn_clearActionPerformed(evt);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_fullname.setText("");
        txt_phoneNumber.setText("");
        txt_schedule.setSelectedItem("Select");
        txt_seatCode.setSelectedItem("Select");
        txt_sort.setSelectedIndex(0);
        showBooking();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneNumberActionPerformed

    private void txt_phoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneNumberKeyPressed
        EventsUtil.validateKeyPressed(evt, txt_phoneNumber);
    }//GEN-LAST:event_txt_phoneNumberKeyPressed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        currentIndex = tbl_booking.getSelectedRow();
        if (currentIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "You haven't choose anything to delete");
            return;
        }
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this booking?");
        if (option == 0 && currentIndex >= 0) {

            bookingService.delete(bookings.get(currentIndex).getId());
            currentIndex = -1;
            showBooking();
        }
        btn_clearActionPerformed(evt);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        FileUtil.writeExcel(tbl_booking);
    }//GEN-LAST:event_button1ActionPerformed

    private void btn_removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeAllActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to wipe all data?");
        if (option == 0) {
            if (!bookingService.removeAll()) {
                JOptionPane.showMessageDialog(null, "Remove failed");
            }
            bookings = bookingService.findAll();
            showBooking();
        }
    }//GEN-LAST:event_btn_removeAllActionPerformed

    private void btn_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortActionPerformed
        if (txt_sort.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Schedule!");
            showBooking();
        } else {
            String schedule_name = txt_sort.getSelectedItem().toString();
            List<BookingModel> findBooking = bookings.stream()
                    .filter(u -> scheduleService.findOne(u.getSchedule_id()).getName().equalsIgnoreCase(schedule_name))
                    .toList();

            tableModel.setRowCount(0);

            Double totalPrice = 0.0;
            if (!findBooking.isEmpty()) {
                for (BookingModel booking : findBooking) {
                    int customer_id = booking.getCustomer_id();
                    int schedule_id = booking.getSchedule_id();
                    int seat_id = booking.getSeat_id();
                    double price = scheduleService.findOne(schedule_id).getNormal_ticket();
                    if (seatDAO.findOne(seat_id).getType().equalsIgnoreCase("Vip")) {
                        price = scheduleService.findOne(schedule_id).getVip_ticket();
                    }

                    tableModel.addRow(new Object[]{
                        tableModel.getRowCount() + 1,
                        customerService.findOne(customer_id).getFullname(),
                        customerService.findOne(customer_id).getPhone_number(),
                        roomDAO.findOne(scheduleService.findOne(schedule_id).getRoom_id()).getRoom_name(),
                        movieDAO.findOne(scheduleService.findOne(schedule_id).getMovie_id()).getTitle(),
                        seatDAO.findOne(seat_id).getCode(),
                        DisplayUtil.printCurrency(price, "Vietnamese Dongs"),
                        scheduleService.findOne(schedule_id).getSchedule_date(),
                        scheduleService.findOne(schedule_id).getSchedule_start()
                    });
                    totalPrice += price;
                }
            }
            txt_totals.setText(DisplayUtil.printCurrency(totalPrice, "Vietnamese Dongs"));
        }
    }//GEN-LAST:event_btn_sortActionPerformed

    private void tbl_bookingMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_bookingMouseClicked
        int position = tbl_booking.getSelectedRow();
        showRow(position);
    }// GEN-LAST:event_tbl_bookingMouseClicked

    private void txt_seatCodeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_seatCodeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_seatCodeActionPerformed

    private void txt_movie_nameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_movie_nameActionPerformed

    }// GEN-LAST:event_txt_movie_nameActionPerformed

    private void txt_normal_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_normal_ticketActionPerformed

    }// GEN-LAST:event_txt_normal_ticketActionPerformed

    private void txt_schedule_startActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_schedule_startActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_schedule_startActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed

    }// GEN-LAST:event_btn_addActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJFrame home = new HomeJFrame();
        home.setVisible(true);
    }// GEN-LAST:event_backBtn2ActionPerformed

    private void txt_seatcodeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_seatcodeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_seatcodeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_clear;
    private java.awt.Button btn_delete;
    private java.awt.Button btn_removeAll;
    private java.awt.Button btn_save;
    private java.awt.Button btn_sort;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_booking;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_phoneNumber;
    private javax.swing.JComboBox<String> txt_schedule;
    private javax.swing.JComboBox<String> txt_seatCode;
    private javax.swing.JComboBox<String> txt_sort;
    private javax.swing.JLabel txt_totals;
    // End of variables declaration//GEN-END:variables

    private void showComboBox() {
        List<ScheduleModel> schedules = scheduleService.findAll();
        if (!schedules.isEmpty()) {
            for (ScheduleModel schedule : schedules) {
                String schedule_name = schedule.getName();
                txt_schedule.addItem(schedule_name);
                txt_sort.addItem(schedule_name);
            }
        }

        List<SeatModel> seats = seatDAO.findAll();
        if (!seats.isEmpty()) {
            for (SeatModel seat : seats) {
                txt_seatCode.addItem(seat.getCode());
            }
        }

    }

    private void showRow(int position) {
        BookingModel booking = bookings.get(position);
        int customer_id = booking.getCustomer_id();
        int schedule_id = booking.getSchedule_id();
        int seat_id = booking.getSeat_id();

        txt_fullname.setText(customerService.findOne(customer_id).getFullname());
        txt_phoneNumber.setText(customerService.findOne(customer_id).getPhone_number());
        txt_schedule.setSelectedItem(scheduleService.findOne(schedule_id).getName());
        txt_seatCode.setSelectedItem(seatDAO.findOne(seat_id).getCode());
    }

    private void showBooking() {
        bookings = bookingService.findAll();

        tableModel.setRowCount(0);

        Double totalPrice = 0.0;
        if (!bookings.isEmpty()) {
            for (BookingModel booking : bookings) {
                int customer_id = booking.getCustomer_id();
                int schedule_id = booking.getSchedule_id();
                int seat_id = booking.getSeat_id();
                double price = scheduleService.findOne(schedule_id).getNormal_ticket();
                if (seatDAO.findOne(seat_id).getType().equalsIgnoreCase("Vip")) {
                    price = scheduleService.findOne(schedule_id).getVip_ticket();
                }

                tableModel.addRow(new Object[]{
                    tableModel.getRowCount() + 1,
                    customerService.findOne(customer_id).getFullname(),
                    customerService.findOne(customer_id).getPhone_number(),
                    roomDAO.findOne(scheduleService.findOne(schedule_id).getRoom_id()).getRoom_name(),
                    movieDAO.findOne(scheduleService.findOne(schedule_id).getMovie_id()).getTitle(),
                    seatDAO.findOne(seat_id).getCode(),
                    DisplayUtil.printCurrency(price, "Vietnamese Dongs"),
                    scheduleService.findOne(schedule_id).getSchedule_date(),
                    scheduleService.findOne(schedule_id).getSchedule_start()
                });
                totalPrice += price;
            }
        }
        txt_totals.setText(DisplayUtil.printCurrency(totalPrice, "Vietnamese Dongs"));
    }

    private boolean Validate() {
        try {
            if (txt_fullname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid fullname ");
                return false;
            }
            if (txt_phoneNumber.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid phone number");
                return false;
            }
            if (txt_schedule.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid schedule");
                return false;
            }
            if (txt_seatCode.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid seat code");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }

}
