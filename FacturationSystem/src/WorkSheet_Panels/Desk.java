package WorkSheet_Panels;

import Frames.WorkSheet;
import Resources.Property;
import Resources.Account;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author CJ
 */
public class Desk extends javax.swing.JPanel {

    /**
     * Creates new form Desk
     */
    public Desk() {
        initComponents();
        pAjustes.setBackground(this.getBackground());
        pCV.setBackground(this.getBackground());
        pCaja.setBackground(this.getBackground());
        pClientes.setBackground(this.getBackground());
        pEmpleados.setBackground(this.getBackground());
        pProductos.setBackground(this.getBackground());
        panelCaja.setVisible(false);
        panelClientes.setVisible(false);
        panelCV.setVisible(false);
        panelAjustes.setVisible(false);
        panelProductos.setVisible(false);
        panelEmpleados.setVisible(false);
        panelCaja.setBounds(internalPanel.getBounds());
        panelCaja.setSize(internalPanel.getSize());
        panelCaja.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        panelClientes.setBounds(internalPanel.getBounds());
        panelClientes.setSize(internalPanel.getSize());
        panelClientes.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        panelCV.setBounds(internalPanel.getBounds());
        panelCV.setSize(internalPanel.getSize());
        panelCV.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        panelAjustes.setBounds(internalPanel.getBounds());
        panelAjustes.setSize(internalPanel.getSize());
        panelAjustes.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        panelProductos.setBounds(internalPanel.getBounds());
        panelProductos.setSize(internalPanel.getSize());
        panelAjustes.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        panelEmpleados.setBounds(internalPanel.getBounds());
        panelEmpleados.setSize(internalPanel.getSize());
        panelEmpleados.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCaja = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelCV = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panelEmpleados = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        panelAjustes = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelProductos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelUser = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        panelStatistics = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        FirstPlane = new javax.swing.JPanel();
        labelBack = new javax.swing.JLabel();
        internalPanel = new javax.swing.JPanel();
        pCaja = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pCV = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pEmpleados = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pAjustes = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pProductos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CAJA");

        javax.swing.GroupLayout panelCajaLayout = new javax.swing.GroupLayout(panelCaja);
        panelCaja.setLayout(panelCajaLayout);
        panelCajaLayout.setHorizontalGroup(
            panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajaLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelCajaLayout.setVerticalGroup(
            panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clientes");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel11)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Compras / Ventas");

        javax.swing.GroupLayout panelCVLayout = new javax.swing.GroupLayout(panelCV);
        panelCV.setLayout(panelCVLayout);
        panelCVLayout.setHorizontalGroup(
            panelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCVLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCVLayout.setVerticalGroup(
            panelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCVLayout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Empleados");

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel16)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ajustes");

        javax.swing.GroupLayout panelAjustesLayout = new javax.swing.GroupLayout(panelAjustes);
        panelAjustes.setLayout(panelAjustesLayout);
        panelAjustesLayout.setHorizontalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjustesLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel17)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        panelAjustesLayout.setVerticalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjustesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Productos");

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel18)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 475, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CAJA");

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CAJA");

        javax.swing.GroupLayout panelStatisticsLayout = new javax.swing.GroupLayout(panelStatistics);
        panelStatistics.setLayout(panelStatisticsLayout);
        panelStatisticsLayout.setHorizontalGroup(
            panelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatisticsLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelStatisticsLayout.setVerticalGroup(
            panelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });

        pCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCajaMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Receipt_100px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Caja");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pCajaLayout = new javax.swing.GroupLayout(pCaja);
        pCaja.setLayout(pCajaLayout);
        pCajaLayout.setHorizontalGroup(
            pCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
            .addGroup(pCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pCajaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pCajaLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        pCajaLayout.setVerticalGroup(
            pCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pCajaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pClientesMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_User_Groups_100px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pClientesLayout = new javax.swing.GroupLayout(pClientes);
        pClientes.setLayout(pClientesLayout);
        pClientesLayout.setHorizontalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pClientesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(pClientesLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel2)))
                    .addContainerGap()))
        );
        pClientesLayout.setVerticalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pClientesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCVMouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Compras / Ventas");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Handshake_100px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pCVLayout = new javax.swing.GroupLayout(pCV);
        pCV.setLayout(pCVLayout);
        pCVLayout.setHorizontalGroup(
            pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
            .addGroup(pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pCVLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        pCVLayout.setVerticalGroup(
            pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pCVLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEmpleadosMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Online_Support_100px.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Empleados");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pEmpleadosLayout = new javax.swing.GroupLayout(pEmpleados);
        pEmpleados.setLayout(pEmpleadosLayout);
        pEmpleadosLayout.setHorizontalGroup(
            pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pEmpleadosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpleadosLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addComponent(jLabel5))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pEmpleadosLayout.setVerticalGroup(
            pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pEmpleadosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pAjustesMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ajustes");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Settings_100px.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pAjustesLayout = new javax.swing.GroupLayout(pAjustes);
        pAjustes.setLayout(pAjustesLayout);
        pAjustesLayout.setHorizontalGroup(
            pAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
            .addGroup(pAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pAjustesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addGroup(pAjustesLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        pAjustesLayout.setVerticalGroup(
            pAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pAjustesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pProductosMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Ingredients_100px.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pProductosLayout = new javax.swing.GroupLayout(pProductos);
        pProductos.setLayout(pProductosLayout);
        pProductosLayout.setHorizontalGroup(
            pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(pProductosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap())))
        );
        pProductosLayout.setVerticalGroup(
            pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout internalPanelLayout = new javax.swing.GroupLayout(internalPanel);
        internalPanel.setLayout(internalPanelLayout);
        internalPanelLayout.setHorizontalGroup(
            internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pCaja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAjustes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        internalPanelLayout.setVerticalGroup(
            internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FirstPlaneLayout = new javax.swing.GroupLayout(FirstPlane);
        FirstPlane.setLayout(FirstPlaneLayout);
        FirstPlaneLayout.setHorizontalGroup(
            FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstPlaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(internalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FirstPlaneLayout.setVerticalGroup(
            FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstPlaneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(internalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstPlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstPlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void StatisticsMouseClicked() {
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Estadísticas/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelStatistics)
            internalPanel.setVisible(false);
            panelStatistics.setVisible(true);
        }
    }

    public void AccountMouseClicked() {
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Usuario/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelUser)
            internalPanel.setVisible(false);
            panelUser.setVisible(true);
        }
    }

    private void pCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCajaMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Caja/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelCaja)
            internalPanel.setVisible(false);
            panelCaja.setVisible(true);
        }
    }//GEN-LAST:event_pCajaMouseClicked

    private void pClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pClientesMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Clientes/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelClientes)
            internalPanel.setVisible(false);
            panelClientes.setVisible(true);
        }
    }//GEN-LAST:event_pClientesMouseClicked

    private void pCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCVMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Compra-Venta/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelCV)
            internalPanel.setVisible(false);
            panelCV.setVisible(true);
        }
    }//GEN-LAST:event_pCVMouseClicked

    private void pEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEmpleadosMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Empleados/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelEmpleados)
            internalPanel.setVisible(false);
            panelEmpleados.setVisible(true);
        }
    }//GEN-LAST:event_pEmpleadosMouseClicked

    private void pAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAjustesMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Ajustes/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelAjustes)
            internalPanel.setVisible(false);
            panelAjustes.setVisible(true);
        }
    }//GEN-LAST:event_pAjustesMouseClicked

    private void pProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pProductosMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Productos/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelProductos)
            internalPanel.setVisible(false);
            panelProductos.setVisible(true);
        }
    }//GEN-LAST:event_pProductosMouseClicked

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        if (buttonClicked == true) {
            buttonClicked = false;
            labelBackMouseClicked(evt);
        } else {
            if (workSheet.getPanelStatistics().isVisible() == false) {
                panelCaja.setVisible(false);
                panelClientes.setVisible(false);
                panelCV.setVisible(false);
                panelAjustes.setVisible(false);
                panelProductos.setVisible(false);
                panelEmpleados.setVisible(false);
                internalPanel.setVisible(true);
                workSheet.getPanelStatistics().setVisible(true);
                workSheet.getAccount().setVisible(true);
                workSheet.getPanelClose().setVisible(true);
                workSheet.getStatusBar1().setInfo("Principal/");
                labelBack.setVisible(false);
            }
        }
    }//GEN-LAST:event_labelBackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FirstPlane;
    private javax.swing.JPanel internalPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelBack;
    private javax.swing.JPanel pAjustes;
    private javax.swing.JPanel pCV;
    private javax.swing.JPanel pCaja;
    private javax.swing.JPanel pClientes;
    private javax.swing.JPanel pEmpleados;
    private javax.swing.JPanel pProductos;
    private javax.swing.JPanel panelAjustes;
    private javax.swing.JPanel panelCV;
    private javax.swing.JPanel panelCaja;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelStatistics;
    private javax.swing.JPanel panelUser;
    // End of variables declaration//GEN-END:variables
    // Variables
    /**
     * Propiedades generales de la interfaz gráfica.
     */
    private Property property;
    /**
     * Si se inició un proceso.
     */
    private boolean buttonClicked;
    /**
     * Frame contenedor.
     */
    private WorkSheet workSheet;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public boolean isButtonClicked() {
        return buttonClicked;
    }

    public void setButtonClicked(boolean buttonClicked) {
        this.buttonClicked = buttonClicked;
    }

    public boolean isLabelBackVisible() {
        return labelBack.isVisible();
    }

    public void setLabelBackVisible(boolean visible) {
        labelBack.setVisible(visible);
    }

    public WorkSheet getWorkSheet() {
        return workSheet;
    }

    public void setWorkSheet(WorkSheet workSheet) {
        this.workSheet = workSheet;
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color); //To change body of generated methods, choose Tools | Templates.
        try {
            pAjustes.setBackground(this.getBackground());
            pCV.setBackground(this.getBackground());
            pCaja.setBackground(this.getBackground());
            pClientes.setBackground(this.getBackground());
            pEmpleados.setBackground(this.getBackground());
            pProductos.setBackground(this.getBackground());
            FirstPlane.setBackground(this.getBackground());
            panelCaja.setBackground(this.getBackground());
            panelClientes.setBackground(this.getBackground());
            panelCV.setBackground(this.getBackground());
            panelAjustes.setBackground(this.getBackground());
            panelProductos.setBackground(this.getBackground());
            panelEmpleados.setBackground(this.getBackground());
            internalPanel.setBackground(this.getBackground());
        } catch (Exception e) {
        }
    }

    public void logout() {
        labelBackMouseClicked(null);
    }

}
