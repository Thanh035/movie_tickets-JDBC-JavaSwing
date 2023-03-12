package com.aptech.movietickets.ui;

import com.aptech.movietickets.model.MovieModel;
import com.aptech.movietickets.service.IMovieService;
import com.aptech.movietickets.service.impl.MovieService;
import com.aptech.movietickets.utils.EventsUtil;
import com.aptech.movietickets.utils.FileUtil;
import java.io.File;
import java.net.URL;
import java.sql.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MovieJFrame extends javax.swing.JFrame {

    private IMovieService movieService = new MovieService();

    DefaultTableModel tableModel;
    static String filename = null;

    int currentIndex = -1;
    List<MovieModel> movieList;

    public MovieJFrame() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_genres = new javax.swing.JComboBox<>();
        txt_cast = new javax.swing.JFormattedTextField();
        txt_director = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_duration = new javax.swing.JFormattedTextField();
        txt_release = new com.toedter.calendar.JDateChooser();
        txt_movie_name = new javax.swing.JFormattedTextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        imagePoster = new javax.swing.JLabel();
        btn_save = new java.awt.Button();
        btn_delete = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
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

        jPanel5.setBackground(new java.awt.Color(253, 248, 221));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel2.setText("Movie name:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel3.setText("Release date:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel4.setText("Duration (minutes):");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel5.setText("Genre:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel7.setText("Cast :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel8.setText("Director:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        txt_genres.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_genres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Action", "Anime", "Comedy", "Drama", "Fantasy", "Horror", "Mystery" }));
        txt_genres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genresActionPerformed(evt);
            }
        });
        jPanel5.add(txt_genres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 250, -1));
        jPanel5.add(txt_cast, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 250, -1));
        jPanel5.add(txt_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 250, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 930, 349, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 948, 429, -1));

        txt_duration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_durationKeyPressed(evt);
            }
        });
        jPanel5.add(txt_duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 250, -1));
        jPanel5.add(txt_release, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 250, -1));
        jPanel5.add(txt_movie_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 250, -1));

        button1.setBackground(new java.awt.Color(255, 204, 0));
        button1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(253, 248, 221));
        button1.setLabel("Export file");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel5.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 500, 72, 35));

        button2.setBackground(new java.awt.Color(66, 62, 62));
        button2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(253, 248, 221));
        button2.setLabel("Choose");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel5.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 72, 35));

        imagePoster.setBackground(new java.awt.Color(255, 255, 255));
        imagePoster.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(imagePoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 180, 230));

        btn_save.setBackground(new java.awt.Color(0, 153, 153));
        btn_save.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(253, 248, 221));
        btn_save.setLabel("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel5.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 500, 72, 35));

        btn_delete.setBackground(new java.awt.Color(228, 31, 37));
        btn_delete.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(253, 248, 221));
        btn_delete.setLabel("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel5.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 500, 72, 35));

        button3.setBackground(new java.awt.Color(255, 153, 0));
        button3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(253, 248, 221));
        button3.setLabel("Clear");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        jPanel5.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 500, 72, 35));

        button4.setBackground(new java.awt.Color(126, 171, 208));
        button4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(253, 248, 221));
        button4.setLabel("Find");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBtnActionPerformed(evt);
            }
        });
        jPanel5.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 500, 72, 35));

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(253, 248, 221));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aptech/movietickets/icons/movie.png"))); // NOI18N
        jLabel12.setText("   Movie Manager");

        backBtn2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
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
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(backBtn2)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, -1));

        tbl_movie.setBackground(new java.awt.Color(0, 102, 204));
        tbl_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Name", "Cast", "Director", "Genres", "Release", "Duration", "Thumbnail"
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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 820, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
        HomeJFrame home = new HomeJFrame();
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
            if (!movieService.delete(movieList.get(currentIndex).getId())) {
                JOptionPane.showMessageDialog(rootPane, "This movie is currently airing. Cannot delete!!");
            }
            currentIndex = -1;
            movieList = movieService.findAll();
            showMovie();
        }
        ResetBtnActionPerformed(evt);
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBtnActionPerformed
        String input = JOptionPane.showInputDialog("Enter the name you are looking for ?");
        if (input != null && input.length() > 0) {
            List<MovieModel> findMovie = (List<MovieModel>) movieList.stream()
                    .filter(u -> u.getTitle().equalsIgnoreCase(input));
//                    .toList();
            tableModel.setRowCount(0);
            if (!findMovie.isEmpty()) {
                showData(findMovie);
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
        filename = null;
        imagePoster.setText("");
        imagePoster.setIcon(null);
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
        movie.setThumbnail(filename);

        if (currentIndex >= 0) {
            int movie_id = movieList.get(currentIndex).getId();
            movie.setId(movieList.get(currentIndex).getId());
            currentIndex = -1;
            movieService.update(movie);
            JOptionPane.showMessageDialog(rootPane, "Update movie successfully");
        } else {
            if (movieService.save(movie) != null) {
                JOptionPane.showMessageDialog(rootPane, "Add movie successfully");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Add movie failed");
            }
        }

        movieList = movieService.findAll();
        showMovie();
        ResetBtnActionPerformed(evt);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void txt_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_durationActionPerformed
    }//GEN-LAST:event_txt_durationActionPerformed

    private void txt_durationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_durationKeyPressed
        EventsUtil.validateKeyPressed(evt, txt_duration);
    }//GEN-LAST:event_txt_durationKeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        FileUtil.writeExcel(tbl_movie);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        URL url = FileUtil.class.getResource("../ui/poster");

        JFileChooser browserImageFile = new JFileChooser();
        browserImageFile.setCurrentDirectory(new File(url.getPath()));
        String selectedImagePath = new File(url.getPath()).toString() + "/";

        //Filter
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Images", "png", "jpg", "jpeg");
        browserImageFile.addChoosableFileFilter(fnef);

        //Dialogue
        int showOpenDialogue = browserImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browserImageFile.getSelectedFile();
            filename = selectedImageFile.getName();
            FileUtil.setImageLabel(selectedImagePath, imagePoster, filename);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void txt_genresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genresActionPerformed

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
            java.util.logging.Logger.getLogger(MovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private java.awt.Button btn_delete;
    private java.awt.Button btn_save;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel imagePoster;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
        movieList = movieService.findAll();
        tableModel.setRowCount(0);
        if (!movieList.isEmpty()) {
            showData(movieList);
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

        //set Image
        URL url = FileUtil.class.getResource("../ui/poster");
        String selectedImagePath = new File(url.getPath()).toString() + "/";

        filename = movieList.get(position).getThumbnail();
        FileUtil.setImageLabel(selectedImagePath, imagePoster, filename);
    }

    private void showData(List<MovieModel> movieList) {
        for (MovieModel movie : movieList) {
            tableModel.addRow(new Object[]{
                tableModel.getRowCount() + 1,
                movie.getTitle(),
                movie.getCast(),
                movie.getDirector(),
                movie.getGenres(),
                movie.getRelease(),
                movie.getDuration(),
                movie.getThumbnail()});
        }
    }
}
