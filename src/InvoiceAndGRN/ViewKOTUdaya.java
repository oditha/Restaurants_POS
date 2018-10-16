package InvoiceAndGRN;

import ClassPack.Excel;
import ClassPack.PoolManager;
import MainMenu.LoginFrame;
import ORM.Invoice;
import ORM.Kot;
import ORM.Kotitems;
import com.alee.laf.WebLookAndFeel;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ViewKOTUdaya extends javax.swing.JFrame {

    public ViewKOTUdaya() {
        initComponents();
        viewAll();
        tableASC();
        tableKOT.setRowHeight(25);
        tableItem.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableItem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        txtEndDate = new com.alee.extended.date.WebDateField();
        btnFilter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKOT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View KOT");

        tableItem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item name", "Qty"
            }
        ));
        jScrollPane1.setViewportView(tableItem);
        if (tableItem.getColumnModel().getColumnCount() > 0) {
            tableItem.getColumnModel().getColumn(0).setMinWidth(400);
            tableItem.getColumnModel().getColumn(0).setPreferredWidth(400);
            tableItem.getColumnModel().getColumn(0).setMaxWidth(400);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Date Start");

        TxtStartDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Date End");

        txtEndDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtEndDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDateMouseClicked(evt);
            }
        });

        btnFilter.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tableKOT.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableKOT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idKot", "KOT No", "Date"
            }
        ));
        tableKOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKOTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableKOT);
        if (tableKOT.getColumnModel().getColumnCount() > 0) {
            tableKOT.getColumnModel().getColumn(0).setMinWidth(0);
            tableKOT.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableKOT.getColumnModel().getColumn(0).setMaxWidth(0);
            tableKOT.getColumnModel().getColumn(1).setMinWidth(180);
            tableKOT.getColumnModel().getColumn(1).setPreferredWidth(180);
            tableKOT.getColumnModel().getColumn(1).setMaxWidth(180);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("To Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("To Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(181, 181, 181))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtEndDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEndDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tableKOT.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        tableKOT.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(Kot.class);
        cr.add(Restrictions.between("date", TxtStartDate.getText(), txtEndDate.getText()));
        cr.add(Restrictions.eq("isDelete", "Active"));
        cr.addOrder(Order.desc("date"));
        
        
        if (!new LoginFrame().UType.equals("Owner")) {
            float s = 0;
            List<Kot> list2 = cr.list();
            s = (float) list2.size();

            //  System.out.println();
            cr.setMaxResults(Math.round(s * 60 / 100));
        }

        List<Kot> list = cr.list();

        DefaultTableModel dtm = (DefaultTableModel) tableKOT.getModel();
        dtm.setRowCount(0);

        for (Kot kot : list) {
            Vector v = new Vector();
            v.add(kot.getIdKot());
            v.add(kot.getKotno());
            v.add(kot.getDate());

            dtm.addRow(v);

        }

        sess.close();
    }//GEN-LAST:event_btnFilterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            tableItem.print();
        } catch (PrinterException ex) {
            Logger.getLogger(DaillySalesSummeryUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableKOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKOTMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) tableItem.getModel();
            dtm.setRowCount(0);
            int x = tableKOT.getSelectedRow();
            int y = Integer.parseInt(tableKOT.getValueAt(x, 0).toString());

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Kotitems.class);
            createCriteria.createAlias("kot", "k");
            createCriteria.add(Restrictions.eq("k.idKot", y));

            List<Kotitems> list = createCriteria.list();

            for (Kotitems ki : list) {
                dtm.addRow(new Object[]{ki.getRawItems().getItemName(), ki.getQty()});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableKOTMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showSaveDialog(null);;
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(tableItem, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewKOTUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
                        try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showSaveDialog(null);;
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(tableKOT, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewKOTUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewKOTUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableItem;
    private javax.swing.JTable tableKOT;
    public static com.alee.extended.date.WebDateField txtEndDate;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void viewAll() {
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(Kot.class);
        cr.add(Restrictions.eq("isDelete", "Active"));
        cr.addOrder(Order.desc("date"));
        if (!new LoginFrame().UType.equals("Owner")) {
            float s = 0;
            List<Kot> list2 = cr.list();
            s = (float) list2.size();

            //  System.out.println();
            cr.setMaxResults(Math.round(s * 60 / 100));
        }

        List<Kot> list = cr.list();

        DefaultTableModel dtm = (DefaultTableModel) tableKOT.getModel();
        dtm.setRowCount(0);

        for (Kot kot : list) {
            Vector v = new Vector();
            v.add(kot.getIdKot());
            v.add(kot.getKotno());
            v.add(kot.getDate());

            dtm.addRow(v);

        }

        sess.close();

    }

    private void tableASC() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableKOT.getModel());
        tableKOT.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 2;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();

    }
}
