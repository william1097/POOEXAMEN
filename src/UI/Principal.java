package UI;

//package UI;

import DB.Conexion;

import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTable;

/**
 *
 * @author William Gonzalez
 */


public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        mostrar();
    }

    PreparedStatement ps;
    ResultSet rs;

    String[] titles = {"Cod", "Product Name", "Presentation", "Price"};
    DefaultTableModel dtm = new DefaultTableModel(null, titles);
    private TableRowSorter trs;
    DefaultListModel modelo = new DefaultListModel();
//    

    public void filter() {

        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFilterProduct.getText(), 1));
    }


    private void mostrar(){
             rs = Conexion.getTabla("select idproducts, Name, presentation, price from products");
        dtm.setColumnIdentifiers(new Object[]{"Cod", "Product Name", "Presentation", "Price"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                dtm.addRow(new Object[]{rs.getString("idproducts"), rs.getString("name"), rs.getString("presentation"), rs.getString("price")});
            }            
            // asigna el modelo a la tabla
            tbProdCata.setModel(dtm);            
        } catch (SQLException e) {
            System.out.println(e);
        }   
    }
       
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pInvoice = new javax.swing.JPanel();
        lblAmount = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        lblSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblIvi = new javax.swing.JLabel();
        txtIvi = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        ckxDiscount = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnNewSale = new javax.swing.JButton();
        pCustomer = new javax.swing.JPanel();
        btnAddCustom = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdCata = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdDet = new javax.swing.JTable();
        btnRemoveProduct = new javax.swing.JButton();
        lblProdDet = new javax.swing.JLabel();
        lblProdCat = new javax.swing.JLabel();
        lblPOS = new javax.swing.JLabel();
        pCustomer1 = new javax.swing.JPanel();
        txtFilterProduct = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        lblQTY = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        mPrinPos = new javax.swing.JMenuItem();
        mPrinProd = new javax.swing.JMenuItem();
        mPrinCust = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point of Sale");
        setName("Principal"); // NOI18N
        setResizable(false);

        pInvoice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));

        lblAmount.setText("Amount:");

        lblDiscount.setText("Discount:");

        txtAmount.setEditable(false);

        txtDiscount.setEnabled(false);

        lblSubtotal.setText("SubTotal:");

        txtSubtotal.setEditable(false);

        lblIvi.setText("I.V.I");

        txtIvi.setEditable(false);

        lblTotal.setText("Total:");

        txtTotal.setEditable(false);

        ckxDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckxDiscountActionPerformed(evt);
            }
        });

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");

        btnNewSale.setText("New SALE");

        javax.swing.GroupLayout pInvoiceLayout = new javax.swing.GroupLayout(pInvoice);
        pInvoice.setLayout(pInvoiceLayout);
        pInvoiceLayout.setHorizontalGroup(
            pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNewSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pInvoiceLayout.createSequentialGroup()
                        .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInvoiceLayout.createSequentialGroup()
                                .addComponent(ckxDiscount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pInvoiceLayout.createSequentialGroup()
                        .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInvoiceLayout.createSequentialGroup()
                                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIvi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 30, Short.MAX_VALUE))
                            .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIvi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pInvoiceLayout.setVerticalGroup(
            pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInvoiceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDiscount)
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckxDiscount))
                .addGap(65, 65, 65)
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIvi)
                    .addComponent(txtIvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(pInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewSale)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer:"));

        btnAddCustom.setText("Add New Customer");
        btnAddCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCustomerLayout = new javax.swing.GroupLayout(pCustomer);
        pCustomer.setLayout(pCustomerLayout);
        pCustomerLayout.setHorizontalGroup(
            pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddCustom)
                .addGap(22, 22, 22))
        );
        pCustomerLayout.setVerticalGroup(
            pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustom)
                    .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbProdCata = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tbProdCata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Product Name", "Presentation", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdCata);

        tbProdDet = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tbProdDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Product", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbProdDet);

        btnRemoveProduct.setText("Remove Product");

        lblProdDet.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProdDet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdDet.setText("Products Details");

        lblProdCat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProdCat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdCat.setText("Products Catalog");

        lblPOS.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPOS.setText("Point of sale");
        lblPOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));

        pCustomer1.setBorder(javax.swing.BorderFactory.createTitledBorder("Products Filter"));

        txtFilterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterProductActionPerformed(evt);
            }
        });
        txtFilterProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilterProductKeyTyped(evt);
            }
        });

        lblQTY.setText("QTY:");

        javax.swing.GroupLayout pCustomer1Layout = new javax.swing.GroupLayout(pCustomer1);
        pCustomer1.setLayout(pCustomer1Layout);
        pCustomer1Layout.setHorizontalGroup(
            pCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFilterProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(lblQTY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pCustomer1Layout.setVerticalGroup(
            pCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilterProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQTY))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        MenuPrincipal.setText("Menu");

        mPrinPos.setText("Point of Sale");
        MenuPrincipal.add(mPrinPos);

        mPrinProd.setText("Products");
        mPrinProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPrinProdActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mPrinProd);

        mPrinCust.setText("Customers");
        mPrinCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPrinCustActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mPrinCust);

        jMenuBar1.add(MenuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblProdDet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoveProduct)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pCustomer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPOS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(pInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdCat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProdDet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Principal getFrame() {
        return this;
    }

    private void mPrinProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPrinProdActionPerformed
        // TODO add your handling code here:
        Products p = new Products() {
        };
        p.setVisible(true);
//        dispose();
    }//GEN-LAST:event_mPrinProdActionPerformed

    private void mPrinCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPrinCustActionPerformed
//         TODO add your handling code here:
        Customers c = new Customers() {
        };
        c.setVisible(true);
//        dispose();
    }//GEN-LAST:event_mPrinCustActionPerformed

    private void btnAddCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomActionPerformed

        Customers c = new Customers() {
            
        };
        c.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnAddCustomActionPerformed

    private void txtFilterProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterProductKeyTyped
        // TODO add your handling code here:
        txtFilterProduct.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                modelo.clear();

                String cadena = (txtFilterProduct.getText()).toUpperCase();
                txtFilterProduct.setText(cadena);
//                String SQL = "SELECT * FROM products where presentation LIKE";
                repaint();
                filter();
            }
        });

        trs = new TableRowSorter(tbProdCata.getModel());
        tbProdCata.setRowSorter(trs);
    }//GEN-LAST:event_txtFilterProductKeyTyped

//        public void searchP(String text){
//            Connection con = null;
//        try{
//            String [] titles =  {"Cod", "Poduct Name", "Presentation", "Price"};
//            String filtro = ""+text+"_%";
//            String SQL = "SELECT * FROM products where presentation LIKE"+'"'+text+'"';
//            
//            System.out.println(SQL);
//            dtm = new DefaultTableModel(null, titles);
//             = con.prepareStatement(SQL);
//            ResultSet re = sent.executeQuery(SQL)
//            
//        }
//    }
    
    public void ValCheck(){
        
        if (ckxDiscount.isSelected()) {
            txtDiscount.setEnabled(true);
        }
        else if (ckxDiscount.isSelected() == false){
            txtDiscount.setEnabled(false);
        }
    }
    
    private void ckxDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckxDiscountActionPerformed
        // TODO add your handling code here:
        ValCheck();
    }//GEN-LAST:event_ckxDiscountActionPerformed


    
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        String correoRemitente = "gonzalezwilliam932@gmail.com";
        String passwordRemitente = "williamfajardo";
        String correoReceptor;
        correoReceptor = JOptionPane.showInputDialog(null, "Ingrese su Email: ","Correo", JOptionPane.INFORMATION_MESSAGE);
        String asunto = "Factura Electronica";

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
//            message.setText(mensaje);

            try (Transport t = session.getTransport("smtp")) {
                t.connect(correoRemitente, passwordRemitente);
                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            }

            JOptionPane.showMessageDialog(null, "Email sent");

        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");

        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "ERROR 2");

        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtFilterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterProductActionPerformed
        

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JButton btnAddCustom;
    private javax.swing.JButton btnNewSale;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox ckxDiscount;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblIvi;
    private javax.swing.JLabel lblPOS;
    private javax.swing.JLabel lblProdCat;
    private javax.swing.JLabel lblProdDet;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem mPrinCust;
    private javax.swing.JMenuItem mPrinPos;
    private javax.swing.JMenuItem mPrinProd;
    private javax.swing.JPanel pCustomer;
    private javax.swing.JPanel pCustomer1;
    private javax.swing.JPanel pInvoice;
    private javax.swing.JTable tbProdCata;
    private javax.swing.JTable tbProdDet;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtFilterProduct;
    private javax.swing.JTextField txtIvi;
    private javax.swing.JTextField txtSearchCustomer;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
