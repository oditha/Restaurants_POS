package Customers;

import ClassPack.DB;
import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.LoginFrame;
import ORM.CashBook;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.Invoice;
import ORM.InvoiceDailyOrderNo;
import ORM.InvoiceItems;
import ORM.InvoicePayment;
import ORM.InvoicePaymentInfo;
import ORM.OrderItems;
import ORM.OrderStatus;
import ORM.RawItemStock;
import ORM.RawItems;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class BillOrdersUdaya extends javax.swing.JFrame {

    static boolean maximized = true;
    String getInvNo;
    String getDailyNo;

    public BillOrdersUdaya() {
        initComponents();
        //maximizeWindow();
        jTable1.setRowHeight(25);
        loadTable();
        tableAlign();
        LoadInvNo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lableAdvance = new javax.swing.JLabel();
        lableRemain = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bill Orders");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Order No", "CusID", "Customer", "Order Date", "Delivery Date", "Total Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(125);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(125);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(125);
            jTable1.getColumnModel().getColumn(2).setMinWidth(0);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(250);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        jTable2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Unit Price", "QTY", "Net Total", "IsStock"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(0);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable2.getColumnModel().getColumn(1).setMinWidth(175);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(175);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(175);
            jTable2.getColumnModel().getColumn(3).setMinWidth(75);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(75);
            jTable2.getColumnModel().getColumn(5).setMinWidth(0);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Advance");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setText("Remaining");

        lableAdvance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lableAdvance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lableAdvance.setText("0.00");

        lableRemain.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lableRemain.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lableRemain.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setText("LKR");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("LKR");

        btnCheckout.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnCheckout.setText("CHECKOUT");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Payment type");

        jComboBox1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lableAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(lableRemain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lableAdvance)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lableRemain)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//
////            DefaultTableModel dtm1 = (DefaultTableModel) jTable2.getModel();
////            dtm1.setRowCount(0);
//            char c = evt.getKeyChar();
//            if (Character.isDigit(c)) {
//                Criteria createCriteria = openSession.createCriteria(Orders.class);
//                createCriteria.add(Restrictions.like("orderNo", "%" + txtSearch.getText() + "%"));
//                createCriteria.add(Restrictions.like("isDelete", "Active"));
//
//                List<Orders> list = createCriteria.list();
//
//                for (Orders orders : list) {
//                    dtm.addRow(new Object[]{orders.getIdOrders(), orders.getOrderNo(), orders.getCustomer().getName(), orders.getOrderDate(), orders.getDeliveryDate(), orders.getOrderTotal()});
//                }
//
//            } else {
//                Criteria createCriteria = openSession.createCriteria(Customer.class);
//                Criterion code = Restrictions.like("name", "%" + txtSearch.getText() + "%");
//                Criterion active = Restrictions.like("isDelete", "Active");
//                LogicalExpression andExp = Restrictions.and(code, active);
//                createCriteria.add(andExp);
//
//                Customer cus = (Customer) createCriteria.uniqueResult();
//
//                Iterator iterator = cus.getOrderses().iterator();
//
//                while (iterator.hasNext()) {
//                    Orders next = (Orders) iterator.next();
//                    dtm.addRow(new Object[]{next.getIdOrders(), next.getOrderNo(), next.getCustomer().getName(), next.getOrderDate(), next.getDeliveryDate(), next.getOrderTotal()});
//
//                }
//
//            }
//            openSession.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));

    }//GEN-LAST:event_txtSearchKeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
//        if (evt.getButton() == 3) {
//            jPopupMenu1.show();
//        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            int x = jTable1.getSelectedRow();
            int y = Integer.parseInt(jTable1.getValueAt(x, 0).toString());

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(OrderItems.class);
            createCriteria.createAlias("orders", "o");
            createCriteria.add(Restrictions.eq("o.idOrders", y));

            List<OrderItems> list = createCriteria.list();

            for (OrderItems oi : list) {
                dtm.addRow(new Object[]{oi.getRawItems().getIdRawItems(), oi.getRawItems().getItemName(), oi.getUnitPrice(), oi.getQty(), oi.getNetTotalOrdersItem(), oi.getRawItems().getIsStock()});

                lableAdvance.setText("0.00");
                lableAdvance.setText(Decimal_Formats.Price(oi.getOrders().getAdvance()));

                lableRemain.setText("0.00");
                lableRemain.setText(Decimal_Formats.Price(oi.getOrders().getOrderTotal() - oi.getOrders().getAdvance()));

            }
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        try {

            if (lableRemain.getText().equals("0.00")) {
                JOptionPane.showMessageDialog(null, "Select order first");
            } else {

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want complete this order?",
                        "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (showConfirmDialog == 0) {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    Customer customer = new Customer();
                    customer.setIdCustomer(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));

                    Invoice invoice = new Invoice();
                    invoice.setInvoiceNo(getInvNo);
                    invoice.setInvoiceDate(dateForm.currentdate());
                    invoice.setSubtotal(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));
                    invoice.setDiscount(Double.parseDouble("0"));
                    invoice.setNetTotal(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));
                    invoice.setIsDelete("Active");
                    invoice.setCreatedBy(LoginFrame.user);
                    invoice.setInvoiceType("Customer Order");
                    invoice.setInvoiceStatus("Complete");

                    invoice.setPromoCode("N/A");
                    invoice.setPaymentType(jComboBox1.getSelectedItem().toString());
                    invoice.setInvoiceTime(dateForm.TimeNow());

//                if (newInvoiceArsh.comboCustomer.getSelectedItem().toString().split(" - ")[0].equals("STAFF")) {
//
//                    invoice.setIsStaff("STAFF");
//
//                } else {
//
//                    invoice.setIsStaff("NOTSTAFF");
//
//                }
                    openSession.save(invoice);

                    InvoiceDailyOrderNo id = new InvoiceDailyOrderNo();
                    id.setDaliyNo(getDailyNo);
                    id.setInvoice(invoice);
                    id.setInvoiceDate(dateForm.currentdate());
                    id.setIsDelete("Active");

                    openSession.save(id);

                    InvoicePaymentInfo ipi = new InvoicePaymentInfo();
                    ipi.setCashBalance(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                    ipi.setCashTenderd(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                    ipi.setInvoice(invoice);
                    ipi.setIsDelete("Active");

                    openSession.save(ipi);

                    CustomerHasInvoice chi = new CustomerHasInvoice();
                    chi.setCustomer(customer);
                    chi.setInvoice(invoice);

                    openSession.save(chi);

                    for (int i = 0; i < jTable2.getRowCount(); i++) {

                        RawItems rawItems = new RawItems();
                        rawItems.setIdRawItems(Integer.parseInt(jTable2.getValueAt(i, 0).toString()));

                        InvoiceItems invoiceItems = new InvoiceItems();
                        invoiceItems.setQty(Double.parseDouble(jTable2.getValueAt(i, 3).toString()));
                        invoiceItems.setUnitPrice(Double.parseDouble(jTable2.getValueAt(i, 2).toString()));
                        invoiceItems.setNetTotalItem(Double.parseDouble(jTable2.getValueAt(i, 4).toString()));
                        invoiceItems.setIsDelete("Active");
                        invoiceItems.setInvoice(invoice);
                        invoiceItems.setRawItems(rawItems);

                        openSession.save(invoiceItems);

                        if (jTable2.getValueAt(i, 5).toString().equals("YES")) {

                            Criteria createCriteria = openSession.createCriteria(RawItemStock.class);
                            createCriteria.createAlias("rawItems", "i");
                            createCriteria.add(Restrictions.eq("i.idRawItems", Integer.parseInt(jTable2.getValueAt(i, 0).toString())));
                            RawItemStock uniqueResult = (RawItemStock) createCriteria.uniqueResult();
                            if (uniqueResult != null) {

                                uniqueResult.setQty(uniqueResult.getQty() - Double.parseDouble(jTable2.getValueAt(i, 3).toString()));
                                openSession.update(uniqueResult);
                            }
                        }

                    }

                    CashBook cashBook = new CashBook();
                    cashBook.setCreatedBy(LoginFrame.user);
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Complete customer order " + jTable1.getValueAt(jTable1.getSelectedRow(), 1));
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(Double.parseDouble(lableRemain.getText()));

                    openSession.save(cashBook);

                    if (jComboBox1.getSelectedItem().equals("Cash")) {

                        InvoicePayment invoicePayment = new InvoicePayment();
                        invoicePayment.setCustomer(customer);
                        invoicePayment.setInvoice(invoice);
                        invoicePayment.setIsDelete("Active");
                        invoicePayment.setPaymentAmount(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));
                        invoicePayment.setPaymentDate(dateForm.currentdate());
                        invoicePayment.setPaymentType("Cash");

                        openSession.save(invoicePayment);
                    } else {

                        InvoicePayment invoicePayment = new InvoicePayment();
                        invoicePayment.setCustomer(customer);
                        invoicePayment.setInvoice(invoice);
                        invoicePayment.setIsDelete("Active");
                        invoicePayment.setPaymentAmount(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));
                        invoicePayment.setPaymentDate(dateForm.currentdate());
                        invoicePayment.setPaymentType("Credit");

                        openSession.save(invoicePayment);

                    }

                    Criteria createCriteria1 = openSession.createCriteria(OrderStatus.class);
                    createCriteria1.createAlias("orders", "or");
                    createCriteria1.add(Restrictions.eq("or.idOrders", Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString())));

                    OrderStatus uniqueResult = (OrderStatus) createCriteria1.uniqueResult();

                    uniqueResult.setIsDelete("Deactive");
                    uniqueResult.setStatus("Deliverd");

                    openSession.update(uniqueResult);

                    beginTransaction.commit();
                    NotificationPopup.save();
                    openSession.close();

                    try {
                        Map<String, Object> map = new HashMap<>();
                        map.put("InvID", invoice.getIdInvoice());
                        //System.out.println(map);
                        JasperPrint jp = JasperFillManager.fillReport(LoginFrame.Invoice, map, DB.getCon());
//                        JasperViewer.viewReport(jp, false);
                        JasperPrintManager.printReport(jp, false);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    loadTable();
                    DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                    dtm.setRowCount(0);

                    lableAdvance.setText("0.00");
                    lableRemain.setText("0.00");

                } else {

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCheckoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillOrdersUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckout;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lableAdvance;
    private javax.swing.JLabel lableRemain;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void maximizeWindow() {

        if (maximized) {

            BillOrdersUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            BillOrdersUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void loadTable() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(OrderStatus.class);
            createCriteria.add(Restrictions.eq("status", "Pending"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));

            List<OrderStatus> list = createCriteria.list();

            for (OrderStatus os : list) {
                if (os.getOrders().getIsDelete().equals("Active")) {

                    dtm.addRow(new Object[]{os.getOrders().getIdOrders(), os.getOrders().getOrderNo(), os.getOrders().getCustomer().getIdCustomer(), os.getOrders().getCustomer().getName(), os.getOrders().getOrderDate(), os.getOrders().getDeliveryDate(), os.getOrders().getOrderTotal()});
                }
            }
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);

        jTable2.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

    }

    private void LoadInvNo() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Invoice.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.setProjection(Projections.rowCount());
            List list = createCriteria.list();
            String get = list.get(0).toString();

            int parseInt = Integer.parseInt(get);
            parseInt++;

            //txtDSetinvNo.setText("INV-" + parseInt);
            getInvNo = "INV-" + parseInt;
            //System.out.println(getInvNo);
            openSession.close();
            LoadDailyNO();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void LoadDailyNO() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(InvoiceDailyOrderNo.class);
            createCriteria.add(Restrictions.eq("invoiceDate", dateForm.currentdate()));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));

            createCriteria.setProjection(Projections.rowCount());
            List list = createCriteria.list();
            Integer get = Integer.parseInt(list.get(0).toString());
            get++;
            getDailyNo = get + "";
            //System.out.println(getDailyNo);
            openSession.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
