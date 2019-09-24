
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ADDSTUDENTINFORMATION extends javax.swing.JFrame {

    /**
     * Creates new form ADDSTUDENTINFORMATION
     */
    public ADDSTUDENTINFORMATION() {
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
        BACK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnLecturerExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelStudentID = new javax.swing.JLabel();
        LabelStudentName = new javax.swing.JLabel();
        LabelStudentPassword = new javax.swing.JLabel();
        LabelLecturerDOB = new javax.swing.JLabel();
        LabelLecturerNat = new javax.swing.JLabel();
        LabelStudentGender = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnStudentPassword = new javax.swing.JPasswordField();
        btnStudentId = new javax.swing.JTextField();
        btnStudentName = new javax.swing.JTextField();
        btnStudentDob = new javax.swing.JTextField();
        btnStudentNat = new javax.swing.JTextField();
        btnStudentMale = new javax.swing.JCheckBox();
        btnStudentFemale = new javax.swing.JCheckBox();
        btnLecturerClear = new javax.swing.JButton();
        LabelStudentDOB = new javax.swing.JLabel();
        LabelStudentIntake = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        selectintake = new javax.swing.JComboBox<>();
        LabelStudentNat = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        btnLecturerNat1 = new javax.swing.JTextField();
        btnLecturerSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 110, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD NEW STUDENT:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/002-professor.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 250, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 320, 40));

        btnLecturerExit.setText("EXIT");
        btnLecturerExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnLecturerExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("APU ATTENDENCE ");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("MANAGMENT SYSTEM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("PLEASE FILL THIS FORM: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, -1));

        LabelStudentID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentID.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentID.setText("STUDENT ID: ");
        jPanel2.add(LabelStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 32));

        LabelStudentName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentName.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentName.setText("NAME: ");
        jPanel2.add(LabelStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 35));

        LabelStudentPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentPassword.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentPassword.setText("PASSWORD: ");
        jPanel2.add(LabelStudentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        LabelLecturerDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelLecturerDOB.setText("SAVE");
        jPanel2.add(LabelLecturerDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 70, 30));

        LabelLecturerNat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelLecturerNat.setText("CLEAR");
        LabelLecturerNat.setToolTipText("");
        jPanel2.add(LabelLecturerNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, 30));

        LabelStudentGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentGender.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentGender.setText("GENDER: ");
        jPanel2.add(LabelStudentGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 60));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 320, 40));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, 10));

        btnStudentPassword.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentPassword.setText("*************");
        btnStudentPassword.setBorder(null);
        btnStudentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        btnStudentId.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentId.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentId.setToolTipText("");
        btnStudentId.setBorder(null);
        btnStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentIdActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 30));

        btnStudentName.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentName.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentName.setToolTipText("");
        btnStudentName.setBorder(null);
        btnStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentNameActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 30));

        btnStudentDob.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentDob.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentDob.setText("DD/MM/YYYY");
        btnStudentDob.setBorder(null);
        btnStudentDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentDobActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 30));

        btnStudentNat.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentNat.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentNat.setBorder(null);
        btnStudentNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentNatActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 30));

        btnStudentMale.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentMale.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentMale.setText("MALE");
        btnStudentMale.setBorder(null);
        btnStudentMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentMaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 69, 20));

        btnStudentFemale.setBackground(new java.awt.Color(36, 47, 65));
        btnStudentFemale.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentFemale.setText("FEMALE");
        btnStudentFemale.setBorder(null);
        btnStudentFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudentFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 80, 40));

        btnLecturerClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLecturerClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        btnLecturerClear.setText("CLEAR");
        btnLecturerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 130, 30));

        LabelStudentDOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentDOB.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentDOB.setText("DOB:");
        jPanel2.add(LabelStudentDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 32));

        LabelStudentIntake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentIntake.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentIntake.setText("PLEASE SELECT ANY ONE INTAKE:");
        jPanel2.add(LabelStudentIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 30));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 320, 10));

        selectintake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Intake", "UC2F1704CS", "UC2F1704IT", "UC2F1704BDS" }));
        selectintake.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectintake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectintakeActionPerformed(evt);
            }
        });
        jPanel2.add(selectintake, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 100, 30));

        LabelStudentNat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelStudentNat.setForeground(new java.awt.Color(204, 204, 204));
        LabelStudentNat.setText("NATIONALITY:");
        jPanel2.add(LabelStudentNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 30));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, 40));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, 40));

        btnLecturerNat1.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerNat1.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerNat1.setBorder(null);
        btnLecturerNat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerNat1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerNat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 30));

        btnLecturerSave.setBackground(new java.awt.Color(97, 212, 195));
        btnLecturerSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLecturerSave.setForeground(new java.awt.Color(102, 102, 102));
        btnLecturerSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        btnLecturerSave.setText("SAVE");
        btnLecturerSave.setBorder(null);
        btnLecturerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 430, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLecturerExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLecturerExitActionPerformed

    private void btnStudentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentPasswordActionPerformed

    private void btnStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentIdActionPerformed

    }//GEN-LAST:event_btnStudentIdActionPerformed

    private void btnStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentNameActionPerformed

    private void btnStudentDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentDobActionPerformed

    private void btnStudentNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentNatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentNatActionPerformed

    private void btnStudentMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentMaleActionPerformed
        if(btnStudentMale.isSelected())
        btnStudentFemale.setSelected(false);
        Gender = "Male";
    }//GEN-LAST:event_btnStudentMaleActionPerformed

    private void btnStudentFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentFemaleActionPerformed
        if(btnStudentFemale.isSelected())
        btnStudentMale.setSelected(false);
        Gender = "Female";
    }//GEN-LAST:event_btnStudentFemaleActionPerformed

    private void btnLecturerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerClearActionPerformed
        
        btnStudentId.setText("");
        btnStudentName.setText("");
        btnStudentPassword.setText("");
        btnStudentDob.setText("DD/MM/YYYY");
        btnStudentNat.setText("");
        btnStudentMale.setSelected(false);
        btnStudentFemale.setSelected(false);
        
    }//GEN-LAST:event_btnLecturerClearActionPerformed

    private void selectintakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectintakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectintakeActionPerformed

    private void btnLecturerNat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerNat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLecturerNat1ActionPerformed

    private void btnLecturerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerSaveActionPerformed
           String IDNO = btnStudentId.getText();
            String Name = btnStudentName.getText();
            String Password = btnStudentPassword.getText();
            String DOB = btnStudentDob.getText();
            String Nationality = btnStudentNat.getText();
           // String intake =(String) selectintake.getSelectedItem();
           String intake =(String) selectintake.getSelectedItem();
         
            
            if (IDNO.isEmpty() || Name.isEmpty() || Password.isEmpty() || DOB.isEmpty() || Nationality.isEmpty() 
                || Gender.isEmpty() || intake.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Fill all  the fields");}
            else{
                Student1 student = new Student1(IDNO, Name, Password, DOB, Nationality, Gender, intake);
           
       try{
           boolean flag = false;
           File f = new File("Student.txt");
           BufferedReader bf = new BufferedReader(new FileReader(f));
           PrintWriter fw = new PrintWriter(new FileWriter(f,true));
           String line = bf.readLine();
           while(line!=null){
           
           Student1 record = new Student1(line);
           if(record.getidno().equals(IDNO)){
               flag = true;
           }
           line = bf.readLine();
           }
           if(!flag){
           fw.println(student.toString());
           fw.flush();
           JOptionPane.showMessageDialog(null, "Saved Successfully");
           
               btnStudentId.setText("");
               btnStudentName.setText("");
               btnStudentPassword.setText("");
               btnStudentDob.setText("DD/MM/YYYY");
               btnStudentNat.setText("");
               btnStudentMale.setSelected(false);
               btnStudentFemale.setSelected(false);
               selectintake.setSelectedItem("Select Intake");
           }
           else{JOptionPane.showMessageDialog(null, "THIS RECORD IS ALREADY ADD");}
               
               btnStudentId.setText("");
               btnStudentName.setText("");
               btnStudentPassword.setText("");
               btnStudentDob.setText("DD/MM/YYYY");
               btnStudentNat.setText("");
               btnStudentMale.setSelected(false);
               btnStudentFemale.setSelected(false);
               selectintake.setSelectedItem("Select Intake");
           
           
               bf.close();
               fw.close();
               
              
       }
       
        catch(IOException e) {
           JOptionPane.showMessageDialog (null, "I cannot create the file");
        }
            }    
             
    }//GEN-LAST:event_btnLecturerSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ADDSTUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDSTUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDSTUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDSTUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDSTUDENTINFORMATION().setVisible(true);
            }
        });
    }
      private void close() {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JLabel LabelLecturerDOB;
    private javax.swing.JLabel LabelLecturerNat;
    private javax.swing.JLabel LabelStudentDOB;
    private javax.swing.JLabel LabelStudentGender;
    private javax.swing.JLabel LabelStudentID;
    private javax.swing.JLabel LabelStudentIntake;
    private javax.swing.JLabel LabelStudentName;
    private javax.swing.JLabel LabelStudentNat;
    private javax.swing.JLabel LabelStudentPassword;
    private javax.swing.JButton btnLecturerClear;
    private javax.swing.JButton btnLecturerExit;
    private javax.swing.JTextField btnLecturerNat1;
    private javax.swing.JButton btnLecturerSave;
    private javax.swing.JTextField btnStudentDob;
    private javax.swing.JCheckBox btnStudentFemale;
    private javax.swing.JTextField btnStudentId;
    private javax.swing.JCheckBox btnStudentMale;
    private javax.swing.JTextField btnStudentName;
    private javax.swing.JTextField btnStudentNat;
    private javax.swing.JPasswordField btnStudentPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JComboBox<String> selectintake;
    // End of variables declaration//GEN-END:variables
private String Gender;
}
