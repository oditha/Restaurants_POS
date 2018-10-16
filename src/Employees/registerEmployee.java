package Employees;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.EmployeeContactDetails;
import ORM.Employees;
import ORM.EmployeesHasJobroals;
import ORM.Jobroals;
import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;
import groovy.model.DefaultTableModel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.image.RescaleOp;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class registerEmployee extends javax.swing.JFrame {

    static boolean maximized = true;
    Map<String, Integer> jobmap = new HashMap();

    public registerEmployee() {
        initComponents();
        tblload();
        txtfildclear();
//        maximizeWindow();
        jTable1.setComponentPopupMenu(jPopupMenu1);
        SetMaximized();
        LoadPositions();
    }

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

        tb = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jlNIC = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jlContact = new javax.swing.JLabel();
        jlAddress1 = new javax.swing.JLabel();
        jlAddress2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtNIC = new javax.swing.JTextField();
        jtName = new javax.swing.JTextField();
        jtContact = new javax.swing.JTextField();
        jtAddress1 = new javax.swing.JTextField();
        jtAddress2 = new javax.swing.JTextField();
        jtCity = new javax.swing.JTextField();
        jtBSalary = new javax.swing.JTextField();
        jtETF = new javax.swing.JTextField();
        jtEPF = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Position = new javax.swing.JComboBox();
        jlContact1 = new javax.swing.JLabel();
        jtContact1 = new javax.swing.JTextField();
        jlContact2 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();

        tb.setText("jLabel17");

        jMenuItem1.setText("Delete ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Register");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.POPUP);

        jlNIC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNIC.setText("NIC");

        jlName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlName.setText("Fullname");

        jlContact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlContact.setText("Contact No ");

        jlAddress1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAddress1.setText("Address Line 1");

        jlAddress2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAddress2.setText("Address Line 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Basic Salary/day ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Etf No");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Epf No");

        jtNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNICFocusLost(evt);
            }
        });
        jtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNICActionPerformed(evt);
            }
        });
        jtNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNICKeyReleased(evt);
            }
        });

        jtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtContactKeyTyped(evt);
            }
        });

        jtAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAddress1ActionPerformed(evt);
            }
        });

        jtAddress2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtBSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtBSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtBSalaryKeyTyped(evt);
            }
        });

        jtETF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtETF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtETFActionPerformed(evt);
            }
        });

        jtEPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "NIC", "NAME", "CONTACT", "BASIC SALARY", "POSITION"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Enter Employee Details");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Position");

        Position.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        Position.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        Position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionActionPerformed(evt);
            }
        });

        jlContact1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlContact1.setText("Contact No 2");

        jtContact1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtContact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtContact1KeyTyped(evt);
            }
        });

        jlContact2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlContact2.setText("Email");

        Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(348, 348, 348))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtBSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtETF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10)
                                            .addGap(124, 124, 124)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlContact, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(jtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtBSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtETF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Employees.class);

            if (!jtName.getText().isEmpty() && !jtNIC.getText().isEmpty() && !jtContact.getText().isEmpty() && Position.getSelectedIndex() != 0) {

                if (btnSave.getText().equals("SAVE")) {
                    Transaction beginTransaction = openSession.beginTransaction();

                    Employees employees = new Employees();

                    employees.setEmployeeNic(jtNIC.getText());
                    employees.setEmployeName(jtName.getText());
                    employees.setEmployeeContactNo(jtContact.getText());
                    employees.setEmployeesAddress1(jtAddress1.getText());
                    employees.setEmployeeAddress2(jtAddress2.getText());
                    employees.setEmployeeCity(jtCity.getText());
                    employees.setEmployeeEpf(jtEPF.getText());
                    employees.setEmployeeEtf(jtETF.getText());
                    employees.setIsDelete("Active");
                    employees.setBasicSalary(Double.parseDouble(jtBSalary.getText()));
                    Jobroals jobroals = new Jobroals();

                    jobroals.setIdJobroals(jobmap.get(Position.getSelectedItem().toString().split("-")[0]));

                    EmployeesHasJobroals emp = new EmployeesHasJobroals();
                    emp.setEmployees(employees);
                    emp.setIsDelete("Active");
                    emp.setJobroals(jobroals);
                    EmployeeContactDetails epep = new EmployeeContactDetails();
                    epep.setContact1(jtContact.getText());
                    epep.setContact2(jtContact1.getText());
                    epep.setEmailAddress(Email.getText());
                    epep.setEmployees(employees);

                    openSession.save(employees);
                    openSession.save(emp);
                    openSession.save(epep);
                    beginTransaction.commit();
                    tblload();
                    openSession.close();
                    cleartextfields();
                    NotificationPopup.save();
                    jtAddress1.setText(null);
                    jtAddress2.setText(null);
                    jtBSalary.setText(null);
                    jtCity.setText(null);
                    jtContact.setText(null);
                    jtEPF.setText(null);
                    jtETF.setText(null);
                    jtNIC.setText(null);
                    jtName.setText(null);
                    jtContact.setText(null);
                    jtContact1.setText(null);
                    Email.setText(null);
                } else {

                    Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = sess.createCriteria(Employees.class);
                    cr.add(Restrictions.eq("idEmployees", jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                    Transaction tr = sess.beginTransaction();
                    Employees employees = (Employees) cr.uniqueResult();

                    if (employees != null) {

                        employees.setEmployeeNic(jtNIC.getText());
                        employees.setEmployeName(jtName.getText());
                        employees.setEmployeeContactNo(jtContact.getText());
                        employees.setEmployeesAddress1(jtAddress1.getText());
                        employees.setEmployeeAddress2(jtAddress2.getText());
                        employees.setEmployeeCity(jtCity.getText());
                        employees.setEmployeeEpf(jtEPF.getText());
                        employees.setEmployeeEtf(jtETF.getText());

                        employees.setBasicSalary(Double.parseDouble(jtBSalary.getText()));
                        Iterator it2 = employees.getEmployeesHasJobroalses().iterator();

                        Jobroals jobroals = new Jobroals();
                        jobroals.setIdJobroals(jobmap.get(Position.getSelectedItem().toString().split("-")[0]));

                        while (it2.hasNext()) {
                            EmployeesHasJobroals object = (EmployeesHasJobroals) it2.next();
                            object.setEmployees(employees);
                            object.setJobroals(jobroals);
                            sess.update(object);
                        }

                        // EmployeesHasJobroals emp = new EmployeesHasJobroals();
//                       
//                        emp.setJobroals(jobroals);
//                        emp.setEmployees(employees);
                        sess.update(employees);
                        //  sess.update(emp);
                        //   sess.update(tr);
                        tr.commit();
                        btnSave.setText("Save");
                        tblload();
                        sess.close();

                        jtAddress1.setText(null);
                        jtAddress2.setText(null);
                        jtBSalary.setText(null);
                        jtCity.setText(null);
                        jtContact.setText(null);
                        jtEPF.setText(null);
                        jtETF.setText(null);
                        jtNIC.setText(null);
                        jtName.setText(null);
                        jtContact1.setText(null);
                        Email.setText(null);
                    }

                }

            } else {

                NotificationPopup.fillFeilds();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jtETFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtETFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtETFActionPerformed

    private void jtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNICActionPerformed

    private void jtNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNICKeyReleased
        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria createCriteria = openSession.createCriteria(Employees.class);

        Criterion supid = Restrictions.eq("employeeNic", jtNIC.getText());
        Criterion active = Restrictions.like("isDelete", "Active");
        LogicalExpression andExp = Restrictions.and(supid, active);
        createCriteria.add(andExp);

        Employees uniqueResult = (Employees) createCriteria.uniqueResult();

        if (uniqueResult != null) {

            JOptionPane.showMessageDialog(rootPane, "Employee Already Exists");

        }
        openSession.close();
    }//GEN-LAST:event_jtNICKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Employees.class);
            cr.add(Restrictions.eq("idEmployees", jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
            Transaction tr = sess.beginTransaction();
            Employees employees = (Employees) cr.uniqueResult();

            if (employees != null) {

                jtNIC.setText(employees.getEmployeeNic());
                jtName.setText(employees.getEmployeName());
                jtContact.setText(employees.getEmployeeContactNo());
                jtAddress1.setText(employees.getEmployeesAddress1());
                jtAddress2.setText(employees.getEmployeeAddress2());
                jtCity.setText(employees.getEmployeeCity());
                jtEPF.setText(employees.getEmployeeEpf());
                jtETF.setText(employees.getEmployeeEtf());
                jtBSalary.setText(employees.getBasicSalary().toString());
                Iterator it2 = employees.getEmployeeContactDetailses().iterator();
                //  Position.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 5));
                Iterator it = employees.getEmployeesHasJobroalses().iterator();

                while (it.hasNext()) {
                    EmployeesHasJobroals epmp = (EmployeesHasJobroals) it.next();
                    Position.setSelectedItem(epmp.getJobroals().getJobcode() + "-" + epmp.getJobroals().getRoleName());

                }
                while (it2.hasNext()) {
                    EmployeeContactDetails ecd = (EmployeeContactDetails) it2.next();
                    jtContact.setText(ecd.getContact1());
                    jtContact1.setText(ecd.getContact2());
                    Email.setText(ecd.getEmailAddress());
                }

                btnSave.setText("Update");

                sess.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {

                int x = jTable1.getSelectedRow();
                String supCode = (jTable1.getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Employees.class);

                createCriteria.add(Restrictions.eq("idEmployees", Integer.parseInt(supCode)));

                Employees em = (Employees) createCriteria.uniqueResult();

                em.setIsDelete("Deactive");

                openSession.update(em);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.Delete();

                tblload();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAddress1ActionPerformed

    private void jtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContactKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || jtContact.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_jtContactKeyTyped

    private void jtBSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBSalaryKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_jtBSalaryKeyTyped

    private void PositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionActionPerformed

    private void jtNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNICFocusLost
        jtName.grabFocus();
    }//GEN-LAST:event_jtNICFocusLost

    private void jtContact1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContact1KeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || jtContact1.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_jtContact1KeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailKeyTyped

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox Position;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlAddress1;
    private javax.swing.JLabel jlAddress2;
    private javax.swing.JLabel jlContact;
    private javax.swing.JLabel jlContact1;
    private javax.swing.JLabel jlContact2;
    private javax.swing.JLabel jlNIC;
    private javax.swing.JLabel jlName;
    private javax.swing.JTextField jtAddress1;
    private javax.swing.JTextField jtAddress2;
    private javax.swing.JTextField jtBSalary;
    private javax.swing.JTextField jtCity;
    private javax.swing.JTextField jtContact;
    private javax.swing.JTextField jtContact1;
    private javax.swing.JTextField jtEPF;
    private javax.swing.JTextField jtETF;
    private javax.swing.JTextField jtNIC;
    private javax.swing.JTextField jtName;
    private javax.swing.JLabel tb;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            registerEmployee.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            registerEmployee.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void tblload() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Employees.class);

            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<Employees> list = createCriteria.list();
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (Employees list1 : list) {
                Vector v = new Vector();
                v.add(list1.getIdEmployees());
                v.add(list1.getEmployeeNic());
                v.add(list1.getEmployeName());
                v.add(list1.getEmployeeContactNo());
                v.add(list1.getBasicSalary());
                Iterator it = list1.getEmployeesHasJobroalses().iterator();

                while (it.hasNext()) {
                    EmployeesHasJobroals emp = (EmployeesHasJobroals) it.next();
                    v.add(emp.getJobroals().getRoleName());

                }

                dtm.addRow(v);

            }
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void txtfildclear() {
        //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cleartextfields() {

    }

    private void LoadPositions() {

        try {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Jobroals.class
            );
            cr.add(Restrictions.eq("isDelete", "Active"));
            List<Jobroals> list = cr.list();

            for (Jobroals jobroals : list) {

                Position.addItem(jobroals.getJobcode() + "-" + jobroals.getRoleName());
                jobmap.put(jobroals.getJobcode(), jobroals.getIdJobroals());

            }
            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
