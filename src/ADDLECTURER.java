
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
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
public class ADDLECTURER extends javax.swing.JFrame {

    /**
     * Creates new form ADDLECTURER
     */
    public ADDLECTURER() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelLecturerID = new javax.swing.JLabel();
        LabelLecturerName = new javax.swing.JLabel();
        LabelLecturerPassword = new javax.swing.JLabel();
        LabelLecturerDOB = new javax.swing.JLabel();
        LabelLecturerNat = new javax.swing.JLabel();
        LabelLecturerGender = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnLecturerPassword = new javax.swing.JPasswordField();
        btnLecturerId = new javax.swing.JTextField();
        btnLecturerName = new javax.swing.JTextField();
        btnLecturerDob = new javax.swing.JTextField();
        btnLecturerNat = new javax.swing.JTextField();
        btnLecturerMale = new javax.swing.JCheckBox();
        btnLecturerFemale = new javax.swing.JCheckBox();
        btnLecturerSave = new javax.swing.JButton();
        btnLecturerClear = new javax.swing.JButton();
        LabelLecturerDOB1 = new javax.swing.JLabel();
        LabelLecturerNat1 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnLecturerExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("PLEASE FILL THIS FORM: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, -1));

        LabelLecturerID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLecturerID.setForeground(new java.awt.Color(204, 204, 204));
        LabelLecturerID.setText("LECTURER ID: ");
        jPanel2.add(LabelLecturerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 32));

        LabelLecturerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLecturerName.setForeground(new java.awt.Color(204, 204, 204));
        LabelLecturerName.setText("NAME: ");
        jPanel2.add(LabelLecturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 35));

        LabelLecturerPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLecturerPassword.setForeground(new java.awt.Color(204, 204, 204));
        LabelLecturerPassword.setText("PASSWORD: ");
        jPanel2.add(LabelLecturerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        LabelLecturerDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelLecturerDOB.setText("SAVE");
        jPanel2.add(LabelLecturerDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 70, 30));

        LabelLecturerNat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelLecturerNat.setText("CLEAR");
        LabelLecturerNat.setToolTipText("");
        jPanel2.add(LabelLecturerNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, 30));

        LabelLecturerGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLecturerGender.setForeground(new java.awt.Color(204, 204, 204));
        LabelLecturerGender.setText("GENDER: ");
        jPanel2.add(LabelLecturerGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, 60));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, 40));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 320, 40));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, 40));

        btnLecturerPassword.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerPassword.setText("*************");
        btnLecturerPassword.setBorder(null);
        btnLecturerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        btnLecturerId.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerId.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerId.setToolTipText("");
        btnLecturerId.setBorder(null);
        btnLecturerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerIdActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 30));

        btnLecturerName.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerName.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerName.setToolTipText("");
        btnLecturerName.setBorder(null);
        btnLecturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerNameActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 30));

        btnLecturerDob.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerDob.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerDob.setText("DD/MM/YYYY");
        btnLecturerDob.setBorder(null);
        btnLecturerDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerDobActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 30));

        btnLecturerNat.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerNat.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerNat.setBorder(null);
        btnLecturerNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerNatActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 30));

        btnLecturerMale.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerMale.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerMale.setText("MALE");
        btnLecturerMale.setBorder(null);
        btnLecturerMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerMaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 69, 20));

        btnLecturerFemale.setBackground(new java.awt.Color(36, 47, 65));
        btnLecturerFemale.setForeground(new java.awt.Color(255, 255, 255));
        btnLecturerFemale.setText("FEMALE");
        btnLecturerFemale.setBorder(null);
        btnLecturerFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 395, 80, 50));

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
        jPanel2.add(btnLecturerSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, 30));

        btnLecturerClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLecturerClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture15.PNG"))); // NOI18N
        btnLecturerClear.setText("CLEAR");
        btnLecturerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturerClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnLecturerClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 130, 30));

        LabelLecturerDOB1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLecturerDOB1.setForeground(new java.awt.Color(204, 204, 204));
        LabelLecturerDOB1.setText("DOB:");
        jPanel2.add(LabelLecturerDOB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 32));

        LabelLecturerNat1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLecturerNat1.setForeground(new java.awt.Color(204, 204, 204));
        LabelLecturerNat1.setText("NATIONALITY:");
        jPanel2.add(LabelLecturerNat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 30));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 320, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 430, 520));

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD NEW TEACHER:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/002-professor.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 270, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 250, 40));
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

    private void btnLecturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLecturerNameActionPerformed

    private void btnLecturerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerClearActionPerformed
    btnLecturerId.setText("");
    btnLecturerName.setText("");
    btnLecturerPassword.setText("");
    btnLecturerDob.setText("DD/MM/YYYY");
    btnLecturerNat.setText("");
    btnLecturerMale.setSelected(false);
    btnLecturerFemale.setSelected(false);
    
   
    }//GEN-LAST:event_btnLecturerClearActionPerformed

    private void btnLecturerExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerExitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnLecturerExitActionPerformed

    private void btnLecturerDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLecturerDobActionPerformed

    private void btnLecturerMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerMaleActionPerformed
           if(btnLecturerMale.isSelected())
               btnLecturerFemale.setSelected(false);
            Gender = "Male";
    }//GEN-LAST:event_btnLecturerMaleActionPerformed

    private void btnLecturerFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerFemaleActionPerformed
           if(btnLecturerFemale.isSelected())
               btnLecturerMale.setSelected(false);
            Gender = "Female";
    }//GEN-LAST:event_btnLecturerFemaleActionPerformed

    private void btnLecturerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerSaveActionPerformed
         
             String IDNO = btnLecturerId.getText();
            String Name = btnLecturerName.getText();
            String Password = btnLecturerPassword.getText();
            String DOB = btnLecturerDob.getText();
            String Nationality = btnLecturerNat.getText();
         
            
            if (IDNO.isEmpty() || Name.isEmpty() || Password.isEmpty() || DOB.isEmpty() || Nationality.isEmpty() 
                || Gender.isEmpty() ) {
            JOptionPane.showMessageDialog(this, " Please Fill all  the fields");}
            else{
                Lecturer1 lecturer = new Lecturer1(IDNO, Name, Password,DOB, Nationality, Gender);
           
       try{
           boolean flag = false;
           File f = new File("bunny.txt");
           BufferedReader bf = new BufferedReader(new FileReader(f));
           PrintWriter fw = new PrintWriter(new FileWriter(f,true));
           String line = bf.readLine();
           while(line!=null){
           
           Lecturer1 record = new Lecturer1(line);
           if(record.getidno().equals(IDNO)){
               flag = true;
           }
           line = bf.readLine();
           }
           if(!flag){
           fw.println(lecturer.toString());
           fw.flush();
           JOptionPane.showMessageDialog(null, "Saved Successfully");
           
            btnLecturerId.setText("");
               btnLecturerName.setText("");
               btnLecturerPassword.setText("");
               btnLecturerDob.setText("DD/MM/YYYY");
               btnLecturerNat.setText("");
               btnLecturerMale.setSelected(false);
               btnLecturerFemale.setSelected(false);
    }
           else{JOptionPane.showMessageDialog(null, "THIS RECORD IS ALREADY ADD");}
                btnLecturerId.setText("");
               btnLecturerName.setText("");
               btnLecturerPassword.setText("");
               btnLecturerDob.setText("DD/MM/YYYY");
               btnLecturerNat.setText("");
               btnLecturerMale.setSelected(false);
               btnLecturerFemale.setSelected(false);
           
           
               bf.close();
               fw.close();
               
              
       }
       
        catch(IOException e) {
           JOptionPane.showMessageDialog (null, "I cannot create the file");
        }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*String IDNO = btnLecturerId.getText();
            String Name = btnLecturerName.getText();
            String Password = btnLecturerPassword.getText();
            String DOB = btnLecturerDob.getText();
            String Nationality = btnLecturerNat.getText();
         
            
            if (IDNO.isEmpty() || Name.isEmpty() || Password.isEmpty() || DOB.isEmpty() || Nationality.isEmpty() 
                || Gender.isEmpty() ) {
            JOptionPane.showMessageDialog(this, " Please Fill all  the fields");}
            else{
                Lecturer1 lecturer = new Lecturer1(IDNO, Name, Password, Nationality, Gender, DOB );
           
       try{
           
           PrintWriter printwriter = new PrintWriter(new FileWriter("bunny.txt",true));
           printwriter.println(lecturer.toString());
         
           
               JOptionPane.showMessageDialog(null, "Saved Successfully");
               printwriter.flush();
               printwriter.close();
               
       }
       
        catch(IOException e) {
           JOptionPane.showMessageDialog (null, "I cannot create the file");
        }
            }

               btnLecturerId.setText("");
               btnLecturerName.setText("");
               btnLecturerPassword.setText("");
               btnLecturerDob.setText("DD/MM/YYYY");
               btnLecturerNat.setText("");
               btnLecturerMale.setSelected(false);
               btnLecturerFemale.setSelected(false);
    
       */
    }//GEN-LAST:event_btnLecturerSaveActionPerformed
    
    private void btnLecturerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerIdActionPerformed
         
    }//GEN-LAST:event_btnLecturerIdActionPerformed

    private void btnLecturerNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerNatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLecturerNatActionPerformed

    private void btnLecturerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLecturerPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ADDLECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDLECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDLECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDLECTURER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     /*   /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDLECTURER().setVisible(true);
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
    private javax.swing.JLabel LabelLecturerDOB1;
    private javax.swing.JLabel LabelLecturerGender;
    private javax.swing.JLabel LabelLecturerID;
    private javax.swing.JLabel LabelLecturerName;
    private javax.swing.JLabel LabelLecturerNat;
    private javax.swing.JLabel LabelLecturerNat1;
    private javax.swing.JLabel LabelLecturerPassword;
    private javax.swing.JButton btnLecturerClear;
    private javax.swing.JTextField btnLecturerDob;
    private javax.swing.JButton btnLecturerExit;
    private javax.swing.JCheckBox btnLecturerFemale;
    private javax.swing.JTextField btnLecturerId;
    private javax.swing.JCheckBox btnLecturerMale;
    private javax.swing.JTextField btnLecturerName;
    private javax.swing.JTextField btnLecturerNat;
    private javax.swing.JPasswordField btnLecturerPassword;
    private javax.swing.JButton btnLecturerSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

    void setLabelLecturerID(String ss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Gender;
}