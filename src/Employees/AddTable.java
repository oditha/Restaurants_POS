package Employees;

import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.Employees;
import ORM.EmployeesHasTable;
import ORM.Table;
import com.alee.laf.WebLookAndFeel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class AddTable extends javax.swing.JFrame {

    Map<String, Integer> EMP = new HashMap();
    Map<String, Integer> TBL = new HashMap();

    Integer getTableId;

    public AddTable() {
        initComponents();
        loadTable();
        loadEmp();
        ViewAll();
        tableAddTable.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboTable = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboEmp = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAddTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Assign tables to employees");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Tables");

        comboTable.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        comboTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Table --", "Add new..." }));
        comboTable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboTablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Employees");

        comboEmp.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        comboEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Employee --" }));
        comboEmp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboEmpPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tableAddTable.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableAddTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TableID", "Table No", "EmpId", "Employee Name"
            }
        ));
        tableAddTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAddTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAddTable);
        if (tableAddTable.getColumnModel().getColumnCount() > 0) {
            tableAddTable.getColumnModel().getColumn(0).setMinWidth(0);
            tableAddTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableAddTable.getColumnModel().getColumn(0).setMaxWidth(0);
            tableAddTable.getColumnModel().getColumn(2).setMinWidth(0);
            tableAddTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            tableAddTable.getColumnModel().getColumn(2).setMaxWidth(0);
            tableAddTable.getColumnModel().getColumn(3).setMinWidth(300);
            tableAddTable.getColumnModel().getColumn(3).setPreferredWidth(300);
            tableAddTable.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if (comboTable.getSelectedIndex() == 0) {
                NotificationPopup.fillFeilds();
            } else if (comboEmp.getSelectedIndex() == 0) {
                NotificationPopup.fillFeilds();
            } else {

                if (btnSave.getText().equals("SAVE")) {

                    //String s = comboTable.getSelectedItem().toString().split(" ")[1];
                    //System.out.println(s);
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    Table table = new Table();
                    table.setIdTable(TBL.get(comboTable.getSelectedItem()));

                    Employees employees = new Employees();
                    employees.setIdEmployees(EMP.get(comboEmp.getSelectedItem().toString().split(" - ")[1]));

                    EmployeesHasTable eht = new EmployeesHasTable();
                    eht.setEmployees(employees);
                    eht.setTable(table);
                    eht.setStatus("Recieved");

                    openSession.save(eht);
                    beginTransaction.commit();

                    NotificationPopup.save();
                    openSession.close();

                    ViewAll();

                    comboEmp.setSelectedIndex(0);
                    comboTable.setSelectedIndex(0);
                } else {
                    int showConfirmDialog = JOptionPane.showConfirmDialog(null, "This table is already reserved.Do you want change it?",
                            "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                    if (showConfirmDialog == 0) {

                        Session openSession = PoolManager.getSessionFactory().openSession();
                        Transaction beginTransaction = openSession.beginTransaction();

                        Criteria createCriteria = openSession.createCriteria(EmployeesHasTable.class);
                        createCriteria.createAlias("table", "tb");
                        createCriteria.add(Restrictions.eq("tb.idTable", TBL.get(comboTable.getSelectedItem())));

                        Employees employees = new Employees();
                        employees.setIdEmployees(EMP.get(comboEmp.getSelectedItem().toString().split(" - ")[1]));

                        EmployeesHasTable uniqueResult = (EmployeesHasTable) createCriteria.uniqueResult();
                        uniqueResult.setEmployees(employees);

                        openSession.update(uniqueResult);
                        beginTransaction.commit();

                        NotificationPopup.save();
                        openSession.close();

                        ViewAll();

                        comboEmp.setSelectedIndex(0);
                        comboTable.setSelectedIndex(0);
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboTablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTablePopupMenuWillBecomeInvisible
        try {

            if (comboTable.getSelectedIndex() == 1) {

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure add new table?",
                        "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (showConfirmDialog == 0) {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    Criteria createCriteria = openSession.createCriteria(Table.class);
                    createCriteria.setProjection(Projections.rowCount());
                    List list = createCriteria.list();
                    int tableNo = Integer.parseInt(list.get(0).toString()) + 1;

                    Table table = new Table();
                    table.setTableNo("TABLE" + " " + tableNo);

                    openSession.save(table);
                    beginTransaction.commit();

                    openSession.close();

                    comboTable.removeAllItems();
                    comboTable.addItem("--Select Table--");
                    comboTable.addItem("Add new...");
                    loadTable();

                }
            } else if (comboTable.getSelectedIndex() == 0) {

            } else {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(EmployeesHasTable.class);
                createCriteria.createAlias("table", "tb");
                createCriteria.add(Restrictions.eq("tb.idTable", TBL.get(comboTable.getSelectedItem())));

                EmployeesHasTable uniqueResult = (EmployeesHasTable) createCriteria.uniqueResult();

                if (uniqueResult != null) {
                    //comboEmp.setSelectedItem(uniqueResult.getEmployees().getEmployeName() +" - "+uniqueResult.getEmployees().getEmployeName());
                    btnSave.setText("UPDATE");
                } else {
                    btnSave.setText("SAVE");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboTablePopupMenuWillBecomeInvisible

    private void comboEmpPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboEmpPopupMenuWillBecomeInvisible
        if (comboTable.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select table first");
            comboEmp.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comboEmpPopupMenuWillBecomeInvisible

    private void tableAddTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAddTableMouseClicked

    }//GEN-LAST:event_tableAddTableMouseClicked

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboEmp;
    private javax.swing.JComboBox<String> comboTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAddTable;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Table.class);

            List<Table> list = createCriteria.list();

            for (Table table : list) {

                comboTable.addItem(table.getTableNo());
                TBL.put(table.getTableNo(), table.getIdTable());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadEmp() {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Employees.class);
            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<Employees> list = createCriteria.list();

            for (Employees employees : list) {
                comboEmp.addItem(employees.getEmployeName() + " - " + employees.getEmployeeNic());
                EMP.put(employees.getEmployeeNic(), employees.getIdEmployees());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ViewAll() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) tableAddTable.getModel();
            dtm.setRowCount(0);

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(EmployeesHasTable.class);
            createCriteria.add(Restrictions.like("status", "Recieved"));
            List<EmployeesHasTable> list = createCriteria.list();

            for (EmployeesHasTable employeeTable : list) {
                dtm.addRow(new Object[]{employeeTable.getTable().getIdTable(), employeeTable.getTable().getTableNo(), employeeTable.getEmployees().getIdEmployees(), employeeTable.getEmployees().getEmployeName()});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
