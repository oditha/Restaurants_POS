package ItemAndStock;

import ORM.RawItems;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;
import com.lowagie.text.pdf.PdfName;
import ClassPack.PoolManager;
import ORM.RawStockOutgoing;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class UpdateStockUdaya extends javax.swing.JFrame {

    static boolean maximized = true;
    private static final int QTY_COL = 3;

    public UpdateStockUdaya() {
        initComponents();
        maximizeWindow();
        loadStock();
        tableDecor();
        //setColor();
        tableStock.setRowHeight(25);

//        tableStock.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Raw Stock Update");
        setMinimumSize(new java.awt.Dimension(830, 480));

        tableStock.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Unit", "Catagory", "Previous Qty", "Available Qty"
            }
        ));
        tableStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableStockKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableStock);
        if (tableStock.getColumnModel().getColumnCount() > 0) {
            tableStock.getColumnModel().getColumn(0).setMinWidth(0);
            tableStock.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableStock.getColumnModel().getColumn(0).setMaxWidth(0);
            tableStock.getColumnModel().getColumn(1).setMinWidth(500);
            tableStock.getColumnModel().getColumn(1).setPreferredWidth(500);
            tableStock.getColumnModel().getColumn(1).setMaxWidth(500);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setText("SAVE");
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
//        Integer i;
//
//        try {
//            DecimalFormat decimalFormat = new DecimalFormat("00");
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(RawItems.class);
//            createCriteria.add(Restrictions.like("itemName", "%" + txtSearch.getText() + "%"));
//            List<RawItems> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
//            dtm.setRowCount(0);
//
//            for (RawItems item : list) {
//                Vector v = new Vector();
//                i = item.getIdRawItems();
//                //dtm.addRow(new Object[]{item.getIdItem(),item.getItemCode(),item.getIitemName()});
//                v.add(item.getIdRawItems());
//                v.add(item.getRawItemsCode());
//                v.add(item.getItemName());
//                v.add(item.getMeasureUnit());
//
//                Criteria createCriteria1 = openSession.createCriteria(RawItemStock.class);
//                createCriteria1.createAlias("rawItems", "i");
//                createCriteria1.add(Restrictions.like("i.idRawItems", i));
//                List<RawItemStock> list1 = createCriteria1.list();
//                
//                v.add(item.getRowItemCatagory().getCatagoryName());
//                for (RawItemStock stock : list1) {
//                    //dtm.addRow(new Object[]{stock.getUnit()});
//                    v.add(decimalFormat.format(stock.getQty()));
//                }
//                
//
//                dtm.addRow(v);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        tableStock.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));

    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            tableStock.print();
        } catch (PrinterException ex) {
            Logger.getLogger(UpdateStockUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            Double previous = null;
            Double available = null;
            Double cal = null;

            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();

            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();

            for (int i = 0; i < dtm.getRowCount(); i++) {

                if (tableStock.getValueAt(i, 5) != null) {
                    Integer getID = Integer.parseInt(tableStock.getValueAt(i, 0).toString());

                    previous = Double.parseDouble(tableStock.getValueAt(i, 4).toString());
                    available = Double.parseDouble(tableStock.getValueAt(i, 5).toString());

                    cal = previous - available;

                    Criteria c1 = openSession.createCriteria(RawItemStock.class);
                    c1.createAlias("rawItems", "r");
                    c1.add(Restrictions.eq("r.idRawItems", getID));

                    RawItemStock un1 = (RawItemStock) c1.uniqueResult();

                    un1.setQty(available);

                    openSession.update(un1);

                    Criteria c2 = openSession.createCriteria(RawStockOutgoing.class);
                    c2.createAlias("rawItems", "ri");
                    c2.add(Restrictions.eq("ri.idRawItems", getID));

                    RawStockOutgoing un2 = (RawStockOutgoing) c2.uniqueResult();

                    Double usage = un2.getQty();

                   // Double setusage = usage + cal;

                    un2.setQty(usage + cal);

                    openSession.update(un2);

                } else {
                    Integer getID = Integer.parseInt(tableStock.getValueAt(i, 0).toString());

                    previous = Double.parseDouble(tableStock.getValueAt(i, 4).toString());
                    //available = Double.parseDouble(tableStock.getValueAt(i, 5).toString());

                    //cal = previous - available;

                    Criteria c1 = openSession.createCriteria(RawItemStock.class);
                    c1.createAlias("rawItems", "r");
                    c1.add(Restrictions.eq("r.idRawItems", getID));

                    RawItemStock un1 = (RawItemStock) c1.uniqueResult();

                    un1.setQty(previous);

                    openSession.update(un1);

                    Criteria c2 = openSession.createCriteria(RawStockOutgoing.class);
                    c2.createAlias("rawItems", "ri");
                    c2.add(Restrictions.eq("ri.idRawItems", getID));

                    RawStockOutgoing un2 = (RawStockOutgoing) c2.uniqueResult();

                    Double usage = un2.getQty();

                    //Double setusage = usage + cal;

                    un2.setQty(usage);

                    openSession.update(un2);
                }

            }
            beginTransaction.commit();
            openSession.close();

            loadStock();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableStockKeyReleased

    }//GEN-LAST:event_tableStockKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStockUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadStock() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawItemStock.class);
            createCriteria.createAlias("rawItems", "r");
            createCriteria.add(Restrictions.eq("r.isRow", "YES"));
            createCriteria.add(Restrictions.eq("r.isStock", "YES"));

            List<RawItemStock> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
            dtm.setRowCount(0);

            for (RawItemStock stock : list) {
                dtm.addRow(new Object[]{stock.getRawItems().getIdRawItems(), stock.getRawItems().getItemName(), stock.getUnit(), stock.getRawItems().getRowItemCatagory().getCatagoryName(), decimalFormat.format(stock.getQty())});
            }

            tableASC();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void maximizeWindow() {

        if (maximized) {

            UpdateStockUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            UpdateStockUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void tableASC() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableStock.getModel());
        tableStock.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 4;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

    private void setColor() {
        try {

//            tableStock.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//                @Override
//                public DefaultTableCellRenderer getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
//                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
//
//                    String qty = (String) table.getModel().getValueAt(row, QTY_COL);
//                    int x = Integer.parseInt(qty);
//                    if (x <= 5 ) {
//                        setBackground(Color.yellow);
//                    } else {
//                        setBackground(Color.WHITE);
//
//                    }
//                    return this;
//
//                }
//
//            });
//            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
//
//            for (int i = 0; i < dtm.getRowCount(); i++) {
//                String qty = tableStock.getValueAt(i, 3).toString();
//                //System.out.println(qty);
//                int q = Integer.parseInt(qty);
//
//                if (q <= 5) {
//                    setBackground(Color.YELLOW);
//                } else {
//                    setBackground(Color.WHITE);
//                }
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tableStock.getColumnModel().getColumn(4).setCellRenderer(dtcr);
        tableStock.getColumnModel().getColumn(5).setCellRenderer(dtcr);

    }

}
