package com.aptech.movietickets.utils;

import com.aptech.movietickets.model.SeatModel;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FileUtil {

    public static void writeExcel(JTable table) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                // Column name
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Row name
                for (int j = 0; j < table.getRowCount(); j++) {
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k) + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "Save file successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error!!");
            }
        }
    }

    public static void exportSeat(List<SeatModel> seats) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            String excelFilePath = chooser.getSelectedFile().toString() + ".xls";
            try {
                ExportSeatExcel.writeExcel(seats, excelFilePath);
                JOptionPane.showMessageDialog(null, "Save file successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error!!");
                Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static List<SeatModel> importSeat() {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            String excelFilePath = chooser.getSelectedFile().toString();
            try {
                return ImportSeatExcel.readExcel(excelFilePath);
            } catch (IOException ex) {
                Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }

    public static void setImageLabel(String getRelativePath, JLabel imgLabel, String name) {
        ImageIcon ii = new ImageIcon(getRelativePath + name);
        //Resize
        Image image = ii.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
        //Display
        imgLabel.setIcon(new ImageIcon(image));
    }
}
