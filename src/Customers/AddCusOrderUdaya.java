/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.LoginFrame;
import ORM.CashBook;
import ORM.Customer;
import ORM.Orders;
import ORM.OrderItems;
import ORM.OrderStatus;
import ORM.RawItemStock;
import ORM.RawItems;
import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author udaya
 */
public class AddCusOrderUdaya extends javax.swing.JFrame {

    Integer itemId = null;
    Integer getCusId = null;
    String isRow;
    Map<String, Integer> cust = new HashMap();
    Map<String, Integer> item = new HashMap();

    public AddCusOrderUdaya() {
        initComponents();
        ComboToTXT2();
        ComboToTXT();
        tableAlign();
        //loadCustomer();
        //loadItem();
        setOrderNo();
        webOrderDate.setText(dateForm.currentdate());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOrderNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        webOrderDate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        webDeliverDate = new com.alee.extended.date.WebDateField();
        txtAdvance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        comboCus = new javax.swing.JComboBox<>();
        comboIyem = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Customer Orders");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Customer");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Order No");

        txtOrderNo.setEditable(false);
        txtOrderNo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("ItemName");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Unit Price");

        txtUnitPrice.setEditable(false);
        txtUnitPrice.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Qty");

        txtQty.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        tableOrder.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Customer", "Item Id", "Item Name", "Unit Price", "QTY", "IsStock"
            }
        ));
        jScrollPane1.setViewportView(tableOrder);
        if (tableOrder.getColumnModel().getColumnCount() > 0) {
            tableOrder.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableOrder.getColumnModel().getColumn(1).setMinWidth(300);
            tableOrder.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableOrder.getColumnModel().getColumn(1).setMaxWidth(300);
            tableOrder.getColumnModel().getColumn(2).setMinWidth(0);
            tableOrder.getColumnModel().getColumn(2).setPreferredWidth(0);
            tableOrder.getColumnModel().getColumn(2).setMaxWidth(0);
            tableOrder.getColumnModel().getColumn(3).setMinWidth(300);
            tableOrder.getColumnModel().getColumn(3).setPreferredWidth(300);
            tableOrder.getColumnModel().getColumn(3).setMaxWidth(300);
            tableOrder.getColumnModel().getColumn(6).setMinWidth(0);
            tableOrder.getColumnModel().getColumn(6).setPreferredWidth(0);
            tableOrder.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        webOrderDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webOrderDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webOrderDateMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Order Date");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Delivery Date");

        webDeliverDate.setBorder(null);
        webDeliverDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDeliverDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webDeliverDateMouseClicked(evt);
            }
        });

        txtAdvance.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtAdvance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Advance");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Total");

        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("0.00");

        comboCus.setEditable(true);
        comboCus.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        comboIyem.setEditable(true);
        comboIyem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboIyem.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboIyemPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setText("Remove Selected");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton3.setText("Remove All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(comboCus, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboIyem, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(txtUnitPrice)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(webOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(webDeliverDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(comboIyem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(webOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(webDeliverDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtTotal)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void webOrderDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webOrderDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webOrderDateMouseClicked

    private void webDeliverDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDeliverDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webDeliverDateMouseClicked

    private void comboIyemPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboIyemPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_comboIyemPopupMenuWillBecomeInvisible

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased

    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtQtyKeyTyped

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed

        if (evt.getKeyCode() == 10) {

            try {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(RawItemStock.class);
                createCriteria.createAlias("rawItems", "ri");
                createCriteria.add(Restrictions.eq("ri.idRawItems", itemId));

                RawItemStock uniqueResult = (RawItemStock) createCriteria.uniqueResult();

                if (uniqueResult != null) {
                    Double d1 = uniqueResult.getQty();
                    Double d2 = Double.parseDouble(txtQty.getText());

                    if (d1 < d2) {
                        JOptionPane.showMessageDialog(null, "");
                    } else {

                        if (!txtQty.getText().isEmpty()) {
                            DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
                            int x = tableOrder.getRowCount();

                            String[] getCustomer = comboCus.getSelectedItem().toString().split(" - ");
                            getCusId = cust.get(comboCus.getSelectedItem().toString().split(" - ")[1]);
                            //System.out.println(getCusId);
                            String getCusName = getCustomer[0];

                            String[] getItem = comboIyem.getSelectedItem().toString().split(" - ");
                            //itemId = Integer.parseInt(getItem[0]);
                            String itemName = getItem[0];

                            if (x == 0) {
                                dtm.addRow(new Object[]{txtOrderNo.getText(), getCusName, itemId, itemName, txtUnitPrice.getText(), txtQty.getText()});
                            } else {
                                dtm.addRow(new Object[]{"", "", itemId, itemName, txtUnitPrice.getText(), txtQty.getText()});

                            }
                            setTotal();
                            comboIyem.removeAllItems();
                            txtUnitPrice.setText(null);
                            txtQty.setText(null);
                            comboIyem.grabFocus();
                        } else {
                            NotificationPopup.fillFeilds();
                        }

                    }

                } else {

                    if (!txtQty.getText().isEmpty()) {
                        DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
                        int x = tableOrder.getRowCount();

                        String[] getCustomer = comboCus.getSelectedItem().toString().split(" - ");
                        getCusId = cust.get(comboCus.getSelectedItem().toString().split(" - ")[1]);
                        //System.out.println(getCusId);
                        String getCusName = getCustomer[0];

                        String[] getItem = comboIyem.getSelectedItem().toString().split(" - ");
                        //itemId = Integer.parseInt(getItem[0]);
                        String itemName = getItem[0];

                        if (x == 0) {
                            dtm.addRow(new Object[]{txtOrderNo.getText(), getCusName, itemId, itemName, txtUnitPrice.getText(), txtQty.getText()});
                        } else {
                            dtm.addRow(new Object[]{"", "", itemId, itemName, txtUnitPrice.getText(), txtQty.getText()});

                        }
                        setTotal();
                        comboIyem.removeAllItems();
                        txtUnitPrice.setText(null);
                        txtQty.setText(null);
                        comboIyem.grabFocus();
                    } else {
                        NotificationPopup.fillFeilds();
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

     }//GEN-LAST:event_txtQtyKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
        dtm.setRowCount(0);
        txtTotal.setText("0.00");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tableOrder.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
        dtm.removeRow(selectedRow);
        setTotal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (webDeliverDate.getDate() == null) {
                NotificationPopup.fillFeilds();
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//                String getOrDate = sdf.format(webOrderDate.getText());
//                String getDelDate = sdf.format(webDeliverDate.getText());

                DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Customer customer = new Customer();
                customer.setIdCustomer(cust.get(comboCus.getSelectedItem().toString().split(" - ")[1]));

                Orders orders = new Orders();
                orders.setOrderDate(webOrderDate.getText().toString());
                orders.setDeliveryDate(webDeliverDate.getText().toString());
                orders.setOrderNo(txtOrderNo.getText());
                orders.setOrderTotal(Double.parseDouble(txtTotal.getText()));
                orders.setIsDelete("Active");

                if (!txtAdvance.getText().isEmpty()) {
                    orders.setAdvance(Double.parseDouble(txtAdvance.getText()));
                }
                orders.setCustomer(customer);

                OrderStatus orderStatus = new OrderStatus();
                orderStatus.setOrders(orders);
                orderStatus.setStatus("Pending");
                orderStatus.setIsDelete("Active");

                openSession.save(orders);
                openSession.save(orderStatus);

                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Double qty = Double.parseDouble(dtm.getValueAt(i, 5).toString());
                    Double uprice = Double.parseDouble(dtm.getValueAt(i, 4).toString());
                    Double getNet = uprice * qty;
                    int getiditems = Integer.parseInt(dtm.getValueAt(i, 2).toString());

                    RawItems rawItems = new RawItems();
                    rawItems.setIdRawItems(getiditems);

                    OrderItems orderItems = new OrderItems();

                    orderItems.setQty(qty);
                    orderItems.setUnitPrice(uprice);
                    orderItems.setNetTotalOrdersItem(getNet);
                    orderItems.setIsDelete("Active");
                    orderItems.setOrders(orders);
                    orderItems.setRawItems(rawItems);

                    openSession.save(orderItems);

                }

                if (!txtAdvance.getText().isEmpty()) {

                    CashBook cashBook = new CashBook();
                    cashBook.setCreatedBy(LoginFrame.user);
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Food order advance" + txtOrderNo.getText());
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(Double.parseDouble(Decimal_Formats.Price(Double.parseDouble(txtAdvance.getText()))));

                    openSession.save(cashBook);
                }

                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();
                ClearTxt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnitPriceKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCusOrderUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCus;
    private javax.swing.JComboBox<String> comboIyem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtOrderNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtUnitPrice;
    public static com.alee.extended.date.WebDateField webDeliverDate;
    public static com.alee.extended.date.WebDateField webOrderDate;
    // End of variables declaration//GEN-END:variables

    private void loadCustomer() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Customer.class);
            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<Customer> list = createCriteria.list();

            for (Customer customer : list) {

                comboCus.addItem(customer.getIdCustomer() + " - " + customer.getName());

            }
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadItem() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawItems.class);
            createCriteria.add(Restrictions.like("isRow", "NO"));
            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<RawItems> list = createCriteria.list();

            for (RawItems ri : list) {

                comboIyem.addItem(ri.getIdRawItems() + " - " + ri.getItemName());

            }
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setOrderNo() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Orders.class);
            createCriteria.setProjection(Projections.rowCount());
            List list = createCriteria.list();
            String OrderNo = Decimal_Formats.InvNo(Integer.parseInt(list.get(0).toString()) + 1);
            txtOrderNo.setText(OrderNo);

            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setTotal() {
        Double sum = 0.00;
        for (int i = 0; i < tableOrder.getRowCount(); i++) {
            double getuprice = Double.parseDouble((String) tableOrder.getValueAt(i, 4));
            double getqty = Double.parseDouble((String) tableOrder.getValueAt(i, 5));
            double getsum = getuprice * getqty;
            sum = getsum + sum;
            txtTotal.setText(Decimal_Formats.Price(sum));
        }
    }

    private void ClearTxt() {
        comboCus.setSelectedItem("");
        comboIyem.setSelectedItem("");
        txtOrderNo.setText(null);
        txtUnitPrice.setText(null);
        txtQty.setText(null);
        txtTotal.setText("0.00");
        txtAdvance.setText(null);
        webDeliverDate.setDate(null);
        webOrderDate.setText(dateForm.currentdate());
        setOrderNo();
        DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
        dtm.setRowCount(0);
    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tableOrder.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tableOrder.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

    }

    public void comboFilter(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawItems.class);
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
            createCriteria.add(Restrictions.like("isRow", "NO"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<RawItems> list = createCriteria.list();
            comboIyem.removeAllItems();
            for (RawItems item : list) {

                str1 = item.getItemName() + " - " + item.getRawItemsCode();
                filterArray.add(str1);

                this.item.put(item.getRawItemsCode(), item.getIdRawItems());

                //itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());
            }
            openSession.close();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboIyem.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboIyem.setSelectedItem(enteredText);
            comboIyem.showPopup();
        } else {
            comboIyem.hidePopup();
        }
    }

    private void ComboToTXT() {
        final JTextField textfield = (JTextField) comboIyem.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                             try {
                                //String[] s = comboIyem.getSelectedItem().toString().split(" - ");
                                
                                Session openSession = PoolManager.getSessionFactory().openSession();
                                Criteria createCriteria = openSession.createCriteria(RawItems.class);
                                createCriteria.add(Restrictions.eq("idRawItems", item.get(comboIyem.getSelectedItem().toString().split(" - ")[1])));
                                createCriteria.add(Restrictions.eq("isDelete", "Active"));

                                List<RawItems> list = createCriteria.list();

                                for (RawItems ri : list) {
                                    Double d = ri.getRawItemsSellingPrice();
                                    txtUnitPrice.setText(Decimal_Formats.Price(d));
                                    itemId = ri.getIdRawItems();
                                }
                                txtQty.grabFocus();
                                openSession.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            if (enteredText.matches("\\d+")) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("contact1", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {
                        str1 = customers.getName() + " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());
                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("name", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {

                        str1 = customers.getName() + " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboCus.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboCus.setSelectedItem(enteredText);
            comboCus.showPopup();
        } else {
            comboCus.hidePopup();
        }
    }

    private void ComboToTXT2() {
        final JTextField textfield0 = (JTextField) comboCus.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                           

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield0.getText());

                        }

                    }
                });

            }
        });
    }

}