
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
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
public class USERADMIN extends javax.swing.JFrame {

    /**
     * Creates new form USERADMIN
     */
    public USERADMIN() {
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

        jLabel4 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        butnExit = new javax.swing.JButton();
        Username1 = new javax.swing.JTextField();
        butnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password1 = new javax.swing.JPasswordField();
        BACK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("ADMIN LOGIN FORM: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 300, -1));

        Login.setText("LOGIN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 103, -1));

        butnExit.setText("EXIT");
        butnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnExitActionPerformed(evt);
            }
        });
        getContentPane().add(butnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 110, -1));

        Username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username1ActionPerformed(evt);
            }
        });
        getContentPane().add(Username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, 30));

        butnClear.setText("CLEAR");
        butnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnClearActionPerformed(evt);
            }
        });
        getContentPane().add(butnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 103, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("USERNAME: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PASSWORD: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password1ActionPerformed(evt);
            }
        });
        getContentPane().add(Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 180, 30));

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_still01_entrance_0.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username1ActionPerformed
        
    }//GEN-LAST:event_Username1ActionPerformed

    private void butnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnClearActionPerformed
    Username1.setText("");
    Password1.setText("");
    }//GEN-LAST:event_butnClearActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String Username = Username1.getText();
        String Password = Password1.getText();
        
        if(Username.equals("Mathan") && Password.equals("1234")){
             ADMININFORMATION Wtadmin = new ADMININFORMATION ();
            Wtadmin.setVisible(true);
        
        }else {
            JOptionPane.showMessageDialog(null, "Sorry, This Password is wrong       \nClick Ok & Try Again, Thanks! ", "WRONG PASSWORD", JOptionPane.ERROR_MESSAGE);
            Username1.setText("");
            Password1.setText("");
            
                    }
     
           
    }//GEN-LAST:event_LoginActionPerformed

    private void Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password1ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        close();
        APU goback = new APU();
        goback.setVisible(true);
    }//GEN-LAST:event_BACKActionPerformed

    private void butnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_butnExitActionPerformed

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
            java.util.logging.Logger.getLogger(USERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERADMIN().setVisible(true);
                
            }
        });
    }
    private void close() {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password1;
    private javax.swing.JTextField Username1;
    private javax.swing.JButton butnClear;
    private javax.swing.JButton butnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}