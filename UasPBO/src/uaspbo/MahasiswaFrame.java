/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uaspbo;

import java.sql.*;
import java.awt.Color;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class MahasiswaFrame extends javax.swing.JFrame {

    public MahasiswaFrame() {
        initComponents();
        Connect();
        LoadAkun();
        LoadMK();
        KodeMK();
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
    
    
    
    private void LoadAkun() {
        int q;
        try {
            pst = con.prepareStatement("SELECT * FROM tbakun");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)tablestudent.getModel();
            df.setRowCount(0);
            while(rs.next()) {
                Vector v1 = new Vector();
                for(int a=1; a <=q ; a++) {
                    v1.add(rs.getString("nim"));
                    v1.add(rs.getString("nama"));
                    v1.add(rs.getString("kelas"));
                }
                df.addRow(v1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void KodeMK() {
        try {
            pst = con.prepareStatement("SELECT kode FROM tbmatkul");
            rs = pst.executeQuery();
            cbxkode.removeAllItems();
            while(rs.next()) {
                cbxkode.addItem(rs.getString(1));
            }
        }catch (SQLException ex) {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroupRadioButton = new javax.swing.ButtonGroup();
        buttonGroupCheckBox = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        bgPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        PanelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelCourse = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelStudent = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PHome = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        PStudent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestudent = new javax.swing.JTable();
        txtnim = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        PCourse = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rbtpraktikum = new javax.swing.JRadioButton();
        rbttidakpraktikum = new javax.swing.JRadioButton();
        cbxkelas = new javax.swing.JComboBox<>();
        cbxsks = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete1 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnsearch1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMK = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cbxkode = new javax.swing.JComboBox<>();
        btndelete2 = new javax.swing.JButton();
        cbxdosen = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtnamaMK = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

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
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(10, 10, 10))
        );

        PanelCourse.setBackground(new java.awt.Color(102, 102, 102));
        PanelCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelCourseMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-book-32.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MANAGE COURSE");

        javax.swing.GroupLayout PanelCourseLayout = new javax.swing.GroupLayout(PanelCourse);
        PanelCourse.setLayout(PanelCourseLayout);
        PanelCourseLayout.setHorizontalGroup(
            PanelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCourseLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCourseLayout.setVerticalGroup(
            PanelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCourseLayout.createSequentialGroup()
                .addGroup(PanelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCourseLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(PanelCourseLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-student-90.png"))); // NOI18N

        PanelStudent.setBackground(new java.awt.Color(102, 102, 102));
        PanelStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelStudentMousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/icons8-student-30 (1).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MANAGE ACCOUNT");

        javax.swing.GroupLayout PanelStudentLayout = new javax.swing.GroupLayout(PanelStudent);
        PanelStudent.setLayout(PanelStudentLayout);
        PanelStudentLayout.setHorizontalGroup(
            PanelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStudentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        PanelStudentLayout.setVerticalGroup(
            PanelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStudentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        PHome.setBackground(new java.awt.Color(255, 255, 255));
        PHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Prompt Semibold", 0, 36)); // NOI18N
        jLabel8.setText("to the system.");
        PHome.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 214, -1, -1));

        jLabel9.setFont(new java.awt.Font("Prompt Semibold", 0, 36)); // NOI18N
        jLabel9.setText("Welcome,");
        PHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 152, -1, -1));

        btnlogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        PHome.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 110, -1));

        PStudent.setBackground(new java.awt.Color(255, 255, 255));

        tablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "KELAS"
            }
        ));
        jScrollPane1.setViewportView(tablestudent);

        txtnim.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtnim.setForeground(new java.awt.Color(153, 153, 153));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("NIM    :");

        btndelete.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PStudentLayout = new javax.swing.GroupLayout(PStudent);
        PStudent.setLayout(PStudentLayout);
        PStudentLayout.setHorizontalGroup(
            PStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PStudentLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(PStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PStudentLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PStudentLayout.createSequentialGroup()
                        .addComponent(btndelete)
                        .addGap(40, 40, 40)
                        .addComponent(btnsearch)
                        .addGap(154, 154, 154))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PStudentLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PStudentLayout.setVerticalGroup(
            PStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PStudentLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(PStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(PStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        PCourse.setBackground(new java.awt.Color(255, 255, 255));
        PCourse.setForeground(new java.awt.Color(153, 153, 153));

        jLabel12.setFont(new java.awt.Font("Prompt Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Mata Kuliah   :");

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("SKS                 :");

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Dosen             :");

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Kelas              :");

        buttonGroupRadioButton.add(rbtpraktikum);
        rbtpraktikum.setText("Praktikum");
        rbtpraktikum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtpraktikumActionPerformed(evt);
            }
        });

        buttonGroupRadioButton.add(rbttidakpraktikum);
        rbttidakpraktikum.setText("Tidak Praktikum");

        cbxkelas.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        cbxkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelas A", "Kelas B", "Kelas C", "Kelas Pilihan", " " }));

        cbxsks.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        cbxsks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 SKS", "3 SKS", "4 SKS" }));

        btnadd.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btndelete1.setText("Delete");
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });

        txtsearch.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(204, 204, 204));
        txtsearch.setText("Cari...");

        btnsearch1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnsearch1.setText("Search");
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });

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
        tableMK.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane3.setViewportView(tableMK);

        jLabel16.setFont(new java.awt.Font("Prompt Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Kode MK      :");

        cbxkode.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        cbxkode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));

        btndelete2.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btndelete2.setText("Clear");
        btndelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete2ActionPerformed(evt);
            }
        });

        cbxdosen.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        cbxdosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pak Fahrul", "Bu Indah", "Pak Awang", "Pak Bambang", "Bu Novianti", "Bu Ummul", "Pak Medi", "Bu Heliza", "Pak Anton", "Pak Reza", "Pak Zainal", " " }));

        jScrollPane6.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N

        txtnamaMK.setColumns(20);
        txtnamaMK.setRows(5);
        jScrollPane6.setViewportView(txtnamaMK);

        javax.swing.GroupLayout PCourseLayout = new javax.swing.GroupLayout(PCourse);
        PCourse.setLayout(PCourseLayout);
        PCourseLayout.setHorizontalGroup(
            PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCourseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(PCourseLayout.createSequentialGroup()
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PCourseLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel16)
                                    .addGap(21, 21, 21)
                                    .addComponent(cbxkode, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PCourseLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PCourseLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PCourseLayout.createSequentialGroup()
                                                .addComponent(rbtpraktikum)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbttidakpraktikum))
                                            .addComponent(cbxsks, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(PCourseLayout.createSequentialGroup()
                                .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PCourseLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PCourseLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxdosen, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))
                        .addGap(53, 53, 53)
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsearch)
                            .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndelete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsearch1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndelete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PCourseLayout.setVerticalGroup(
            PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCourseLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PCourseLayout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnsearch1))
                    .addGroup(PCourseLayout.createSequentialGroup()
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cbxkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(PCourseLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12)))))
                .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCourseLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbxsks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtpraktikum)
                            .addComponent(rbttidakpraktikum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbxkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxdosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(PCourseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadd)
                        .addGap(6, 6, 6)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHome, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
            .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                    .addGap(0, 325, Short.MAX_VALUE)
                    .addComponent(PStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                    .addContainerGap(316, Short.MAX_VALUE)
                    .addComponent(PCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PanelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHomeMousePressed
        setColor(PanelHome);
        resetColor(PanelCourse);
        resetColor(PanelStudent);
        bgPanel.setVisible(true);
        sidePanel.setVisible(true);
        PHome.setVisible(true);
        PStudent.setVisible(false);
        PCourse.setVisible(false);
    }//GEN-LAST:event_PanelHomeMousePressed

    private void PanelCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCourseMousePressed
        setColor(PanelCourse);
        resetColor(PanelHome);
        resetColor(PanelStudent);
        bgPanel.setVisible(true);
        sidePanel.setVisible(true);
        PHome.setVisible(false);
        PStudent.setVisible(false);
        PCourse.setVisible(true);
    }//GEN-LAST:event_PanelCourseMousePressed

    private void PanelStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelStudentMousePressed
        setColor(PanelStudent);
        resetColor(PanelHome);
        resetColor(PanelCourse);
        bgPanel.setVisible(true);
        sidePanel.setVisible(true);
        PHome.setVisible(false);
        PStudent.setVisible(true);
        PCourse.setVisible(false);
        
    }//GEN-LAST:event_PanelStudentMousePressed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String nimm = txtnim.getText();
        try {
            pst = con.prepareStatement("DELETE FROM tbakun WHERE nim=?");
            pst.setString(1, nimm);
            
            int k = pst.executeUpdate();
            
            if(k == 1) {
                JOptionPane.showMessageDialog(this, "Data Deleted!");
                txtnim.setText("");
                LoadMK();
                KodeMK();
            }else {
                JOptionPane.showMessageDialog(this, "Failed to Delete Data!");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DefaultTableModel df = (DefaultTableModel)tablestudent.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(df);
        tablestudent.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtnim.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    private void rbtpraktikumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtpraktikumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtpraktikumActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String namaMK = txtnamaMK.getText();
        String skss = cbxsks.getSelectedItem().toString();
        String kls = cbxkelas.getSelectedItem().toString();
        String rbt = null;
        String dsn = cbxdosen.getSelectedItem().toString();
        
        if(rbtpraktikum.isSelected()) {
            rbt="Praktikum";
        }else if(rbttidakpraktikum.isSelected()) {
            rbt="Tidak";
        }
        
        try {   
            pst = con.prepareStatement("INSERT INTO tbmatkul(nama,sks,praktikum,kelas,dosen)VALUES(?,?,?,?,?)");
            pst.setString(1, namaMK);
                pst.setString(2, skss);
                    pst.setString(3, rbt);
                        pst.setString(4, kls);
                        pst.setString(5, dsn);
            
            int k = pst.executeUpdate();
            if(k==1) {
                JOptionPane.showMessageDialog(this,"Successfully Insert Data!");
                LoadMK();
                KodeMK();
                txtnamaMK.setText("");
                cbxsks.setSelectedItem("");
                cbxkelas.setSelectedItem("");
                buttonGroupRadioButton.clearSelection();
                cbxdosen.setSelectedItem("");
            }else{
                JOptionPane.showMessageDialog(this,"Failed to Insert Data !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String id = cbxkode.getSelectedItem().toString();
        String namaMK = txtnamaMK.getText();
        String skss = cbxsks.getSelectedItem().toString();
        String kls = cbxkelas.getSelectedItem().toString();
        String rbt = buttonGroupRadioButton.getSelection().toString();
        String dsn = cbxdosen.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("UPDATE tbmatkul SET nama=?,sks=?,praktikum=?,kelas=?,dosen=? WHERE kode=? ");
            pst.setString(1, namaMK);
                pst.setString(2, skss);
                    pst.setString(3, rbt);
                        pst.setString(4, kls);
                            pst.setString(5, dsn);
                                pst.setString(6, id);
                                
            int k = pst.executeUpdate();
            if(k == 1) {
                JOptionPane.showMessageDialog(this,"Successfully Update Data!");
                LoadMK();
                KodeMK();
                cbxkode.setSelectedItem("");
                txtnamaMK.setText("");
                cbxsks.setSelectedItem("");
                cbxkelas.setSelectedItem("");
                buttonGroupRadioButton.clearSelection();
                cbxdosen.setSelectedItem("");
            } else {
                JOptionPane.showMessageDialog(this,"Failed to Update Data !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed
        String kodee = cbxkode.getSelectedItem().toString();
        try {
            pst = con.prepareStatement("DELETE FROM tbmatkul WHERE kode=?");
            pst.setString(1, kodee);
            
            int k = pst.executeUpdate();
            
            if(k == 1) {
                JOptionPane.showMessageDialog(this, "Data Deleted!");
                txtnim.setText("");
                LoadMK();
                KodeMK();
            }else {
                JOptionPane.showMessageDialog(this, "Failed to Delete Data!");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndelete1ActionPerformed

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
        DefaultTableModel dg = (DefaultTableModel)tableMK.getModel();
        TableRowSorter<DefaultTableModel> objj = new TableRowSorter<>(dg);
        tableMK.setRowSorter(objj);
        objj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()));
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void btndelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete2ActionPerformed
        txtnamaMK.setText("");
        cbxsks.setSelectedItem("");
        cbxkelas.setSelectedItem("");
        buttonGroupRadioButton.clearSelection();
        cbxdosen.setSelectedItem("");
    }//GEN-LAST:event_btndelete2ActionPerformed

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
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCourse;
    private javax.swing.JPanel PHome;
    private javax.swing.JPanel PStudent;
    private javax.swing.JPanel PanelCourse;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelStudent;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btndelete2;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsearch1;
    private javax.swing.JButton btnupdate;
    public javax.swing.ButtonGroup buttonGroupCheckBox;
    private javax.swing.ButtonGroup buttonGroupRadioButton;
    private javax.swing.JComboBox<String> cbxdosen;
    private javax.swing.JComboBox<String> cbxkelas;
    private javax.swing.JComboBox<String> cbxkode;
    private javax.swing.JComboBox<String> cbxsks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton rbtpraktikum;
    private javax.swing.JRadioButton rbttidakpraktikum;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTable tableMK;
    private javax.swing.JTable tablestudent;
    private javax.swing.JTextArea txtnamaMK;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
