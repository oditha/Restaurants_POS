package InvoiceAndGRN;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.LoginFrame;
import ORM.CashBook;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.Invoice;
import ORM.InvoiceItems;
import ORM.InvoicePayment;
import ORM.CustomerReturn;
import ORM.InvoiceCancel;
import ORM.RawItems;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class InvoiceReturnCustomer extends javax.swing.JFrame {

    HashMap<String, Integer> invid = new HashMap();
    HashMap<String, Integer> ItmId = new HashMap();
    HashMap<String, Integer> Itm = new HashMap();

    public int getInvoID;
    public int getItemID;
    public int getInvoItemID;
    public int getCusID;
    public double UnitPrice;

    public InvoiceReturnCustomer() {
        initComponents();
        TxtStartDate.setText(dateForm.currentdate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        txtQty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        INV = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox<>();
        comboCondition = new javax.swing.JComboBox<>();
        comboTerm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice Return |  Bit Win Computers");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Invoice No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        txtInvoiceNo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtInvoiceNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInvoiceNoKeyReleased(evt);
            }
        });
        jPanel1.add(txtInvoiceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 40));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Select Item");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 120, -1));

        TxtStartDate.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });
        jPanel1.add(TxtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 170, 40));

        txtQty.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 170, 40));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Condition");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        btnSave.setText("Add Return");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, 40));

        INV.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        INV.setText("INV-");
        jPanel1.add(INV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 40));

        comboItem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jPanel1.add(comboItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 370, 40));

        comboCondition.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Damage", "Non-Damage" }));
        jPanel1.add(comboCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 170, 40));

        comboTerm.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash Back", "Exchange" }));
        jPanel1.add(comboTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, 40));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Return Qty");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Term");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtInvoiceNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvoiceNoKeyReleased

        try {

            String text = "INV-" + txtInvoiceNo.getText();

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Invoice.class);

            //createCriteria.add(Restrictions.eq("invoiceNo", text));

            Criterion id = Restrictions.eq("invoiceNo", text);
            Criterion active1 = Restrictions.like("isDelete", "Active");
 
            LogicalExpression andExp1 = Restrictions.and(id, active1);
            createCriteria.add(andExp1);

            Invoice inv = (Invoice) createCriteria.uniqueResult();

            Iterator itt = inv.getCustomerHasInvoices().iterator();
            while (itt.hasNext()) {
                CustomerHasInvoice next = (CustomerHasInvoice) itt.next();
                getCusID = next.getCustomer().getIdCustomer();
            }
            
            invid.clear();
            invid.put(inv.getInvoiceNo(), inv.getIdInvoice());
            Iterator iterator = inv.getInvoiceItemses().iterator();
            comboItem.removeAllItems();
            ItmId.clear();
            Itm.clear();
            while (iterator.hasNext()) {

                InvoiceItems next = (InvoiceItems) iterator.next();
                comboItem.addItem(next.getRawItems().getRawItemsCode() + " - " + next.getRawItems().getItemName());
                ItmId.put(next.getRawItems().getRawItemsCode() + " - " + next.getRawItems().getItemName(), next.getIdInvoiceItems());
                Itm.put(next.getRawItems().getRawItemsCode()+ " - " + next.getRawItems().getItemName(), next.getRawItems().getIdRawItems());
                
                
            }   System.out.println(ItmId);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtInvoiceNoKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if ((!txtInvoiceNo.getText().isEmpty() || !txtQty.getText().isEmpty())) {

                String text = "INV-" + txtInvoiceNo.getText();

                getInvoID = invid.get(text);
                

                //////////////////////////////////////////////////////////////////////////////////////
                getItemID = Itm.get(comboItem.getSelectedItem().toString());

              

                /////////////////////////////////////////////////////////////////////////////////
              

                /////////////////////////////////////////////////////////////////////////////////
                Session openSession4 = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession4.beginTransaction();

//                InvoiceCancel invoiceReturn = new InvoiceCancel();

                Invoice invoice = new Invoice();
                //invoice.setIdInvoice(invid.get("INV-" + txtInvoiceNo.getText()));
                invoice.setIdInvoice(getInvoID);

                InvoiceItems invoiceItem = new InvoiceItems();
                //invoiceItem.setIdInvoiceItem(ItmId.get(comboItem.getSelectedItem().toString()));
                invoiceItem.setIdInvoiceItems(ItmId.get(comboItem.getSelectedItem().toString()));

                

                Customer customers = new Customer();
                customers.setIdCustomer(getCusID);
                System.out.println("INV"+getInvoItemID);

                CustomerReturn customerReturn = new CustomerReturn();
                
                    customerReturn.setCreatedBy(LoginFrame.user);
                    customerReturn.setCustomer(customers);
                    customerReturn.setIdCustomerReturn(getItemID);
                    customerReturn.setInvoice(invoice);
                    customerReturn.setInvoiceItems(invoiceItem);
                    customerReturn.setIsDelete("Active");
                    customerReturn.setQty(txtQty.getText());
                    customerReturn.setReturnDate(TxtStartDate.getText());
                    customerReturn.setReturnReson(comboCondition.getSelectedItem().toString());
                    customerReturn.setReturnTerm(comboTerm.getSelectedItem().toString());
                    customerReturn.setReturnTime(dateForm.TimeNow());
                
                
                
                openSession4.save(customerReturn);
                beginTransaction.commit();

                openSession4.close();

                if (comboCondition.getSelectedItem().equals("Non-Damage")) {
                    Session openSession5 = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction1 = openSession5.beginTransaction();
                    Criteria c = openSession5.createCriteria(RawItemStock.class);
                    c.createAlias("rawItems", "s");
                    c.add(Restrictions.eq("s.idRawItems", getItemID));
                    RawItemStock ur = (RawItemStock) c.uniqueResult();
                    
                    if (ur != null) {
                        
                    System.out.println(ur.getQty());

                    ur.setQty(ur.getQty() + Double.parseDouble(txtQty.getText()));

                    openSession5.update(ur);

                    beginTransaction1.commit();
                    openSession5.close();
                    }
                }

                if (comboTerm.getSelectedItem().equals("Cash Back")) {

                    Session openSession6 = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction2 = openSession6.beginTransaction();

                    CashBook cashBook = new CashBook();
                    cashBook.setDate(TxtStartDate.getText());
                    cashBook.setCreatedBy(LoginFrame.user);
                    cashBook.setDescription(comboCondition.getSelectedItem().toString());
                    cashBook.setExpence(UnitPrice);
                    cashBook.setIdCashBook(SOMEBITS);
                    cashBook.setIncome(UnitPrice);


                    openSession6.save(cashBook);
                    beginTransaction2.commit();
                    openSession6.close();

                }
                NotificationPopup.save();

                txtInvoiceNo.setText("");
                txtQty.setText("");
                
                txtInvoiceNo.grabFocus();
                comboItem.removeAllItems();

            } else {
                NotificationPopup.fillFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceReturnCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INV;
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboItem;
    private javax.swing.JComboBox<String> comboTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtInvoiceNo;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
