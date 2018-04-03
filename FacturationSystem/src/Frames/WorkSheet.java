package Frames;

import Common_Panels.StatusBar;
import Resources.Property;
import Resources.Account;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author CJ
 */
public class WorkSheet extends javax.swing.JFrame {

    /**
     * Creates new form WorkSheet
     */
    public WorkSheet() {
        initComponents();
        desk1.setWorkSheet(this);
        this.setMinimumSize(new Dimension(680, 695));
        this.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setPreferredSize(new Dimension(700, 695));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(88, 89, 83));
        itemLogout.setEnabled(false);
        desk1.setProperty(property);
        statusBar1.setProperty(property);
        desk1.setLabelBackVisible(false);
        closeSession();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWall = new javax.swing.JPanel();
        desk1 = new WorkSheet_Panels.Desk();
        account = new Common_Panels.Account();
        statusBar1 = new Common_Panels.StatusBar();
        panelClose = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelStatistics = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        itemClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setFocusTraversalPolicyProvider(true);
        setIconImage(getIconImage());

        panelWall.setFocusCycleRoot(true);
        panelWall.setFocusTraversalPolicyProvider(true);

        desk1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        desk1.setOpaque(false);
        desk1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                desk1PropertyChange(evt);
            }
        });

        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
        });

        statusBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Toggle_Off_40px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel15.setDoubleBuffered(true);
        jLabel15.setFocusCycleRoot(true);
        jLabel15.setFocusTraversalPolicyProvider(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salir");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCloseLayout = new javax.swing.GroupLayout(panelClose);
        panelClose.setLayout(panelCloseLayout);
        panelCloseLayout.setHorizontalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCloseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCloseLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(jLabel15))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelCloseLayout.setVerticalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCloseLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Training_100px_1.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel17.setDoubleBuffered(true);
        jLabel17.setFocusCycleRoot(true);
        jLabel17.setFocusTraversalPolicyProvider(true);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estadisticas");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelStatisticsLayout = new javax.swing.GroupLayout(panelStatistics);
        panelStatistics.setLayout(panelStatisticsLayout);
        panelStatisticsLayout.setHorizontalGroup(
            panelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatisticsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );
        panelStatisticsLayout.setVerticalGroup(
            panelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatisticsLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout panelWallLayout = new javax.swing.GroupLayout(panelWall);
        panelWall.setLayout(panelWallLayout);
        panelWallLayout.setHorizontalGroup(
            panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWallLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(panelWallLayout.createSequentialGroup()
                        .addComponent(desk1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                        .addGroup(panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelWallLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelWallLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelWallLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        panelWallLayout.setVerticalGroup(
            panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWallLayout.createSequentialGroup()
                .addGroup(panelWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWallLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(desk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(statusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("General");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/20px/icons8_Customer_20px_1.png"))); // NOI18N
        jMenu2.setText("Usuario");

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itemLogin.setText("Iniciar sesión");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        jMenu2.add(itemLogin);

        itemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemLogout.setText("Cerrar sesión");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });
        jMenu2.add(itemLogout);

        jMenu1.add(jMenu2);

        itemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itemClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/20px/icons8_Toggle_Off_20px_2.png"))); // NOI18N
        itemClose.setText("Salir");
        itemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCloseActionPerformed(evt);
            }
        });
        jMenu1.add(itemClose);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelWall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelWall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close() {
        load.updateProperties();
        System.exit(0);
    }

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        close();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        close();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void itemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCloseActionPerformed
        close();
    }//GEN-LAST:event_itemCloseActionPerformed

    private void newSession() {
        for (int i = 0; i < property.getAccountList().size(); i++) {
            System.out.println(property.getAccountList().get(i));
        }
        try {
            if (property.isLogged() == false) {
                closeSession();
                UserLogin.main(new String[]{""}, property, this);
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
        newSession();
    }//GEN-LAST:event_itemLoginActionPerformed

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        if (property.isLogged() == false) {
            newSession();
        } else {
            desk1.AccountMouseClicked();
        }
    }//GEN-LAST:event_accountMouseClicked

    private void closeSession() {
        property.setAccount(new Account());
        property.setLogged(false);
        statusBar1.refresh();
        itemLogout.setEnabled(false);
        itemLogin.setEnabled(true);
        desk1.logout();
    }

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoutActionPerformed
        closeSession();
    }//GEN-LAST:event_itemLogoutActionPerformed

    private void desk1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_desk1PropertyChange
        if (desk1.isButtonClicked() == true) {
            panelStatistics.setVisible(false);
        }
    }//GEN-LAST:event_desk1PropertyChange

    /**
     * @param args the command line arguments
     * @param newProperty
     * @param load1
     */
    public static void main(String args[], Property newProperty, Load load1) {
        load = load1;
        property = newProperty;
        /* Set the Darcula look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Darcula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Common_Panels.Account account;
    private WorkSheet_Panels.Desk desk1;
    private javax.swing.JMenuItem itemClose;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelStatistics;
    private javax.swing.JPanel panelWall;
    private Common_Panels.StatusBar statusBar1;
    // End of variables declaration//GEN-END:variables
    // Variables
    /**
     * Propiedades generales de la interfaz gráfica.
     */
    private static Property property;

    private static Load load;

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    public JPanel getjPanel1() {
        return panelWall;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.panelWall = jPanel1;
    }

    public StatusBar getStatusBar1() {
        return statusBar1;
    }

    public JPanel getPanelStatistics() {
        return panelStatistics;
    }

    public void setPanelStatistics(JPanel panelStatistics) {
        this.panelStatistics = panelStatistics;
    }

    public JPanel getPanelClose() {
        return panelClose;
    }

    public void setPanelClose(JPanel panelClose) {
        this.panelClose = panelClose;
    }

    public JMenuItem getItemLogin() {
        return itemLogin;
    }

    public void setItemLogin(JMenuItem itemLogin) {
        this.itemLogin = itemLogin;
    }

    public JMenuItem getItemLogout() {
        return itemLogout;
    }

    public void setItemLogout(JMenuItem itemLogout) {
        this.itemLogout = itemLogout;
    }

    public Common_Panels.Account getAccount() {
        return account;
    }

    public void setAccount(Common_Panels.Account account) {
        this.account = account;
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color); //To change body of generated methods, choose Tools | Templates.
        try {
            desk1.setBackground(this.getBackground());
            panelWall.setBackground(this.getBackground());
            panelClose.setBackground(this.getBackground());
            panelStatistics.setBackground(this.getBackground());
            statusBar1.setBackground(new Color(63, 168, 176));
            jMenuBar1.setBackground(new Color(216, 106, 107));
        } catch (Exception e) {
        }
    }

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

}
