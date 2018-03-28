package Common_Panels;

/**
 *
 * @author CJ
 */
public class StatusBar extends javax.swing.JPanel {

    /**
     * Creates new form StatusBar
     */
    public StatusBar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDate = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        labelRunTime = new javax.swing.JLabel();

        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setText("date");

        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("User");

        labelInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelInfo.setText("info-user-sells");

        labelRunTime.setForeground(new java.awt.Color(255, 255, 255));
        labelRunTime.setText("run time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(labelRunTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelInfo)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelDate)
                    .addComponent(labelUser)
                    .addComponent(labelInfo)
                    .addComponent(labelRunTime))
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelRunTime;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables
}
