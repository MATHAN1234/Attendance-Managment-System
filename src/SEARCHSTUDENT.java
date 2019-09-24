
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SEARCHSTUDENT extends javax.swing.JFrame {

    /**
     * Creates new form SEARCHSTUDENT
     */
    public SEARCHSTUDENT() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        IDSEARCHSTUDENT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SearchStudentbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ClearStudentbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        labelLecturerSearch = new javax.swing.JLabel();
        labelLecturerSearch1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnStudentSID = new javax.swing.JTextField();
        labelLecturerSearch2 = new javax.swing.JLabel();
        btnStudentSName = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        labelLecturerSearch3 = new javax.swing.JLabel();
        btnStudentSPassword = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        labelLecturerSearch4 = new javax.swing.JLabel();
        btnStudentSDOB = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        labelLecturerSearch5 = new javax.swing.JLabel();
        labelLecturerSearch6 = new javax.swing.JLabel();
        btnStudentSNat = new javax.swing.JTextField();
        btnStudentSFemale = new javax.swing.JCheckBox();
        btnStudentSMale = new javax.swing.JCheckBox();
        jSeparator11 = new javax.swing.JSeparator();
        SelectSearchIntake = new javax.swing.JComboBox<>();
        LabelStudentIntake = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH STUDENTS:");
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
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter the Student ID Number & Click Search: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 330, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 20));

        IDSEARCHSTUDENT.setBackground(new java.awt.Color(36, 47, 65));
        IDSEARCHSTUDENT.setForeground(new java.awt.Color(255, 255, 255));
        IDSEARCHSTUDENT.setBorder(null);
        IDSEARCHSTUDENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSEARCHSTUDENTActionPerformed(evt);
            }
        });
        jPanel2.add(IDSEARCHSTUDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 230, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("SEARCH");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 30));

        SearchStudentbtn.setBackground(new java.awt.Color(97, 212, 195));
        SearchStudentbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        SearchStudentbtn.setText("SEARCH");
        SearchStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentbtnActionPerformed(evt);
            }
        });
        jPanel2.add(SearchStudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 118, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("CLEAR");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, 30));

        ClearStudentbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        ClearStudentbtn.setText("CLEAR");
        ClearStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearStudentbtnActionPerformed(evt);
            }
        });
        jPanel2.add(ClearStudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 120, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Student Profile: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));

        labelLecturerSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch.setText("Name: ");
        jPanel2.add(labelLecturerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 60, 30));

        labelLecturerSearch1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch1.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch1.setText("STUDENT ID: ");
        jPanel2.add(labelLecturerSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 240, 20));

        btnStudentSID.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSID.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentSID.setBorder(null);
        btnStudentSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentSIDActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 250, 20));

        labelLecturerSearch2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch2.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch2.setText("ID No: ");
        jPanel2.add(labelLecturerSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 60, 30));

        btnStudentSName.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSName.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentSName.setBorder(null);
        btnStudentSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentSNameActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 250, 20));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 240, 20));

        labelLecturerSearch3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch3.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch3.setText("Password: ");
        jPanel2.add(labelLecturerSearch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 70, 30));

        btnStudentSPassword.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentSPassword.setBorder(null);
        btnStudentSPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentSPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentSPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 260, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 240, 20));

        labelLecturerSearch4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch4.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch4.setText("DOB: ");
        jPanel2.add(labelLecturerSearch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 70, 30));

        btnStudentSDOB.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSDOB.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentSDOB.setBorder(null);
        btnStudentSDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentSDOBActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentSDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 260, 20));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 240, 20));

        labelLecturerSearch5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch5.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch5.setText("Gender:");
        jPanel2.add(labelLecturerSearch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 70, 20));

        labelLecturerSearch6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLecturerSearch6.setForeground(new java.awt.Color(204, 204, 204));
        labelLecturerSearch6.setText("Nationality: ");
        jPanel2.add(labelLecturerSearch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 70, 30));

        btnStudentSNat.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSNat.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentSNat.setBorder(null);
        btnStudentSNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentSNatActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentSNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 260, 20));

        btnStudentSFemale.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSFemale.setForeground(new java.awt.Color(204, 204, 204));
        btnStudentSFemale.setText("FEMALE");
        jPanel2.add(btnStudentSFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 20));

        btnStudentSMale.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentSMale.setForeground(new java.awt.Color(204, 204, 204));
        btnStudentSMale.setText("MALE");
        btnStudentSMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentSMaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentSMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 60, 20));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 240, 20));

        SelectSearchIntake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Intake", "UC2F1704CS", "UC2F1704IT", "UC2F1704BDS" }));
        SelectSearchIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectSearchIntakeActionPerformed(evt);
            }
        });
        jPanel2.add(SelectSearchIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 120, 20));

        LabelStudentIntake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentIntake.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentIntake.setText("Intake: ");
        jPanel2.add(LabelStudentIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 430, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLecturerExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLecturerExitActionPerformed

    private void IDSEARCHSTUDENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSEARCHSTUDENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDSEARCHSTUDENTActionPerformed

    private void SearchStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentbtnActionPerformed

        FileReader fr = null;
        String StudentID= IDSEARCHSTUDENT.getText();
        String genderrecord, record;

        if (StudentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an ID First"); }
        else{
            try {
                File Student = new File ("Student.txt");
                fr = new FileReader(Student);
                BufferedReader br = new BufferedReader(fr);
                String data;
                Student1 student;

                while ((data = br.readLine()) != null){
                    student = new Student1(data);

                    if (student.getidno().equals(StudentID))
                    {

                        btnStudentSID.setText(student.getidno());
                        btnStudentSName.setText(student.getname());
                        btnStudentSPassword.setText(student.getpassword());
                        btnStudentSNat.setText(student.getnationality());
                        btnStudentSDOB.setText(student.getdob());
                        genderrecord = student.getgender();
                        record = student.getIntake();
                        
                        if (genderrecord.equals("Male")){ // checks the user gender
                            btnStudentSMale.setSelected(true);
                            btnStudentSFemale.setSelected(false);}
                        else {btnStudentSFemale.setSelected(true);
                            btnStudentSMale.setSelected(false);}

                       
                        switch (record) {
                        case "UC2F1704CS":
                            SelectSearchIntake.setSelectedItem("UC2F1704CS");
                            break;
                        case "UC2F1704IT":
                            SelectSearchIntake.setSelectedItem("UC2F1704IT");
                            break;
                        case "UC2F1704BDS":
                            SelectSearchIntake.setSelectedItem("UC2F1704BDS");
                            break;
                        
                        default:
                            SelectSearchIntake.setSelectedItem("");
                            break;
                    }

                        JOptionPane.showMessageDialog(null,"Data is searched successfully");
                        return;

                    }//if(!lecturer.getidno().equals(LecturerID))
                    //     {
                        //JOptionPane.showMessageDialog(null,"Record not founded");
                        //return;
                        //}

                }

            } catch (FileNotFoundException ex) {

           // }   catch (IOException ex) {
             //   Logger.getLogger(SEARCHLECTURER.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SEARCHSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fr.close();

                    //  } catch (IOException ex) {
                    //    Logger.getLogger(Admin_SearchRecords.class.getName()).log(Level.SEVERE, null, ex);
              //  } catch (IOException ex) {
                //    Logger.getLogger(SEARCHLECTURER.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SEARCHSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }//GEN-LAST:event_SearchStudentbtnActionPerformed

    private void ClearStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearStudentbtnActionPerformed
        IDSEARCHSTUDENT.setText("");
        btnStudentSID.setText("");
        btnStudentSName.setText("");
        btnStudentSPassword.setText("");
        btnStudentSMale.setSelected(false);
        btnStudentSFemale.setSelected(false);
        btnStudentSNat.setText("");
        btnStudentSDOB.setText("");
        SelectSearchIntake.setSelectedItem("Select Intake");
    }//GEN-LAST:event_ClearStudentbtnActionPerformed

    private void btnStudentSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentSIDActionPerformed

    private void btnStudentSNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentSNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentSNameActionPerformed

    private void btnStudentSPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentSPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentSPasswordActionPerformed

    private void btnStudentSDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentSDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentSDOBActionPerformed

    private void btnStudentSNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentSNatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentSNatActionPerformed

    private void btnStudentSMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentSMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentSMaleActionPerformed

    private void SelectSearchIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectSearchIntakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectSearchIntakeActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        close();
        ADDSTUDENT goback = new ADDSTUDENT();
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
            java.util.logging.Logger.getLogger(SEARCHSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEARCHSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEARCHSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEARCHSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCHSTUDENT().setVisible(true);
            }
        });
    }
      private void close() {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton ClearStudentbtn;
    private javax.swing.JTextField IDSEARCHSTUDENT;
    private javax.swing.JLabel LabelStudentIntake;
    private javax.swing.JButton SearchStudentbtn;
    private javax.swing.JComboBox<String> SelectSearchIntake;
    private javax.swing.JButton btnLecturerExit;
    private javax.swing.JTextField btnStudentSDOB;
    private javax.swing.JCheckBox btnStudentSFemale;
    private javax.swing.JTextField btnStudentSID;
    private javax.swing.JCheckBox btnStudentSMale;
    private javax.swing.JTextField btnStudentSName;
    private javax.swing.JTextField btnStudentSNat;
    private javax.swing.JTextField btnStudentSPassword;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel labelLecturerSearch;
    private javax.swing.JLabel labelLecturerSearch1;
    private javax.swing.JLabel labelLecturerSearch2;
    private javax.swing.JLabel labelLecturerSearch3;
    private javax.swing.JLabel labelLecturerSearch4;
    private javax.swing.JLabel labelLecturerSearch5;
    private javax.swing.JLabel labelLecturerSearch6;
    // End of variables declaration//GEN-END:variables
}
