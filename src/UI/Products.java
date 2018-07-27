package UI;

import DB.Conexion;
import static DB.CustomersDB.getConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Products extends javax.swing.JFrame {

    String sql = "SELECT * FROM products";

    public static final String URL = "jdbc:mysql://localhost:3306/projectpoo";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Temporal0";

    PreparedStatement ps;
    ResultSet rs;
    Statement st;

    public static Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public Products() {
        initComponents();
        mostrar();
    }

    String[] titles = {"Cod", "Product Name", "Presentation", "Price", "type"};

    DefaultTableModel dtm = new DefaultTableModel(null, titles);

    DB.Conexion con = new DB.Conexion();

    public void filter() {
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFilterProdInf.getText(), 1));
    }

    private void mostrar() {
        rs = Conexion.getTabla("select idproducts, Name, presentation, type, price from products");
        dtm.setColumnIdentifiers(new Object[]{"Cod", "Product Name", "Presentation", "Type", "Price"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                dtm.addRow(new Object[]{rs.getString("idproducts"), rs.getString("name"), rs.getString("presentation"), rs.getString("type"), rs.getString("price")});
            }
            // asigna el modelo a la tabla
            tblProdInfo.setModel(dtm);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pProdInfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblCodeProd = new javax.swing.JLabel();
        txtCodeProd = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox<>();
        lblNameProd = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPresentationProd = new javax.swing.JLabel();
        txtPresentation = new javax.swing.JTextField();
        lblPriceProd = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnEditProd = new java.awt.Button();
        btnSaveProd = new java.awt.Button();
        btnDelProd = new java.awt.Button();
        txtFilterProdInf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdInfo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuProducts = new javax.swing.JMenu();
        mProdProducts = new javax.swing.JMenuItem();
        mProdCust = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Products");
        setName("Products"); // NOI18N
        setPreferredSize(new java.awt.Dimension(827, 610));
        setResizable(false);

        pProdInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Products Information"));
        pProdInfo.setToolTipText("Products");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblCodeProd.setText("Code:");

        txtCodeProd.setEnabled(false);

        lblType.setText("Type:");

        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Electronics", "Software", "Hardware", "Personal Computers" }));

        lblNameProd.setText("Name:");

        lblPresentationProd.setText("Presentation:");

        lblPriceProd.setText("Price:");

        btnEditProd.setActionCommand("Edit Product");
        btnEditProd.setLabel("Edit Product");
        btnEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdActionPerformed(evt);
            }
        });

        btnSaveProd.setLabel("Save Product");
        btnSaveProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProdActionPerformed(evt);
            }
        });

        btnDelProd.setLabel("Delete Product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodeProd)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblType)
                                .addGap(21, 21, 21)
                                .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 181, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNameProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPresentationProd))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPresentation, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPriceProd)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSaveProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeProd)
                    .addComponent(txtCodeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameProd)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType)
                    .addComponent(lblPresentationProd)
                    .addComponent(txtPresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPriceProd))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtFilterProdInf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilterProdInfKeyTyped(evt);
            }
        });

        tblProdInfo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tblProdInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Product Name", "Presentation", "Price", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProdInfo);

        javax.swing.GroupLayout pProdInfoLayout = new javax.swing.GroupLayout(pProdInfo);
        pProdInfo.setLayout(pProdInfoLayout);
        pProdInfoLayout.setHorizontalGroup(
            pProdInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProdInfoLayout.createSequentialGroup()
                .addGroup(pProdInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProdInfoLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(txtFilterProdInf, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pProdInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pProdInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        pProdInfoLayout.setVerticalGroup(
            pProdInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProdInfoLayout.createSequentialGroup()
                .addComponent(txtFilterProdInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        MenuProducts.setText("Menu");
        MenuProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductsActionPerformed(evt);
            }
        });

        mProdProducts.setText("Products");
        MenuProducts.add(mProdProducts);

        mProdCust.setText("Customers");
        mProdCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProdCustActionPerformed(evt);
            }
        });
        MenuProducts.add(mProdCust);

        jMenuBar1.add(MenuProducts);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProdInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProdInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Products getFrame() {
        return this;
    }

    public void clear() {
        txtCodeProd.setText(null);
        txtName.setText(null);
        txtPresentation.setText(null);
        txtPrice.setText(null);
        cbxType.setSelectedIndex(0);
    }

    private void MenuProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProductsActionPerformed

    private void mProdCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProdCustActionPerformed
        // TODO add your handling code here:
        Customers c = new Customers() {
        };
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_mProdCustActionPerformed

    private void btnSaveProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProdActionPerformed
        // TODO add your handling code here:

        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO products (Name, Presentation, Price, Type ) VALUES (?,?,?,?)");

            ps.setString(1, txtCodeProd.getText());
            ps.setString(1, txtName.getText());
            ps.setString(2, txtPresentation.getText());
            ps.setString(3, txtPrice.getText());
            ps.setString(4, cbxType.getSelectedItem().toString());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Product saved successfully.");
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "Error saving product");
                clear();
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);

        }

    }//GEN-LAST:event_btnSaveProdActionPerformed
    TableRowSorter trs;

    private void txtFilterProdInfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterProdInfKeyTyped

        txtFilterProdInf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {

                String cadena = (txtFilterProdInf.getText()).toUpperCase();
                txtFilterProdInf.setText(cadena);
                repaint();
                filter();
            }
        });

        trs = new TableRowSorter(tblProdInfo.getModel());
        tblProdInfo.setRowSorter(trs);
    }//GEN-LAST:event_txtFilterProdInfKeyTyped

    private void btnEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnEditProdActionPerformed

    private void tblProdInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdInfoMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion objcon = new Conexion();
            Connection con = Conexion.getConexion();

//            int column = 2;
            int Fila = tblProdInfo.getSelectedRow();
            String codigo = tblProdInfo.getValueAt(Fila, 0).toString();

            ps = con.prepareStatement("SELECT idproducts, name, presentation, type, price from products where idproducts=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtCodeProd.setText(rs.getString("idproducts"));
                txtName.setText(rs.getString("Name"));
                txtPresentation.setText(rs.getString("presentation"));
                txtPrice.setText(rs.getString("price"));
                cbxType.getModel().setSelectedItem(String.valueOf(tblProdInfo.getModel().getValueAt(Fila, 3)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblProdInfoMouseClicked

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Products().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuProducts;
    private java.awt.Button btnDelProd;
    private java.awt.Button btnEditProd;
    private java.awt.Button btnSaveProd;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodeProd;
    private javax.swing.JLabel lblNameProd;
    private javax.swing.JLabel lblPresentationProd;
    private javax.swing.JLabel lblPriceProd;
    private javax.swing.JLabel lblType;
    private javax.swing.JMenuItem mProdCust;
    private javax.swing.JMenuItem mProdProducts;
    private javax.swing.JPanel pProdInfo;
    private javax.swing.JTable tblProdInfo;
    private javax.swing.JTextField txtCodeProd;
    private javax.swing.JTextField txtFilterProdInf;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPresentation;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}