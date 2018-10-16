package Customers;


import ClassPack.Excel;

import Customers.withoutBTN.ViewOutstandingHistoryODK;
import ClassPack.PoolManager;
import ORM.RawGrn;
import ORM.RowItemGrnPayment;
import ORM.Supplier;
import Suppliers.ViewGrnPaymentUdaya;
import com.alee.laf.WebLookAndFeel;


import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.criterion.Restrictions;

public class ViewSupplierOutstrandingODK extends javax.swing.JFrame {
    
    Map<String, Integer> sup = new HashMap();
    
    public ViewSupplierOutstrandingODK() {
        
        initComponents();
        tblAddPayments.setComponentPopupMenu(jPopupMenu1);
        tableAlign();
        tblAddPayments.setRowHeight(30);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboSup = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("View History");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("View GRN Payments");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Outstanding");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Select Type");

        comboSup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "GRN Outstadings" }));
        comboSup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSupPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupActionPerformed(evt);
            }
        });

        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suplier / Customer Name", "Phone No", "Total Purchased", "Total Paid", "Outstanding", "idCustomer"
            }
        ));
        tblAddPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAddPaymentsMouseReleased(evt);
            }
        });
        tblAddPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddPaymentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddPayments);
        if (tblAddPayments.getColumnModel().getColumnCount() > 0) {
            tblAddPayments.getColumnModel().getColumn(5).setMinWidth(0);
            tblAddPayments.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAddPayments.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("To Exel");
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(jLabel4))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSupPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupPopupMenuWillBecomeInvisible
//        
      
        

    }//GEN-LAST:event_comboSupPopupMenuWillBecomeInvisible

    private void tblAddPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddPaymentsKeyReleased
        

    }//GEN-LAST:event_tblAddPaymentsKeyReleased

    private void comboSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupActionPerformed
          DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
        dtm.setRowCount(0);
            System.out.println("oo");
        
        if (comboSup.getSelectedIndex() !=0) {
            try {
                double grnnet=0.0;
                double grnPaytotl=0.0;
                
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Supplier.class);
                
                cr.add(Restrictions.eq("isDelete", "Active"));
                List<Supplier> list = cr.list();
                for (Supplier supplier : list) {
                    
     //       System.out.println(supplier.getSupplierName());
                    Iterator it = supplier.getRawGrns().iterator();
                    while (it.hasNext()) {
                        
                        RawGrn next = (RawGrn) it.next();
                        
                        if (next.getIsDelete().equals("Active")) {
                           
                            grnnet=next.getNetTotal();
                            
                            
                        }
                        
                        
                    
                        
                        //  Iterator it2 = (Iterator) next.getRowItemGrnPayments();
                        Iterator it2 = supplier.getRowItemGrnPayments().iterator();
                        while (it2.hasNext()) {
                            RowItemGrnPayment next1 = (RowItemGrnPayment) it2.next();
                              grnPaytotl+=next1.getRowItemGrnPayAmount();
                        }
                        
                        
                        
//                        while (it2.hasNext()) {
//                            RowItemGrnPayments next1 = (RowItemGrnPayments) it2.next();
//                            
//                          
//                            
//                            
//                            
//                            
//                            
//                            
//                            
//                        }
//                        
                        
                    
                        
                    }
                
                       if (grnnet>grnPaytotl) {
                           System.out.println("ok");
                           
                        Vector v = new Vector();
                        v.add(supplier.getSupplierName());
                        v.add(supplier.getContactNo1());
                        v.add(grnnet);
                        v.add(grnPaytotl);
                        v.add((grnnet-grnPaytotl));
                        v.add(supplier.getIdSupplier());
                        dtm.addRow(v);
                        
                    } else{
                           System.out.println(grnnet);
                    System.out.println(grnPaytotl);
                       
                       
                       
                       }
                }
                
                
                
                
            } catch (Exception e) {
            
            e.printStackTrace();
            }





            
        }
    }//GEN-LAST:event_comboSupActionPerformed

    private void tblAddPaymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddPaymentsMouseReleased
        
        int button = evt.getButton();
        System.out.println(button);
        
        if (button == 3) {
            
            jPopupMenu1.show();
            
        }
        

    }//GEN-LAST:event_tblAddPaymentsMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        
        ViewOutstandingHistoryODK outstandingHistory = new ViewOutstandingHistoryODK();
        
        DefaultTableModel dtm = (DefaultTableModel) outstandingHistory.jTable1.getModel();
        dtm.setRowCount(0);
        int r = tblAddPayments.getSelectedRow();
        int cusid = (int) tblAddPayments.getValueAt(r, 5);
        String supliername=(String) tblAddPayments.getValueAt(r, 0);
        String contact=(String) tblAddPayments.getValueAt(r, 1);
        System.out.println(cusid);
//        
        if (comboSup.getSelectedIndex() == 1) {
            
          
            
        }else if (comboSup.getSelectedIndex()==2) {
            
           
            try {
                double grnptmnt=0.0;
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Supplier.class);
                cr.add(Restrictions.eq("isDelete", "Active"));
                cr.add(Restrictions.eq("idSupplier",cusid));
                
                Supplier uniqueResult = (Supplier) cr.uniqueResult();
                
                if (uniqueResult!=null) {
                    
                    Iterator it = uniqueResult.getRawGrns().iterator();
                
                    while (it.hasNext()) {
                        RawGrn next = (RawGrn) it.next();
                        Iterator it2 = next.getRowItemGrnPayments().iterator();
                        while (it2.hasNext()) {
                            RowItemGrnPayment next1 = (RowItemGrnPayment) it2.next();
                            
                          grnptmnt+=next1.getRowItemGrnPayAmount();
                            
                            
                            
                            
                        }
                        
                        
                        
                        if (next.getNetTotal()>grnptmnt) {
                            Vector v = new Vector();
                            v.add(next.getRawGrnNo());
                            v.add(next.getRawGrnDate());
                            v.add(next.getNetTotal());
                            v.add(grnptmnt);
                            v.add((next.getNetTotal()-grnptmnt));
                            dtm.addRow(v);
                        
                        
                        
                        
                        }
                        
                        outstandingHistory.name.setText(supliername);
                        outstandingHistory.contact.setText(contact);
                    }
                    
                    
                    outstandingHistory.setVisible(true);
                    
                }
                
                
                
                
            } catch (Exception e) {
            
            e.printStackTrace();
            
            }
           
            
       
            
           
            
            
            
            
            
            
            
            
            
            
            
        }
//        
//        else if(comboSup.getSelectedIndex()==3){
//        
//        
//            Session sess = PoolManager.getSessionFactory().openSession();
//            Criteria cr = sess.createCriteria(Grn.class);
//            cr.add(Restrictions.eq("isActive", "Active"));
//            cr.createAlias("supplier", "s");
//            cr.add(Restrictions.eq("s.idSupplier", cusid));
//            System.out.println(cusid);
//            List<Grn> list = cr.list();
//            
//            for (Grn grn : list) {
//                
//                
//                Double net=grn.getNettTotal();
//                 Double amount = 0.00;
//                Iterator it = grn.getGrnpaymentses().iterator();
//                while (it.hasNext()) {
//                    Grnpayments next = (Grnpayments) it.next();
//                    
//                    if (next.getIsActive().equals("Active")) {
//                        amount+=next.getAmount();
//                    }
//                    
//                    
//                    
//                    
//                }
//                
//                
//                if (net>amount) {
//                    
//                       dtm.addRow(new Object[]{
//                     
//                       grn.getGrnno(),
//                        grn.getGrndate(),
//                        Decimal_Formats.Price(grn.getNettTotal()),
//                        Decimal_Formats.Price(amount),
//                        Decimal_Formats.Price(net - amount)
//                    
//                    });
//                    
//                    
//                    
//                        
//                   outstandingHistory.name.setText(supliername);
//                   outstandingHistory.contact.setText(contact);
//                    
//                    
//                    outstandingHistory.setVisible(true);
//                    
//                    
//                    
//                    
//                    
//                }
//                
//                
//                
//            }
//        
//        
//        }
//        
//        
//        
//        else{
//        
//        dtm.setRowCount(0);
//        
//        
//        }
//{
//        
//        
//        
//        
//        
//        }
//        
//
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showSaveDialog(null);;
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
            Excel.toExcel(tblAddPayments, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewSupplierOutstrandingODK.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        
        
        
        
        
        
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Supplier.class);
            cr.add(Restrictions.eq("idSupplier", tblAddPayments.getValueAt(tblAddPayments.getSelectedRow(), 5)));
            
            List<Supplier> list = cr.list();
            for (Supplier supplier : list) {

               new ViewGrnPaymentUdaya(). comboSup.setSelectedItem(supplier.getIdSupplier() + " - " + supplier.getSupplierName());
               new ViewGrnPaymentUdaya().setVisible(true);
               
               
               
            }
            openSession.close();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSupplierOutstrandingODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddPayments;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {
        
//        try {
//            
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Supplier.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            List<Supplier> list = createCriteria.list();
//            for (Supplier supplier : list) {
//                
//                comboSup.addItem(supplier.getSupplierCode() + " - " + supplier.getSupplierName());
//                sup.put(supplier.getSupplierCode(), supplier.getIdSupplier());
//                
//            }
//            openSession.close();
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//            
//        }
//        
    }
    
    private void loadTable() {
        
//        try {
//            
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Grn.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            createCriteria.createAlias("supplier", "s");
//            createCriteria.add(Restrictions.eq("s.idSupplier", sup.get(comboSup.getSelectedItem().toString().split(" - ")[0])));
//            List<Grn> list = createCriteria.list();
//            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
//            dtm.setRowCount(0);
//            for (Grn grn : list) {
//                
//                Double nettTotal = grn.getNettTotal();
//                Double amount = 0.00;
//                Iterator iterator = grn.getGrnpaymentses().iterator();
//                while (iterator.hasNext()) {
//                    Grnpayments gp = (Grnpayments) iterator.next();
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
//                        grn.getIdGrn(),
//                        grn.getGrnno(),
//                        grn.getGrndate(),
//                        Decimal_Formats.Price(grn.getNettTotal()),
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
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        
        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        
    }
    
}
