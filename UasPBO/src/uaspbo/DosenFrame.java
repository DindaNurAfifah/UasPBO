
package uaspbo;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class DosenFrame extends javax.swing.JFrame {
    
    public DosenFrame() {
        initComponents();
        Connect();
        LoadMK();
        kolom();
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

    private void LoadMK() {
        int q;
        try {
            pst = con.prepareStatement("SELECT * FROM tbmatkul");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)tableMK.getModel();
            df.setRowCount(0);
            while(rs.next()) {
                Vector v2 = new Vector();
                for(int a=1; a <=q ; a++) {
                    v2.add(rs.getString("kode"));
                    v2.add(rs.getString("nama"));
                    v2.add(rs.getString("sks"));
                    v2.add(rs.getString("praktikum"));
                    v2.add(rs.getString("kelas"));
                    v2.add(rs.getString("dosen"));
                }
                df.addRow(v2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void kolom() {
        TableColumn column;
        tableMK.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tableMK.getColumnModel().getColumn(0);
        column.setPreferredWidth(50);
        column = tableMK.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);
        column = tableMK.getColumnModel().getColumn(2);
        column.setPreferredWidth(50);
        column = tableMK.getColumnModel().getColumn(3);
        column.setPreferredWidth(80);
        column = tableMK.getColumnModel().getColumn(4);
        column.setPreferredWidth(60);
        column = tableMK.getColumnModel().getColumn(5);
        column.setPreferredWidth(100);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        PanelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelCourse = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sidebantu = new javax.swing.JPanel();
        Phome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        PCourse = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMK = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidePanel.setBackground(new java.awt.Color(102, 102, 102));

        PanelHome.setBackground(new java.awt.Color(102, 102, 102));
        PanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelHomeMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-home-30.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME PAGE");

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelHomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-student-90.png"))); // NOI18N

        PanelCourse.setBackground(new java.awt.Color(102, 102, 102));
        PanelCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelCourseMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-book-32.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COURSE");

        javax.swing.GroupLayout PanelCourseLayout = new javax.swing.GroupLayout(PanelCourse);
        PanelCourse.setLayout(PanelCourseLayout);
        PanelCourseLayout.setHorizontalGroup(
            PanelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCourseLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCourseLayout.setVerticalGroup(
            PanelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCourseLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidebantu.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout sidebantuLayout = new javax.swing.GroupLayout(sidebantu);
        sidebantu.setLayout(sidebantuLayout);
        sidebantuLayout.setHorizontalGroup(
            sidebantuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sidebantuLayout.setVerticalGroup(
            sidebantuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sidebantu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sidebantu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Phome.setBackground(new java.awt.Color(255, 255, 255));
        Phome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Prompt Semibold", 0, 36)); // NOI18N
        jLabel6.setText("Welcome,");
        Phome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Prompt Semibold", 0, 36)); // NOI18N
        jLabel7.setText("to the system.");
        Phome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        btnlogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        Phome.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 110, -1));

        PCourse.setBackground(new java.awt.Color(255, 255, 255));
        PCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableMK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KODE", "MATKUL", "SKS", "PRAKTIKUM", "KELAS", "DOSEN"
            }
        ));
        tableMK.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tableMK);

        PCourse.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 490, 360));

        txtsearch.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(153, 153, 153));
        PCourse.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 280, -1));

        btnsearch.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        PCourse.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 110, -1));

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Phome, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                    .addGap(0, 330, Short.MAX_VALUE)
                    .addComponent(PCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Phome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PanelCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCourseMousePressed
        setColor(PanelCourse);
        resetColor(PanelHome);
        sidePanel.setVisible(true);
        bgPanel.setVisible(true);
        sidebantu.setVisible(true);
        Phome.setVisible(false);
        PCourse.setVisible(true);
    }//GEN-LAST:event_PanelCourseMousePressed

    private void PanelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHomeMousePressed
        setColor(PanelHome);
        resetColor(PanelCourse);
        sidePanel.setVisible(true);
        bgPanel.setVisible(true);
        Phome.setVisible(true);
        PCourse.setVisible(false);
    }//GEN-LAST:event_PanelHomeMousePressed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DefaultTableModel dg = (DefaultTableModel)tableMK.getModel();
        TableRowSorter<DefaultTableModel> objj = new TableRowSorter<>(dg);
        tableMK.setRowSorter(objj);
        objj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    void setColor(JPanel panel) {
        panel.setBackground(new Color(153,153,153));
    }
    
    void resetColor(JPanel panel) {
        panel.setBackground(new Color(102,102,102));
    }
    
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
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DosenFrame().setVisible(true);
            }
        });
       
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCourse;
    private javax.swing.JPanel PanelCourse;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel Phome;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel sidebantu;
    private javax.swing.JTable tableMK;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
