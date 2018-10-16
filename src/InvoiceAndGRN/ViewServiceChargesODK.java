package InvoiceAndGRN;

import ClassPack.Excel;
import ClassPack.PoolManager;
import ORM.Customer;
import ORM.ServiceCharge;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class ViewServiceChargesODK extends javax.swing.JFrame {

    Map<String, Integer> cust = new HashMap();

    public ViewServiceChargesODK() {
        initComponents();
      //  ComboToTXT2();
        tableAlign();
        SetMaximized();
        Loadtable();
    }
 static boolean maximized = true;
    
    
      private void SetMaximized() {
       
    
    if (maximized) {

            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        filterText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCurBalance1 = new javax.swing.JTextField();
        webdateFrom = new com.alee.extended.date.WebDateField();
        webdateTo = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        setTitle("Customer Invoice Payments");

        filterText.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        filterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTextActionPerformed(evt);
            }
        });
        filterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTextKeyReleased(evt);
            }
        });

        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Invoice NO", "Date", "Amount"
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

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Enter Invoice No");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Total");

        txtCurBalance1.setEditable(false);
        txtCurBalance1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCurBalance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurBalance1ActionPerformed(evt);
            }
        });

        webdateFrom.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webdateFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webdateFromMouseClicked(evt);
            }
        });
        webdateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webdateFromActionPerformed(evt);
            }
        });

        webdateTo.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webdateTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webdateToMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("To");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setText("From");

        btnFilter.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("To Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(webdateTo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(webdateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurBalance1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(webdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(webdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurBalance1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void filterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterTextActionPerformed

    private void txtCurBalance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurBalance1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurBalance1ActionPerformed

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
        
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
   tblAddPayments.setRowSorter(tr);
   tr.setRowFilter(RowFilter.regexFilter(filterText.getText()));
    }//GEN-LAST:event_filterTextKeyReleased

    private void webdateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateFromMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webdateFromMouseClicked

    private void webdateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateToMouseClicked

    }//GEN-LAST:event_webdateToMouseClicked

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
  DefaultTableModel model = (DefaultTableModel) tblAddPayments.getModel();
        try {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(ServiceCharge.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            cr.add(Restrictions.between("serviceChargeDate", webdateFrom.getText(), webdateTo.getText()));
            
            List<ServiceCharge> list = cr.list();
            for (ServiceCharge serviceCharge : list) {
                Vector v = new Vector();
                v.add(serviceCharge.getIdServiceCharge());
                v.add(serviceCharge.getInvoice().getInvoiceNo());
                v.add(serviceCharge.getServiceChargeDate());
                v.add(serviceCharge.getAmount());
                model.addRow(v);
                
                
                
            }
            
        } catch (Exception e) {
        
        e.printStackTrace();
        
        }
       
    }//GEN-LAST:event_btnFilterActionPerformed

    private void webdateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webdateFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_webdateFromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showSaveDialog(null);;
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(jTable1, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewServiceChargesODK.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewServiceChargesODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JTextField filterText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAddPayments;
    private javax.swing.JTextField txtCurBalance1;
    private com.alee.extended.date.WebDateField webdateFrom;
    private com.alee.extended.date.WebDateField webdateTo;
    // End of variables declaration//GEN-END:variables

    private void loadTableV2() {
//
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(InvoiceHasCustomers.class);
//            createCriteria.createAlias("customers", "c");
//            createCriteria.add(Restrictions.eq("c.idCustomers", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
//            List<InvoiceHasCustomers> list = createCriteria.list();
//            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
//            dtm.setRowCount(0);
//            for (InvoiceHasCustomers cusin : list) {
//
//                Double nettTotal = cusin.getInvoice().getNettTotal();
//                Double amount = 0.00;
//                Iterator iterator = cusin.getInvoice().getInvoicePaymentses().iterator();
//                while (iterator.hasNext()) {
//                    InvoicePayments gp = (InvoicePayments) iterator.next();
//
//                    if (gp.getIsActive().equals("Active")) {
//
//                        amount += gp.getAmount();
//                    }
//
//                }
//
//                if (nettTotal > amount) {
//
//                    dtm.addRow(new Object[]{
//                        cusin.getInvoice().getIdInvoice(),
//                        cusin.getInvoice().getInvoiceNo(),
//                        cusin.getInvoice().getInvoiceDate(),
//                        Decimal_Formats.Price(cusin.getInvoice().getNettTotal()),
//                        Decimal_Formats.Price(amount),
//                        Decimal_Formats.Price(nettTotal - amount)
//
//                    });
//
//                }
//
//            }
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }

    }

    private void tableAlign() {

//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        tblAddPayments.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
//        tblAddPayments.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
//        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
//        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
//        tblAddPayments.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

   

    private void ComboToTXT2() {
        
    }

    private void settotal() {
//        double invtotal = 0;
//        double paidtot = 0;
//
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Customers.class);
//            createCriteria.add(Restrictions.eq("idCustomers", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
//            Customers uniqueResult = (Customers) createCriteria.uniqueResult();
//
//            Iterator iterator = uniqueResult.getInvoiceHasCustomerses().iterator();
//
//            while (iterator.hasNext()) {
//
//                InvoiceHasCustomers invhascus = (InvoiceHasCustomers) iterator.next();
//
//                invtotal += invhascus.getInvoice().getNettTotal();
//
//            }
//
//            Iterator iterator1 = uniqueResult.getInvoicePaymentses().iterator();
//            while (iterator1.hasNext()) {
//
//                InvoicePayments next = (InvoicePayments) iterator1.next();
//                if (next.getIsActive().equals("Active")) {
//                    paidtot += next.getAmount();
//
//                }
//
//            }
//            txtCurBalance.setText(Decimal_Formats.Price(invtotal - paidtot) + "");
//            openSession.close();
//            loadTableV2();
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//
  }

    private void Loadtable() {
        DefaultTableModel model = (DefaultTableModel) tblAddPayments.getModel();
        try {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(ServiceCharge.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            List<ServiceCharge> list = cr.list();
            for (ServiceCharge serviceCharge : list) {
                Vector v = new Vector();
                v.add(serviceCharge.getIdServiceCharge());
                v.add(serviceCharge.getInvoice().getInvoiceNo());
                v.add(serviceCharge.getServiceChargeDate());
                v.add(serviceCharge.getAmount());
                model.addRow(v);
                
                
                
            }
            
        } catch (Exception e) {
        
        e.printStackTrace();
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
