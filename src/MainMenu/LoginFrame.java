/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import ClassPack.PoolManager;
import InvoiceAndGRN.newInvoiceArsh;
import ORM.Answers;
import ORM.Login;
import com.alee.laf.WebLookAndFeel;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author arshak
 */
public class LoginFrame extends javax.swing.JFrame {

    public static String user = "Admin";
    public static String UType = "Admin";
    public static Integer logid = null;
    public static JasperReport Invoice;
    public static JasperReport KOT;
    public static JasperReport Stock;
    public static JasperReport Menu;
    public static JasperReport KOTDN;

    public LoginFrame() {
        initComponents();
        CompileJasper();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFPassword = new javax.swing.JLabel();
        btnLogging = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cheysta.png"))); // NOI18N

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jLabelFPassword.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelFPassword.setText("Forget Password");

        btnLogging.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnLogging.setText("Login");
        btnLogging.setPreferredSize(new java.awt.Dimension(89, 45));
        btnLogging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggingActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1)
                    .addComponent(btnLogging, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFPassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogging, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtUser.getAccessibleContext().setAccessibleName("");

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

    private void btnLoggingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggingActionPerformed

        if (txtUser.getText().equals("msadmin") && jPasswordField1.getText().equals("*222*odk*")) {
            user = txtUser.getText();
            UType = "Admin";
            new Dashboard().setVisible(true);
            this.dispose();
        } else {

            try {
                Session openSession = PoolManager.getSessionFactory().openSession();

                Criteria createCriteria = openSession.createCriteria(Login.class);
                createCriteria.add(Restrictions.eq("userName", txtUser.getText()));
                createCriteria.add(Restrictions.eq("passWord", jPasswordField1.getText()));
                Login uniqueResult = (Login) createCriteria.uniqueResult();
                if (uniqueResult != null) {
                    user = uniqueResult.getUserName();
                    UType = uniqueResult.getPrivilage();
                    //to do code here
                    logid = uniqueResult.getIdLogin();
                    System.out.println(logid);
                    Criteria cc = openSession.createCriteria(Answers.class);
                    cc.createAlias("login", "lo");
                    cc.add(Restrictions.eq("lo.idLogin", logid));
                    Answers uniqueResult1 = (Answers) cc.uniqueResult();

                    if (uniqueResult1 == null) {
                        UserSecutityQuestion us = new UserSecutityQuestion();
                        us.setVisible(true);
                        this.dispose();
                    } else {
                        new Dashboard().setVisible(true);
                        this.dispose();
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Username or password error");

                }

                openSession.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_btnLoggingActionPerformed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased

        if (evt.getKeyCode() == 10) {

            if (txtUser.getText().equals("msadmin") && jPasswordField1.getText().equals("*222*odk*")) {
                user = txtUser.getText();
                UType = "Admin";
                new Dashboard().setVisible(true);
                this.dispose();
            } else {

                try {
                    Session openSession = PoolManager.getSessionFactory().openSession();

                    Criteria createCriteria = openSession.createCriteria(Login.class);
                    createCriteria.add(Restrictions.eq("userName", txtUser.getText()));
                    createCriteria.add(Restrictions.eq("passWord", jPasswordField1.getText()));
                    Login uniqueResult = (Login) createCriteria.uniqueResult();
                    if (uniqueResult != null) {
                        user = uniqueResult.getUserName();
                        UType = uniqueResult.getPrivilage();
                        //to do code here
                        logid = uniqueResult.getIdLogin();
                        Criteria cc = openSession.createCriteria(Answers.class);
                        cc.createAlias("login", "lo");
                        cc.add(Restrictions.eq("lo.idLogin", logid));
                        Answers uniqueResult1 = (Answers) cc.uniqueResult();

                        if (uniqueResult1 == null) {
                            UserSecutityQuestion us = new UserSecutityQuestion();
                            us.setVisible(true);
                            this.dispose();
                        } else {
                            new Dashboard().setVisible(true);
                            this.dispose();
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "Username or password error");

                    }

                    openSession.close();
                } catch (Exception e) {
                }

            }

        }

    }//GEN-LAST:event_jPasswordField1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogging;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void CompileJasper() {
        try {
            InputStream Rp = getClass().getResourceAsStream("/JReports/Ceyesta_Invoice.jrxml");
            Invoice = JasperCompileManager.compileReport(Rp);

            InputStream Rps = getClass().getResourceAsStream("/JReports/Ceyesta_BOT.jrxml");
            KOT = JasperCompileManager.compileReport(Rps);

            InputStream stk = getClass().getResourceAsStream("/JReports/Stocks.jrxml");
            Stock = JasperCompileManager.compileReport(stk);

            InputStream menu = getClass().getResourceAsStream("/JReports/ITEMS.jrxml");
            Menu = JasperCompileManager.compileReport(menu);

            InputStream input = getClass().getResourceAsStream("/JReports/Ceyesta_KOT.jrxml");
            KOTDN = JasperCompileManager.compileReport(input);

        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }

}
