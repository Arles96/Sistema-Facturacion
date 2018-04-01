package Frames;

import Resources.Account;
import Resources.Property;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CJ
 */
public class UserJoin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public UserJoin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        panelWall.setBackground(new Color(property.getMix()[3][0], property.getMix()[3][1], property.getMix()[3][2]));
        errorUser.setVisible(false);
        errorPasswordR.setVisible(false);
        errorEmail.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        errorUser = new javax.swing.JLabel();
        labelDone = new javax.swing.JLabel();
        passwordR = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        errorPasswordR = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        panelWall = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });
        getContentPane().add(labelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/Logo/oie_28161150ZEyMVMDU.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Crear usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 96, -1, -1));

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 178, -1));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 178, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Connect_Develop_100px.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 6, -1, 84));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        errorUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N
        getContentPane().add(errorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Checkmark_40px.png"))); // NOI18N
        labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDoneMouseClicked(evt);
            }
        });
        getContentPane().add(labelDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        passwordR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordRKeyReleased(evt);
            }
        });
        getContentPane().add(passwordR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 178, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Repita contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        errorPasswordR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N
        getContentPane().add(errorPasswordR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 178, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        errorEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N
        getContentPane().add(errorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        panelWall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelWallLayout = new javax.swing.GroupLayout(panelWall);
        panelWall.setLayout(panelWallLayout);
        panelWallLayout.setHorizontalGroup(
            panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelWallLayout.setVerticalGroup(
            panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(panelWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        this.dispose();
        workSheet.setVisible(true);
    }//GEN-LAST:event_labelBackMouseClicked

    private void labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDoneMouseClicked
        if (!errorUser.isVisible() && !errorPasswordR.isVisible() && !errorEmail.isVisible()
                && !user.getText().isEmpty() && !password.getText().isEmpty() && !passwordR.getText().isEmpty() && !email.getText().isEmpty()) {
            property.setAccount(new Account(password.getText(), user.getText(), "email", null));
            this.dispose();
            workSheet.setVisible(true);
        }
    }//GEN-LAST:event_labelDoneMouseClicked

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        if (!Validate(user.getText())) {
            errorUser.setVisible(true);
        } else {
            errorUser.setVisible(false);
        }
    }//GEN-LAST:event_userKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
    }//GEN-LAST:event_passwordKeyReleased

    private void passwordRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordRKeyReleased
        if (passwordR.getText().equals(password.getText())) {
            errorPasswordR.setVisible(false);
        } else {
            errorPasswordR.setVisible(true);
        }
    }//GEN-LAST:event_passwordRKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        Pattern p = Pattern.compile("^\\s|^\\d|\\s|\\W");
        Matcher m = p.matcher(email.getText());
        if (!m.find()) {
                
        }
    }//GEN-LAST:event_emailKeyReleased

    /**
     * @param args the command line arguments
     * @param properties
     */
    public static void main(String args[], Property properties, UserLogin login) {
        property = properties;
        workSheet = login;
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
            java.util.logging.Logger.getLogger(UserJoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJoin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorPasswordR;
    private javax.swing.JLabel errorUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelDone;
    private javax.swing.JPanel panelWall;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField passwordR;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    // EXTRA COMPONENTS
    /**
     * Propiedades generales de la interfaz gráfica.
     */
    private static Property property;
    /**
     * Frame de trabajo.
     */
    private static UserLogin workSheet;

    /**
     *
     * Establece ícono de ventana
     *
     * @return Ícono
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("ICO/100px/icons8_Connect_Develop_100px.png"));
        return retValue;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    private boolean Validate(String text) {
        Pattern p = Pattern.compile("^\\s|^\\d|\\s|\\W");
        Matcher m = p.matcher(text);
        return !m.find();
    }

}
