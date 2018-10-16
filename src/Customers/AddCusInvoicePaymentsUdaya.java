package Customers;

import ORM.CashBook;
import ORM.Customer;
import ORM.Invoice;
import ORM.CustomerHasInvoice;
import ORM.InvoicePayment;
import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddCusInvoicePaymentsUdaya extends javax.swing.JFrame {

    Map<String, Integer> cust = new HashMap();

    public AddCusInvoicePaymentsUdaya() {
        initComponents();
        ComboToTXT2();
        tableAlign();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtCurBalance = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice Payments | Bit Win Computers");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setText("Select Customer");

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCurBalance.setEditable(false);
        txtCurBalance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCurBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurBalanceActionPerformed(evt);
            }
        });

        comboCustomer.setEditable(true);
        comboCustomer.setToolTipText("Press Enter after choose");
        comboCustomer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCustomerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                comboCustomerPopupMenuCanceled(evt);
            }
        });

        tblAddPayments.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Invoice No", "Invoice Date", "Invoice Total", "Total Paid", "Outstanding", "Paid Amount"
            }
        ));
        tblAddPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddPaymentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddPayments);
        if (tblAddPayments.getColumnModel().getColumnCount() > 0) {
            tblAddPayments.getColumnModel().getColumn(0).setMinWidth(0);
            tblAddPayments.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAddPayments.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setText("Current Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCurBalance))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboCustomerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCustomerPopupMenuWillBecomeInvisible
//        loadTableV2();

    }//GEN-LAST:event_comboCustomerPopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        for (int i = 0; i < tblAddPayments.getRowCount(); i++) {
            System.out.println(i);
            if (tblAddPayments.getValueAt(i, 6) != null) {

                try {
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    Invoice Inv = new Invoice();
                    Inv.setIdInvoice(Integer.parseInt(tblAddPayments.getValueAt(i, 0).toString()));

                    Customer customer = new Customer();
                    customer.setIdCustomer(cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1]));

                    InvoicePayment invpay = new InvoicePayment();
                    invpay.setPaymentDate(dateForm.currentdate());
                    invpay.setPaymentAmount(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    invpay.setPaymentType("Cash");
                    invpay.setCustomer(customer);
                    invpay.setIsDelete("Active");
                    invpay.setInvoice(Inv);
                    openSession.save(invpay);

                    CashBook cashBook = new CashBook();
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Payment for Invoice " + tblAddPayments.getValueAt(i, 1).toString());

                    openSession.save(cashBook);
                    beginTransaction.commit();
                    openSession.close();
                    System.out.println("Payment ID"+ invpay.getIdInvoicePayment() );
//                    InputStream Rp = getClass().getResourceAsStream("/JReports/CusPaymentRecipt.jrxml");
//                    JasperReport jr = JasperCompileManager.compileReport(Rp);
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("IdInvPayment", invpay.getIdInvoicePayment());

                    //JasperPrint jp = JasperFillManager.fillReport(Login.jrCusPayment, map, DB.getCon());
//                    JasperViewer.viewReport(jp);
                    //JasperPrintManager.printReport(jp, true);
                    
                    NotificationPopup.save();

                    comboCustomer.setSelectedIndex(-1);

                    txtCurBalance.setText(null);
                    DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
                    dtm.setRowCount(0);
                    comboCustomer.grabFocus();

                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        }

//        if (!txtPaidAmo.getText().isEmpty()) {
//
//            try {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Transaction beginTransaction = openSession.beginTransaction();
//
//                Supplier supplier = new Supplier();
//                supplier.setIdSupplier(sup.get(comboSup.getSelectedItem().toString().split(" - ")[0]));
//
//                Grnpayments grn = new Grnpayments();
//                grn.setPaymentDate(dateForm.currentdate());
//                grn.setAmount(Double.parseDouble(txtPaidAmo.getText()));
//                grn.setPaymentType(comboType.getSelectedItem().toString());
//                grn.setSupplier(supplier);
//                grn.setIsActive("Active");
//
//                openSession.save(grn);
//
//                CashBook cashBook = new CashBook();
//                cashBook.setCredit(0.00);
//                cashBook.setDebit(Double.parseDouble(txtPaidAmo.getText()));
//                cashBook.setCbdate(dateForm.currentdate());
//
//                openSession.save(cashBook);
//
//                beginTransaction.commit();
//                openSession.close();
//
//                NotificationPopup.save();
//
//                comboSup.setSelectedIndex(0);
//                comboType.setSelectedIndex(0);
//                txtCurBalance.setText(null);
//                txtPaidAmo.setText(null);
//
//                comboSup.grabFocus();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//
//        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblAddPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddPaymentsKeyReleased

        if (evt.getKeyCode() == 10) {
            try {
                int row = tblAddPayments.getSelectedRow();
                String Value = tblAddPayments.getValueAt(row, 3).toString();

                tblAddPayments.editCellAt(tblAddPayments.getSelectedRow() + 1, 6);
                tblAddPayments.setSurrendersFocusOnKeystroke(true);
                tblAddPayments.getEditorComponent().requestFocus();
                tblAddPayments.setRowSelectionInterval(tblAddPayments.getSelectedRow() + 1, tblAddPayments.getSelectedRow() + 1);

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_tblAddPaymentsKeyReleased

    private void txtCurBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurBalanceActionPerformed

    private void comboCustomerPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCustomerPopupMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCustomerPopupMenuCanceled

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCusInvoicePaymentsUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAddPayments;
    private javax.swing.JTextField txtCurBalance;
    // End of variables declaration//GEN-END:variables

    private void loadTableV2() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(CustomerHasInvoice.class);
            createCriteria.createAlias("customer", "c");
            createCriteria.add(Restrictions.eq("c.idCustomer", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
            List<CustomerHasInvoice> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
            dtm.setRowCount(0);
            for (CustomerHasInvoice cusin : list) {

                if (cusin.getInvoice().getIsDelete().equals("Active")) {
                    
                
                
                Double nettTotal = cusin.getInvoice().getNetTotal();
                Double amount = 0.00;
                Iterator iterator = cusin.getInvoice().getInvoicePayments().iterator();
                while (iterator.hasNext()) {
                    InvoicePayment gp = (InvoicePayment) iterator.next();

                    if (gp.getIsDelete().equals("Active")) {

                        amount += gp.getPaymentAmount();
                    }

                }

                if (nettTotal > amount) {

                    dtm.addRow(new Object[]{
                        cusin.getInvoice().getIdInvoice(),
                        cusin.getInvoice().getInvoiceNo(),
                        cusin.getInvoice().getInvoiceDate(),
                        Decimal_Formats.Price(cusin.getInvoice().getNetTotal()),
                        Decimal_Formats.Price(amount),
                        Decimal_Formats.Price(nettTotal - amount)

                    });

                }
            }
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            if (enteredText.matches("\\d+")) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("contact1", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {
                        str1 = customers.getName()+ " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());
                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("name", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {

                        str1 = customers.getName()+ " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboCustomer.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboCustomer.setSelectedItem(enteredText);
            comboCustomer.showPopup();
        } else {
            comboCustomer.hidePopup();
        }

    }

    private void ComboToTXT2() {
        final JTextField textfield0 = (JTextField) comboCustomer.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            loadTableV2();
                            settotal();

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield0.getText());

                        }

                    }
                });

            }
        });
    }

    private void settotal() {
        double invtotal = 0;
        double paidtot = 0;

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Customer.class);
            createCriteria.add(Restrictions.eq("idCustomer", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
            Customer uniqueResult = (Customer) createCriteria.uniqueResult();

            Iterator iterator = uniqueResult.getCustomerHasInvoices().iterator();

            while (iterator.hasNext()) {

                CustomerHasInvoice invhascus = (CustomerHasInvoice) iterator.next();

                invtotal += invhascus.getInvoice().getNetTotal();

            }

            Iterator iterator1 = uniqueResult.getInvoicePayments().iterator();
            while (iterator1.hasNext()) {

                InvoicePayment next = (InvoicePayment) iterator1.next();
                if (next.getIsDelete().equals("Active")) {
                    paidtot += next.getPaymentAmount();

                }

            }
            txtCurBalance.setText(Decimal_Formats.Price(invtotal - paidtot) + "");
            openSession.close();
            loadTableV2();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
