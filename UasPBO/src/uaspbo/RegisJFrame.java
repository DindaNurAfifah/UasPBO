
package uaspbo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class RegisJFrame extends javax.swing.JFrame {

    
    public RegisJFrame() {
        initComponents();
        Connect();
        this.setResizable(false);
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbmahasiswa", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch(SQLException ex) {
            Logger.getLogger(RegisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Plogo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pregis = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtstatus = new javax.swing.JTextField();
        txtpasswordregis = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtnama = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        cbxkelas = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        btnsignup = new javax.swing.JButton();
        txtnim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Plogo.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-student-90.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Prompt Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome, Student");

        javax.swing.GroupLayout PlogoLayout = new javax.swing.GroupLayout(Plogo);
        Plogo.setLayout(PlogoLayout);
        PlogoLayout.setHorizontalGroup(
            PlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlogoLayout.createSequentialGroup()
                .addGroup(PlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlogoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5))
                    .addGroup(PlogoLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PlogoLayout.setVerticalGroup(
            PlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlogoLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jPanel1.add(Plogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pregis.setBackground(new java.awt.Color(255, 255, 255));
        Pregis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Have an account ?");
        Pregis.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jButton3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 255));
        jButton3.setText("Sign In");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Pregis.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        txtstatus.setEditable(false);
        txtstatus.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtstatus.setForeground(new java.awt.Color(51, 51, 51));
        txtstatus.setText("Mahasiswa");
        txtstatus.setBorder(null);
        txtstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtstatus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtstatus.setEnabled(false);
        Pregis.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 270, -1));

        txtpasswordregis.setFont(new java.awt.Font("Prompt Medium", 0, 18)); // NOI18N
        txtpasswordregis.setForeground(new java.awt.Color(51, 51, 51));
        txtpasswordregis.setText("jPasswordField1");
        txtpasswordregis.setBorder(null);
        Pregis.add(txtpasswordregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 270, -1));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pregis.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 270, 20));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        Pregis.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 30));

        txtnama.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtnama.setForeground(new java.awt.Color(51, 51, 51));
        txtnama.setText("Nama");
        txtnama.setBorder(null);
        Pregis.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, -1));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pregis.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 270, 20));

        cbxkelas.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        cbxkelas.setForeground(new java.awt.Color(51, 51, 51));
        cbxkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelas A", "Kelas B", "Kelas C", " ", " " }));
        cbxkelas.setBorder(null);
        Pregis.add(cbxkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 290, -1));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pregis.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 270, 20));

        btnsignup.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        Pregis.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 110, -1));

        txtnim.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtnim.setForeground(new java.awt.Color(51, 51, 51));
        txtnim.setText("Nim");
        txtnim.setBorder(null);
        Pregis.add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 270, -1));

        jPanel1.add(Pregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 400, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        LoginFrame loginf = new LoginFrame();
        loginf.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        String nimm = txtnim.getText();
        String pass = new String(txtpasswordregis.getPassword());
        String namaa = txtnama.getText();
        String kelass = cbxkelas.getSelectedItem().toString();
        String state = txtstatus.getText();
        
        try {   
            pst = con.prepareStatement("INSERT INTO tbakun(nim,password,nama,kelas,status)VALUES(?,?,?,?,?)");
            pst.setString(1, nimm);
                pst.setString(2, pass);
                    pst.setString(3, namaa);
                        pst.setString(4, kelass);
                        pst.setString(5, state);
            
            int k = pst.executeUpdate();
            if(k==1) {
                JOptionPane.showMessageDialog(this,"Successfully Sign Up !");
                txtnim.setText("Nim");
                txtpasswordregis.setText("**********");
                txtnama.setText("Nama");
                cbxkelas.setSelectedItem("");
                txtstatus.setText("Mahasiswa");
            }else{
                JOptionPane.showMessageDialog(this,"Unsuccessfully Sign Up !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsignupActionPerformed

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
            java.util.logging.Logger.getLogger(RegisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Plogo;
    private javax.swing.JPanel Pregis;
    private javax.swing.JButton btnsignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxkelas;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JPasswordField txtpasswordregis;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
