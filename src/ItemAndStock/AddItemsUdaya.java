package ItemAndStock;

import ORM.RawItems;
import ORM.RowItemCatagory;
import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import ORM.FoodItemInfo;
import ORM.Jobroals;
import ORM.RawItemInfo;
import ORM.RawItemStock;
import ORM.RawItems;
import ORM.RawItemsHasJobroals;
import ORM.RawStockOutgoing;
import ORM.RowItemExpireDate;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
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
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class AddItemsUdaya extends javax.swing.JFrame {

    boolean FLAG_TXT_VALIDATE = false;
    Map<String, Integer> cat = new HashMap();
    Map<String, Integer> job = new HashMap();

    public AddItemsUdaya() {
        initComponents();
        LoadCombo();
        loadJob();
        txtChange1.setEnabled(false);
        comboJob.setEnabled(false);
        txtCommition.setEnabled(false);
        txtChange2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        checkFood = new javax.swing.JCheckBox();
        checkRow = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        checkStock = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtSellPrice = new javax.swing.JTextField();
        txtItemCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        txtChange = new javax.swing.JLabel();
        txtChangeText = new javax.swing.JTextField();
        txtChange1 = new javax.swing.JLabel();
        comboJob = new javax.swing.JComboBox<>();
        txtChange2 = new javax.swing.JLabel();
        txtCommition = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Items\n");

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
        btnSave.setText("Save Item");
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

        buttonGroup1.add(checkFood);
        checkFood.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        checkFood.setText("Food Item");
        checkFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkFoodMouseClicked(evt);
            }
        });

        buttonGroup1.add(checkRow);
        checkRow.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        checkRow.setSelected(true);
        checkRow.setText("Row Item");
        checkRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRowMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Unit Price");

        txtUnitPrice.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtUnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyTyped(evt);
            }
        });

        checkStock.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        checkStock.setText("Add Stock");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Selling Price");

        txtSellPrice.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSellPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSellPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSellPriceKeyTyped(evt);
            }
        });

        txtItemCode.setEditable(false);
        txtItemCode.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemCodeKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Item Code");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel10.setText("Messure");

        comboMes.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litter", "Kg", "Pcs" }));

        txtChange.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtChange.setText("Min QTY");

        txtChangeText.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtChangeText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtChangeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChangeTextKeyTyped(evt);
            }
        });

        txtChange1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtChange1.setText("Job Role");

        comboJob.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        txtChange2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtChange2.setText("Commission per item");

        txtCommition.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtCommition.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(comboCatogory, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtItemBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(dateManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(dateExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkRow)
                            .addComponent(checkStock))
                        .addGap(27, 27, 27)
                        .addComponent(checkFood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChange)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChange1)
                            .addComponent(comboJob, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtChange2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnResetItem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCommition, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCatogory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtChange)
                        .addGap(6, 6, 6)
                        .addComponent(txtChangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkRow)
                                .addGap(18, 18, 18)
                                .addComponent(checkStock))
                            .addComponent(checkFood))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtChange1)
                        .addGap(6, 6, 6)
                        .addComponent(comboJob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtChange2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCommition, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResetItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetItemActionPerformed
        ClearFeilds();
    }//GEN-LAST:event_btnResetItemActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cc = sess.createCriteria(RawItems.class);

            Criterion contact = Restrictions.like("itemName", txtItemName.getText().toUpperCase());
            Criterion active = Restrictions.like("isDelete", "Active");
            LogicalExpression andExp = Restrictions.and(contact, active);
            cc.add(andExp);

            RawItems uniqueResult = (RawItems) cc.uniqueResult();

            if (uniqueResult != null) {

                NotificationPopup.already();
                //txtItemName.setText(null);
                txtItemName.grabFocus();
                sess.close();
            } else {

                String code = txtItemCode.getText();

                Session s = PoolManager.getSessionFactory().openSession();
                Criteria cc1 = s.createCriteria(RawItems.class);
//            cc.add(Restrictions.eq("catagoryCode", code));

                Criterion contact1 = Restrictions.like("rawItemsCode", code);
                Criterion active1 = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp1 = Restrictions.and(contact1, active1);
                cc1.add(andExp1);

                RawItems uniqueResult1 = (RawItems) cc1.uniqueResult();

                if (uniqueResult1 != null) {

                    NotificationPopup.already();
                    txtItemCode.setText(null);
                    txtItemCode.grabFocus();

                } else {

                    validateTXT();
                    if (FLAG_TXT_VALIDATE == false) {

//                        String PreFix = comboCatogory.getSelectedItem().toString().split(" - ")[0];
//                        int i = Integer.parseInt(PreFix);                       
                        Session openSession = PoolManager.getSessionFactory().openSession();
                        Transaction beginTransaction = openSession.beginTransaction();

                        RowItemCatagory catogory = new RowItemCatagory();
                        catogory.setIdRowItemCatagory(cat.get(comboCatogory.getSelectedItem().toString().split(" - ")[0]));

                        RawItems item = new RawItems();

                        item.setRowItemCatagory(catogory);
                        item.setItemName(txtItemName.getText());
                        item.setRawItemsCode(txtItemCode.getText());

                        try {
                            item.setRawItemsUnitPrice(Double.parseDouble(txtUnitPrice.getText()));

                        } catch (Exception e) {
                        }

                        item.setRawItemsSellingPrice(Double.parseDouble(txtSellPrice.getText()));

                        if (checkStock.isSelected()) {
                            item.setIsStock("YES");
                        } else {

                            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Don't you want add stock this item?",
                                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (showConfirmDialog == 0) {
                                item.setIsStock("NO");
                            } else {

                                item.setIsStock("YES");
                                checkStock.setSelected(true);

                            }

                        }

                        item.setDescription(txtDescription.getText());
                        item.setMeasureUnit(comboMes.getSelectedItem().toString());
                        item.setIsDelete("Active");

                        if (checkRow.isSelected()) {

                            item.setIsRow("YES");

                        } else if (checkFood.isSelected()) {

                            item.setIsRow("NO");

                        }

                        openSession.save(item);

                        if (checkRow.isSelected()) {

                            item.setIsRow("YES");
                            RawItemInfo rawItemInfo = new RawItemInfo();

                            rawItemInfo.setMinQty(txtChangeText.getText());
                            rawItemInfo.setRawItems(item);

                            openSession.save(rawItemInfo);

                        } else if (checkFood.isSelected()) {

                            item.setIsRow("NO");
                            FoodItemInfo foodItemInfo = new FoodItemInfo();

                            foodItemInfo.setFoodItemCode(txtChangeText.getText());
                            foodItemInfo.setRawItems(item);

                            openSession.save(foodItemInfo);

                            Jobroals jobroals = new Jobroals();
                            jobroals.setIdJobroals(job.get(comboJob.getSelectedItem().toString().split(" - ")[0]));

                            RawItemsHasJobroals rj = new RawItemsHasJobroals();
                            rj.setRawItems(item);
                            rj.setJobroals(jobroals);
                            rj.setCommisonPerItem(Double.parseDouble(txtCommition.getText()));
                            rj.setIsDelete("Active");
                            openSession.save(rj);

                        }

                        RowItemExpireDate ItemExpire = new RowItemExpireDate();
                        ItemExpire.setRawItems(item);
                        ItemExpire.setManufactureDate(dateManufacture.getText());
                        ItemExpire.setExpireDate(dateExpire.getText());
                        ItemExpire.setBatchNo(txtItemBatchNo.getText());
                        ItemExpire.setIsDelete("Active");
                        openSession.save(ItemExpire);

                        if (checkStock.isSelected()) {
                            RawItemStock rawItemStock = new RawItemStock();
                            rawItemStock.setRawItems(item);
                            rawItemStock.setQty(0.0);
                            rawItemStock.setUnit(comboMes.getSelectedItem().toString());
                            rawItemStock.setIsDelete("Active");
                            openSession.save(rawItemStock);

                            RawStockOutgoing rawStockOutgoing = new RawStockOutgoing();
                            rawStockOutgoing.setRawItems(item);
                            rawStockOutgoing.setQty(0.0);
                            rawStockOutgoing.setUnit(comboMes.getSelectedItem().toString());
                            rawStockOutgoing.setIsDelete("Active");
                            openSession.save(rawStockOutgoing);

                        }

                        beginTransaction.commit();
                        openSession.close();

                        NotificationPopup.save();
                        ClearFeilds();
                    } else {
                        NotificationPopup.fillFeilds();
                    }

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboCatogoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCatogoryPopupMenuWillBecomeInvisible

        if (!comboCatogory.getSelectedItem().toString().equals("Select")) {

            String PreFix = comboCatogory.getSelectedItem().toString().split(" - ")[0];

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(RawItems.class);
                createCriteria.createAlias("rowItemCatagory", "c");
                createCriteria.add(Restrictions.eq("c.idRowItemCatagory", cat.get(PreFix)));
                createCriteria.setProjection(Projections.rowCount());
                List list = createCriteria.list();

                String Item_Code = Decimal_Formats.Item_Code(Integer.parseInt(list.get(0).toString()) + 1);

                txtItemCode.setText(PreFix + "-" + Item_Code);

                txtItemName.grabFocus();

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_comboCatogoryPopupMenuWillBecomeInvisible

    private void txtItemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemNameFocusLost

    }//GEN-LAST:event_txtItemNameFocusLost

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost

    }//GEN-LAST:event_txtDescriptionFocusLost

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased

    }//GEN-LAST:event_txtItemNameKeyReleased

    private void dateManufactureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateManufactureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateManufactureMouseClicked

    private void dateExpireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateExpireMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateExpireMouseClicked

    private void txtItemBatchNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemBatchNoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemBatchNoFocusLost

    private void txtItemBatchNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemBatchNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemBatchNoKeyReleased

    private void txtItemCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemCodeKeyReleased

    }//GEN-LAST:event_txtItemCodeKeyReleased

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

    private void txtChangeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChangeTextKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeTextKeyTyped

    private void checkRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRowMouseClicked

        txtChange.setText("Min Qty");
        txtChange1.setEnabled(false);
        comboJob.setEnabled(false);
        txtCommition.setEnabled(false);
        txtChange2.setEnabled(false);

    }//GEN-LAST:event_checkRowMouseClicked

    private void checkFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkFoodMouseClicked
        txtChange.setText("Menu Code");
        txtChange1.setEnabled(true);
        comboJob.setEnabled(true);
        txtCommition.setEnabled(true);
        txtChange2.setEnabled(true);

        String catcode = comboCatogory.getSelectedItem().toString().split(" - ")[0];
        Map<String, ArrayList> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        al.clear();
        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = sess.createCriteria(RowItemCatagory.class);
            createCriteria.add(Restrictions.eq("catagoryCode", catcode));
            List<RowItemCatagory> list = createCriteria.list();
            for (RowItemCatagory ri : list) {

                Iterator<RawItems> iterator = ri.getRawItemses().iterator();
                while (iterator.hasNext()) {
                    RawItems next = iterator.next();

                    Iterator<FoodItemInfo> food = next.getFoodItemInfos().iterator();
                    while (food.hasNext()) {
                        FoodItemInfo nxt = food.next();

                        al.add(Integer.parseInt(nxt.getFoodItemCode()));

                    }

                }

            }

            if (al.size() == 0) {

                List<Integer> code = new ArrayList<>();
                code.clear();
                Criteria cc = sess.createCriteria(FoodItemInfo.class);
                List<FoodItemInfo> li = cc.list();
                for (FoodItemInfo ff : li) {
                    
                    al.add(Integer.parseInt(ff.getFoodItemCode()));
                    
                }
                
                if (code.size()==0) {
                    
                    txtChangeText.setText("1");
                    
                }else{
                Collections.sort(code);
                
                    Integer get = code.get(code.size()-1);
                    int name = get+5;
                    txtChangeText.setText(""+name);
                }
                
                
            } else {

                Collections.sort(al);
                
                int gencode = al.get(al.size()-1);
                gencode++;
                
                Criteria cc = sess.createCriteria(FoodItemInfo.class);
                cc.add(Restrictions.eq("foodItemCode", gencode+""));
                FoodItemInfo uniqueResult = (FoodItemInfo) cc.uniqueResult();
                if (uniqueResult == null) {
                    
                    txtChangeText.setText(""+gencode);
                    
                }else {
                
                    JOptionPane.showMessageDialog(null, "System generated food code already used for other item. You have to set it mannualy");
                
                }
                
            }

            sess.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_checkFoodMouseClicked

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemsUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetItem;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkFood;
    private javax.swing.JCheckBox checkRow;
    private javax.swing.JCheckBox checkStock;
    private javax.swing.JComboBox<String> comboCatogory;
    private javax.swing.JComboBox<String> comboJob;
    private javax.swing.JComboBox<String> comboMes;
    private com.alee.extended.date.WebDateField dateExpire;
    private com.alee.extended.date.WebDateField dateManufacture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtChange;
    private javax.swing.JLabel txtChange1;
    private javax.swing.JLabel txtChange2;
    private javax.swing.JTextField txtChangeText;
    private javax.swing.JTextField txtCommition;
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

                comboCatogory.addItem(catogory.getCatagoryCode() + " - " + catogory.getCatagoryName());
                cat.put(catogory.getCatagoryCode(), catogory.getIdRowItemCatagory());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void ClearFeilds() {

        comboCatogory.setSelectedIndex(0);
        comboMes.setSelectedIndex(0);
        txtItemBatchNo.setText(null);
        txtDescription.setText(null);
        txtItemCode.setText(null);
        txtItemName.setText(null);
        txtSellPrice.setText(null);
        txtUnitPrice.setText(null);
        txtDescription.setText(null);
        dateManufacture.setText(null);
        txtChangeText.setText(null);
        dateExpire.setText(null);
        checkStock.setSelected(false);
        checkRow.setSelected(true);
        txtChange.setText("Min Qty");
        txtChange1.setEnabled(false);
        comboJob.setEnabled(false);
        txtCommition.setEnabled(false);
        txtChange2.setEnabled(false);
        txtCommition.setText(null);
        comboJob.setSelectedIndex(0);

    }

    private void validateTXT() {

        if (comboCatogory.getSelectedIndex() == 0) {
            FLAG_TXT_VALIDATE = true;
        } else {
            FLAG_TXT_VALIDATE = false;

        }
    }

    private void loadJob() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Jobroals.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Jobroals> list = createCriteria.list();

            for (Jobroals jr : list) {

                comboJob.addItem(jr.getJobcode() + " - " + jr.getRoleName());
                job.put(jr.getJobcode(), jr.getIdJobroals());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
