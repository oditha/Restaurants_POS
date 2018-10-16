package Suppliers;


import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.Supplier;

import com.alee.laf.WebLookAndFeel;


import java.text.DecimalFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewDeletedSupp extends javax.swing.JFrame {

    public static String a;
    public static String a1;
    public static String a2;
    public static String a3;
    public static String a4;
    public static String a5;
    public static String a6;
    public static String a7;
    public static String a8;
    
    public static Integer s01;
    
    public ViewDeletedSupp() {
        initComponents();
        loadSupp();
        tableSupplier.setComponentPopupMenu(jPopupMenu1);
        tableSupplier.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filterText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();

        jMenuItem4.setText("Activate");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Suppliers | Bit Win Computers");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 14))); // NOI18N

        filterText.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        filterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTextKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText(" Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact 1", "Contact 2"
            }
        ));
        tableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSupplierMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableSupplier);
        if (tableSupplier.getColumnModel().getColumnCount() > 0) {
            tableSupplier.getColumnModel().getColumn(0).setMinWidth(0);
            tableSupplier.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableSupplier.getColumnModel().getColumn(0).setMaxWidth(0);
            tableSupplier.getColumnModel().getColumn(1).setMinWidth(300);
            tableSupplier.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableSupplier.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased

DefaultTableModel dtm=(DefaultTableModel) tableSupplier.getModel();
   TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
   tableSupplier.setRowSorter(tr);
   tr.setRowFilter(RowFilter.regexFilter(filterText.getText()));





//        try {
//            char c = evt.getKeyChar();
//            if (Character.isDigit(c)) {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(Supplier.class);
//                //createCriteria.add(Restrictions.like("supplierCode", txtSearch.getText() + "%"));
//
//                Criterion code = Restrictions.like("supplierCode", "%"+txtSearch.getText() + "%");
//                Criterion active = Restrictions.like("isActive", "Deactive");
//                LogicalExpression andExp = Restrictions.and(code, active);
//                createCriteria.add(andExp);
//
//                List<Supplier> list = createCriteria.list();
//
//                DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
//                dtm.setRowCount(0);
//
//                for (Supplier supplier : list) {
//
//                    dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierCode(), supplier.getSupplierName(), supplier.getSupplierContactNo1(), supplier.getSupplierContactNo2(), supplier.getSupplierEmail()});
//
//                }
//
//            } else {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(Supplier.class);
//                //createCriteria.add(Restrictions.like("supplierName", txtSearch.getText() + "%"));
//
//                Criterion supname = Restrictions.like("supplierName", "%"+txtSearch.getText() + "%");
//                Criterion active = Restrictions.like("isActive", "Deactive");
//                LogicalExpression andExp = Restrictions.and(supname, active);
//                createCriteria.add(andExp);
//
//                List<Supplier> list = createCriteria.list();
//
//                DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
//                dtm.setRowCount(0);
//
//                for (Supplier supplier : list) {
//
//                    dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierCode(), supplier.getSupplierName(), supplier.getSupplierContactNo1(), supplier.getSupplierContactNo2(), supplier.getSupplierEmail()});
//
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_filterTextKeyReleased

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
       int showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, "Are you sure want to activate this supplier?");
        
        if (showConfirmDialog==0) {
             try {
            int x = tableSupplier.getSelectedRow();
            String supCode = (tableSupplier.getValueAt(x, 0).toString());

            Session openSession = PoolManager.getSessionFactory().openSession();

            Transaction beginTransaction = openSession.beginTransaction();

            Criteria createCriteria = openSession.createCriteria(Supplier.class);

            createCriteria.add(Restrictions.eq("idSupplier", Integer.parseInt(supCode)));

            Supplier supplier = (Supplier) createCriteria.uniqueResult();

            supplier.setIsDelete("Active");

            openSession.update(supplier);
            beginTransaction.commit();
            openSession.close();
            NotificationPopup.save();

            loadSupp();

        } catch (Exception e) {
            e.printStackTrace();
        }
            
        }
 
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tableSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }

    }//GEN-LAST:event_tableSupplierMouseReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDeletedSupp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filterText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableSupplier;
    // End of variables declaration//GEN-END:variables

    public static void loadSupp() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Supplier.class);

            createCriteria.add(Restrictions.like("isDelete", "Deactive"));

            List<Supplier> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
            dtm.setRowCount(0);

            for (Supplier supplier : list) {
                Vector v = new Vector();
                v.add(supplier.getIdSupplier());
                v.add(supplier.getSupplierName());
                v.add(supplier.getContactNo1());
                v.add(supplier.getContactNo2());
                dtm.addRow(v);
                        
                // dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierCode(), supplier.getSupplierName(), supplier.getSupplierContactNo1(), supplier.getSupplierContactNo2(), supplier.getSupplierEmail(), supplier.getSupplierAddress1(), supplier.getSupplierAddress2(), supplier.getSupplierCity()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
