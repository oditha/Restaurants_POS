package ItemAndStock;

import ClassPack.Excel;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import ORM.RawItemStock;
import ORM.RowItemExpireDate;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;

import java.awt.print.PrinterException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ViewExpireReminderODK extends javax.swing.JFrame {

//    DaillySalesSupSummery dss;
    public ViewExpireReminderODK() {
        initComponents();
        loadStock();
        tableAlign();
SetMaximized();
jTable1.setRowHeight(30);
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expire reminder");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Batch No", "Manufacture Date", "Expire Date", "Qty"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Search");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("To Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 333, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(342, 342, 342)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ViewExpireReminderODK.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
     
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
   jTable1.setRowSorter(tr);
   tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showSaveDialog(null);;
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(jTable1, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewExpireReminderODK.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewExpireReminderODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

//    private DaillySalesSupSummery opnsumm() {
//
////        if (dss == null) {
////
////            dss = new DaillySalesSupSummery();
////        }
////        return dss;
//    }
    private void loadStock() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 7); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        
        
        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria cr = openSession.createCriteria(RowItemExpireDate.class);
        cr.add(Restrictions.between("expireDate", dateForm.currentdate(), output));
        List<RowItemExpireDate> list = cr.list();
        
        for (RowItemExpireDate rowItemExpireDate : list) {
            
            Vector v = new Vector();
            v.add(rowItemExpireDate.getRawItems().getRawItemsCode());
            v.add(rowItemExpireDate.getRawItems().getItemName());
            v.add(rowItemExpireDate.getBatchNo());
            v.add(rowItemExpireDate.getManufactureDate());
            v.add(rowItemExpireDate.getExpireDate());
            Iterator iterator = rowItemExpireDate.getRawItems().getRawItemStocks().iterator();
            
            while (iterator.hasNext()) {
                RawItemStock next = (RawItemStock) iterator.next();
                v.add(next.getQty());
                
            }
           
            dtm.addRow(v);
            
        }
        
        
        
        
        

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
 // jTable1.getColumnModel().getColumn(4).getCellEditor().c

    }

}
