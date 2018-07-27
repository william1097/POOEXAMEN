/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.CustomersDB;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author William Gonzalez
 */
public class Customers extends javax.swing.JFrame {
        public static final String URL = "jdbc:mysql://localhost:3306/projectpoo";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Temporal0";

    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            JOptionPane.showMessageDialog(null, "Successful connection");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public Customers() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDniC = new javax.swing.JLabel();
        txtDniC = new javax.swing.JTextField();
        lblNameC = new javax.swing.JLabel();
        txtNameC = new javax.swing.JTextField();
        lblEmailC = new javax.swing.JLabel();
        txtEmailC = new javax.swing.JTextField();
        lblBDC = new javax.swing.JLabel();
        txtBDC = new javax.swing.JTextField();
        lblTelC = new javax.swing.JLabel();
        txtTelC = new javax.swing.JTextField();
        btnEditC = new javax.swing.JButton();
        btnDelC = new javax.swing.JButton();
        btnClearC = new javax.swing.JButton();
        btnSearchCust = new javax.swing.JButton();
        btnSaveC = new javax.swing.JButton();
        lblFormat = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        mCustProd = new javax.swing.JMenuItem();
        mCustCust = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customers");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Information"));

        lblDniC.setText("DNI:");

        lblNameC.setText("Name:");

        lblEmailC.setText("E-Mail:");

        lblBDC.setText("Birth Date:");

        lblTelC.setText("Telephone:");

        btnEditC.setText("Edit");
        btnEditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCActionPerformed(evt);
            }
        });

        btnDelC.setText("Delete");
        btnDelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCActionPerformed(evt);
            }
        });

        btnClearC.setText("Clear");
        btnClearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCActionPerformed(evt);
            }
        });

        btnSearchCust.setText("Search Customer");
        btnSearchCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustActionPerformed(evt);
            }
        });

        btnSaveC.setText("Save");
        btnSaveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCActionPerformed(evt);
            }
        });

        lblFormat.setText("YYYY - MM - DD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNameC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSearchCust)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDniC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmailC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNameC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDniC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelC, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnSaveC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBDC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblFormat)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniC)
                    .addComponent(txtDniC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelC)
                    .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameC)
                    .addComponent(txtNameC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBDC)
                    .addComponent(txtBDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormat)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmailC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelC)
                    .addComponent(btnClearC)
                    .addComponent(btnSearchCust)
                    .addComponent(btnSaveC)
                    .addComponent(btnEditC))
                .addGap(69, 69, 69))
        );

        MenuPrincipal.setText("Menu");

        mCustProd.setText("Products");
        mCustProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCustProdActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mCustProd);

        mCustCust.setText("Customers");
        mCustCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCustCustActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mCustCust);

        jMenuBar1.add(MenuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mCustProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCustProdActionPerformed
        // TODO add your handling code here:
        Products p = new Products() {
        };
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_mCustProdActionPerformed

    private void mCustCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCustCustActionPerformed
        //         TODO add your handling code here:

    }//GEN-LAST:event_mCustCustActionPerformed

    private void btnDelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCActionPerformed
        // TODO add your handling code here:
        
                Connection con = null;

        try{

            con = getConnection();
            ps = con.prepareStatement("DELETE FROM customers WHERE DNI=?");
            ps.setInt(1, Integer.parseInt(txtDniC.getText()));

            int res = ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null, "The customer was successfully deleted");
                clear();
            } else{
                JOptionPane.showMessageDialog(null, "Error deleting the customer");
                clear();
            }
            con.close();
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnDelCActionPerformed

        private void clear() {
        txtDniC.setText(null);
        txtNameC.setText(null);
        txtTelC.setText(null);
        txtEmailC.setText(null);
        txtBDC.setText(null);
    }
    
    private void btnSaveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCActionPerformed
        // TODO add your handling code here:
        
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO customers (DNI, name, Email, Telephone, BirthDate) VALUES (?,?,?,?,?)");
            ps.setString(1, txtDniC.getText());
            ps.setString(2, txtNameC.getText());
            ps.setString(3, txtEmailC.getText());
            ps.setString(4, txtTelC.getText());
            ps.setDate(5, Date.valueOf(txtBDC.getText()));
            
            

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Client Saved Successfully.");
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "Error saving client");
                clear();
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);

        }
        
    }//GEN-LAST:event_btnSaveCActionPerformed

    private void btnClearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCActionPerformed
clear();
// TODO add your handling code here:
    }//GEN-LAST:event_btnClearCActionPerformed

    private void btnSearchCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustActionPerformed
        // TODO add your handling code here:
        
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM customers WHERE dni = ?");
            ps.setString(1, txtDniC.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                txtDniC.setText(rs.getString("DNI"));
                txtNameC.setText(rs.getString("Name"));
                txtTelC.setText(rs.getString("Telephone"));
                txtEmailC.setText(rs.getString("Email"));
                txtBDC.setText(rs.getString("BirthDate"));
              
            } else {
                JOptionPane.showMessageDialog(null, "There is not customer with the DNI");
                clear();
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnSearchCustActionPerformed

    private void btnEditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCActionPerformed
        // TODO add your handling code here:
        
        
        Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("UPDATE customers SET dni = ?, Name=?, Telephone=?, BirthDate=?, Email=? WHERE DNI=?");
            ps.setString(1, txtDniC.getText());
            ps.setString(2, txtNameC.getText());
            ps.setString(3, txtTelC.getText());
            ps.setDate(4, Date.valueOf(txtBDC.getText()));
            ps.setString(5, txtEmailC.getText());
            ps.setString(6, txtDniC.getText());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "The customer was modified");
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred while modifying the customer");
                clear();
            }
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnEditCActionPerformed

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Customers().setVisible(true);
        });
    }

    CustomersDB CDB = new CustomersDB();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JButton btnClearC;
    private javax.swing.JButton btnDelC;
    private javax.swing.JButton btnEditC;
    private javax.swing.JButton btnSaveC;
    private javax.swing.JButton btnSearchCust;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBDC;
    private javax.swing.JLabel lblDniC;
    private javax.swing.JLabel lblEmailC;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblNameC;
    private javax.swing.JLabel lblTelC;
    private javax.swing.JMenuItem mCustCust;
    private javax.swing.JMenuItem mCustProd;
    private javax.swing.JTextField txtBDC;
    private javax.swing.JTextField txtDniC;
    private javax.swing.JTextField txtEmailC;
    private javax.swing.JTextField txtNameC;
    private javax.swing.JTextField txtTelC;
    // End of variables declaration//GEN-END:variables
}
