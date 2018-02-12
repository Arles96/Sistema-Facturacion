package Frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author CJ
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 2,
                Toolkit.getDefaultToolkit().getScreenSize().height / 2));
        this.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.pack();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAccount = new Common_Panels.Account();
        panelDisplay = new Home_Panels.Display();
        panelRecent = new Home_Panels.Recent();
        panelStatusBar = new Common_Panels.StatusBar();
        panelToolBar = new Common_Panels.ToolBar();

        panelAccount.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout panelAccountLayout = new javax.swing.GroupLayout(panelAccount);
        panelAccount.setLayout(panelAccountLayout);
        panelAccountLayout.setHorizontalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelAccountLayout.setVerticalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDisplay.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout panelDisplayLayout = new javax.swing.GroupLayout(panelDisplay);
        panelDisplay.setLayout(panelDisplayLayout);
        panelDisplayLayout.setHorizontalGroup(
            panelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDisplayLayout.setVerticalGroup(
            panelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        panelRecent.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout panelRecentLayout = new javax.swing.GroupLayout(panelRecent);
        panelRecent.setLayout(panelRecentLayout);
        panelRecentLayout.setHorizontalGroup(
            panelRecentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );
        panelRecentLayout.setVerticalGroup(
            panelRecentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelStatusBar.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelStatusBarLayout = new javax.swing.GroupLayout(panelStatusBar);
        panelStatusBar.setLayout(panelStatusBarLayout);
        panelStatusBarLayout.setHorizontalGroup(
            panelStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );
        panelStatusBarLayout.setVerticalGroup(
            panelStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelToolBar.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout panelToolBarLayout = new javax.swing.GroupLayout(panelToolBar);
        panelToolBar.setLayout(panelToolBarLayout);
        panelToolBarLayout.setHorizontalGroup(
            panelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelToolBarLayout.setVerticalGroup(
            panelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRecent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelStatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelRecent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Common_Panels.Account panelAccount;
    private Home_Panels.Display panelDisplay;
    private Home_Panels.Recent panelRecent;
    private Common_Panels.StatusBar panelStatusBar;
    private Common_Panels.ToolBar panelToolBar;
    // End of variables declaration//GEN-END:variables

// EXTRA COMPONENTS
    /**
     * Colores de los páneles.
     */
    public Color colorRecent;
    public Color colorDisplay;
    public Color colorToolBar;
    public Color colorStatusBar;
    public Color colorAccount;

    /**
     * Cambia el color de los páneles, dependiendo de la combinación selecta.
     *
     * @param R Recent
     * @param D Display
     * @param T ToolBar
     * @param S StatusBar
     * @param A Account
     */
    private void changeColor(Color R, Color D, Color T, Color S, Color A) {
        panelRecent.setBackground(colorRecent = R);
        panelDisplay.setBackground(colorDisplay = D);
        panelToolBar.setBackground(colorToolBar = T);
        panelStatusBar.setBackground(colorStatusBar = S);
        panelAccount.setBackground(colorAccount = A);
    }

    private void initExtraComponents() {
    }
}
