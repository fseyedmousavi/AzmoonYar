package Panels;

import Panels.Login.ManagerLogin;
import Panels.Login.StudentLogin;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Init extends javax.swing.JFrame {

    private final Toolkit t;
    private final Dimension d;

    /**
     * Creates new form Main
     */
    public Init() {
        t = Toolkit.getDefaultToolkit();
        d = t.getScreenSize();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelM = new javax.swing.JPanel();
        jPanelS = new javax.swing.JPanel();
        loginM = new javax.swing.JButton(); //manager
        loginS = new javax.swing.JButton(); //student
        registerM = new javax.swing.JButton(); //manager
        registerS = new javax.swing.JButton(); //student

        setTitle("آزمون یار");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(26, 33, 38));
        setBounds((d.width) / 4, (d.height) / 4, (d.width) / 2, (d.height) / 2);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setName("Azmoon"); // NOI18N
        setPreferredSize(new Dimension((d.width) / 2, (d.height) / 2));
        setSize((d.width) / 2, (d.height) / 2);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(26, 33, 38));
        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, getHeight() / 10)); // NOI18N
        jLabel1.setText("آزمون یار");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setInheritsPopupMenu(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(getWidth() * 3 / 8, getHeight() / 15, getWidth() / 2, getHeight() / 9);

        jPanelM.setBackground(new java.awt.Color(255, 102, 102));
        jPanelM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "پنل مدیر",
                javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("B Nazanin", 1, d.height / 24))); // NOI18N
        jPanelM.setForeground(new java.awt.Color(0, 0, 0));
        jPanelM.setLayout(null);

        loginS.setFont(new java.awt.Font("B Nazanin", 1, d.height / 28)); // NOI18N
        loginS.setText("ورود");
        loginS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSActionPerformed(evt);
            }
        });
        jPanelS.add(loginS);

        registerS.setFont(new java.awt.Font("B Nazanin", 1, d.height / 28)); // NOI18N
        registerS.setText("ثبت نام");
        registerS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSActionPerformed(evt);
            }
        });
        jPanelS.add(registerS);

        getContentPane().add(jPanelS);
        jPanelS.setBounds(getWidth() * 8 / 15, getHeight() / 4, getWidth() * 3 / 8, getHeight() * 5 / 8);
        loginS.setBounds(jPanelS.getWidth() / 4, jPanelS.getHeight() / 2, jPanelS.getWidth() / 2, jPanelS.getHeight() / 6);
        registerS.setBounds(jPanelS.getWidth() / 4, jPanelS.getHeight() / 3, jPanelS.getWidth() / 2, jPanelS.getHeight() / 6);

        jPanelS.setBackground(new java.awt.Color(255, 102, 102));
        jPanelS.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                "پنل دانشجو", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.TOP, new java.awt.Font("B Nazanin", 1, d.height / 24))); // NOI18N
        jPanelS.setForeground(new java.awt.Color(0, 0, 0));
        jPanelS.setLayout(null);

        loginM.setFont(new java.awt.Font("B Nazanin", 1, d.height / 28)); // NOI18N
        loginM.setText("ورود");
        loginM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMActionPerformed(evt);
            }
        });
        jPanelM.add(loginM);

        registerM.setFont(new java.awt.Font("B Nazanin", 1, d.height / 28)); // NOI18N
        registerM.setText("ثبت نام");
        registerM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMActionPerformed(evt);
            }
        });
        jPanelM.add(registerM);

        getContentPane().add(jPanelM);
        jPanelM.setBounds(getWidth() / 15, getHeight() / 4, getWidth() * 3 / 8, getHeight() * 5 / 8);
        loginM.setBounds(jPanelM.getWidth() / 4, jPanelM.getHeight() / 2, jPanelM.getWidth() / 2, jPanelM.getHeight() / 6);
        registerM.setBounds(jPanelM.getWidth() / 4, jPanelM.getHeight() / 3, jPanelM.getWidth() / 2, jPanelM.getHeight() / 6);

        getAccessibleContext().setAccessibleName("Azmoon Yar");

        pack();
    }// </editor-fold>                        

    private void remove() {
        loginM.setVisible(false);
        loginS.setVisible(false);
        jLabel1.setVisible(false);
        jPanelS.setVisible(false);
        jPanelM.setVisible(false);
    }
    
    public static void getBack(){
        loginM.setVisible(true);
        loginS.setVisible(true);
        jLabel1.setVisible(true);
        jPanelS.setVisible(true);
        jPanelM.setVisible(true);
    }
    private void loginSActionPerformed(java.awt.event.ActionEvent evt) {
        remove();
        StudentLogin.entrance(this, "login");
    }

    private void loginMActionPerformed(java.awt.event.ActionEvent evt) {
        remove();
        ManagerLogin.entrance(this, "login");
        //new ManagerPanel(new Manager("Ali", "A", "83293fdsdf"), this).setVisible(true);
    }

    private void registerSActionPerformed(java.awt.event.ActionEvent evt) {
        remove();
        StudentLogin.entrance(this, "register");
    }

    private void registerMActionPerformed(java.awt.event.ActionEvent evt) {
        remove();
        ManagerLogin.entrance(this, "register");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Init().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private static javax.swing.JButton loginM;
    private static javax.swing.JButton loginS;
    private static javax.swing.JButton registerM;
    private static javax.swing.JButton registerS;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JPanel jPanelM;
    private static javax.swing.JPanel jPanelS;
    // End of variables declaration    
}
