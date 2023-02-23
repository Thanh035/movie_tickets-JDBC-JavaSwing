package com.aptech.movietickets.gui;

import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IScheduleDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.ScheduleDAO;
import com.aptech.movietickets.model.MovieModel;
import com.aptech.movietickets.model.ScheduleModel;
import com.aptech.movietickets.utils.EventsKey;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MovieJframe extends javax.swing.JFrame {

    private IMovieDAO movieDAO = new MovieDAO();
    private IScheduleDAO scheduleDAO = new ScheduleDAO();

    DefaultTableModel tableModel;

    int currentIndex = -1;
    List<MovieModel> movieList;

    public MovieJframe() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tbl_movie.getModel();

        showMovie();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_genres = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_cast = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_director = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        FindBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txt_duration = new javax.swing.JFormattedTextField();
        txt_release = new com.toedter.calendar.JDateChooser();
        txt_movie_name = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_movie = new javax.swing.JTable();

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

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Movie name :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Release Date :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Duration (minutes):");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Genre:");

        txt_genres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Action", "Anime", "Comedy", "Drama", "Fantasy", "Horror", "Mystery" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Cast :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Director:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        SaveBtn.setBackground(new java.awt.Color(102, 153, 0));
        SaveBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(255, 204, 0));
        ResetBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 255, 255));
        ResetBtn.setText("Clear");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        FindBtn.setBackground(new java.awt.Color(102, 102, 255));
        FindBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FindBtn.setForeground(new java.awt.Color(255, 255, 255));
        FindBtn.setText("Find");
        FindBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(153, 51, 0));
        DeleteBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        txt_duration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_durationKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_release, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txt_duration))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(SaveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ResetBtn)
                        .addGap(43, 43, 43)
                        .addComponent(FindBtn)
                        .addGap(49, 49, 49)
                        .addComponent(DeleteBtn)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cast, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_genres, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_director, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_genres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_cast, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_director, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_release, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FindBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveBtn))
                .addGap(150, 150, 150)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Movie Manager");

        backBtn2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        backBtn2.setText("Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(218, 218, 218)
                .addComponent(backBtn2)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        tbl_movie.setBackground(new java.awt.Color(0, 153, 153));
        tbl_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Name", "Cast", "Director", "Genres", "Release", "Duration", "ID"
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
        jScrollPane1.setViewportView(tbl_movie);
        if (tbl_movie.getColumnModel().getColumnCount() > 0) {
            tbl_movie.getColumnModel().getColumn(6).setResizable(false);
            tbl_movie.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(658, 658, 658)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJframe home = new HomeJframe();
        home.setVisible(true);
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        currentIndex = tbl_movie.getSelectedRow();
        if (currentIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "You haven't choose anything to delete");
            return;
        }
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this movie?");
        if (option == 0 && currentIndex >= 0) {

            ScheduleModel schedule = scheduleDAO.findByMovie_id(movieList.get(currentIndex).getId());

            if (schedule == null) {
                movieDAO.delete(movieList.get(currentIndex).getId());
            } else {
                JOptionPane.showMessageDialog(rootPane, "This movie is currently airing. Cannot delete!!");
            }
            currentIndex = -1;
            movieDAO.findAll();
            showMovie();
        }
        ResetBtnActionPerformed(evt);
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBtnActionPerformed
        String input = JOptionPane.showInputDialog("Enter the name you are looking for ?");
        if (input != null && input.length() > 0) {
            MovieModel movie = new MovieModel();
            movie = movieDAO.findByTitle(input);

            tableModel.setRowCount(0);

            if (movie != null) {
                tableModel.addRow(new Object[]{
                    tableModel.getRowCount() + 1,
                    movie.getTitle(),
                    movie.getCast(),
                    movie.getDirector(),
                    movie.getGenres(),
                    movie.getRelease(),
                    movie.getDuration(),
                    movie.getId()});
            }
            return;
        }
        showMovie();
    }//GEN-LAST:event_FindBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        txt_movie_name.setText("");
        txt_genres.setSelectedIndex(0);
        txt_cast.setText("");
        txt_director.setText("");
        txt_duration.setText("");
        txt_release.setCalendar(null);
        showMovie();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if (!Validate()) {
            return;
        }
        currentIndex = tbl_movie.getSelectedRow();

        MovieModel movie = new MovieModel();

        String title = txt_movie_name.getText();
        String genre = txt_genres.getSelectedItem().toString();
        String cast = txt_cast.getText();
        String director = txt_director.getText();
        int duration = Integer.parseInt(txt_duration.getText());
        Date release = new java.sql.Date(txt_release.getDate().getTime());

        movie.setTitle(title);
        movie.setGenres(genre);
        movie.setCast(cast);
        movie.setDirector(director);
        movie.setDuration(duration);
        movie.setRelease(release);

        if (currentIndex >= 0) {
            movie.setId(movieList.get(currentIndex).getId());
            currentIndex = -1;
            movieDAO.update(movie);
            JOptionPane.showMessageDialog(rootPane, "Update movie successfully");
        } else {
            if (movieDAO.save(movie) != -1) {
                JOptionPane.showMessageDialog(rootPane, "Add movie successfully");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Add movie failed");
            }
        }

        movieList = movieDAO.findAll();
        showMovie();
        ResetBtnActionPerformed(evt);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void txt_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_durationActionPerformed
    }//GEN-LAST:event_txt_durationActionPerformed

    private void txt_durationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_durationKeyPressed
        EventsKey.validateKeyPressed(evt, txt_duration);
    }//GEN-LAST:event_txt_durationKeyPressed

    private void tbl_movieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_movieMouseClicked
        int position = tbl_movie.getSelectedRow();
        showRow(position);
    }//GEN-LAST:event_tbl_movieMouseClicked

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
            java.util.logging.Logger.getLogger(MovieJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton FindBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton backBtn2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbl_movie;
    private javax.swing.JFormattedTextField txt_cast;
    private javax.swing.JFormattedTextField txt_director;
    private javax.swing.JFormattedTextField txt_duration;
    private javax.swing.JComboBox<String> txt_genres;
    private javax.swing.JFormattedTextField txt_movie_name;
    private com.toedter.calendar.JDateChooser txt_release;
    // End of variables declaration//GEN-END:variables

    private void showMovie() {
        movieList = movieDAO.findAll();

        tableModel.setRowCount(0);

        for (MovieModel movie : movieList) {
            tableModel.addRow(new Object[]{
                tableModel.getRowCount() + 1,
                movie.getTitle(),
                movie.getCast(),
                movie.getDirector(),
                movie.getGenres(),
                movie.getRelease(),
                movie.getDuration(),
                movie.getId()});
        }
    }

    private boolean Validate() {
        try {
            if (txt_movie_name.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid movie's title");
                return false;
            }
            if (txt_release.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Invalid movie's released date");
                return false;
            }
            if (txt_duration.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid movie's duration");
                return false;
            }
            if (Integer.parseInt(txt_duration.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Input must greater than 0");
                return false;
            }
            if (txt_genres.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Invalid movie's genre");
                return false;
            }
            if (txt_cast.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid movie's cast");
                return false;
            }
            if (txt_director.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Invalid movie's director");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }

    private void showRow(int position) {
        MovieModel model = movieList.get(position);
        txt_movie_name.setText(model.getTitle());
        txt_cast.setText(model.getCast());
        txt_director.setText(model.getDirector());
        txt_duration.setText(String.valueOf(model.getDuration()));
        txt_release.setDate(model.getRelease());
        txt_genres.setSelectedItem(model.getGenres());
    }

}
