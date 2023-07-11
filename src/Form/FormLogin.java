
package Form;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class FormLogin extends javax.swing.JFrame {

    Connection conn = new ConnectionMySQL().getConnection();
    
    public FormLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c_user = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();
        b_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("User");

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        c_user.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        c_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Admin", "Karyawan" }));
        c_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_userActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        t_username.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        t_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_usernameKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        t_password.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });
        t_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_passwordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_passwordKeyTyped(evt);
            }
        });

        b_login.setBackground(new java.awt.Color(0, 255, 102));
        b_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/log_3596092.png"))); // NOI18N
        b_login.setText("Login");
        b_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selamat Datang di Aplikasi Pemesanan Hotel ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t_username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_user, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Timer timer;
    ActionListener action;
    
    private void pemilihan_user(){
        if (c_user.getSelectedIndex() == 1){
            masuk_admin();
        }
        else if (c_user.getSelectedIndex() == 2){
            masuk_karyawan();
        }
    }
    
    private void masuk_admin(){
        String sql = "SELECT * FROM tb_admin WHERE username=? and password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t_username.getText());
            ps.setString(2, t_password.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                FormMain form_utama = new FormMain();
                form_utama.l_id_admin.setText(rs.getString("id_admin"));
                form_utama.l_admin.setText(rs.getString("nama_admin"));
                form_utama.setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void masuk_karyawan(){
        String sql = "SELECT * FROM tb_karyawan WHERE id_karyawan=? and password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t_username.getText());
            ps.setString(2, t_password.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                FormMain form_utama = new FormMain();
                form_utama.l_id_admin.setText(rs.getString("id_karyawan"));
//                form_utama.l_admin.setText(rs.getString("nama_karyawan"));
//                form_utama.b_tambah_karyawan.setEnabled(false);
//                form_utama.b_edit_karyawan.setEnabled(false);
//                form_utama.b_delete_karyawan.setEnabled(false);
                form_utama.setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loginActionPerformed
        if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)){
            JOptionPane.showMessageDialog(null, "Pemilihan User SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_username.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_password.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            pemilihan_user();
        }
    }//GEN-LAST:event_b_loginActionPerformed

    private void t_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_passwordKeyTyped
//        char c = evt.getKeyChar();
//        if (c == KeyEvent.VK_ENTER){
//            if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)){
//                JOptionPane.showMessageDialog(null, "Pemilihan User SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else if ("".equals(t_username.getText())){
//                JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else if ("".equals(t_password.getText())){
//                JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else {
//                pemilihan_user();
//            }
//        }
    }//GEN-LAST:event_t_passwordKeyTyped

    private void t_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_passwordKeyPressed
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)){
                JOptionPane.showMessageDialog(null, "Pemilihan User SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            else if ("".equals(t_username.getText())){
                JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            else if ("".equals(t_password.getText())){
                JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                pemilihan_user();
            }
        }
    }//GEN-LAST:event_t_passwordKeyPressed

    private void t_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_usernameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)){
                JOptionPane.showMessageDialog(null, "Pemilihan User SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            else if ("".equals(t_username.getText())){
                JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            else if ("".equals(t_password.getText())){
                JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                pemilihan_user();
            }
        }
    }//GEN-LAST:event_t_usernameKeyPressed

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

    private void c_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_userActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_login;
    private javax.swing.JComboBox<String> c_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}
