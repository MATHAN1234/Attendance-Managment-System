
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunny_Mangrani
 */
public class DELETELECTURER extends javax.swing.JFrame {

    /**
     * Creates new form DELETELECTURER
     */
    public DELETELECTURER() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        IDDELETELECTURER = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DELETELECTURER = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CLEARLECTURER = new javax.swing.JButton();
        labelLecturerSearch1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnLecturerExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter the Student ID Number & Click Delete ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 360, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, 20));

        IDDELETELECTURER.setBackground(new java.awt.Color(36, 47, 65));
        IDDELETELECTURER.setForeground(new java.awt.Color(255, 255, 255));
        IDDELETELECTURER.setBorder(null);
        IDDELETELECTURER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDDELETELECTURERActionPerformed(evt);
            }
        });
        jPanel2.add(IDDELETELECTURER, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("DELETE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 30));

        DELETELECTURER.setBackground(new java.awt.Color(97, 212, 195));
        DELETELECTURER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        DELETELECTURER.setText("SEARCH");
        DELETELECTURER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETELECTURERActionPerformed(evt);
            }
        });
        jPanel2.add(DELETELECTURER, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 118, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("CLEAR");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, 30));

        CLEARLECTURER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        CLEARLECTURER.setText("CLEAR");
        CLEARLECTURER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARLECTURERActionPerformed(evt);
            }
        });
        jPanel2.add(CLEARLECTURER, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, 30));

        labelLecturerSearch1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch1.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch1.setText("STUDENT ID: ");
        jPanel2.add(labelLecturerSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 430, 520));

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DELETE STUDENTS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searcher (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 270, 270));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 250, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 320, 40));

        btnLecturerExit.setText("EXIT");
        btnLecturerExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnLecturerExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("MANAGMENT SYSTEM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("APU ATTENDENCE ");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 320, 40));

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLecturerExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLecturerExitActionPerformed

    private void IDDELETELECTURERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDDELETELECTURERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDDELETELECTURERActionPerformed

    private void DELETELECTURERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETELECTURERActionPerformed

        String deleteid = IDDELETELECTURER.getText();

        ArrayList<Lecturer1> LecturersList = new ArrayList<>();

        if (deleteid.isEmpty())  {
            JOptionPane.showMessageDialog(this, " Please insert an ID");
        }
        else  {
            File LecturerRecord = new File("bunny.txt");

            try {
                try (FileReader fr = new FileReader(LecturerRecord)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    Lecturer1 DeleteLecturer;

                    while ((data = br.readLine()) != null) {
                        DeleteLecturer = new Lecturer1(data);
                        if (!DeleteLecturer.getidno().equals(deleteid)) {
                            LecturersList.add(DeleteLecturer);
                            JOptionPane.showMessageDialog(this, "Student Deleted Succesfully");
                        }
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(LecturerRecord, false))) {
                    LecturersList.forEach((Student) -> {
                        pw.println(Student.toString());

                    });

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_DELETELECTURERActionPerformed

    private void CLEARLECTURERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARLECTURERActionPerformed
        IDDELETELECTURER.setText("");

    }//GEN-LAST:event_CLEARLECTURERActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        close();
        ADDTEACHER goback = new ADDTEACHER();
        goback.setVisible(true);
    }//GEN-LAST:event_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(DELETELECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELETELECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELETELECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELETELECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETELECTURER().setVisible(true);
            }
        });
    }
    private void close() {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton CLEARLECTURER;
    private javax.swing.JButton DELETELECTURER;
    private javax.swing.JTextField IDDELETELECTURER;
    private javax.swing.JButton btnLecturerExit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelLecturerSearch1;
    // End of variables declaration//GEN-END:variables
}
