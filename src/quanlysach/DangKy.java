/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author Admin
 */
public class DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
    }
    String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Dangnhap;"
            + "integratedSecurity=true";
    String user = "sa";
    String password ="12345";
    Statement st ;
    ResultSet rs ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtgmail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txtpasswordconfirm = new javax.swing.JPasswordField();
        ptnlogin = new javax.swing.JButton();
        ptndk = new javax.swing.JButton();
        ptncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("TH??M T??I KHO???N");

        jLabel2.setText("USER");

        jLabel3.setText("GMAIL");

        jLabel4.setText("Password");

        jLabel5.setText("ConfirmPassword");

        ptnlogin.setText("????ng nh???p");
        ptnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptnloginActionPerformed(evt);
            }
        });

        ptndk.setText("????ng k??");
        ptndk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptndkActionPerformed(evt);
            }
        });

        ptncancel.setText("Tho??t");
        ptncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpasswordconfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtgmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtuser)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(ptnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(ptndk, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ptncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpasswordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptnlogin)
                    .addComponent(ptndk)
                    .addComponent(ptncancel))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ptndkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptndkActionPerformed
        // TODO add your handling code here:
        int dk=JOptionPane.showConfirmDialog(this,"B???N MU???N ????NG K??","Confirm",JOptionPane.YES_NO_OPTION);
        if(dk!=JOptionPane.YES_OPTION){
            return ;
        }
        try {
            Class.forName(drive);
            Connection con = DriverManager.getConnection(url,user,password);
            String sql ="INSERT into ACCOUNT values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtuser.getText());
            ps.setString(2, txtgmail.getText());
            ps.setString(3, txtpassword.getText());
            ps.setString(4, txtpasswordconfirm.getText());
            
            int n= ps.executeUpdate();
            if(txtuser.getText().equals("")|txtgmail.getText().equals("")|txtpassword.getText().equals("")|txtpasswordconfirm.getText().equals("")){
                JOptionPane.showMessageDialog(this, "kh??ng th??? ????? tr???ng");
            }else if(n!=0){
                JOptionPane.showMessageDialog(this, "????ng k?? th??nh c??ng"); 
            }else{
                JOptionPane.showMessageDialog(this, "????ng k?? th???t b???i");
            }
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ptndkActionPerformed

    private void ptncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptncancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ptncancelActionPerformed

    private void ptnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptnloginActionPerformed
        // TODO add your handling code here:
        DangNhap dn =new DangNhap();
        dn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ptnloginActionPerformed

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
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton ptncancel;
    private javax.swing.JButton ptndk;
    private javax.swing.JButton ptnlogin;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpasswordconfirm;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
