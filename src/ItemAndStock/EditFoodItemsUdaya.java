package ItemAndStock;

import ORM.RowItemCatagory;
import ORM.RawItems;
import ORM.RowItemCatagory;
import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import static ItemAndStock.ViewItemUdaya.iditem;
import ORM.RowItemExpireDate;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EditFoodItemsUdaya extends javax.swing.JFrame {

    Map<String, Integer> cat = new HashMap();
    Map<String, Integer> bra = new HashMap();
    int catagoryid;

    public EditFoodItemsUdaya() {
        initComponents();
        LoadCombo();
        loadDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        comboCatogory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnResetItem = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        dateManufacture = new com.alee.extended.date.WebDateField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateExpire = new com.alee.extended.date.WebDateField();
        txtItemBatchNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSellPrice = new javax.swing.JTextField();
        txtItemCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setText("Delete Selected");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete All");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Item");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Select Catogory");

        comboCatogory.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboCatogory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboCatogory.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCatogoryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Item Name");

        txtItemName.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtItemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemNameFocusLost(evt);
            }
        });
        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNameKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtDescription.setRows(5);
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescription);

        btnResetItem.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnResetItem.setText("Cancel");
        btnResetItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetItemActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Update");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        dateManufacture.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateManufacture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateManufactureMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Manufacture Date");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Expire Date");

        dateExpire.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateExpire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateExpireMouseClicked(evt);
            }
        });

        txtItemBatchNo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtItemBatchNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemBatchNoFocusLost(evt);
            }
        });
        txtItemBatchNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemBatchNoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Batch No");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Unit Price");

        txtUnitPrice.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Selling Price");

        txtSellPrice.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSellPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSellPriceKeyTyped(evt);
            }
        });

        txtItemCode.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Item Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUnitPrice)
                                    .addComponent(dateManufacture, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(124, 124, 124)))
                            .addComponent(jLabel2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSellPrice)
                            .addComponent(dateExpire, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResetItem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCatogory, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtItemBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCatogory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItemBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetItemActionPerformed
        ClearFeilds();
    }//GEN-LAST:event_btnResetItemActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if (comboCatogory.getSelectedIndex() != 0) {
                if (!txtItemName.getText().isEmpty() && !txtSellPrice.getText().isEmpty() && !txtUnitPrice.getText().isEmpty() && !txtSellPrice.getText().isEmpty()) {
                    String PreFix = comboCatogory.getSelectedItem().toString().split(" - ")[0];
                    int i = Integer.parseInt(PreFix);

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(RawItems.class);
                    createCriteria.add(Restrictions.eq("idRawItems", iditem));
                    Transaction beginTransaction = openSession.beginTransaction();

                    RowItemCatagory rowItemCatagory = new RowItemCatagory();
                    rowItemCatagory.setIdRowItemCatagory(i);

                    RawItems un = (RawItems) createCriteria.uniqueResult();

                    un.setRowItemCatagory(rowItemCatagory);
                    un.setItemName(txtItemName.getText());
                    un.setRawItemsUnitPrice(Double.parseDouble(txtUnitPrice.getText()));
                    un.setRawItemsSellingPrice(Double.parseDouble(txtSellPrice.getText()));
                    un.setDescription(txtDescription.getText());

                    openSession.update(un);

                    Criteria createCriteria1 = openSession.createCriteria(RowItemExpireDate.class);
                    createCriteria1.createAlias("rawItems", "r");
                    createCriteria1.add(Restrictions.eq("r.idRawItems", iditem));

                    RowItemExpireDate un1 = (RowItemExpireDate) createCriteria1.uniqueResult();

                    un1.setBatchNo(txtItemBatchNo.getText());
                    un1.setManufactureDate(dateManufacture.getText());
                    un1.setExpireDate(dateExpire.getText());

                    openSession.update(un1);

                    beginTransaction.commit();
                    openSession.close();
                    NotificationPopup.save();
                    ClearFeilds();

                    this.dispose();

                    ViewItemUdaya viewItemUdaya = new ViewItemUdaya();
                    viewItemUdaya.setVisible(true);
                    
                } else {
                    NotificationPopup.fillFeilds();
                }
            } else {
                NotificationPopup.fillFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboCatogoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCatogoryPopupMenuWillBecomeInvisible
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(RowItemCatagory.class);
            cr.add(Restrictions.eq("catagoryName", comboCatogory.getSelectedItem().toString()));

            RowItemCatagory uniqueResult = (RowItemCatagory) cr.uniqueResult();

            if (uniqueResult != null) {

                catagoryid = uniqueResult.getIdRowItemCatagory();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_comboCatogoryPopupMenuWillBecomeInvisible

    private void txtItemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemNameFocusLost

    }//GEN-LAST:event_txtItemNameFocusLost

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost

    }//GEN-LAST:event_txtDescriptionFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased


    }//GEN-LAST:event_txtItemNameKeyReleased

    private void txtItemBatchNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemBatchNoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemBatchNoFocusLost

    private void txtItemBatchNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemBatchNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemBatchNoKeyReleased

    private void dateExpireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateExpireMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateExpireMouseClicked

    private void dateManufactureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateManufactureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateManufactureMouseClicked

    private void txtUnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnitPriceKeyTyped

    private void txtSellPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtSellPriceKeyTyped

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFoodItemsUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetItem;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboCatogory;
    private com.alee.extended.date.WebDateField dateExpire;
    private com.alee.extended.date.WebDateField dateManufacture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtItemBatchNo;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtSellPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void LoadCombo() {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RowItemCatagory.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<RowItemCatagory> list = createCriteria.list();

            for (RowItemCatagory catogory : list) {

                comboCatogory.addItem(catogory.getIdRowItemCatagory() + " - " + catogory.getCatagoryName());
//                cat.put(catogory.getCatagoryCode(), catogory.getIdRowItemCatagory());

            }

        } catch (Exception e) {

            //e.printStackTrace();
        }
    }

    private void loadDetails() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawItems.class);
            createCriteria.add(Restrictions.eq("idRawItems", iditem));

            RawItems un = (RawItems) createCriteria.uniqueResult();
            Iterator iterator = un.getRowItemExpireDates().iterator();
            if (un != null) {
                comboCatogory.setSelectedItem(un.getRowItemCatagory().getIdRowItemCatagory() + " - " + un.getRowItemCatagory().getCatagoryName());
                txtItemName.setText(un.getItemName());
                txtItemCode.setText(un.getRawItemsCode());
                Double uprice = un.getRawItemsUnitPrice();
                txtUnitPrice.setText("" + uprice);
                Double sprice = un.getRawItemsSellingPrice();
                txtSellPrice.setText("" + sprice);
                txtDescription.setText(un.getDescription());

                while (iterator.hasNext()) {
                    RowItemExpireDate next = (RowItemExpireDate) iterator.next();
                    txtItemBatchNo.setText(next.getBatchNo());
                    dateManufacture.setText(next.getManufactureDate());
                    dateExpire.setText(next.getExpireDate());
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void ClearFeilds() {

        comboCatogory.setSelectedIndex(0);
        txtItemBatchNo.setText(null);
        txtDescription.setText(null);
        txtItemCode.setText(null);
        txtItemName.setText(null);
        txtSellPrice.setText(null);
        txtUnitPrice.setText(null);
        txtDescription.setText(null);
        dateManufacture.setText(null);
        dateExpire.setText(null);

    }

}
