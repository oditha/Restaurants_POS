package ItemAndStock;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.FoodItemInfo;
import ORM.Jobroals;
import ORM.RawItems;
import ORM.RawItemsHasJobroals;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddJobRolesUdaya extends javax.swing.JFrame {

    static boolean maximized = true;
    Map<String, Integer> job = new HashMap();

    public AddJobRolesUdaya() {
        initComponents();
        maximizeWindow();
        jTable1.setRowHeight(30);
        loadTable();
        tableASC();
        loadJob();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();

        jComboBox1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Food Code");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Code", "Item Name", "Catagory", "Job Role", "Commossion Item"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(2).setMinWidth(500);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(500);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(500);
            jTable1.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jComboBox1));
        }

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (jTable1.getValueAt(i, 5) != null) {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    RawItems rawItems = new RawItems();
                    rawItems.setIdRawItems(Integer.parseInt(jTable1.getValueAt(i, 0).toString()));

                    Jobroals jobroals = new Jobroals();
                    jobroals.setIdJobroals(job.get(jTable1.getValueAt(i, 4)));

                    RawItemsHasJobroals rj = new RawItemsHasJobroals();
                    rj.setRawItems(rawItems);
                    rj.setJobroals(jobroals);
                    rj.setCommisonPerItem(Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
                    rj.setIsDelete("Active");

                    openSession.save(rj);
                    beginTransaction.commit();

                }
            }
            NotificationPopup.save();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJobRolesUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawItems.class);

            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.eq("isRow", "NO"));

            List<RawItems> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (RawItems rawItems : list) {
                dtm.addRow(new Object[]{rawItems.getIdRawItems(), rawItems.getRawItemsCode(), rawItems.getItemName(), rawItems.getRowItemCatagory().getCatagoryName()});

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void maximizeWindow() {

        if (maximized) {

            AddJobRolesUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddJobRolesUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void tableASC() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 3;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();

    }

    private void loadJob() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Jobroals.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Jobroals> list = createCriteria.list();

            for (Jobroals jr : list) {

                jComboBox1.addItem(jr.getRoleName());
                job.put(jr.getRoleName(), jr.getIdJobroals());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
