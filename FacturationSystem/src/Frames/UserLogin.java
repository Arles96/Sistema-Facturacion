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
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public UserLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        panelWall.setBackground(new Color(property.getMix()[3][0], property.getMix()[3][1], property.getMix()[3][2]));
        jPanel1.setBackground(new Color(property.getMix()[4][0], property.getMix()[4][1], property.getMix()[4][2]));
        errorUser.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        errorUser = new javax.swing.JLabel();
        labelDone = new javax.swing.JLabel();
        labelNew = new javax.swing.JLabel();
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
        jLabel2.setText("Inicio sesión");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 96, -1, -1));

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 165, 178, -1));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 232, 178, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Connect_Develop_100px.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 6, -1, 84));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 207, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Chrome_40px_1.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_YouTube_40px_1.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Facebook_40px_1.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Instagram_40px_1.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 250, 50));

        errorUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N
        getContentPane().add(errorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 157, -1, -1));

        labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Checkmark_40px.png"))); // NOI18N
        labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDoneMouseClicked(evt);
            }
        });
        getContentPane().add(labelDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 270, -1, -1));

        labelNew.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelNew.setForeground(new java.awt.Color(102, 153, 255));
        labelNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNew.setText("Crear usuario");
        labelNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNewMouseClicked(evt);
            }
        });
        getContentPane().add(labelNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 90, 20));

        panelWall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelWallLayout = new javax.swing.GroupLayout(panelWall);
        panelWall.setLayout(panelWallLayout);
        panelWallLayout.setHorizontalGroup(
            panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panelWallLayout.setVerticalGroup(
            panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(panelWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        this.dispose();
        workSheet.setVisible(true);
    }//GEN-LAST:event_labelBackMouseClicked

    private void labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDoneMouseClicked
        if (!errorUser.isVisible() && !user.getText().isEmpty() && !password.getText().isEmpty()) {
            int index;
            if ((index = property.containsAccount(user.getText())) > -1) {
                if (property.getAccountList().get(index).getPassword().equals(password.getText())) {
                    property.setAccount(property.getAccountList().get(index));
                    property.setLogged(true);
                    workSheet.getItemLogout().setEnabled(true);
                    workSheet.getItemLogin().setEnabled(false);
                    workSheet.getStatusBar1().refresh();
                    this.dispose();
                    workSheet.setVisible(true);
                }
            }
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

    private void labelNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewMouseClicked
        UserJoin.main(new String[]{""}, property, this);
        this.setVisible(false);
    }//GEN-LAST:event_labelNewMouseClicked

    /**
     * @param args the command line arguments
     * @param properties
     * @param work
     */
    public static void main(String args[], Property properties, WorkSheet work) {
        property = properties;
        workSheet = work;
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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelDone;
    private javax.swing.JLabel labelNew;
    private javax.swing.JPanel panelWall;
    private javax.swing.JPasswordField password;
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
    private static WorkSheet workSheet;

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

    public static WorkSheet getWorkSheet() {
        return workSheet;
    }

    public static void setWorkSheet(WorkSheet workSheet) {
        UserLogin.workSheet = workSheet;
    }

    private boolean Validate(String text) {
        Pattern p = Pattern.compile("^\\s|^\\d|\\s|\\W");
        Matcher m = p.matcher(text);
        return !m.find();
    }

}
