package com.aptech.movietickets.ui;

public class HomeJFrame extends javax.swing.JFrame {

    public HomeJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CustomerButton = new javax.swing.JButton();
        MovieButton = new javax.swing.JButton();
        ScheduleButton = new javax.swing.JButton();
        BookingButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RoomButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 252, 240));

        jPanel2.setBackground(new java.awt.Color(253, 248, 221));

        CustomerButton.setBackground(new java.awt.Color(255, 153, 51));
        CustomerButton.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(253, 248, 221));
        CustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/customer.png"))); // NOI18N
        CustomerButton.setText("Customer");
        CustomerButton.setBorder(null);
        CustomerButton.setBorderPainted(false);
        CustomerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        MovieButton.setBackground(new java.awt.Color(0, 102, 204));
        MovieButton.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        MovieButton.setForeground(new java.awt.Color(253, 248, 221));
        MovieButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/movie.png"))); // NOI18N
        MovieButton.setText("Movie");
        MovieButton.setBorder(null);
        MovieButton.setBorderPainted(false);
        MovieButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieButtonActionPerformed(evt);
            }
        });

        ScheduleButton.setBackground(new java.awt.Color(0, 153, 153));
        ScheduleButton.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        ScheduleButton.setForeground(new java.awt.Color(253, 248, 221));
        ScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/schedule-20-128.png"))); // NOI18N
        ScheduleButton.setText("Schedule");
        ScheduleButton.setBorder(null);
        ScheduleButton.setBorderPainted(false);
        ScheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });

        BookingButton.setBackground(new java.awt.Color(255, 215, 65));
        BookingButton.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        BookingButton.setForeground(new java.awt.Color(253, 248, 221));
        BookingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/booknow.png"))); // NOI18N
        BookingButton.setText("Booking");
        BookingButton.setBorder(null);
        BookingButton.setBorderPainted(false);
        BookingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingButtonActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(228, 31, 37));
        LogoutButton.setFont(new java.awt.Font("Kristen ITC", 0, 20)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(253, 248, 221));
        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/logoutnew.png"))); // NOI18N
        LogoutButton.setText("Log out");
        LogoutButton.setBorder(null);
        LogoutButton.setBorderPainted(false);
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(228, 31, 37));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 248, 221));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/hd-tickets-49039.png"))); // NOI18N
        jLabel1.setText("Movie System Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        RoomButton.setBackground(new java.awt.Color(66, 62, 61));
        RoomButton.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        RoomButton.setForeground(new java.awt.Color(253, 248, 221));
        RoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/roommovie.png"))); // NOI18N
        RoomButton.setText("Room");
        RoomButton.setBorder(null);
        RoomButton.setBorderPainted(false);
        RoomButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(MovieButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed

        this.setVisible(false);
        CustomerJFrame customer = new CustomerJFrame();
        customer.setVisible(true);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void MovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieButtonActionPerformed
        this.setVisible(false);
        MovieJFrame movie = new MovieJFrame();
        movie.setVisible(true);
    }//GEN-LAST:event_MovieButtonActionPerformed

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ScheduleJFrame schedule = new ScheduleJFrame();
        schedule.setVisible(true);
    }//GEN-LAST:event_ScheduleButtonActionPerformed

    private void BookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BookingJFrame booking = new BookingJFrame();
        booking.setVisible(true);
    }//GEN-LAST:event_BookingButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginJFrame logout = new LoginJFrame();
        logout.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void RoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomButtonActionPerformed
        this.setVisible(false);
        RoomJFrame room = new RoomJFrame();
        room.setVisible(true);
    }//GEN-LAST:event_RoomButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookingButton;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MovieButton;
    private javax.swing.JButton RoomButton;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
