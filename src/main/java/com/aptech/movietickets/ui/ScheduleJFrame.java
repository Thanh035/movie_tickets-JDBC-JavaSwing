package com.aptech.movietickets.ui;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IRoomDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.RoomDAO;
import com.aptech.movietickets.model.MovieModel;
import com.aptech.movietickets.model.RoomModel;
import com.aptech.movietickets.model.ScheduleModel;
import com.aptech.movietickets.service.IScheduleService;
import com.aptech.movietickets.service.impl.ScheduleService;
import com.aptech.movietickets.utils.DisplayUtil;
import com.aptech.movietickets.utils.EventsUtil;
import com.aptech.movietickets.utils.FileUtil;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ScheduleJFrame extends javax.swing.JFrame {

    private IMovieDAO movieDAO = new MovieDAO();
    private IRoomDAO roomDAO = new RoomDAO();
    private IBookingDAO bookingDAO = new BookingDAO();

    private IScheduleService scheduleService = new ScheduleService();

    DefaultTableModel tableModel;

    int currentIndex = -1;
    List<ScheduleModel> schedules;

    public ScheduleJFrame() {
        initComponents();
        showComboBox();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tbl_schedule.getModel();
        showSchedule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new java.awt.Button();
        btn_reset = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_room_name = new javax.swing.JComboBox<>();
        txt_movie_name = new javax.swing.JComboBox<>();
        txt_normal_ticket = new javax.swing.JTextField();
        txt_schedule_start = new javax.swing.JTextField();
        txt_vip_ticket = new javax.swing.JTextField();
        txt_scheduleDate = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_schedule = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        txt_sort = new javax.swing.JComboBox<>();
        btn_sort = new java.awt.Button();
        btn_delete = new java.awt.Button();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 248, 221));

        jPanel1.setBackground(new java.awt.Color(253, 248, 221));

        jLabel2.setText("Movie name");

        jLabel3.setText("Normal ticket");

        jLabel5.setText("Schedule date");

        jLabel6.setText("Schedule start");

        btn_save.setBackground(new java.awt.Color(0, 153, 153));
        btn_save.setForeground(new java.awt.Color(253, 248, 221));
        btn_save.setLabel("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(255, 0, 255));
        btn_reset.setForeground(new java.awt.Color(253, 248, 221));
        btn_reset.setLabel("Clear");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jLabel7.setText("Room ");

        jLabel8.setText("Vip ticket");

        txt_room_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        txt_movie_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txt_movie_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_movie_nameActionPerformed(evt);
            }
        });

        txt_normal_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_normal_ticketActionPerformed(evt);
            }
        });
        txt_normal_ticket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_normal_ticketKeyPressed(evt);
            }
        });

        txt_schedule_start.setText("00:00:00");
        txt_schedule_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_schedule_startActionPerformed(evt);
            }
        });

        txt_vip_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vip_ticketActionPerformed(evt);
            }
        });
        txt_vip_ticket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_vip_ticketKeyPressed(evt);
            }
        });

        tbl_schedule.setBackground(new java.awt.Color(0, 153, 153));
        tbl_schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Movie name", "Room", "VipTicket", "NormalTicket", "ScheduleDate", "ScheduleStart"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_scheduleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_schedule);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setText("Movie schedule");

        backBtn2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        backBtn2.setText("Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        txt_sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        btn_sort.setLabel("Sort");
        btn_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txt_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(252, 252, 252)
                .addComponent(backBtn2)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        btn_delete.setBackground(new java.awt.Color(228, 31, 37));
        btn_delete.setForeground(new java.awt.Color(253, 248, 221));
        btn_delete.setLabel("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 255, 51));
        button1.setLabel("Export");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_room_name, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_schedule_start, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_scheduleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vip_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_normal_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(275, 275, 275)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(578, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_room_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_normal_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vip_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_scheduleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_schedule_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(489, 489, 489)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(24, 24, 24)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        currentIndex = tbl_schedule.getSelectedRow();
        if (currentIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "You haven't choose anything to delete");
            return;
        }
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this schedule?");
        if (option == 0 && currentIndex >= 0) {
            if (!scheduleService.delete(schedules.get(currentIndex).getId())) {
                JOptionPane.showMessageDialog(rootPane, "This schedule is currently airing. Cannot delete!!");
            }
            currentIndex = -1;
            schedules = scheduleService.findAll();
            showSchedule();
        }
        btn_resetActionPerformed(evt);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_normal_ticketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_normal_ticketKeyPressed
        EventsUtil.validateKeyPressed(evt, txt_normal_ticket);
    }//GEN-LAST:event_txt_normal_ticketKeyPressed

    private void txt_vip_ticketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_vip_ticketKeyPressed
        EventsUtil.validateKeyPressed(evt, txt_vip_ticket);
    }//GEN-LAST:event_txt_vip_ticketKeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        FileUtil.writeExcel(tbl_schedule);
    }//GEN-LAST:event_button1ActionPerformed

    private void btn_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortActionPerformed
        if (txt_sort.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Date!");
            showSchedule();
        } else {
            Date sortDate = java.sql.Date.valueOf(txt_sort.getSelectedItem().toString());
            schedules = scheduleService.findByScheduleDate(sortDate);

            tableModel.setRowCount(0);

            if (!schedules.isEmpty()) {
                for (ScheduleModel schedule : schedules) {
                    tableModel.addRow(new Object[]{
                        tableModel.getRowCount() + 1,
                        movieDAO.findOne(schedule.getMovie_id()).getTitle(),
                        roomDAO.findOne(schedule.getRoom_id()).getRoom_name(),
                        DisplayUtil.printCurrency(schedule.getVip_ticket(), "Vietnamese Dongs"),
                        DisplayUtil.printCurrency(schedule.getNormal_ticket(), "Vietnamese Dongs"),
                        schedule.getSchedule_date(),
                        schedule.getSchedule_start()
                    });
                }
            }
        }
    }//GEN-LAST:event_btn_sortActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_resetActionPerformed
        txt_movie_name.setSelectedItem("Select");
        txt_normal_ticket.setText("");
        txt_room_name.setSelectedItem("Select");
        txt_scheduleDate.setCalendar(null);
        txt_schedule_start.setText("00:00:00");
        txt_vip_ticket.setText("");
        txt_sort.setSelectedIndex(0);
        showSchedule();
    }// GEN-LAST:event_btn_resetActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_saveActionPerformed
        if (!Validate()) {
            return;
        }

        currentIndex = tbl_schedule.getSelectedRow();

        String movie_name = txt_movie_name.getSelectedItem().toString();
        String room_name = txt_room_name.getSelectedItem().toString();
        Double vip_ticket = Double.parseDouble(txt_vip_ticket.getText());
        Double normal_ticket = Double.parseDouble(txt_normal_ticket.getText());
        Date scheduleDate = new java.sql.Date(txt_scheduleDate.getDate().getTime());
        Time schedule_start = java.sql.Time.valueOf(txt_schedule_start.getText());
        ScheduleModel schedule = new ScheduleModel(vip_ticket, normal_ticket, scheduleDate, schedule_start, movie_name, room_name);

        if (currentIndex >= 0) {
            schedule.setId(schedules.get(currentIndex).getId());
            currentIndex = -1;
            scheduleService.update(schedule);
        } else {
            if (scheduleService.save(schedule) == null) {
                JOptionPane.showMessageDialog(rootPane, "Add schedule failed");
            }
        }

        schedules = scheduleService.findAll();
        showSchedule();
        btn_resetActionPerformed(evt);
    }// GEN-LAST:event_btn_saveActionPerformed

    private void tbl_scheduleMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_scheduleMouseClicked
        int position = tbl_schedule.getSelectedRow();
        showRow(position);
    }// GEN-LAST:event_tbl_scheduleMouseClicked

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJFrame home = new HomeJFrame();
        home.setVisible(true);
    }// GEN-LAST:event_backBtn2ActionPerformed

    private void txt_vip_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_vip_ticketActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_vip_ticketActionPerformed

    private void txt_schedule_startActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_schedule_startActionPerformed

    }// GEN-LAST:event_txt_schedule_startActionPerformed

    private void txt_normal_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_normal_ticketActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_normal_ticketActionPerformed

    private void txt_movie_nameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_movie_nameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_movie_nameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScheduleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_delete;
    private java.awt.Button btn_reset;
    private java.awt.Button btn_save;
    private java.awt.Button btn_sort;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_schedule;
    private javax.swing.JComboBox<String> txt_movie_name;
    private javax.swing.JTextField txt_normal_ticket;
    private javax.swing.JComboBox<String> txt_room_name;
    private com.toedter.calendar.JDateChooser txt_scheduleDate;
    private javax.swing.JTextField txt_schedule_start;
    private javax.swing.JComboBox<String> txt_sort;
    private javax.swing.JTextField txt_vip_ticket;
    // End of variables declaration//GEN-END:variables

    private void showComboBox() {
        List<MovieModel> movies = movieDAO.findAll();
        if (!movies.isEmpty()) {
            txt_movie_name.removeAllItems();
            txt_movie_name.addItem("Select");
            for (MovieModel movie : movies) {
                txt_movie_name.addItem(movie.getTitle());
            }
        }

        List<RoomModel> rooms = roomDAO.findAll();
        if (!rooms.isEmpty()) {
            txt_room_name.removeAllItems();
            txt_room_name.addItem("Select");
            for (RoomModel room : rooms) {
                txt_room_name.addItem(room.getRoom_name());
            }
        }

        List<ScheduleModel> dates = scheduleService.findDistinctScheduleDate();
        if (!dates.isEmpty()) {
            txt_sort.removeAllItems();
            txt_sort.addItem("Select");
            for (ScheduleModel date : dates) {
                txt_sort.addItem(date.getSchedule_date().toString());
            }
        }
    }

    private void showSchedule() {
        schedules = scheduleService.findAll();

        tableModel.setRowCount(0);

        if (!schedules.isEmpty()) {
            for (ScheduleModel schedule : schedules) {
                tableModel.addRow(new Object[]{
                    tableModel.getRowCount() + 1,
                    movieDAO.findOne(schedule.getMovie_id()).getTitle(),
                    roomDAO.findOne(schedule.getRoom_id()).getRoom_name(),
                    DisplayUtil.printCurrency(schedule.getVip_ticket(), "Vietnamese Dongs"),
                    DisplayUtil.printCurrency(schedule.getNormal_ticket(), "Vietnamese Dongs"),
                    schedule.getSchedule_date(),
                    schedule.getSchedule_start()
                });
            }
        }
        showComboBox();
    }

    private void showRow(int position) {
        ScheduleModel schedule = schedules.get(position);
        String movie_name = movieDAO.findOne(schedule.getMovie_id()).getTitle();
        txt_movie_name.setSelectedItem(movie_name);
        String room_name = roomDAO.findOne(schedule.getRoom_id()).getRoom_name();
        txt_room_name.setSelectedItem(room_name);
        txt_normal_ticket.setText(schedule.getNormal_ticket().toString());
        txt_vip_ticket.setText(schedule.getVip_ticket().toString());
        txt_scheduleDate.setDate(schedule.getSchedule_date());
        txt_schedule_start.setText(schedule.getSchedule_start().toString());
    }

    private boolean Validate() {
        try {
            if (txt_room_name.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid room name");
                return false;
            }
            if (txt_movie_name.getSelectedItem().toString().equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Invalid movie name");
                return false;
            }
            if (txt_normal_ticket.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid normal ticket");
                return false;
            }
            if (txt_vip_ticket.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid vip ticket");
                return false;
            }
            if (txt_scheduleDate.getCalendar() == null) {
                JOptionPane.showMessageDialog(null, "Invalid schedule date");
                return false;
            }
            if (txt_schedule_start.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid schedule start");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }

}
