/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.Jobroals;
import com.alee.laf.WebLookAndFeel;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author arshak
 */
public class JobRoles extends javax.swing.JFrame {

    /**
     * Creates new form JobRoles
     */
    public JobRoles() {
        initComponents();
        LoadTable();
        jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jobcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Rollname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        save2 = new javax.swing.JButton();

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Job Roles");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Job Code");

        jobcode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jobcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobcodeActionPerformed(evt);
            }
        });
        jobcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jobcodeKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Role Name");

        Rollname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Rollname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollnameActionPerformed(evt);
            }
        });
        Rollname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RollnameKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Code", "Role Name", "id"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setMinWidth(0);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save.setText("CANCEL");

        save2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save2.setText("SAVE");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rollname, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jobcode)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rollname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save2)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void jobcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobcodeActionPerformed

    private void RollnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollnameActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed

        if (save2.getText().equals("Update")) {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Jobroals.class);
            Transaction tr = sess.beginTransaction();
            cr.add(Restrictions.eq("jobcode", jobcode.getText()));
            Jobroals uniqueResult = (Jobroals) cr.uniqueResult();

            if (uniqueResult != null) {

                // Rollname.setText(uniqueResult.getRoleName());
                uniqueResult.setRoleName(Rollname.getText());

                tr.commit();
                LoadTable();
                jobcode.setText(null);
                Rollname.setText(null);
                save2.setText("Insert");

            }

            sess.close();

        }

        if (!(jobcode.getText().isEmpty() && Rollname.getText().isEmpty())) {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(ORM.Jobroals.class);
            Transaction tr = sess.beginTransaction();
            Jobroals jobroals = new Jobroals();
            jobroals.setIsDelete("Active");
            jobroals.setRoleName(Rollname.getText().toUpperCase());
            jobroals.setJobcode(jobcode.getText().toLowerCase());

            sess.save(jobroals);
            tr.commit();
            LoadTable();

            if (tr.wasCommitted()) {
                NotificationPopup.save();
                jobcode.setText(null);
                Rollname.setText(null);
            }
            sess.close();

        }


    }//GEN-LAST:event_save2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        if (evt.getButton() == 3) {

            jPopupMenu1.show();

        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Jobroals.class);
            Transaction tr = sess.beginTransaction();
            cr.add(Restrictions.eq("idJobroals", Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString())));
            Jobroals uniqueResult = (Jobroals) cr.uniqueResult();

            if (uniqueResult != null) {

                uniqueResult.setIsDelete("Deactive");
                tr.commit();

                if (tr.wasCommitted()) {

                    NotificationPopup.Delete();
                    LoadTable();

                }

            }
            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jobcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jobcodeKeyReleased

        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(Jobroals.class);
        Transaction tr = sess.beginTransaction();
        cr.add(Restrictions.eq("jobcode", jobcode.getText()));
        Jobroals uniqueResult = (Jobroals) cr.uniqueResult();

        if (uniqueResult != null) {

            Rollname.setText(uniqueResult.getRoleName());
            save2.setText("Update");

        }
        sess.close();

    }//GEN-LAST:event_jobcodeKeyReleased

    private void RollnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RollnameKeyReleased

        if (evt.getKeyCode() == 10) {

            if (!(jobcode.getText().isEmpty() && Rollname.getText().isEmpty())) {
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(ORM.Jobroals.class);
                Transaction tr = sess.beginTransaction();
                Jobroals jobroals = new Jobroals();
                jobroals.setIsDelete("Active");
                jobroals.setRoleName(Rollname.getText().toUpperCase());
                jobroals.setJobcode(jobcode.getText().toUpperCase());

                sess.save(jobroals);
                tr.commit();

                if (tr.wasCommitted()) {
                    LoadTable();
                    NotificationPopup.save();
                    jobcode.setText(null);
                    Rollname.setText(null);
                }
                sess.close();
            }

        }

    }//GEN-LAST:event_RollnameKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WebLookAndFeel.install();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobRoles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rollname;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jobcode;
    private javax.swing.JButton save;
    private javax.swing.JButton save2;
    // End of variables declaration//GEN-END:variables

    private void LoadTable() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Jobroals.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            List<Jobroals> list = cr.list();

            for (Jobroals jobroals : list) {
                Vector v = new Vector();
                v.add(jobroals.getJobcode());
                v.add(jobroals.getRoleName());
                v.add(jobroals.getIdJobroals());
                dtm.addRow(v);

            }

            sess.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
