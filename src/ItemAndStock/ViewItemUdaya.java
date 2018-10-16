/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItemAndStock;

import ClassPack.Excel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.RawItems;
import ORM.RowItemExpireDate;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author udaya
 */
public class ViewItemUdaya extends javax.swing.JFrame {

    public static Integer iditem;
    static boolean maximized = true;

    public ViewItemUdaya() {
        initComponents();
        maximizeWindow();
        loadItem();
        tableASC();
        tableFoodItem.setComponentPopupMenu(jPopupMenu1);
        tblrowhight();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFoodItem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("Edit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Items");

        tableFoodItem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableFoodItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Item Catagory", "Unit Price", "Selling Price", "Manufacture Date", "Expire Date"
            }
        ));
        tableFoodItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableFoodItemMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableFoodItem);
        if (tableFoodItem.getColumnModel().getColumnCount() > 0) {
            tableFoodItem.getColumnModel().getColumn(0).setMinWidth(0);
            tableFoodItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableFoodItem.getColumnModel().getColumn(0).setMaxWidth(0);
            tableFoodItem.getColumnModel().getColumn(1).setMinWidth(250);
            tableFoodItem.getColumnModel().getColumn(1).setPreferredWidth(250);
            tableFoodItem.getColumnModel().getColumn(1).setMaxWidth(250);
            tableFoodItem.getColumnModel().getColumn(2).setMinWidth(250);
            tableFoodItem.getColumnModel().getColumn(2).setPreferredWidth(250);
            tableFoodItem.getColumnModel().getColumn(2).setMaxWidth(250);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
//        try {

//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Item.class);
//            //createCriteria.add(Restrictions.like("iitemName", "%" + txtSearch.getText() + "%"));
//
//            Criterion name = Restrictions.like("iitemName", "%" + txtSearch.getText() + "%");
//            Criterion active = Restrictions.like("isActive", "Active");
//            LogicalExpression andExp = Restrictions.and(name, active);
//            createCriteria.add(andExp);
//
//            List<Item> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) tableItem.getModel();
//            dtm.setRowCount(0);
//
//            for (Item item : list) {
//                dtm.addRow(new Object[]{item.getIdItem(), item.getItemCode(), item.getIitemName(), item.getCatogory().getCatogoryName(), item.getBrands().getBrandName(), item.getDescriotion()});
//            }
//            openSession.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        DefaultTableModel dtm = (DefaultTableModel) tableFoodItem.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        tableFoodItem.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void tableFoodItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFoodItemMouseReleased
        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }
    }//GEN-LAST:event_tableFoodItemMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int r = tableFoodItem.getSelectedRow();

        iditem = Integer.parseInt(tableFoodItem.getValueAt(r, 0).toString());

        EditFoodItemsUdaya editItem = new EditFoodItemsUdaya();
        editItem.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {
                int x = tableFoodItem.getSelectedRow();
                String ItemID = (tableFoodItem.getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(RawItems.class);

                createCriteria.add(Restrictions.eq("idRawItems", Integer.parseInt(ItemID)));

                RawItems item = (RawItems) createCriteria.uniqueResult();

                item.setIsDelete("Deactive");

                openSession.update(item);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.Delete();

                loadItem();
            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tableFoodItem.print();
        } catch (PrinterException ex) {
            // Logger.getLogger(ViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showSaveDialog(null);;
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(tableFoodItem, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewItemUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItemUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableFoodItem;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadItem() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawItems.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<RawItems> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableFoodItem.getModel();
            dtm.setRowCount(0);

            for (RawItems item : list) {
                Iterator iterator = item.getRowItemExpireDates().iterator();
                Vector v = new Vector();
                v.add(item.getIdRawItems());
                v.add(item.getItemName());
                v.add(item.getRowItemCatagory().getCatagoryName());
                v.add(item.getRawItemsUnitPrice());
                v.add(item.getRawItemsSellingPrice());

                while (iterator.hasNext()) {
                    RowItemExpireDate next = (RowItemExpireDate) iterator.next();
                    v.add(next.getManufactureDate());
                    v.add(next.getExpireDate());

                }

                dtm.addRow(v);
                //  dtm.addRow(new Object[]{item.getIdRawItems(), item.getItemName(), item.getRowItemCatagory().getCatagoryName(), item.getRawItemsUnitPrice(), item.getRawItemsSellingPrice()});
            }

            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void tableASC() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableFoodItem.getModel());
        tableFoodItem.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 2;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();

    }

    private void maximizeWindow() {

        if (maximized) {

            ViewItemUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewItemUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void tblrowhight() {

        tableFoodItem.setRowHeight(40);

    }
}
