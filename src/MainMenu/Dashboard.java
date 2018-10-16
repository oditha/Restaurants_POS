/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

//import com.alee.laf.WebLookAndFeel;
import ClassPack.DBbackup;
import Customers.AddCusInvoicePaymentsUdaya;
import Customers.AddCusOrderUdaya;
import Customers.AddCustomersUdaya;
import Customers.BillOrdersUdaya;
import Customers.OrderDueRemideUdaya;
import Customers.ViewCusOrderUdaya;
import Customers.ViewSupplierOutstrandingODK;
import Customers.ViewCustomersUdaya;
import Customers.ViewDeletedCustomersODK;
import Employees.AddTable;
import Employees.EmployeeAllowance;
import Employees.EmployeePayment;
import Employees.JobRoles;
import Employees.RegisterAttendence;
import Employees.SalaryReport;
import Employees.SecuirityQuestions;
import Employees.StaffLeaveManagement;
import Employees.TemporaryJobRoles;
import Employees.ViewAttendenceReport;
import Employees.registerEmployee;
import InvoiceAndGRN.AddGRNODK;
import InvoiceAndGRN.AddPromotionUdaya;
import InvoiceAndGRN.BestSellingItem;
import InvoiceAndGRN.DaillySalesSummeryUdaya;
import InvoiceAndGRN.InvoiceCancelF;
import InvoiceAndGRN.InvoiceReturnCustomer;
import InvoiceAndGRN.ViewCancelInvoice;
import InvoiceAndGRN.ViewCustomerReturn;
import InvoiceAndGRN.ViewDeletedInvoiceUdaya;
import InvoiceAndGRN.ViewGRNExces;

import InvoiceAndGRN.ViewGRNODK;
import InvoiceAndGRN.ViewInvCommUdaya;
import InvoiceAndGRN.ViewInvoiceODK;
import InvoiceAndGRN.withoutBTN.ViewInvoicePaymentODK;
import InvoiceAndGRN.ViewKOTUdaya;
import InvoiceAndGRN.ViewPromotionUdaya;
import InvoiceAndGRN.newInvoiceArsh;
import ItemAndStock.AddCatagoryUdaya;
import ItemAndStock.AddFoodCodeUdaya;
import ItemAndStock.AddItemsUdaya;
import ItemAndStock.AddJobRolesUdaya;
import ItemAndStock.AddRawMinUdaya;
import ItemAndStock.UpdateStockUdaya;
import ItemAndStock.ViewExpireReminderODK;
import ItemAndStock.ViewFoodItemsUdaya;
import ItemAndStock.ViewItemUdaya;
import ItemAndStock.ViewStockODk;
import ItemAndStock.ViewStockRefillReminderODK;
import ItemAndStock.ViewUpdateStockUdaya;
import static MainMenu.LoginFrame.UType;
import ORM.CashBook;
import Suppliers.AddGrnPaymentsUdaya;
import Suppliers.AddSupplierUdaya;
import Suppliers.GrnReturnUdaya;
import Suppliers.ViewDeletedSupp;
import Suppliers.ViewGrnPaymentUdaya;
import Suppliers.ViewReturnGRNUdaya;
import Suppliers.ViewSuppUdaya;
import java.awt.Color;
import java.awt.Window;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();

        getContentPane().setBackground(Color.WHITE);
        //  System.out.println();
        Privilage();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        viewInvoiceGroup = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem54 = new javax.swing.JMenuItem();
        viewreturn = new javax.swing.JMenuItem();
        summeryGroup = new javax.swing.JMenu();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        PromotionGroup = new javax.swing.JMenu();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        viewStock = new javax.swing.JMenuItem();
        viewFood = new javax.swing.JMenuItem();
        updatestock = new javax.swing.JMenu();
        addRecord = new javax.swing.JMenuItem();
        viewRecord = new javax.swing.JMenuItem();
        reminder = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        bulk = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        cusAddPayment = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cheysta789.png"))); // NOI18N

        jMenuBar2.setForeground(java.awt.Color.black);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/invoice.png"))); // NOI18N
        jMenu7.setText("Invoice");
        jMenu7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu7.setPreferredSize(new java.awt.Dimension(140, 40));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });

        jMenuItem7.setText("Add Invoice");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(91, 40));
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseClicked(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem10.setText("Cancel Invoice");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(91, 40));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenu12.setText("Orders");
        jMenu12.setPreferredSize(new java.awt.Dimension(135, 40));

        jMenuItem25.setText("Add Order");
        jMenuItem25.setPreferredSize(new java.awt.Dimension(110, 40));
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem25);

        jMenuItem26.setText("View Order");
        jMenuItem26.setPreferredSize(new java.awt.Dimension(73, 40));
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem26);

        jMenuItem50.setText("Bill Orders");
        jMenuItem50.setPreferredSize(new java.awt.Dimension(97, 40));
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem50);

        jMenuItem51.setText("Due Reminder");
        jMenuItem51.setPreferredSize(new java.awt.Dimension(119, 40));
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem51);

        jMenu7.add(jMenu12);

        viewInvoiceGroup.setText("View");
        viewInvoiceGroup.setPreferredSize(new java.awt.Dimension(73, 40));

        jMenuItem4.setText("View Invoice");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(91, 40));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        viewInvoiceGroup.add(jMenuItem4);

        jMenuItem37.setText("View KOT");
        jMenuItem37.setPreferredSize(new java.awt.Dimension(217, 40));
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        viewInvoiceGroup.add(jMenuItem37);

        jMenuItem52.setText("View Invoice Commisons");
        jMenuItem52.setPreferredSize(new java.awt.Dimension(177, 40));
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        viewInvoiceGroup.add(jMenuItem52);

        jMenuItem53.setText("View Delete Invoice");
        jMenuItem53.setPreferredSize(new java.awt.Dimension(177, 40));
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        viewInvoiceGroup.add(jMenuItem53);

        jMenuItem20.setText("Cancelled Invoice");
        jMenuItem20.setPreferredSize(new java.awt.Dimension(109, 40));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        viewInvoiceGroup.add(jMenuItem20);

        jMenu7.add(viewInvoiceGroup);

        jMenu26.setText("Return");
        jMenu26.setPreferredSize(new java.awt.Dimension(83, 40));

        jMenuItem54.setText("Add Return");
        jMenuItem54.setPreferredSize(new java.awt.Dimension(173, 40));
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem54);

        viewreturn.setText("View Return");
        viewreturn.setPreferredSize(new java.awt.Dimension(173, 40));
        viewreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreturnActionPerformed(evt);
            }
        });
        jMenu26.add(viewreturn);

        jMenu7.add(jMenu26);

        summeryGroup.setText("Summary");
        summeryGroup.setPreferredSize(new java.awt.Dimension(99, 40));

        jMenuItem55.setText("Daily Sales Summary");
        jMenuItem55.setPreferredSize(new java.awt.Dimension(153, 40));
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        summeryGroup.add(jMenuItem55);

        jMenuItem56.setText("Best Selling Items");
        jMenuItem56.setPreferredSize(new java.awt.Dimension(153, 40));
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        summeryGroup.add(jMenuItem56);

        jMenu7.add(summeryGroup);

        PromotionGroup.setText("Promotion");
        PromotionGroup.setPreferredSize(new java.awt.Dimension(105, 40));

        jMenuItem57.setText("Add Promotion");
        jMenuItem57.setPreferredSize(new java.awt.Dimension(125, 40));
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        PromotionGroup.add(jMenuItem57);

        jMenuItem58.setText("View Promotion");
        jMenuItem58.setPreferredSize(new java.awt.Dimension(129, 40));
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        PromotionGroup.add(jMenuItem58);

        jMenu7.add(PromotionGroup);

        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stock.png"))); // NOI18N
        jMenu8.setText("Stock");
        jMenu8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(140, 75));

        jMenu23.setText("Manage");
        jMenu23.setPreferredSize(new java.awt.Dimension(91, 40));

        viewStock.setText("View Stock");
        viewStock.setPreferredSize(new java.awt.Dimension(161, 40));
        viewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockActionPerformed(evt);
            }
        });
        jMenu23.add(viewStock);

        viewFood.setText("View Food Items");
        viewFood.setPreferredSize(new java.awt.Dimension(135, 40));
        viewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFoodActionPerformed(evt);
            }
        });
        jMenu23.add(viewFood);

        jMenu8.add(jMenu23);

        updatestock.setText("Update Stock");
        updatestock.setPreferredSize(new java.awt.Dimension(161, 40));

        addRecord.setText("Add Record");
        addRecord.setPreferredSize(new java.awt.Dimension(100, 40));
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });
        updatestock.add(addRecord);

        viewRecord.setText("View Update Details");
        viewRecord.setPreferredSize(new java.awt.Dimension(150, 40));
        viewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordActionPerformed(evt);
            }
        });
        updatestock.add(viewRecord);

        jMenu8.add(updatestock);

        reminder.setText("Reminder");
        reminder.setPreferredSize(new java.awt.Dimension(99, 40));

        jMenuItem14.setText("Stock Refill Reminder");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(161, 40));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        reminder.add(jMenuItem14);

        jMenuItem15.setText("Expire Reminder");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(161, 40));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        reminder.add(jMenuItem15);

        jMenu8.add(reminder);

        bulk.setText("BULK");
        bulk.setPreferredSize(new java.awt.Dimension(77, 40));

        jMenuItem36.setText("Add Food Item Code");
        jMenuItem36.setPreferredSize(new java.awt.Dimension(153, 40));
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        bulk.add(jMenuItem36);

        jMenuItem41.setText("Add Raw Item Min QTY");
        jMenuItem41.setPreferredSize(new java.awt.Dimension(167, 40));
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        bulk.add(jMenuItem41);

        jMenuItem49.setText("Add Job Role");
        jMenuItem49.setPreferredSize(new java.awt.Dimension(113, 40));
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        bulk.add(jMenuItem49);

        jMenu8.add(bulk);

        jMenuBar2.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping-bag.png"))); // NOI18N
        jMenu9.setText("Item");
        jMenu9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(140, 75));

        jMenuItem16.setText("Add Item                          ");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem16);

        jMenuItem17.setText("View Item");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem17);

        jMenuItem18.setText("Add Category");
        jMenuItem18.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem18);

        jMenuBar2.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/approve.png"))); // NOI18N
        jMenu10.setText("GRN");
        jMenu10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu10.setMaximumSize(new java.awt.Dimension(150, 32767));
        jMenu10.setPreferredSize(new java.awt.Dimension(130, 75));

        jMenu21.setText("Manage");
        jMenu21.setPreferredSize(new java.awt.Dimension(91, 40));

        jMenuItem2.setText("Add GRN               ");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem2);

        jMenuItem3.setText("View GRN");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(65, 40));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem3);

        jMenu10.add(jMenu21);

        jMenu3.setText("GRN Return");
        jMenu3.setPreferredSize(new java.awt.Dimension(109, 40));

        jMenuItem5.setText("Add GRN Return");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(122, 40));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("View GRN Return");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(122, 40));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenu10.add(jMenu3);

        jMenu22.setText("Payment");
        jMenu22.setPreferredSize(new java.awt.Dimension(95, 40));

        jMenuItem46.setText("Add Payment");
        jMenuItem46.setPreferredSize(new java.awt.Dimension(115, 40));
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem46);

        jMenuItem47.setText("View Payment");
        jMenuItem47.setPreferredSize(new java.awt.Dimension(119, 40));
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem47);

        jMenuItem48.setText("View Exess Payment");
        jMenuItem48.setPreferredSize(new java.awt.Dimension(149, 40));
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem48);

        jMenu10.add(jMenu22);

        jMenuBar2.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/team.png"))); // NOI18N
        jMenu11.setText("Suppliers");
        jMenu11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu11.setPreferredSize(new java.awt.Dimension(160, 40));

        jMenu20.setText("Manage");
        jMenu20.setPreferredSize(new java.awt.Dimension(91, 40));

        jMenuItem1.setText("Add Suppliers");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(87, 40));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem1);

        jMenuItem19.setText("View Suppliers");
        jMenuItem19.setPreferredSize(new java.awt.Dimension(141, 40));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem19);

        jMenuItem40.setText("View Deleted Suppliers");
        jMenuItem40.setPreferredSize(new java.awt.Dimension(163, 40));
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem40);

        jMenu11.add(jMenu20);

        jMenuBar2.add(jMenu11);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/users.png"))); // NOI18N
        jMenu1.setText("Customer");
        jMenu1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(125, 32767));
        jMenu1.setPreferredSize(new java.awt.Dimension(175, 75));

        jMenuItem23.setText("Add Customer");
        jMenuItem23.setPreferredSize(new java.awt.Dimension(87, 40));
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem23);

        jMenuItem24.setText("View Customer");
        jMenuItem24.setPreferredSize(new java.awt.Dimension(200, 40));
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem24);

        cusAddPayment.setText("Add Payment");
        cusAddPayment.setPreferredSize(new java.awt.Dimension(200, 40));
        cusAddPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusAddPaymentActionPerformed(evt);
            }
        });
        jMenu1.add(cusAddPayment);

        jMenuBar2.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/meeting.png"))); // NOI18N
        jMenu2.setText("Employees");
        jMenu2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(144, 75));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem29.setText("Add Table");
        jMenuItem29.setPreferredSize(new java.awt.Dimension(97, 40));
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem29);

        jMenuItem43.setText("Cash Book");
        jMenuItem43.setPreferredSize(new java.awt.Dimension(99, 40));
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem43);

        jMenu18.setText("Manage Employee");
        jMenu18.setPreferredSize(new java.awt.Dimension(147, 40));

        jMenuItem32.setText("Add Employees");
        jMenuItem32.setPreferredSize(new java.awt.Dimension(125, 40));
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem32);

        jMenuItem34.setText("Add Users");
        jMenuItem34.setPreferredSize(new java.awt.Dimension(125, 40));
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem34);

        jMenuItem45.setText("Add Security Questions ");
        jMenuItem45.setPreferredSize(new java.awt.Dimension(169, 40));
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem45);

        jMenu2.add(jMenu18);

        jMenu19.setText("Job Roles");
        jMenu19.setPreferredSize(new java.awt.Dimension(147, 40));

        jMenuItem39.setText("Add Job Roles");
        jMenuItem39.setPreferredSize(new java.awt.Dimension(117, 40));
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem39);

        jMenuItem44.setText("TMP Job Roles");
        jMenuItem44.setPreferredSize(new java.awt.Dimension(119, 40));
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem44);

        jMenu2.add(jMenu19);

        jMenu13.setText("Salary");
        jMenu13.setPreferredSize(new java.awt.Dimension(147, 40));

        jMenuItem30.setText("Add Salary");
        jMenuItem30.setPreferredSize(new java.awt.Dimension(110, 40));
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem30);

        jMenuItem31.setText("View Salary");
        jMenuItem31.setPreferredSize(new java.awt.Dimension(110, 40));
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem31);

        jMenuItem21.setText("Employee Payment");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem21);

        jMenu2.add(jMenu13);

        jMenu15.setText("Attendence");
        jMenu15.setPreferredSize(new java.awt.Dimension(147, 40));

        jMenuItem33.setText("Add Attendence");
        jMenuItem33.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem33);

        jMenuItem35.setText("View Attendence");
        jMenuItem35.setPreferredSize(new java.awt.Dimension(133, 40));
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem35);

        jMenuItem9.setText("Staff Leave Management");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(175, 40));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem9);

        jMenu2.add(jMenu15);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addComponent(jLabel1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AddGRNODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new ViewGRNODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new newInvoiceArsh().setVisible(true);


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseClicked

    }//GEN-LAST:event_jMenuItem7MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked

    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        new ViewInvoiceODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        new AddCusOrderUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        new ViewCusOrderUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void viewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStockActionPerformed
        new ViewStockODk().setVisible(true);
    }//GEN-LAST:event_viewStockActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        new UpdateStockUdaya().setVisible(true);
    }//GEN-LAST:event_addRecordActionPerformed

    private void viewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordActionPerformed
        new ViewUpdateStockUdaya().setVisible(true);
    }//GEN-LAST:event_viewRecordActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

        new ViewStockRefillReminderODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        new ViewExpireReminderODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new AddItemsUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        new ViewItemUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new AddCatagoryUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new GrnReturnUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new ViewReturnGRNUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AddSupplierUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        new ViewSuppUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        new AddCustomersUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        new ViewCustomersUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        new EmployeeAllowance().setVisible(true);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        new SalaryReport().setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        new RegisterAttendence().setVisible(true);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        new ViewAttendenceReport().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        DBbackup.BACKUPDB();

        Window[] wins = Window.getWindows();
        for (int i = 0; i < wins.length; i++) {
            System.out.println(wins[i]);
            wins[i].dispose();
        }
        new LoginFrame().setVisible(true);
        new LoginFrame().UType = null;

        this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        new ViewKOTUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        new ViewDeletedSupp().setVisible(true);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed

        new AddFoodCodeUdaya().setVisible(true);

    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed

        new AddRawMinUdaya().setVisible(true);

    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void viewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFoodActionPerformed

        new ViewFoodItemsUdaya().setVisible(true);

    }//GEN-LAST:event_viewFoodActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed

        new ViewCashBookUdaya().setVisible(true);

    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
       new AddTable().setVisible(true);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        new registerEmployee().setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        new AddUserUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        new SecuirityQuestions().setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        new JobRoles().setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
       new TemporaryJobRoles().setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
       new AddGrnPaymentsUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
       new ViewGrnPaymentUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
       new ViewGRNExces().setVisible(true);
            
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
       new AddJobRolesUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        new BillOrdersUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
        new OrderDueRemideUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
 
       new ViewInvCommUdaya().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        new ViewDeletedInvoiceUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        new InvoiceReturnCustomer().setVisible(true);
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        new DaillySalesSummeryUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        new BestSellingItem().setVisible(true);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
        new AddPromotionUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem57ActionPerformed

    private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
        new ViewPromotionUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem58ActionPerformed

    private void viewreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewreturnActionPerformed
        new ViewCustomerReturn().setVisible(true);
    }//GEN-LAST:event_viewreturnActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new StaffLeaveManagement().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
 
        new InvoiceCancelF().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        
        new ViewCancelInvoice().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void cusAddPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusAddPaymentActionPerformed
        new AddCusInvoicePaymentsUdaya().setVisible(true);
    }//GEN-LAST:event_cusAddPaymentActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        
        
        new EmployeePayment().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu PromotionGroup;
    private javax.swing.JMenuItem addRecord;
    private javax.swing.JMenu bulk;
    private javax.swing.JMenuItem cusAddPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu reminder;
    private javax.swing.JMenu summeryGroup;
    private javax.swing.JMenu updatestock;
    private javax.swing.JMenuItem viewFood;
    private javax.swing.JMenu viewInvoiceGroup;
    private javax.swing.JMenuItem viewRecord;
    private javax.swing.JMenuItem viewStock;
    private javax.swing.JMenuItem viewreturn;
    // End of variables declaration//GEN-END:variables

    private void Privilage() {

        if (new LoginFrame().UType.equals("Cashier")) {

            jMenuItem4.setEnabled(false);
            viewInvoiceGroup.setEnabled(false);
            summeryGroup.setEnabled(false);
            PromotionGroup.setEnabled(false);
            viewStock.setEnabled(false);
            reminder.setEnabled(false);
            viewRecord.setEnabled(false);
//            updatestock.setEnabled(false);
            jMenuItem14.setEnabled(false);
            jMenuItem15.setEnabled(false);
            bulk.setEnabled(false);
            jMenu9.setEnabled(false);
            jMenu10.setEnabled(false);
            jMenuItem19.setEnabled(false);
            viewreturn.setEnabled(false);
//            jMenuItem22.setEnabled(false);
            jMenuItem40.setEnabled(false);
            jMenuItem24.setEnabled(false);
//            cusAddPayment.setEnabled(false);
            jMenuItem32.setEnabled(false);
//            jMenuItem38.setEnabled(false);
            jMenu2.setEnabled(false);

            // jMenuItem28.setEnabled(false);
        }

    }
}
