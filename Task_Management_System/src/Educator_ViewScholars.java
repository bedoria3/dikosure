package task_management_system;

import DBUtil.CRUD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Student.Admin
 */
public class Educator_ViewScholars extends javax.swing.JFrame {

    String sex;

    /**
     * Creates new form Register_student
     */
    public Educator_ViewScholars() {
        initComponents();
        this.setTitle("Educator's Dashboard");
        showlist();
        String sex;

        Connection con1;
        PreparedStatement pst;

    }

    private void showlist() {
        try {
            String query = "SELECT * FROM `scholars_info";
            int s;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task_system", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                com.mysql.jdbc.ResultSetMetaData rsd = (com.mysql.jdbc.ResultSetMetaData) rs.getMetaData();
                s = rsd.getColumnCount();

                DefaultTableModel model = (DefaultTableModel) scholar_table.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    Vector v2 = new Vector();

                    for (int i = 1; i < +s; i++) {
                        v2.add(rs.getString("scholar_id"));
                        v2.add(rs.getString("first_name"));
                        v2.add(rs.getString("last_name"));
                        v2.add(rs.getString("birthdate"));
                        v2.add(rs.getString("age"));
                        v2.add(rs.getString("sex"));
                        v2.add(rs.getString("batch_year"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("email"));
                        v2.add(rs.getString("password"));
                    }
                    model.addRow(v2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Educator_ViewScholars.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Educator_ViewScholars.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        educator_name1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scholar_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        birthdate = new com.toedter.calendar.JDateChooser();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        firstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        batchyear = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(233, 195, 244));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(93, 78, 98));
        jLabel4.setText("Educator");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(93, 78, 98));
        jLabel5.setText("tms");

        educator_name1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        educator_name1.setForeground(new java.awt.Color(93, 78, 98));
        educator_name1.setText("Educator's Name");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(117, 98, 122));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vector (2).png"))); // NOI18N
        jLabel1.setText("Scholars");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(117, 98, 122));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vector (1).png"))); // NOI18N
        jLabel3.setText("  Dashboard");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(117, 98, 122));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vector.png"))); // NOI18N
        jLabel8.setText("  Progress");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(educator_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(educator_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(231, 231, 231)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 220, 630);

        jPanel9.setBackground(new java.awt.Color(182, 182, 240));

        scholar_table.setForeground(new java.awt.Color(117, 98, 122));
        scholar_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Birthdate", "Age", "Sex", "Batch Year", "Address", "Email", "Password"
            }
        ));
        scholar_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        scholar_table.setRowHeight(18);
        scholar_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholar_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(scholar_table);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(117, 98, 122));
        jLabel2.setText("Passerelles Numeriques Task Management System");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SCHOLARS LIST");

        update.setBackground(new java.awt.Color(117, 98, 122));
        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(117, 98, 122));
        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD SCHOLAR");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(117, 98, 122));
        jLabel7.setText("First Name:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(117, 98, 122));
        jLabel9.setText("Last Name:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(117, 98, 122));
        jLabel10.setText("Birth Date");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(117, 98, 122));
        jLabel11.setText("Age");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(117, 98, 122));
        jLabel12.setText("Address");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(117, 98, 122));
        jLabel13.setText("Sex");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(117, 98, 122));
        jLabel14.setText("Password");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(117, 98, 122));
        jLabel15.setText("Email");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(117, 98, 122));

        jButton3.setBackground(new java.awt.Color(117, 98, 122));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(117, 98, 122));
        jLabel17.setText("Batch Year");

        group.add(male);
        male.setText("Male");

        group.add(female);
        female.setText("Female");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(lastname)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(366, 366, 366)
                        .addComponent(jLabel16))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(batchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel13))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(male)
                                .addComponent(female)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(batchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(230, -10, 1110, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        new Register_student().setVisible(true);

        this.setVisible(false);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void scholar_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholar_tableMouseClicked

        DefaultTableModel model1 = (DefaultTableModel) scholar_table.getModel();
        int selectIndex = scholar_table.getSelectedRow();

        firstname.setText(model1.getValueAt(selectIndex, 1).toString());
        lastname.setText(model1.getValueAt(selectIndex, 2).toString());
        try {
            int srow = scholar_table.getSelectedRow();

            Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String) model1.getValueAt(srow, 3));
            birthdate.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        age.setText(model1.getValueAt(selectIndex, 4).toString());

        batchyear.setText(model1.getValueAt(selectIndex, 6).toString());
        address.setText(model1.getValueAt(selectIndex, 7).toString());
        email.setText(model1.getValueAt(selectIndex, 8).toString());
        password.setText(model1.getValueAt(selectIndex, 9).toString());
        String gender = model1.getValueAt(selectIndex, 5).toString();
        if (gender.equals("Male")) {
            male.setSelected(true);
        } else {
            female.setSelected(true);
        }

    }//GEN-LAST:event_scholar_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) scholar_table.getModel();
        int selectIndex = scholar_table.getSelectedRow();

        int id = Integer.parseInt(model1.getValueAt(selectIndex, 0).toString());
        String fnames = firstname.getText();
        String lnames = lastname.getText();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        String bdate = dateformat.format(birthdate.getDate());
        String uage = age.getText();
        String sex = null;

        if (male.isSelected()) {
            sex = "Male";
        }
        if (female.isSelected()) {
            sex = "Female";
        }
        String uaddress = address.getText();
        String byear = batchyear.getText();
        String emails = email.getText();
        String pass = String.valueOf(password.getPassword());

//        String pbrand = brand.getText();
//        String pname = productname.getText();
//        String pquantity = quantity.getText();
//        String pprice = price.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/task_system", "root", "");
            PreparedStatement pst = con1.prepareStatement("Update scholars_info set first_name=?,last_name=?,birthdate=?,age=?,sex=?,batch_year=?,address=?,email=?,password=? where scholar_id= ?");

            pst.setString(1, fnames);
            pst.setString(2, lnames);
            pst.setString(3, bdate);
            pst.setString(4, uage);

            if (male.isSelected()) {
                sex = "Male";
            }
            if (female.isSelected()) {
                sex = "Female";
            }
            pst.setString(5, sex);
            pst.setString(6, byear);
            pst.setString(7, uaddress);
            pst.setString(8, emails);
            pst.setString(9, pass);
            pst.setInt(10, id);
            pst.executeUpdate();

            showlist();
            JOptionPane.showMessageDialog(null, "Scholar's Information is Updated");
            

            firstname.setText("");
            lastname.setText("");
            batchyear.setText("");
            age.setText("");
            group.clearSelection();
            address.setText("");
            email.setText("");
            password.setText("");
            birthdate.setDate(null);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Educator_ViewScholars.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Educator_ViewScholars.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String fnames = firstname.getText();
        String lnames = lastname.getText();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        String bdate = dateformat.format(birthdate.getDate());
        String uage = age.getText();

        String sex = null;
        if (male.isSelected()) {
            sex = "Male";
        }
        if (female.isSelected()) {
            sex = "Female";
        }

        String uaddress = address.getText();
        String byear = batchyear.getText();
        String emails = email.getText();
        String pass = String.valueOf(password.getPassword());

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/task_system", "root", "");
            PreparedStatement pst = con1.prepareStatement("insert into scholars_info(first_name,last_name,birthdate,age,sex,address,batch_year,email,password)values (?,?,?,?,?,?,?,?,?)");

            pst.setString(1, fnames);
            pst.setString(2, lnames);
            pst.setString(3, bdate);
            pst.setString(4, uage);

            if (male.isSelected()) {
                sex = "Male";
            }
            if (female.isSelected()) {
                sex = "Female";
            }
            pst.setString(5, sex);
            pst.setString(6, byear);
            pst.setString(7, uaddress);
            pst.setString(8, emails);
            pst.setString(9, pass);

            pst.executeUpdate();
            showlist();
            JOptionPane.showMessageDialog(null, "Scholar's Added");

            firstname.setText("");
            lastname.setText("");
            batchyear.setText("");
            age.setText("");
            group.clearSelection();
            address.setText("");
            email.setText("");
            password.setText("");
            birthdate.setDate(null);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Educator_ViewScholars.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Educator_ViewScholars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(Register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Educator_ViewScholars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField batchyear;
    private com.toedter.calendar.JDateChooser birthdate;
    private javax.swing.JLabel educator_name1;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstname;
    private javax.swing.ButtonGroup group;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JPasswordField password;
    private javax.swing.JTable scholar_table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
