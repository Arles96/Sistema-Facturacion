package WorkSheet_Panels;

import Frames.WorkSheet;
import Resources.Property;
import Resources.Account;
import java.awt.Color;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
        panelUser.setVisible(false);
        panelStatistics.setVisible(false);
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
        panelStatistics.setBounds(internalPanel.getBounds());
        panelStatistics.setSize(internalPanel.getSize());
        panelStatistics.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        panelUser.setBounds(internalPanel.getBounds());
        panelUser.setSize(internalPanel.getSize());
        panelUser.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
        Admin_user_edit.setVisible(false);
        errorPhone.setVisible(false);
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
        panelAjustes = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelStatistics = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelUser = new javax.swing.JPanel();
        User_TabbedPane = new javax.swing.JTabbedPane();
        User_SPGeneral = new javax.swing.JScrollPane();
        User_SPGeneral_panel = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        errorUser = new javax.swing.JLabel();
        labelDone = new javax.swing.JLabel();
        passwordR = new javax.swing.JPasswordField();
        labelPasswordR = new javax.swing.JLabel();
        errorPasswordR = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        labelEdit = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        labelCancel = new javax.swing.JLabel();
        passwordCurrent = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        errorPhone = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        User_SPAdminstrar = new javax.swing.JScrollPane();
        User_SPAdministrar_panel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Admin_User_Table = new javax.swing.JTable();
        labelDone1 = new javax.swing.JLabel();
        buttomAdministrator = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Admin_user_edit = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        panelEmpleados = new javax.swing.JPanel();
        Employee_TabbedPane = new javax.swing.JTabbedPane();
        Employee_SP = new javax.swing.JScrollPane();
        Employee_SP_panel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Employee_Table = new javax.swing.JTable();
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
        FirstPlane = new javax.swing.JPanel();
        labelBack = new javax.swing.JLabel();
        panelProductos = new javax.swing.JPanel();
        Product_TabbedPane = new javax.swing.JTabbedPane();
        Product_SP = new javax.swing.JScrollPane();
        Product_SP_panel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Product_Table = new javax.swing.JTable();

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

        panelUser.setOpaque(false);

        User_TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        User_TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        User_TabbedPane.setToolTipText("");
        User_TabbedPane.setAutoscrolls(true);
        User_TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        User_TabbedPane.setDoubleBuffered(true);
        User_TabbedPane.setFocusCycleRoot(true);
        User_TabbedPane.setFocusTraversalPolicyProvider(true);
        User_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                User_TabbedPaneStateChanged(evt);
            }
        });

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Usuario");

        labelPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Nueva Contraseña");

        errorUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N

        labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Checkmark_40px.png"))); // NOI18N
        labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDoneMouseClicked(evt);
            }
        });

        passwordR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordRKeyReleased(evt);
            }
        });

        labelPasswordR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPasswordR.setForeground(new java.awt.Color(255, 255, 255));
        labelPasswordR.setText("Repita Nueva contraseña");

        errorPasswordR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Correo");

        errorEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N

        labelEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Edit_40px.png"))); // NOI18N
        labelEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEditMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Información de Usuario");

        labelCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_40px.png"))); // NOI18N
        labelCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCancelMouseClicked(evt);
            }
        });

        passwordCurrent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordCurrentKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Contraseña Actual");

        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Teléfono");

        errorPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N

        ID.setEditable(false);
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDKeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ID");

        javax.swing.GroupLayout User_SPGeneral_panelLayout = new javax.swing.GroupLayout(User_SPGeneral_panel);
        User_SPGeneral_panel.setLayout(User_SPGeneral_panelLayout);
        User_SPGeneral_panelLayout.setHorizontalGroup(
            User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel28)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPassword)
                                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelPasswordR))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorPasswordR))
                                    .addComponent(passwordCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)
                                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel27))
                                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(errorPhone)
                                            .addComponent(errorUser)))
                                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel23)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorEmail)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCancel)
                                    .addComponent(labelEdit)
                                    .addComponent(labelDone))))
                        .addContainerGap(295, Short.MAX_VALUE))))
        );
        User_SPGeneral_panelLayout.setVerticalGroup(
            User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, User_SPGeneral_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(0, 0, 0)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(1, 1, 1)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, User_SPGeneral_panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(errorUser)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(0, 0, 0)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, User_SPGeneral_panelLayout.createSequentialGroup()
                                .addComponent(errorPhone)
                                .addGap(18, 18, 18)))
                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, 0)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(errorEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(0, 0, 0)
                        .addComponent(passwordCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPassword)
                        .addGap(1, 1, 1)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(User_SPGeneral_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(labelPasswordR)
                                .addGap(0, 0, 0)
                                .addComponent(passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(178, Short.MAX_VALUE))
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(errorPasswordR)
                                .addContainerGap(165, Short.MAX_VALUE))))
                    .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelEdit)
                        .addGap(72, 72, 72)
                        .addComponent(labelCancel)
                        .addGap(65, 65, 65)
                        .addComponent(labelDone)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        User_SPGeneral.setViewportView(User_SPGeneral_panel);

        User_TabbedPane.addTab("General", User_SPGeneral);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Administrar Usuarios");

        Admin_User_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Admin_User_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Admin_User_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin_User_TableMouseClicked(evt);
            }
        });
        Admin_User_Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Admin_User_TableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Admin_User_Table);

        labelDone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Checkmark_40px.png"))); // NOI18N
        labelDone1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDone1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDone1MouseClicked(evt);
            }
        });

        buttomAdministrator.setForeground(new java.awt.Color(255, 255, 255));
        buttomAdministrator.setText("Administrador");
        buttomAdministrator.setOpaque(false);
        buttomAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomAdministratorActionPerformed(evt);
            }
        });

        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);

        Admin_user_edit.setEditable(false);
        Admin_user_edit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Admin_user_editKeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(Admin_user_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Admin_user_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout User_SPAdministrar_panelLayout = new javax.swing.GroupLayout(User_SPAdministrar_panel);
        User_SPAdministrar_panel.setLayout(User_SPAdministrar_panelLayout);
        User_SPAdministrar_panelLayout.setHorizontalGroup(
            User_SPAdministrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_SPAdministrar_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(User_SPAdministrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(User_SPAdministrar_panelLayout.createSequentialGroup()
                        .addGroup(User_SPAdministrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(User_SPAdministrar_panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(buttomAdministrator)
                                .addGap(52, 52, 52)
                                .addComponent(labelDone1))
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        User_SPAdministrar_panelLayout.setVerticalGroup(
            User_SPAdministrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_SPAdministrar_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(User_SPAdministrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(User_SPAdministrar_panelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(User_SPAdministrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDone1)
                            .addComponent(buttomAdministrator))))
                .addGap(29, 29, 29))
        );

        User_SPAdminstrar.setViewportView(User_SPAdministrar_panel);

        User_TabbedPane.addTab("Administrar", User_SPAdminstrar);

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(User_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(User_TabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        Employee_TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Employee_TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Employee_TabbedPane.setToolTipText("");
        Employee_TabbedPane.setAutoscrolls(true);
        Employee_TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Employee_TabbedPane.setDoubleBuffered(true);
        Employee_TabbedPane.setFocusCycleRoot(true);
        Employee_TabbedPane.setFocusTraversalPolicyProvider(true);
        Employee_TabbedPane.setOpaque(true);
        Employee_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Employee_TabbedPaneStateChanged(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Listado de Empleados");

        jScrollPane2.setOpaque(false);

        Employee_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Correo", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Employee_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Employee_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Employee_Table.setEditingColumn(-1);
        Employee_Table.setEditingRow(-1);
        Employee_Table.setOpaque(false);
        Employee_Table.setRowSelectionAllowed(false);
        Employee_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Employee_Table.setUpdateSelectionOnSort(false);
        Employee_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(Employee_Table);

        javax.swing.GroupLayout Employee_SP_panelLayout = new javax.swing.GroupLayout(Employee_SP_panel);
        Employee_SP_panel.setLayout(Employee_SP_panelLayout);
        Employee_SP_panelLayout.setHorizontalGroup(
            Employee_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Employee_SP_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Employee_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(Employee_SP_panelLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        Employee_SP_panelLayout.setVerticalGroup(
            Employee_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Employee_SP_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(79, 79, 79))
        );

        Employee_SP.setViewportView(Employee_SP_panel);

        Employee_TabbedPane.addTab("Listado", Employee_SP);

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Employee_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Employee_TabbedPane)
        );

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
                .addContainerGap(14, Short.MAX_VALUE)
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

        labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });

        Product_TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Product_TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Product_TabbedPane.setToolTipText("");
        Product_TabbedPane.setAutoscrolls(true);
        Product_TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Product_TabbedPane.setDoubleBuffered(true);
        Product_TabbedPane.setFocusCycleRoot(true);
        Product_TabbedPane.setFocusTraversalPolicyProvider(true);
        Product_TabbedPane.setOpaque(true);
        Product_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Product_TabbedPaneStateChanged(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Listado de Productos");

        jScrollPane3.setOpaque(false);

        Product_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Correo", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Product_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Product_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Product_Table.setEditingColumn(-1);
        Product_Table.setEditingRow(-1);
        Product_Table.setOpaque(false);
        Product_Table.setRowSelectionAllowed(false);
        Product_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Product_Table.setUpdateSelectionOnSort(false);
        Product_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(Product_Table);

        javax.swing.GroupLayout Product_SP_panelLayout = new javax.swing.GroupLayout(Product_SP_panel);
        Product_SP_panel.setLayout(Product_SP_panelLayout);
        Product_SP_panelLayout.setHorizontalGroup(
            Product_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Product_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        Product_SP_panelLayout.setVerticalGroup(
            Product_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Product_SP.setViewportView(Product_SP_panel);

        Product_TabbedPane.addTab("Listado", Product_SP);

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Product_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Product_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FirstPlaneLayout = new javax.swing.GroupLayout(FirstPlane);
        FirstPlane.setLayout(FirstPlaneLayout);
        FirstPlaneLayout.setHorizontalGroup(
            FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstPlaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBack)
                .addContainerGap(753, Short.MAX_VALUE))
            .addComponent(panelProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FirstPlaneLayout.setVerticalGroup(
            FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstPlaneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            User_TabbedPane.setSelectedIndex(0);
            User_TabbedPane.addTab("Administrar", User_SPAdminstrar);
            User_TabbedPane.removeTabAt(1);
            if (property.getAccount().getLevel() == 1) {
                User_TabbedPane.addTab("Administrar", User_SPAdminstrar);
            } else {

            }
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
            Employee_refreshTable();
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
                panelUser.setVisible(false);
                panelStatistics.setVisible(false);
                internalPanel.setVisible(true);
                workSheet.getPanelStatistics().setVisible(true);
                workSheet.getAccount().setVisible(true);
                workSheet.getPanelClose().setVisible(true);
                workSheet.getStatusBar1().setInfo("Principal/");
                labelBack.setVisible(false);
            }
        }
    }//GEN-LAST:event_labelBackMouseClicked

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        if (!Validate(user.getText())) {
            errorUser.setVisible(true);
        } else {
            errorUser.setVisible(false);
        }
    }//GEN-LAST:event_userKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased

    }//GEN-LAST:event_passwordKeyReleased

    private void labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDoneMouseClicked
        System.out.println(property);
        property.getAccountList().remove(property.getAccount());
        if (property.getAccount().getLevel() == 1) {
            property.getAdminList().remove(property.getAccount());
        }
        if (!errorUser.isVisible() && !errorPasswordR.isVisible() && !errorEmail.isVisible()
                && !user.getText().isEmpty() && !password.getText().isEmpty() && !passwordR.getText().isEmpty() && !email.getText().isEmpty()) {
            if (property.contains(user.getText()) > -1) {
                JOptionPane.showMessageDialog(null, "Usuario ya existente", "Colición", 0);
                errorUser.setVisible(true);
            } else {
                if (passwordCurrent.getText().equals(property.getAccount().getPassword())) {
                    property.setAccount(new Account(password.getText(), user.getText(), email.getText(), property.getAccount().getLevel()));
                    Account_ResetFields();
                    workSheet.getStatusBar1().refresh();
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña actual errónea", "Error", 0);
                    passwordCurrent.setText("");
                }
            }
        }
        property.getAccountList().add(property.getAccount());
        if (property.getAccount().getLevel() == 1) {
            property.getAdminList().add(property.getAccount());
        }
    }//GEN-LAST:event_labelDoneMouseClicked

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

    private void labelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEditMouseClicked
        Account_SetFields();
    }//GEN-LAST:event_labelEditMouseClicked

    private void labelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCancelMouseClicked
        Account_ResetFields();
    }//GEN-LAST:event_labelCancelMouseClicked

    private void passwordCurrentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordCurrentKeyReleased

    }//GEN-LAST:event_passwordCurrentKeyReleased

    private void Admin_user_editKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Admin_user_editKeyReleased
        if (!Validate(user.getText())) {
            errorUser.setVisible(true);
        } else {
            errorUser.setVisible(false);
        }
    }//GEN-LAST:event_Admin_user_editKeyReleased

    private void Admin_User_TableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Admin_User_TableKeyTyped
        Admin_user_edit.setText(property.getAccountList().get(Admin_User_Table.getSelectedRow()).getName());
        if (property.getAccountList().get(Admin_User_Table.getSelectedRow()).getLevel() == 0) {
            buttomAdministrator.setSelected(false);
        } else {
            buttomAdministrator.setSelected(true);
        }
    }//GEN-LAST:event_Admin_User_TableKeyTyped

    private void Admin_User_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admin_User_TableMouseClicked
        Admin_user_edit.setText(property.getAccountList().get(Admin_User_Table.getSelectedRow()).getName());
        if (property.getAccountList().get(Admin_User_Table.getSelectedRow()).getLevel() == 0) {
            buttomAdministrator.setSelected(false);
        } else {
            buttomAdministrator.setSelected(true);
        }
    }//GEN-LAST:event_Admin_User_TableMouseClicked

    private void labelDone1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDone1MouseClicked
        if (Admin_User_Table.getSelectedRow() > -1) {
            int level = 0;
            if (buttomAdministrator.isSelected()) {
                level = 1;
            }
            property.getAccountList().get(Admin_User_Table.getSelectedRow()).setLevel(level);
            Admin_User_refreshTable();
            Admin_user_edit.setText("");
            buttomAdministrator.setSelected(false);
        }
    }//GEN-LAST:event_labelDone1MouseClicked

    private void User_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_User_TabbedPaneStateChanged
        if (User_TabbedPane.getSelectedIndex() == 1) {
            Admin_User_refreshTable();
            Admin_user_edit.setText("");
            buttomAdministrator.setSelected(false);
            Admin_user_edit.setVisible(true);
        } else {
            try {
                Account_ResetFields();
            } catch (Exception e) {
            }
            //Admin_user_edit.setVisible(true);
        }
    }//GEN-LAST:event_User_TabbedPaneStateChanged

    private void buttomAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomAdministratorActionPerformed
        if (Admin_User_Table.getSelectedRow() == -1) {
            buttomAdministrator.setSelected(false);
        }
    }//GEN-LAST:event_buttomAdministratorActionPerformed

    private void Employee_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Employee_TabbedPaneStateChanged
        if (Employee_TabbedPane.getSelectedIndex() == 0) {
            try {
                Employee_refreshTable();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_Employee_TabbedPaneStateChanged

    private void Product_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Product_TabbedPaneStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_TabbedPaneStateChanged

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneKeyReleased

    private void IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_IDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Admin_User_Table;
    private javax.swing.JTextField Admin_user_edit;
    private javax.swing.JScrollPane Employee_SP;
    private javax.swing.JPanel Employee_SP_panel;
    private javax.swing.JTabbedPane Employee_TabbedPane;
    private javax.swing.JTable Employee_Table;
    private javax.swing.JPanel FirstPlane;
    private javax.swing.JTextField ID;
    private javax.swing.JScrollPane Product_SP;
    private javax.swing.JPanel Product_SP_panel;
    private javax.swing.JTabbedPane Product_TabbedPane;
    private javax.swing.JTable Product_Table;
    private javax.swing.JPanel User_SPAdministrar_panel;
    private javax.swing.JScrollPane User_SPAdminstrar;
    private javax.swing.JScrollPane User_SPGeneral;
    private javax.swing.JPanel User_SPGeneral_panel;
    private javax.swing.JTabbedPane User_TabbedPane;
    private javax.swing.JRadioButton buttomAdministrator;
    private javax.swing.JTextField email;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorPasswordR;
    private javax.swing.JLabel errorPhone;
    private javax.swing.JLabel errorUser;
    private javax.swing.JPanel internalPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelCancel;
    private javax.swing.JLabel labelDone;
    private javax.swing.JLabel labelDone1;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPasswordR;
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
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField passwordCurrent;
    private javax.swing.JPasswordField passwordR;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField user;
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
            panelUser.setBackground(this.getBackground());
            internalPanel.setBackground(this.getBackground());
            User_SPAdminstrar.setBackground(this.getBackground());
            User_SPAdministrar_panel.setBackground(this.getBackground());
            User_SPGeneral.setBackground(this.getBackground());
            User_SPGeneral_panel.setBackground(this.getBackground());
            Employee_SP.setBackground(this.getBackground());
            Employee_SP_panel.setBackground(this.getBackground());
            Employee_TabbedPane.setBackground(this.getBackground());
        } catch (Exception e) {
        }
    }

    public void logout() {
        labelBackMouseClicked(null);
    }

    private boolean Validate(String text) {
        Pattern p = Pattern.compile("^\\s|^\\d|\\s|\\W");
        Matcher m = p.matcher(text);
        return !m.find();
    }

    public void Account_ResetFields() {
        labelEdit.setVisible(true);
        errorEmail.setVisible(false);
        errorPasswordR.setVisible(false);
        errorUser.setVisible(false);
        labelCancel.setVisible(false);
        labelDone.setVisible(false);
        labelPassword.setVisible(false);
        labelPasswordR.setVisible(false);
        password.setVisible(false);
        passwordR.setVisible(false);
        ID.setText(property.getAccount().getID());
        phone.setText(property.getAccount().getPhone());
        passwordCurrent.setText(property.getAccount().getPassword());
        email.setText(property.getAccount().getEmail());
        user.setText(property.getAccount().getName());
        email.setEditable(false);
        phone.setEditable(false);
        user.setEditable(false);
        passwordCurrent.setEditable(false);
        //passwordCurrent.setLocation(passwordCurrent.getY(), user.getX());
    }

    private void Account_SetFields() {
        labelEdit.setVisible(false);
        labelCancel.setVisible(true);
        labelDone.setVisible(true);
        labelPassword.setVisible(true);
        labelPasswordR.setVisible(true);
        password.setVisible(true);
        passwordR.setVisible(true);
        passwordCurrent.setText("");
        password.setText("");
        passwordR.setText("");
        email.setText(property.getAccount().getEmail());
        user.setText(property.getAccount().getName());
        email.setEditable(true);
        user.setEditable(true);
        phone.setEditable(true);
        passwordCurrent.setEditable(true);
    }

    private void Admin_User_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Administrador"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getAccountList().forEach((accountRow) -> {
            boolean level = false;
            if (accountRow.getLevel() == 1) {
                level = true;
            }
            model.addRow(new Object[]{accountRow.getName(), level});
        });
        Admin_User_Table.setModel(model);
    }

    private void Employee_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Correo", "Cargo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getAccountList().forEach((accountRow) -> {
            if (accountRow.getLevel() == 1) {
                model.addRow(new Object[]{accountRow.getName(), accountRow.getEmail(), "Administrador"});
            } else {
                model.addRow(new Object[]{accountRow.getName(), accountRow.getEmail(), "Empleado"});
            }
        });
        Employee_Table.setModel(model);
    }

    private void Prooduct_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Correo", "Cargo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getAccountList().forEach((accountRow) -> {
            if (accountRow.getLevel() == 1) {
                model.addRow(new Object[]{accountRow.getName(), accountRow.getEmail(), "Administrador"});
            } else {
                model.addRow(new Object[]{accountRow.getName(), accountRow.getEmail(), "Empleado"});
            }
        });
        Employee_Table.setModel(model);
    }
}
