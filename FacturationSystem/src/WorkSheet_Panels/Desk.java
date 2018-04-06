package WorkSheet_Panels;

import Entities.Client;
import Entities.Inventory;
import Entities.PersonaJuridica;
import Entities.PersonaNatural;
import Entities.Provider;
import Frames.WorkSheet;
import Resources.Property;
import Resources.Account;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Date;
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
        try {

            Product_Dialog_Select.setLocationRelativeTo(null);
            Product_Dialog_Select.pack();
            Client_Dialog_Select.setLocationRelativeTo(null);
            Client_Dialog_Select.pack();
            Provider_Dialog_Select.setLocationRelativeTo(null);
            Provider_Dialog_Select.pack();
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
            panelProveedores.setVisible(false);
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
            panelProveedores.setBounds(internalPanel.getBounds());
            panelProveedores.setSize(internalPanel.getSize());
            panelProveedores.setLocation(labelBack.getY() + 8, labelBack.getX() + 8);
            Admin_user_edit.setVisible(false);
            errorPhone.setVisible(false);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCaja = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        Product_Dialog_Select = new javax.swing.JDialog();
        Product_Dialog_Panel = new javax.swing.JPanel();
        Product_Select_labelBack = new javax.swing.JLabel();
        Product_Dialog_labelSelect = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Product_Dialog_Select_Table = new javax.swing.JTable();
        panelProductos = new javax.swing.JPanel();
        Product_TabbedPane = new javax.swing.JTabbedPane();
        Product_Add_SP = new javax.swing.JScrollPane();
        Product_SP_AddPanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Product_Add_Name = new javax.swing.JTextField();
        Product_Add_priceBoxSell = new javax.swing.JFormattedTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Product_Add_labelDone = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Product_Add_Date = new com.toedter.calendar.JDateChooser();
        Product_Add_Type = new javax.swing.JTextField();
        Product_Add_priceU = new javax.swing.JFormattedTextField();
        jLabel54 = new javax.swing.JLabel();
        Product_Add_priceUSell = new javax.swing.JFormattedTextField();
        jLabel55 = new javax.swing.JLabel();
        Product_Add_priceBox = new javax.swing.JFormattedTextField();
        Product_Add_impu = new javax.swing.JFormattedTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Product_Add_CantU = new javax.swing.JSpinner();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Product_Add_CantBox = new javax.swing.JSpinner();
        Product_List_SP = new javax.swing.JScrollPane();
        Product_SP_ListPanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Product_List_Table = new javax.swing.JTable();
        Product_List_Remove = new javax.swing.JLabel();
        Product_List_EditSelected = new javax.swing.JLabel();
        Product_Edit_SP = new javax.swing.JScrollPane();
        Product_SP_EditPanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        Product_Edit_labelSelect = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        Product_Edit_priceUSell = new javax.swing.JFormattedTextField();
        jLabel61 = new javax.swing.JLabel();
        Product_Edit_Name = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        Product_Edit_CantBox = new javax.swing.JSpinner();
        Product_Edit_priceBoxSell = new javax.swing.JFormattedTextField();
        Product_Edit_priceBox = new javax.swing.JFormattedTextField();
        jLabel63 = new javax.swing.JLabel();
        Product_Edit_impu = new javax.swing.JFormattedTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Product_Edit_labelDone = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        Product_Edit_Date = new com.toedter.calendar.JDateChooser();
        Product_Edit_CantU = new javax.swing.JSpinner();
        Product_Edit_Type = new javax.swing.JTextField();
        Product_Edit_priceU = new javax.swing.JFormattedTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        Client_Dialog_Select = new javax.swing.JDialog();
        Client_Dialog_Panel = new javax.swing.JPanel();
        Client_Select_labelBack = new javax.swing.JLabel();
        Client_Dialog_labelChangeType = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Client_Dialog_Select_Table = new javax.swing.JTable();
        Client_Dialog_Label_Type = new javax.swing.JLabel();
        Client_Dialog_labelSelect = new javax.swing.JLabel();
        Client_Add_Type_Group = new javax.swing.ButtonGroup();
        Client_Edit_Type_Group = new javax.swing.ButtonGroup();
        panelClientes = new javax.swing.JPanel();
        Client_TabbedPane = new javax.swing.JTabbedPane();
        Client_Add_SP = new javax.swing.JScrollPane();
        Client_SP_AddPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        Client_Add_Name = new javax.swing.JTextField();
        Client_Add_labelDone = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Client_Add_Type_Person = new javax.swing.JRadioButton();
        Client_Add_Type_Bussines = new javax.swing.JRadioButton();
        Client_Add_ID_RTN = new javax.swing.JFormattedTextField();
        Client_Add_Label_Type = new javax.swing.JLabel();
        Client_Add_Email = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        Client_Add_Phone = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        Client_Add_Department = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        Client_Add_Municipio = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        Client_Add_City = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        Client_List_SP = new javax.swing.JScrollPane();
        Client_SP_ListPanel = new javax.swing.JPanel();
        Client_List_Remove = new javax.swing.JLabel();
        Client_List_EditSelected = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Client_List_Table = new javax.swing.JTable();
        Client_List_labelChangeType = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Client_List_Label_Type = new javax.swing.JLabel();
        Client_Edit_SP = new javax.swing.JScrollPane();
        Client_SP_EditPanel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        Client_Edit_labelSelect = new javax.swing.JLabel();
        Client_Edit_Municipio = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        Client_Edit_City = new javax.swing.JTextField();
        Client_Edit_Name = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        Client_Edit_Type_Person = new javax.swing.JRadioButton();
        Client_Edit_Type_Bussines = new javax.swing.JRadioButton();
        Client_Edit_Email = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        Client_Edit_labelDone = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        Client_Edit_ID_RTN = new javax.swing.JFormattedTextField();
        Client_Edit_Phone = new javax.swing.JTextField();
        Client_Edit_Label_Type = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        Client_Edit_Department = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        panelProveedores = new javax.swing.JPanel();
        Provider_TabbedPane = new javax.swing.JTabbedPane();
        Provider_Add_SP = new javax.swing.JScrollPane();
        Provider_SP_AddPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        Provider_Add_Email = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        Provider_Add_Name = new javax.swing.JTextField();
        Provider_Add_Address = new javax.swing.JTextField();
        Provider_Add_labelDone = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        Provider_Add_RTN = new javax.swing.JFormattedTextField();
        Client_Add_Label_Type3 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        Provider_Add_Phone = new javax.swing.JTextField();
        Provider_List_SP = new javax.swing.JScrollPane();
        Provider_SP_ListPanel = new javax.swing.JPanel();
        Provider_List_Remove = new javax.swing.JLabel();
        Provider_List_EditSelected = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Provider_List_Table = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        Provider_Edit_SP = new javax.swing.JScrollPane();
        Provider_SP_EditPanel = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        Provider_Edit_labelSelect = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        Provider_Edit_Email = new javax.swing.JTextField();
        Client_Add_Label_Type2 = new javax.swing.JLabel();
        Provider_Edit_RTN = new javax.swing.JFormattedTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        Provider_Edit_labelDone = new javax.swing.JLabel();
        Provider_Edit_Address = new javax.swing.JTextField();
        Provider_Edit_Name = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        Provider_Edit_Phone = new javax.swing.JTextField();
        Provider_Dialog_Select = new javax.swing.JDialog();
        Provider_Dialog_Panel = new javax.swing.JPanel();
        Provider_Select_labelBack = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Provider_Dialog_Select_Table = new javax.swing.JTable();
        Provider_Dialog_labelSelect = new javax.swing.JLabel();
        FirstPlane = new javax.swing.JPanel();
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
        pProductos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pProveedores = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelCV = new javax.swing.JPanel();
        CV_TabbedPane = new javax.swing.JTabbedPane();
        Compras_SP = new javax.swing.JScrollPane();
        Compras_SP_panel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Compras_Table = new javax.swing.JTable();
        Ventas_SP = new javax.swing.JScrollPane();
        Ventas_SP_panel = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Ventas_Table = new javax.swing.JTable();
        Pagos_SP = new javax.swing.JScrollPane();
        Pagos_SP_panel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Pagos_Table = new javax.swing.JTable();
        labelBack = new javax.swing.JLabel();

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

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Teléfono");

        errorPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_Row_40px.png"))); // NOI18N

        ID.setEditable(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPasswordR)
                                .addGap(0, 0, 0)
                                .addComponent(passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(178, Short.MAX_VALUE))
                            .addGroup(User_SPGeneral_panelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(errorPasswordR)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                "ID", "Usuario", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                "ID", "Usuario", "Cargo", "Correo", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        Product_Dialog_Select.setTitle("Seleccionar Producto");
        Product_Dialog_Select.setAlwaysOnTop(true);
        Product_Dialog_Select.setIconImage(getIconImage());
        Product_Dialog_Select.setModal(true);
        Product_Dialog_Select.setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        Product_Select_labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        Product_Select_labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_Select_labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Select_labelBackMouseClicked(evt);
            }
        });

        Product_Dialog_labelSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Natural_User_Interface_2_40px.png"))); // NOI18N
        Product_Dialog_labelSelect.setText("Elegir producto");
        Product_Dialog_labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_Dialog_labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Dialog_labelSelectMouseClicked(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Listado de Productos");

        jScrollPane4.setOpaque(false);

        Product_Dialog_Select_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Precio unidad", "Precio venta unidad", "Precio caja", "Precio venta caja", "Impuesto", "Fecha vencimiento", "Existencia unidad", "Existencia caja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Product_Dialog_Select_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Product_Dialog_Select_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Product_Dialog_Select_Table.setEditingColumn(-1);
        Product_Dialog_Select_Table.setEditingRow(-1);
        Product_Dialog_Select_Table.setOpaque(false);
        Product_Dialog_Select_Table.setRowSelectionAllowed(false);
        Product_Dialog_Select_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Product_Dialog_Select_Table.setUpdateSelectionOnSort(false);
        Product_Dialog_Select_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(Product_Dialog_Select_Table);

        javax.swing.GroupLayout Product_Dialog_PanelLayout = new javax.swing.GroupLayout(Product_Dialog_Panel);
        Product_Dialog_Panel.setLayout(Product_Dialog_PanelLayout);
        Product_Dialog_PanelLayout.setHorizontalGroup(
            Product_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(Product_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Product_Dialog_PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Product_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                        .addGroup(Product_Dialog_PanelLayout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(Product_Dialog_labelSelect))
                        .addGroup(Product_Dialog_PanelLayout.createSequentialGroup()
                            .addComponent(Product_Select_labelBack)
                            .addGap(42, 42, 42)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        Product_Dialog_PanelLayout.setVerticalGroup(
            Product_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(Product_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Product_Dialog_PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Product_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel47)
                        .addComponent(Product_Select_labelBack))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Product_Dialog_labelSelect)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout Product_Dialog_SelectLayout = new javax.swing.GroupLayout(Product_Dialog_Select.getContentPane());
        Product_Dialog_Select.getContentPane().setLayout(Product_Dialog_SelectLayout);
        Product_Dialog_SelectLayout.setHorizontalGroup(
            Product_Dialog_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Product_Dialog_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Product_Dialog_SelectLayout.setVerticalGroup(
            Product_Dialog_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Product_Dialog_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Product_TabbedPane.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Agregar Producto");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Precio Caja");

        Product_Add_priceBoxSell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Add_priceBoxSell.setText("0");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Precio Unidad");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Precio Venta Caja");

        Product_Add_labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/60px/icons8_Checkmark_60px.png"))); // NOI18N
        Product_Add_labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_Add_labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Add_labelDoneMouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Fecha Vencimiento");

        Product_Add_Date.setOpaque(false);

        Product_Add_priceU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Add_priceU.setText("0");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Nombre");

        Product_Add_priceUSell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Add_priceUSell.setText("0");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Precio Venta Unidad");

        Product_Add_priceBox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Add_priceBox.setText("0");

        Product_Add_impu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0%"))));
        Product_Add_impu.setText("15");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Impuesto");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Tipo");

        Product_Add_CantU.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Cantidad Unidad");

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Cantidad Caja");

        Product_Add_CantBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout Product_SP_AddPanelLayout = new javax.swing.GroupLayout(Product_SP_AddPanel);
        Product_SP_AddPanel.setLayout(Product_SP_AddPanelLayout);
        Product_SP_AddPanelLayout.setHorizontalGroup(
            Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Product_Add_priceUSell, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Product_Add_Type)
                            .addComponent(Product_Add_Name)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53)
                            .addComponent(jLabel56)
                            .addComponent(Product_Add_impu)
                            .addComponent(Product_Add_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jLabel57)
                            .addComponent(jLabel51)
                            .addComponent(Product_Add_priceU))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel55)
                            .addComponent(jLabel52)
                            .addComponent(Product_Add_priceBoxSell, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jLabel50)
                            .addComponent(Product_Add_priceBox)
                            .addComponent(Product_Add_CantU)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(Product_Add_CantBox))))
                .addGap(18, 49, Short.MAX_VALUE)
                .addComponent(Product_Add_labelDone)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        Product_SP_AddPanelLayout.setVerticalGroup(
            Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(27, 27, 27)
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Add_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Add_priceUSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_SP_AddPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Product_Add_labelDone)
                        .addGap(1, 1, 1))
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product_Add_priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Add_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Add_priceBoxSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Product_Add_impu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product_Add_CantU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(Product_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Add_priceU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Product_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Add_CantBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        Product_Add_SP.setViewportView(Product_SP_AddPanel);

        Product_TabbedPane.addTab("Agregar", Product_Add_SP);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Listado de Productos");

        jScrollPane3.setOpaque(false);

        Product_List_Table.setAutoCreateRowSorter(true);
        Product_List_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Precio unidad", "Precio venta unidad", "Precio caja", "Precio venta caja", "Impuesto", "Fecha vencimiento", "Existencia unidad", "Existencia caja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Product_List_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Product_List_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Product_List_Table.setEditingColumn(-1);
        Product_List_Table.setEditingRow(-1);
        Product_List_Table.setOpaque(false);
        Product_List_Table.setRowSelectionAllowed(false);
        Product_List_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Product_List_Table.setUpdateSelectionOnSort(false);
        Product_List_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(Product_List_Table);

        Product_List_Remove.setForeground(new java.awt.Color(255, 255, 255));
        Product_List_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_40px.png"))); // NOI18N
        Product_List_Remove.setText("Eliminar");
        Product_List_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_List_Remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_List_RemoveMouseClicked(evt);
            }
        });

        Product_List_EditSelected.setForeground(new java.awt.Color(255, 255, 255));
        Product_List_EditSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Edit_40px.png"))); // NOI18N
        Product_List_EditSelected.setText("Modificar");
        Product_List_EditSelected.setToolTipText("");
        Product_List_EditSelected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_List_EditSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_List_EditSelectedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Product_SP_ListPanelLayout = new javax.swing.GroupLayout(Product_SP_ListPanel);
        Product_SP_ListPanel.setLayout(Product_SP_ListPanelLayout);
        Product_SP_ListPanelLayout.setHorizontalGroup(
            Product_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_ListPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Product_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_ListPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Product_List_Remove)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Product_List_EditSelected)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Product_SP_ListPanelLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Product_SP_ListPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        Product_SP_ListPanelLayout.setVerticalGroup(
            Product_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_ListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Product_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product_List_Remove)
                    .addComponent(Product_List_EditSelected))
                .addGap(9, 9, 9))
        );

        Product_List_SP.setViewportView(Product_SP_ListPanel);

        Product_TabbedPane.addTab("Listado", Product_List_SP);

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Editar Producto");

        Product_Edit_labelSelect.setForeground(new java.awt.Color(255, 255, 255));
        Product_Edit_labelSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Natural_User_Interface_2_40px.png"))); // NOI18N
        Product_Edit_labelSelect.setText("Elegir producto");
        Product_Edit_labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_Edit_labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Edit_labelSelectMouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Cantidad Unidad");

        Product_Edit_priceUSell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Edit_priceUSell.setText("0");

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Cantidad Caja");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Precio Venta Unidad");

        Product_Edit_CantBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        Product_Edit_priceBoxSell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Edit_priceBoxSell.setText("0");

        Product_Edit_priceBox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Edit_priceBox.setText("0");

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Precio Unidad");

        Product_Edit_impu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0%"))));
        Product_Edit_impu.setText("15");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Precio Venta Caja");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Impuesto");

        Product_Edit_labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/60px/icons8_Checkmark_60px.png"))); // NOI18N
        Product_Edit_labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_Edit_labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Edit_labelDoneMouseClicked(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Fecha Vencimiento");

        Product_Edit_Date.setOpaque(false);

        Product_Edit_CantU.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        Product_Edit_priceU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,###.000"))));
        Product_Edit_priceU.setText("0");

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Nombre");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Precio Caja");

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Tipo");

        javax.swing.GroupLayout Product_SP_EditPanelLayout = new javax.swing.GroupLayout(Product_SP_EditPanel);
        Product_SP_EditPanel.setLayout(Product_SP_EditPanelLayout);
        Product_SP_EditPanelLayout.setHorizontalGroup(
            Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Product_Edit_priceUSell, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Product_Edit_Type)
                                        .addComponent(Product_Edit_Name)
                                        .addComponent(jLabel67)
                                        .addComponent(jLabel66)
                                        .addComponent(jLabel65)
                                        .addComponent(Product_Edit_impu)
                                        .addComponent(Product_Edit_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel63)
                                        .addComponent(Product_Edit_priceU, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel69))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel64)
                                    .addComponent(Product_Edit_priceBoxSell)
                                    .addComponent(jLabel68)
                                    .addComponent(Product_Edit_priceBox)
                                    .addComponent(Product_Edit_CantU)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel61)
                                    .addComponent(Product_Edit_CantBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Product_Edit_labelDone)
                        .addGap(68, 68, 68))
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Product_Edit_labelSelect)
                        .addGap(45, 45, 45))))
        );
        Product_SP_EditPanelLayout.setVerticalGroup(
            Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(Product_Edit_labelSelect))
                .addGap(24, 24, 24)
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Edit_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Edit_priceUSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Edit_priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product_Edit_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product_Edit_priceBoxSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Product_Edit_labelDone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Product_Edit_impu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product_Edit_CantU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(Product_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Edit_priceU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Product_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Edit_CantBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Product_Edit_SP.setViewportView(Product_SP_EditPanel);

        Product_TabbedPane.addTab("Modificar", Product_Edit_SP);

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Product_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Product_TabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        Client_Dialog_Select.setTitle("Seleccionar Cliente");
        Client_Dialog_Select.setAlwaysOnTop(true);
        Client_Dialog_Select.setIconImage(getIconImage());
        Client_Dialog_Select.setModal(true);
        Client_Dialog_Select.setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        Client_Select_labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        Client_Select_labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_Select_labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_Select_labelBackMouseClicked(evt);
            }
        });

        Client_Dialog_labelChangeType.setForeground(new java.awt.Color(255, 255, 255));
        Client_Dialog_labelChangeType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Handle_With_Care_40px.png"))); // NOI18N
        Client_Dialog_labelChangeType.setText("Cambiar tipo de Cliente");
        Client_Dialog_labelChangeType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_Dialog_labelChangeType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_Dialog_labelChangeTypeMouseClicked(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Listado de Clientes");

        jScrollPane5.setOpaque(false);

        Client_Dialog_Select_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "ID", "Nombre", "Correo", "Teléfono", "Departamento", "Municipio", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Client_Dialog_Select_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Client_Dialog_Select_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Client_Dialog_Select_Table.setEditingColumn(-1);
        Client_Dialog_Select_Table.setEditingRow(-1);
        Client_Dialog_Select_Table.setOpaque(false);
        Client_Dialog_Select_Table.setRowSelectionAllowed(false);
        Client_Dialog_Select_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Client_Dialog_Select_Table.setUpdateSelectionOnSort(false);
        Client_Dialog_Select_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane5.setViewportView(Client_Dialog_Select_Table);

        Client_Dialog_Label_Type.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Client_Dialog_Label_Type.setForeground(new java.awt.Color(255, 255, 255));
        Client_Dialog_Label_Type.setText("Tipo: Persona");

        Client_Dialog_labelSelect.setForeground(new java.awt.Color(255, 255, 255));
        Client_Dialog_labelSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Natural_User_Interface_2_40px.png"))); // NOI18N
        Client_Dialog_labelSelect.setText("Elegir cliente");
        Client_Dialog_labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_Dialog_labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_Dialog_labelSelectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Client_Dialog_PanelLayout = new javax.swing.GroupLayout(Client_Dialog_Panel);
        Client_Dialog_Panel.setLayout(Client_Dialog_PanelLayout);
        Client_Dialog_PanelLayout.setHorizontalGroup(
            Client_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_Dialog_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Client_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(Client_Dialog_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Client_Dialog_labelChangeType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Client_Dialog_labelSelect)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Client_Dialog_PanelLayout.createSequentialGroup()
                        .addComponent(Client_Select_labelBack)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(Client_Dialog_Label_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Client_Dialog_PanelLayout.setVerticalGroup(
            Client_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_Dialog_PanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Client_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Client_Select_labelBack)
                    .addGroup(Client_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(Client_Dialog_Label_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Client_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Client_Dialog_labelSelect)
                    .addComponent(Client_Dialog_labelChangeType))
                .addContainerGap())
        );

        javax.swing.GroupLayout Client_Dialog_SelectLayout = new javax.swing.GroupLayout(Client_Dialog_Select.getContentPane());
        Client_Dialog_Select.getContentPane().setLayout(Client_Dialog_SelectLayout);
        Client_Dialog_SelectLayout.setHorizontalGroup(
            Client_Dialog_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_Dialog_SelectLayout.createSequentialGroup()
                .addComponent(Client_Dialog_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Client_Dialog_SelectLayout.setVerticalGroup(
            Client_Dialog_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Client_Dialog_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Client_TabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        Client_TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Client_TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Client_TabbedPane.setToolTipText("");
        Client_TabbedPane.setAutoscrolls(true);
        Client_TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Client_TabbedPane.setDoubleBuffered(true);
        Client_TabbedPane.setFocusCycleRoot(true);
        Client_TabbedPane.setFocusTraversalPolicyProvider(true);
        Client_TabbedPane.setOpaque(true);
        Client_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Client_TabbedPaneStateChanged(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Agregar Cliente");

        Client_Add_labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/60px/icons8_Checkmark_60px.png"))); // NOI18N
        Client_Add_labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_Add_labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_Add_labelDoneMouseClicked(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Nombre");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Tipo");

        Client_Add_Type_Group.add(Client_Add_Type_Person);
        Client_Add_Type_Person.setForeground(new java.awt.Color(255, 255, 255));
        Client_Add_Type_Person.setText("Persona");
        Client_Add_Type_Person.setOpaque(false);
        Client_Add_Type_Person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_Add_Type_PersonActionPerformed(evt);
            }
        });

        Client_Add_Type_Group.add(Client_Add_Type_Bussines);
        Client_Add_Type_Bussines.setForeground(new java.awt.Color(255, 255, 255));
        Client_Add_Type_Bussines.setText("Empresa");
        Client_Add_Type_Bussines.setOpaque(false);
        Client_Add_Type_Bussines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_Add_Type_BussinesActionPerformed(evt);
            }
        });

        Client_Add_ID_RTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-####-#####"))));

        Client_Add_Label_Type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Client_Add_Label_Type.setForeground(new java.awt.Color(255, 255, 255));
        Client_Add_Label_Type.setText("Id");

        jLabel90.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Correo");

        jLabel91.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Teléfono");

        jLabel92.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Departamento");

        jLabel93.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Municipio");

        jLabel94.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Ciudad");

        javax.swing.GroupLayout Client_SP_AddPanelLayout = new javax.swing.GroupLayout(Client_SP_AddPanel);
        Client_SP_AddPanel.setLayout(Client_SP_AddPanelLayout);
        Client_SP_AddPanelLayout.setHorizontalGroup(
            Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Client_Add_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel74)
                        .addComponent(jLabel77)
                        .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(Client_Add_Label_Type))
                        .addComponent(Client_Add_ID_RTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Client_Add_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jLabel90)))
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Client_Add_Type_Person)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_Type_Bussines)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Client_Add_Department, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jLabel92))
                            .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Client_Add_Municipio)
                                .addComponent(jLabel93)
                                .addComponent(Client_Add_City, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel94)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Client_Add_labelDone))
                    .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Client_Add_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addComponent(jLabel91)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Client_SP_AddPanelLayout.setVerticalGroup(
            Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(27, 27, 27)
                .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                                .addComponent(Client_Add_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jLabel93))
                            .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Client_Add_labelDone)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Client_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Client_Add_Type_Person)
                            .addComponent(Client_Add_Type_Bussines))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(Client_Add_Label_Type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_ID_RTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(Client_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Add_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        Client_Add_SP.setViewportView(Client_SP_AddPanel);

        Client_TabbedPane.addTab("Agregar", Client_Add_SP);

        Client_List_Remove.setForeground(new java.awt.Color(255, 255, 255));
        Client_List_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_40px.png"))); // NOI18N
        Client_List_Remove.setText("Eliminar");
        Client_List_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_List_Remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_List_RemoveMouseClicked(evt);
            }
        });

        Client_List_EditSelected.setForeground(new java.awt.Color(255, 255, 255));
        Client_List_EditSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Edit_40px.png"))); // NOI18N
        Client_List_EditSelected.setText("Modificar");
        Client_List_EditSelected.setToolTipText("");
        Client_List_EditSelected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_List_EditSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_List_EditSelectedMouseClicked(evt);
            }
        });

        jScrollPane7.setOpaque(false);

        Client_List_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "ID", "Nombre", "Correo", "Teléfono", "Departamento", "Municipio", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Client_List_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Client_List_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Client_List_Table.setEditingColumn(-1);
        Client_List_Table.setEditingRow(-1);
        Client_List_Table.setOpaque(false);
        Client_List_Table.setRowSelectionAllowed(false);
        Client_List_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Client_List_Table.setUpdateSelectionOnSort(false);
        Client_List_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane7.setViewportView(Client_List_Table);

        Client_List_labelChangeType.setForeground(new java.awt.Color(255, 255, 255));
        Client_List_labelChangeType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Handle_With_Care_40px.png"))); // NOI18N
        Client_List_labelChangeType.setText("Cambiar tipo de Cliente");
        Client_List_labelChangeType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_List_labelChangeType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_List_labelChangeTypeMouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Listado de Clientes");

        Client_List_Label_Type.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Client_List_Label_Type.setForeground(new java.awt.Color(255, 255, 255));
        Client_List_Label_Type.setText("Tipo: Persona");

        javax.swing.GroupLayout Client_SP_ListPanelLayout = new javax.swing.GroupLayout(Client_SP_ListPanel);
        Client_SP_ListPanel.setLayout(Client_SP_ListPanelLayout);
        Client_SP_ListPanelLayout.setHorizontalGroup(
            Client_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_SP_ListPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Client_List_labelChangeType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Client_List_Remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Client_List_EditSelected)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Client_SP_ListPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Client_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_SP_ListPanelLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(Client_List_Label_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane7)))
        );
        Client_SP_ListPanelLayout.setVerticalGroup(
            Client_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_SP_ListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Client_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(Client_List_Label_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Client_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Client_List_labelChangeType)
                    .addComponent(Client_List_EditSelected)
                    .addComponent(Client_List_Remove))
                .addGap(17, 17, 17))
        );

        Client_List_SP.setViewportView(Client_SP_ListPanel);

        Client_TabbedPane.addTab("Listado", Client_List_SP);

        Client_SP_EditPanel.setToolTipText("");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Editar Cliente");

        Client_Edit_labelSelect.setForeground(new java.awt.Color(255, 255, 255));
        Client_Edit_labelSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Natural_User_Interface_2_40px.png"))); // NOI18N
        Client_Edit_labelSelect.setText("Elegir cliente");
        Client_Edit_labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_Edit_labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Edit_labelSelect1MouseClicked(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Nombre");

        jLabel95.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Municipio");

        jLabel96.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Ciudad");

        Client_Edit_Type_Group.add(Client_Edit_Type_Person);
        Client_Edit_Type_Person.setForeground(new java.awt.Color(255, 255, 255));
        Client_Edit_Type_Person.setText("Persona");
        Client_Edit_Type_Person.setOpaque(false);
        Client_Edit_Type_Person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_Edit_Type_PersonActionPerformed(evt);
            }
        });

        Client_Edit_Type_Group.add(Client_Edit_Type_Bussines);
        Client_Edit_Type_Bussines.setForeground(new java.awt.Color(255, 255, 255));
        Client_Edit_Type_Bussines.setText("Empresa");
        Client_Edit_Type_Bussines.setOpaque(false);
        Client_Edit_Type_Bussines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_Edit_Type_BussinesActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Correo");

        Client_Edit_labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/60px/icons8_Checkmark_60px.png"))); // NOI18N
        Client_Edit_labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client_Edit_labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_Edit_labelDoneMouseClicked(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Tipo");

        Client_Edit_ID_RTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-####-#####"))));

        Client_Edit_Label_Type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Client_Edit_Label_Type.setForeground(new java.awt.Color(255, 255, 255));
        Client_Edit_Label_Type.setText("Id");

        jLabel98.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Teléfono");

        jLabel99.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Departamento");

        javax.swing.GroupLayout Client_SP_EditPanelLayout = new javax.swing.GroupLayout(Client_SP_EditPanel);
        Client_SP_EditPanel.setLayout(Client_SP_EditPanelLayout);
        Client_SP_EditPanelLayout.setHorizontalGroup(
            Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Client_Edit_labelSelect)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_SP_EditPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Client_Edit_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel75)
                        .addComponent(jLabel78)
                        .addComponent(Client_Edit_Label_Type)
                        .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                            .addComponent(Client_Edit_Type_Person)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Client_Edit_Type_Bussines))
                        .addComponent(Client_Edit_ID_RTN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Client_Edit_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jLabel97))))
                    .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 91, Short.MAX_VALUE)
                .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                        .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Client_Edit_Department, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jLabel99))
                            .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Client_Edit_Municipio)
                                .addComponent(jLabel95)
                                .addComponent(Client_Edit_City, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel96)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Client_Edit_labelDone))
                    .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Client_Edit_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addComponent(jLabel98)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        Client_SP_EditPanelLayout.setVerticalGroup(
            Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(Client_Edit_labelSelect))
                .addGap(30, 30, 30)
                .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Edit_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Edit_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Client_Edit_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Client_Edit_labelDone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(Client_Edit_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Client_Edit_Type_Person)
                            .addComponent(Client_Edit_Type_Bussines))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Client_Edit_Label_Type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Edit_ID_RTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(Client_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Edit_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Client_Edit_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        Client_Edit_SP.setViewportView(Client_SP_EditPanel);

        Client_TabbedPane.addTab("Modificar", Client_Edit_SP);

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Client_TabbedPane)
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Client_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        Provider_TabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        Provider_TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Provider_TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Provider_TabbedPane.setToolTipText("");
        Provider_TabbedPane.setAutoscrolls(true);
        Provider_TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Provider_TabbedPane.setDoubleBuffered(true);
        Provider_TabbedPane.setFocusCycleRoot(true);
        Provider_TabbedPane.setFocusTraversalPolicyProvider(true);
        Provider_TabbedPane.setOpaque(true);
        Provider_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Provider_TabbedPaneStateChanged(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Agregar Proveedor");

        jLabel113.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Teléfono");

        Provider_Add_labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/60px/icons8_Checkmark_60px.png"))); // NOI18N
        Provider_Add_labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_Add_labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_Add_labelDoneMouseClicked(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Dirección");

        jLabel83.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Nombre");

        Provider_Add_RTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        Client_Add_Label_Type3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Client_Add_Label_Type3.setForeground(new java.awt.Color(255, 255, 255));
        Client_Add_Label_Type3.setText("RTN");

        jLabel115.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Correo");

        javax.swing.GroupLayout Provider_SP_AddPanelLayout = new javax.swing.GroupLayout(Provider_SP_AddPanel);
        Provider_SP_AddPanel.setLayout(Provider_SP_AddPanelLayout);
        Provider_SP_AddPanelLayout.setHorizontalGroup(
            Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Provider_Add_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Client_Add_Label_Type3)
                        .addComponent(Provider_Add_RTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Provider_Add_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addComponent(jLabel115)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Provider_Add_labelDone)
                    .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Provider_Add_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addComponent(jLabel113))
                    .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Provider_Add_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addComponent(jLabel114)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        Provider_SP_AddPanelLayout.setVerticalGroup(
            Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(26, 26, 26)
                .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Add_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Add_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(Client_Add_Label_Type3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Add_RTN))
                    .addGroup(Provider_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Add_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(Provider_SP_AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Provider_SP_AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Add_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Provider_Add_labelDone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        Provider_Add_SP.setViewportView(Provider_SP_AddPanel);

        Provider_TabbedPane.addTab("Agregar", Provider_Add_SP);

        Provider_List_Remove.setForeground(new java.awt.Color(255, 255, 255));
        Provider_List_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Delete_40px.png"))); // NOI18N
        Provider_List_Remove.setText("Eliminar");
        Provider_List_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_List_Remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_List_RemoveMouseClicked(evt);
            }
        });

        Provider_List_EditSelected.setForeground(new java.awt.Color(255, 255, 255));
        Provider_List_EditSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Edit_40px.png"))); // NOI18N
        Provider_List_EditSelected.setText("Modificar");
        Provider_List_EditSelected.setToolTipText("");
        Provider_List_EditSelected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_List_EditSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_List_EditSelectedMouseClicked(evt);
            }
        });

        jScrollPane8.setOpaque(false);

        Provider_List_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RTN", "Nombre", "Correo", "Teléfono", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Provider_List_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Provider_List_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Provider_List_Table.setEditingColumn(-1);
        Provider_List_Table.setEditingRow(-1);
        Provider_List_Table.setOpaque(false);
        Provider_List_Table.setRowSelectionAllowed(false);
        Provider_List_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Provider_List_Table.setUpdateSelectionOnSort(false);
        Provider_List_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane8.setViewportView(Provider_List_Table);

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Listado de Proveedores");

        javax.swing.GroupLayout Provider_SP_ListPanelLayout = new javax.swing.GroupLayout(Provider_SP_ListPanel);
        Provider_SP_ListPanel.setLayout(Provider_SP_ListPanelLayout);
        Provider_SP_ListPanelLayout.setHorizontalGroup(
            Provider_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_SP_ListPanelLayout.createSequentialGroup()
                .addGroup(Provider_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Provider_SP_ListPanelLayout.createSequentialGroup()
                        .addGroup(Provider_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Provider_SP_ListPanelLayout.createSequentialGroup()
                                .addContainerGap(126, Short.MAX_VALUE)
                                .addComponent(Provider_List_Remove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addComponent(Provider_List_EditSelected))
                            .addGroup(Provider_SP_ListPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel70)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE))
                    .addGroup(Provider_SP_ListPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8)))
                .addContainerGap())
        );
        Provider_SP_ListPanelLayout.setVerticalGroup(
            Provider_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_SP_ListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Provider_SP_ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Provider_List_Remove)
                    .addComponent(Provider_List_EditSelected))
                .addGap(9, 9, 9))
        );

        Provider_List_SP.setViewportView(Provider_SP_ListPanel);

        Provider_TabbedPane.addTab("Listado", Provider_List_SP);

        Provider_SP_EditPanel.setToolTipText("");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Editar Proveedor");

        Provider_Edit_labelSelect.setForeground(new java.awt.Color(255, 255, 255));
        Provider_Edit_labelSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Natural_User_Interface_2_40px.png"))); // NOI18N
        Provider_Edit_labelSelect.setText("Elegir proveedor");
        Provider_Edit_labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_Edit_labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_Edit_labelSelectMouseClicked(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Correo");

        Client_Add_Label_Type2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Client_Add_Label_Type2.setForeground(new java.awt.Color(255, 255, 255));
        Client_Add_Label_Type2.setText("RTN");

        Provider_Edit_RTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-####-#####"))));

        jLabel82.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Nombre");

        jLabel111.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Dirección");

        Provider_Edit_labelDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/60px/icons8_Checkmark_60px.png"))); // NOI18N
        Provider_Edit_labelDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_Edit_labelDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_Edit_labelDoneMouseClicked(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Teléfono");

        javax.swing.GroupLayout Provider_SP_EditPanelLayout = new javax.swing.GroupLayout(Provider_SP_EditPanel);
        Provider_SP_EditPanel.setLayout(Provider_SP_EditPanelLayout);
        Provider_SP_EditPanelLayout.setHorizontalGroup(
            Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Provider_Edit_labelSelect))
                    .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addContainerGap(88, Short.MAX_VALUE)
                        .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Provider_Edit_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82)
                            .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Client_Add_Label_Type2)
                                .addComponent(Provider_Edit_RTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Provider_Edit_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jLabel110)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Provider_Edit_labelDone)
                            .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Provider_Edit_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jLabel112))
                            .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Provider_Edit_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jLabel111)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        Provider_SP_EditPanelLayout.setVerticalGroup(
            Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(Provider_Edit_labelSelect))
                .addGap(27, 27, 27)
                .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Edit_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Edit_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(Client_Add_Label_Type2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Edit_RTN))
                    .addGroup(Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Edit_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(Provider_SP_EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Provider_SP_EditPanelLayout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Provider_Edit_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Provider_Edit_labelDone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        Provider_Edit_SP.setViewportView(Provider_SP_EditPanel);

        Provider_TabbedPane.addTab("Modificar", Provider_Edit_SP);

        javax.swing.GroupLayout panelProveedoresLayout = new javax.swing.GroupLayout(panelProveedores);
        panelProveedores.setLayout(panelProveedoresLayout);
        panelProveedoresLayout.setHorizontalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Provider_TabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelProveedoresLayout.setVerticalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Provider_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        Provider_Dialog_Select.setTitle("Seleccionar Proveedor");
        Provider_Dialog_Select.setAlwaysOnTop(true);
        Provider_Dialog_Select.setIconImage(getIconImage());
        Provider_Dialog_Select.setModal(true);
        Provider_Dialog_Select.setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        Provider_Select_labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        Provider_Select_labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_Select_labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_Select_labelBackMouseClicked(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Listado de Proveedores");

        jScrollPane6.setOpaque(false);

        Provider_Dialog_Select_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RTN", "Nombre", "Correo", "Teléfono", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Provider_Dialog_Select_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Provider_Dialog_Select_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Provider_Dialog_Select_Table.setEditingColumn(-1);
        Provider_Dialog_Select_Table.setEditingRow(-1);
        Provider_Dialog_Select_Table.setOpaque(false);
        Provider_Dialog_Select_Table.setRowSelectionAllowed(false);
        Provider_Dialog_Select_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Provider_Dialog_Select_Table.setUpdateSelectionOnSort(false);
        Provider_Dialog_Select_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane6.setViewportView(Provider_Dialog_Select_Table);

        Provider_Dialog_labelSelect.setForeground(new java.awt.Color(255, 255, 255));
        Provider_Dialog_labelSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Natural_User_Interface_2_40px.png"))); // NOI18N
        Provider_Dialog_labelSelect.setText("Elegir Proveedor");
        Provider_Dialog_labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Provider_Dialog_labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Provider_Dialog_labelSelectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Provider_Dialog_PanelLayout = new javax.swing.GroupLayout(Provider_Dialog_Panel);
        Provider_Dialog_Panel.setLayout(Provider_Dialog_PanelLayout);
        Provider_Dialog_PanelLayout.setHorizontalGroup(
            Provider_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_Dialog_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Provider_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(Provider_Dialog_PanelLayout.createSequentialGroup()
                        .addComponent(Provider_Select_labelBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel71)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Provider_Dialog_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Provider_Dialog_labelSelect)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Provider_Dialog_PanelLayout.setVerticalGroup(
            Provider_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Provider_Dialog_PanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Provider_Dialog_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Provider_Select_labelBack)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(Provider_Dialog_labelSelect)
                .addContainerGap())
        );

        javax.swing.GroupLayout Provider_Dialog_SelectLayout = new javax.swing.GroupLayout(Provider_Dialog_Select.getContentPane());
        Provider_Dialog_Select.getContentPane().setLayout(Provider_Dialog_SelectLayout);
        Provider_Dialog_SelectLayout.setHorizontalGroup(
            Provider_Dialog_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Provider_Dialog_SelectLayout.createSequentialGroup()
                .addComponent(Provider_Dialog_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Provider_Dialog_SelectLayout.setVerticalGroup(
            Provider_Dialog_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Provider_Dialog_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
        jLabel10.setText("Compras / Ventas / Pagos");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Handshake_100px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pCVLayout = new javax.swing.GroupLayout(pCV);
        pCV.setLayout(pCVLayout);
        pCVLayout.setHorizontalGroup(
            pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
            .addGroup(pCVLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pCVLayout.setVerticalGroup(
            pCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCVLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
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
            .addGap(0, 124, Short.MAX_VALUE)
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
            .addGap(0, 146, Short.MAX_VALUE)
            .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pEmpleadosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9)
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

        pProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pProveedoresMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Conference_100px.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Proveedores");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pProveedoresLayout = new javax.swing.GroupLayout(pProveedores);
        pProveedores.setLayout(pProveedoresLayout);
        pProveedoresLayout.setHorizontalGroup(
            pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pProveedoresLayout.createSequentialGroup()
                    .addGroup(pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pProveedoresLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel11))
                        .addGroup(pProveedoresLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel16)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pProveedoresLayout.setVerticalGroup(
            pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pProveedoresLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel16)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout internalPanelLayout = new javax.swing.GroupLayout(internalPanel);
        internalPanel.setLayout(internalPanelLayout);
        internalPanelLayout.setHorizontalGroup(
            internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(internalPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        internalPanelLayout.setVerticalGroup(
            internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(internalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CV_TabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        CV_TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        CV_TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        CV_TabbedPane.setToolTipText("");
        CV_TabbedPane.setAutoscrolls(true);
        CV_TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CV_TabbedPane.setDoubleBuffered(true);
        CV_TabbedPane.setFocusCycleRoot(true);
        CV_TabbedPane.setFocusTraversalPolicyProvider(true);
        CV_TabbedPane.setOpaque(true);
        CV_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CV_TabbedPaneStateChanged(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Listado de Compras");

        jScrollPane9.setOpaque(false);

        Compras_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RTN Proveedor", "CAI", "Número de documentos fiscales", "Subtotal compra", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Compras_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Compras_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Compras_Table.setEditingColumn(-1);
        Compras_Table.setEditingRow(-1);
        Compras_Table.setOpaque(false);
        Compras_Table.setRowSelectionAllowed(false);
        Compras_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Compras_Table.setUpdateSelectionOnSort(false);
        Compras_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane9.setViewportView(Compras_Table);

        javax.swing.GroupLayout Compras_SP_panelLayout = new javax.swing.GroupLayout(Compras_SP_panel);
        Compras_SP_panel.setLayout(Compras_SP_panelLayout);
        Compras_SP_panelLayout.setHorizontalGroup(
            Compras_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Compras_SP_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Compras_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Compras_SP_panelLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Compras_SP_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );
        Compras_SP_panelLayout.setVerticalGroup(
            Compras_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Compras_SP_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        Compras_SP.setViewportView(Compras_SP_panel);

        CV_TabbedPane.addTab("Compras", Compras_SP);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Listado de Ventas");

        jScrollPane10.setOpaque(false);

        Ventas_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ingreso exento", "Ingreso gravado", "Impuesto", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Ventas_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Ventas_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Ventas_Table.setEditingColumn(-1);
        Ventas_Table.setEditingRow(-1);
        Ventas_Table.setOpaque(false);
        Ventas_Table.setRowSelectionAllowed(false);
        Ventas_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Ventas_Table.setUpdateSelectionOnSort(false);
        Ventas_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane10.setViewportView(Ventas_Table);

        javax.swing.GroupLayout Ventas_SP_panelLayout = new javax.swing.GroupLayout(Ventas_SP_panel);
        Ventas_SP_panel.setLayout(Ventas_SP_panelLayout);
        Ventas_SP_panelLayout.setHorizontalGroup(
            Ventas_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas_SP_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Ventas_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ventas_SP_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(Ventas_SP_panelLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Ventas_SP_panelLayout.setVerticalGroup(
            Ventas_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas_SP_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        Ventas_SP.setViewportView(Ventas_SP_panel);

        CV_TabbedPane.addTab("Ventas", Ventas_SP);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Listado de Pagos");

        jScrollPane11.setOpaque(false);

        Pagos_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Número crédito", "Abono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Pagos_Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Pagos_Table.setDropMode(javax.swing.DropMode.INSERT_COLS);
        Pagos_Table.setEditingColumn(-1);
        Pagos_Table.setEditingRow(-1);
        Pagos_Table.setOpaque(false);
        Pagos_Table.setRowSelectionAllowed(false);
        Pagos_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Pagos_Table.setUpdateSelectionOnSort(false);
        Pagos_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane11.setViewportView(Pagos_Table);

        javax.swing.GroupLayout Pagos_SP_panelLayout = new javax.swing.GroupLayout(Pagos_SP_panel);
        Pagos_SP_panel.setLayout(Pagos_SP_panelLayout);
        Pagos_SP_panelLayout.setHorizontalGroup(
            Pagos_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagos_SP_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Pagos_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagos_SP_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(Pagos_SP_panelLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Pagos_SP_panelLayout.setVerticalGroup(
            Pagos_SP_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagos_SP_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        Pagos_SP.setViewportView(Pagos_SP_panel);

        CV_TabbedPane.addTab("Pagos", Pagos_SP);

        javax.swing.GroupLayout panelCVLayout = new javax.swing.GroupLayout(panelCV);
        panelCV.setLayout(panelCVLayout);
        panelCVLayout.setHorizontalGroup(
            panelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CV_TabbedPane)
        );
        panelCVLayout.setVerticalGroup(
            panelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CV_TabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/40px/icons8_Back_40px_1.png"))); // NOI18N
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FirstPlaneLayout = new javax.swing.GroupLayout(FirstPlane);
        FirstPlane.setLayout(FirstPlaneLayout);
        FirstPlaneLayout.setHorizontalGroup(
            FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstPlaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBack)
                .addContainerGap(791, Short.MAX_VALUE))
            .addComponent(panelCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FirstPlaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(internalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        FirstPlaneLayout.setVerticalGroup(
            FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstPlaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FirstPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FirstPlaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(internalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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
            Product_refreshTable();
            Product_Add_refresh();
            Product_TabbedPane.setSelectedIndex(0);
        }
    }//GEN-LAST:event_pProductosMouseClicked

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        if (buttonClicked == true) {
            buttonClicked = false;
            labelBackMouseClicked(evt);
        } else {
            if (workSheet.getPanelStatistics().isVisible() == false) {
                panelCaja.setVisible(false);
                panelProveedores.setVisible(false);
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
            if (property.containsAccount(user.getText()) > -1) {
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
        try {
            switch (Product_TabbedPane.getSelectedIndex()) {
                case 0: {

                    Product_Add_refresh();
                    break;
                }
                case 1: {
                    Product_refreshTable();
                    break;
                }
                case 2: {
                    Product_Edit_refresh();
                    Product_Edit_Name.setEnabled(false);
                    Product_Edit_Type.setEnabled(false);
                    Product_Edit_impu.setEnabled(false);
                    Product_Edit_priceU.setEnabled(false);
                    Product_Edit_priceUSell.setEnabled(false);
                    Product_Edit_priceBoxSell.setEnabled(false);
                    Product_Edit_priceBox.setEnabled(false);
                    Product_Edit_CantU.setEnabled(false);;
                    Product_Edit_CantBox.setEnabled(false);;
                    Product_Edit_Date.setEnabled(false);
                    Product_Edit_labelDone.setEnabled(false);
                    break;
                }
                default: {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Product_TabbedPaneStateChanged

    private void Product_Edit_labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Edit_labelSelectMouseClicked
        Product_Dialog_Select.setLocationRelativeTo(null);
        Product_Dialog_Select.pack();

        Product_Dialog_Select.setVisible(true);
    }//GEN-LAST:event_Product_Edit_labelSelectMouseClicked

    private void Product_List_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_List_RemoveMouseClicked
        if (Product_List_Table.getSelectedRow() > -1) {
            property.getProductList().remove(Product_List_Table.getSelectedRow());
            Product_refreshTable();
        }
    }//GEN-LAST:event_Product_List_RemoveMouseClicked

    private void Product_List_EditSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_List_EditSelectedMouseClicked
        if (Product_List_Table.getSelectedRow() > -1) {
            Product_TabbedPane.setSelectedIndex(2);
            Product_SelectProduct(Product_Selected_row = Product_List_Table.getSelectedRow());
            Product_Edit_Name.setEnabled(true);
            Product_Edit_Type.setEnabled(true);
            Product_Edit_impu.setEnabled(true);
            Product_Edit_priceU.setEnabled(true);
            Product_Edit_priceUSell.setEnabled(true);
            Product_Edit_priceBoxSell.setEnabled(true);
            Product_Edit_priceBox.setEnabled(true);
            Product_Edit_CantU.setEnabled(true);;
            Product_Edit_CantBox.setEnabled(true);;
            Product_Edit_Date.setEnabled(true);
            Product_Edit_labelDone.setEnabled(true);
        }
    }//GEN-LAST:event_Product_List_EditSelectedMouseClicked

    private void Product_Dialog_labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Dialog_labelSelectMouseClicked
        if (Product_Dialog_Select_Table.getSelectedRow() > -1) {
            Product_Dialog_Select.dispose();
            Product_SelectProduct(Product_Selected_row = Product_Dialog_Select_Table.getSelectedRow());
            Product_Edit_Name.setEnabled(true);
            Product_Edit_Type.setEnabled(true);
            Product_Edit_impu.setEnabled(true);
            Product_Edit_priceU.setEnabled(true);
            Product_Edit_priceUSell.setEnabled(true);
            Product_Edit_priceBoxSell.setEnabled(true);
            Product_Edit_priceBox.setEnabled(true);
            Product_Edit_CantU.setEnabled(true);;
            Product_Edit_CantBox.setEnabled(true);;
            Product_Edit_Date.setEnabled(true);
            Product_Edit_labelDone.setEnabled(true);
        }
    }//GEN-LAST:event_Product_Dialog_labelSelectMouseClicked

    private void Product_Select_labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Select_labelBackMouseClicked
        Product_Dialog_Select.dispose();
    }//GEN-LAST:event_Product_Select_labelBackMouseClicked

    private void Product_Add_labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Add_labelDoneMouseClicked
        if (!Product_Add_Name.getText().isEmpty() && !Product_Add_Type.getText().isEmpty() && !Product_Add_impu.getText().isEmpty()) {
            try {
                property.getProductList().add(new Inventory(property.getLastProductId() + 1, Product_Add_Name.getText(),
                        Float.parseFloat(Product_Add_impu.getText()), Float.parseFloat(Product_Add_priceBox.getText()),
                        Float.parseFloat(Product_Add_priceU.getText()), Float.parseFloat(Product_Add_priceBoxSell.getText()),
                        Float.parseFloat(Product_Add_priceUSell.getText()),
                        Product_Add_Date.getDate().toString(), Integer.parseInt(Product_Add_CantU.getValue().toString()),
                        Integer.parseInt(Product_Add_CantBox.getValue().toString()), Product_Add_Type.getText()));
                property.setLastProductId(property.getLastProductId() + 1);
                Product_Add_refresh();
                Product_Edit_Name.setEnabled(false);
                Product_Edit_Type.setEnabled(false);
                Product_Edit_impu.setEnabled(false);
                Product_Edit_priceU.setEnabled(false);
                Product_Edit_priceUSell.setEnabled(false);
                Product_Edit_priceBoxSell.setEnabled(false);
                Product_Edit_priceBox.setEnabled(false);
                Product_Edit_CantU.setEnabled(false);;
                Product_Edit_CantBox.setEnabled(false);;
                Product_Edit_Date.setEnabled(false);
                Product_Edit_labelDone.setEnabled(false);
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Product_Add_labelDoneMouseClicked

    private void Product_Edit_labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Edit_labelDoneMouseClicked
        if (Product_Edit_labelDone.isEnabled() && !Product_Edit_Name.getText().isEmpty() && !Product_Edit_Type.getText().isEmpty() && !Product_Edit_impu.getText().isEmpty()) {
            try {
                property.getProductList().set(Product_Selected_row, new Inventory(
                        property.getProductList().get(Product_Selected_row).getIdProducto(), Product_Edit_Name.getText(),
                        Float.parseFloat(Product_Edit_impu.getText()), Float.parseFloat(Product_Edit_priceBox.getText()),
                        Float.parseFloat(Product_Edit_priceU.getText()), Float.parseFloat(Product_Edit_priceBoxSell.getText()),
                        Float.parseFloat(Product_Edit_priceUSell.getText()),
                        Product_Edit_Date.getDate().toString(), Integer.parseInt(Product_Edit_CantU.getValue().toString()),
                        Integer.parseInt(Product_Edit_CantBox.getValue().toString()), Product_Edit_Type.getText()));
                Product_Edit_refresh();
                Product_Edit_Name.setEnabled(false);
                Product_Edit_Type.setEnabled(false);
                Product_Edit_impu.setEnabled(false);
                Product_Edit_priceU.setEnabled(false);
                Product_Edit_priceUSell.setEnabled(false);
                Product_Edit_priceBoxSell.setEnabled(false);
                Product_Edit_priceBox.setEnabled(false);
                Product_Edit_CantU.setEnabled(false);;
                Product_Edit_CantBox.setEnabled(false);;
                Product_Edit_Date.setEnabled(false);
                Product_Edit_labelDone.setEnabled(false);
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Product_Edit_labelDoneMouseClicked

    private void Client_Select_labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_Select_labelBackMouseClicked
        Client_Dialog_Select.dispose();
    }//GEN-LAST:event_Client_Select_labelBackMouseClicked

    private void Client_Dialog_labelChangeTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_Dialog_labelChangeTypeMouseClicked
        Client_ChangeType = !Client_ChangeType;
        if (Client_ChangeType == true) {
            Client_Dialog_Label_Type.setText("Tipo: Empresa");
        } else {
            Client_Dialog_Label_Type.setText("Tipo: Persona");
        }
        Client_refreshTable();
    }//GEN-LAST:event_Client_Dialog_labelChangeTypeMouseClicked

    private void Client_Add_labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_Add_labelDoneMouseClicked
        if (Client_Add_labelDone.isEnabled() && !Client_Add_Name.getText().isEmpty() && !Client_Add_Department.getText().isEmpty()
                && !Client_Add_City.getText().isEmpty() && !Client_Add_Email.getText().isEmpty() && !Client_Add_ID_RTN.getText().isEmpty()
                && !Client_Add_Municipio.getText().isEmpty() && !Client_Add_Phone.getText().isEmpty()) {
            try {
                if (Client_Add_Type_Person.isSelected()) {
                    property.getClientList().add(new PersonaNatural(
                            Client_Add_ID_RTN.getText(), property.getLastNumClient() + 1, Client_Add_Name.getText(),
                            Client_Add_Email.getText(), Client_Add_Phone.getText(), Client_Add_Department.getText(),
                            Client_Add_Municipio.getText(), Client_Add_City.getText()
                    ));
                } else {
                    property.getClientList().add(new PersonaJuridica(
                            Client_Add_ID_RTN.getText(), property.getLastNumClient() + 1, Client_Add_Name.getText(),
                            Client_Add_Email.getText(), Client_Add_Phone.getText(), Client_Add_Department.getText(),
                            Client_Add_Municipio.getText(), Client_Add_City.getText()
                    ));
                }
                property.setLastNumClient(property.getLastNumClient() + 1);
                Client_Add_refresh();
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Client_Add_labelDoneMouseClicked

    private void Client_List_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_List_RemoveMouseClicked
        if (Client_List_Table.getSelectedRow() > -1) {
            property.getClientList().remove(Client_List_Table.getSelectedRow());
            Client_refreshTable();
        }
    }//GEN-LAST:event_Client_List_RemoveMouseClicked

    private void Client_List_EditSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_List_EditSelectedMouseClicked
        if (Client_List_Table.getSelectedRow() > -1) {
            Client_TabbedPane.setSelectedIndex(2);
            Client_SelectClient(Client_Selected_row = Client_List_Table.getSelectedRow());
            Client_Edit_Name.setEnabled(true);
            Client_Edit_Email.setEnabled(true);
            Client_Edit_Phone.setEnabled(true);
            Client_Edit_Department.setEnabled(true);
            Client_Edit_Municipio.setEnabled(true);
            Client_Edit_City.setEnabled(true);
            Client_Edit_ID_RTN.setEnabled(true);
            Client_Edit_Type_Person.setEnabled(true);
            Client_Edit_Type_Bussines.setEnabled(true);
        }
    }//GEN-LAST:event_Client_List_EditSelectedMouseClicked

    private void Product_Edit_labelSelect1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Edit_labelSelect1MouseClicked
        Client_Dialog_Select.setLocationRelativeTo(null);
        Client_Dialog_Select.pack();
        Client_refreshTable();
        Client_Dialog_Select.setVisible(true);
    }//GEN-LAST:event_Product_Edit_labelSelect1MouseClicked

    private void Client_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Client_TabbedPaneStateChanged
        try {
            switch (Client_TabbedPane.getSelectedIndex()) {
                case 0: {
                    Client_Add_refresh();
                    break;
                }
                case 1: {
                    Client_ChangeType = false;
                    Client_refreshTable();
                    Client_Dialog_Label_Type.setText("Tipo: Persona");
                    Client_List_Label_Type.setText("Tipo: Persona");
                    break;
                }
                case 2: {
                    Client_ChangeType = false;
                    Client_List_Label_Type.setText("Tipo: Persona");
                    Client_Edit_refresh();
                    Client_Edit_Name.setEnabled(false);
                    Client_Edit_Email.setEnabled(false);
                    Client_Edit_Phone.setEnabled(false);
                    Client_Edit_Department.setEnabled(false);
                    Client_Edit_Municipio.setEnabled(false);
                    Client_Edit_City.setEnabled(false);
                    Client_Edit_ID_RTN.setEnabled(false);
                    Client_Edit_Type_Person.setEnabled(false);
                    Client_Edit_Type_Bussines.setEnabled(false);
                    break;
                }
                default: {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Client_TabbedPaneStateChanged

    private void Client_Dialog_labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_Dialog_labelSelectMouseClicked
        if (Client_Dialog_Select_Table.getSelectedRow() > -1) {
            Client_Dialog_Select.dispose();
            Client_SelectClient(Client_Dialog_Select_Table.getSelectedRow());
            Client_Edit_Name.setEnabled(true);
            Client_Edit_Email.setEnabled(true);
            Client_Edit_Phone.setEnabled(true);
            Client_Edit_Department.setEnabled(true);
            Client_Edit_Municipio.setEnabled(true);
            Client_Edit_City.setEnabled(true);
            Client_Edit_ID_RTN.setEnabled(true);
            Client_Edit_Type_Person.setEnabled(true);
            Client_Edit_Type_Bussines.setEnabled(true);
            Client_ChangeType = false;
            Client_Dialog_Label_Type.setText("Tipo: Persona");
            Client_List_Label_Type.setText("Tipo: Persona");
        }
    }//GEN-LAST:event_Client_Dialog_labelSelectMouseClicked

    private void Client_Add_Type_PersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_Add_Type_PersonActionPerformed
        Client_Add_Label_Type.setText("ID");
    }//GEN-LAST:event_Client_Add_Type_PersonActionPerformed

    private void Client_Add_Type_BussinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_Add_Type_BussinesActionPerformed
        Client_Add_Label_Type.setText("RTN");
    }//GEN-LAST:event_Client_Add_Type_BussinesActionPerformed

    private void Client_Edit_Type_PersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_Edit_Type_PersonActionPerformed
        Client_Edit_Label_Type.setText("ID");
    }//GEN-LAST:event_Client_Edit_Type_PersonActionPerformed

    private void Client_Edit_Type_BussinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_Edit_Type_BussinesActionPerformed
        Client_Edit_Label_Type.setText("RTN");
    }//GEN-LAST:event_Client_Edit_Type_BussinesActionPerformed

    private void Client_Edit_labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_Edit_labelDoneMouseClicked
        if (Client_Edit_labelDone.isEnabled() && !Client_Edit_Name.getText().isEmpty() && !Client_Edit_Department.getText().isEmpty()
                && !Client_Edit_City.getText().isEmpty() && !Client_Edit_Email.getText().isEmpty() && !Client_Edit_ID_RTN.getText().isEmpty()
                && !Client_Edit_Municipio.getText().isEmpty() && !Client_Edit_Phone.getText().isEmpty()) {
            try {
                if (Client_Edit_Type_Person.isSelected()) {
                    property.getClientList().set(Client_Selected_row, new PersonaNatural(
                            Client_Edit_ID_RTN.getText(), property.getLastNumClient() + 1, Client_Edit_Name.getText(),
                            Client_Edit_Email.getText(), Client_Edit_Phone.getText(), Client_Edit_Department.getText(),
                            Client_Edit_Municipio.getText(), Client_Edit_City.getText()
                    ));
                } else {
                    property.getClientList().set(Client_Selected_row, new PersonaJuridica(
                            Client_Edit_ID_RTN.getText(), property.getLastNumClient() + 1, Client_Edit_Name.getText(),
                            Client_Edit_Email.getText(), Client_Edit_Phone.getText(), Client_Edit_Department.getText(),
                            Client_Edit_Municipio.getText(), Client_Edit_City.getText()
                    ));
                }
                Client_Edit_refresh();
                Client_Edit_Name.setEnabled(false);
                Client_Edit_Email.setEnabled(false);
                Client_Edit_Phone.setEnabled(false);
                Client_Edit_Department.setEnabled(false);
                Client_Edit_Municipio.setEnabled(false);
                Client_Edit_City.setEnabled(false);
                Client_Edit_ID_RTN.setEnabled(false);
                Client_Edit_Type_Person.setEnabled(false);
                Client_Edit_Type_Bussines.setEnabled(false);
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Client_Edit_labelDoneMouseClicked

    private void Client_List_labelChangeTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_List_labelChangeTypeMouseClicked
        Client_ChangeType = !Client_ChangeType;
        if (Client_ChangeType == true) {
            Client_List_Label_Type.setText("Tipo: Empresa");
        } else {
            Client_List_Label_Type.setText("Tipo: Persona");
        }
        Client_refreshTable();
    }//GEN-LAST:event_Client_List_labelChangeTypeMouseClicked

    private void pProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pProveedoresMouseClicked
        if (property.isLogged()) {
            this.buttonClicked = true;
            workSheet.getPanelStatistics().setVisible(false);
            workSheet.getAccount().setVisible(false);
            workSheet.getPanelClose().setVisible(false);
            workSheet.getStatusBar1().setInfo("Principal/Proveedores/");
            labelBack.setVisible(true);
            // Oculto el panel Principal
            // Muestro panel interno (panelProveedores)
            internalPanel.setVisible(false);
            panelProveedores.setVisible(true);
        }
    }//GEN-LAST:event_pProveedoresMouseClicked

    private void Provider_List_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_List_RemoveMouseClicked
        if (Provider_List_Table.getSelectedRow() > -1) {
            property.getProviderList().remove(Provider_List_Table.getSelectedRow());
            Provider_refreshTable();
        }
    }//GEN-LAST:event_Provider_List_RemoveMouseClicked

    private void Provider_List_EditSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_List_EditSelectedMouseClicked
        if (Provider_List_Table.getSelectedRow() > -1) {
            Provider_TabbedPane.setSelectedIndex(2);
            Provider_SelectProvider(Provider_Selected_row = Provider_List_Table.getSelectedRow());
            Provider_Edit_Name.setEnabled(true);
            Provider_Edit_Email.setEnabled(true);
            Provider_Edit_Phone.setEnabled(true);
            Provider_Edit_Address.setEnabled(true);
            Provider_Edit_RTN.setEnabled(true);
        }
    }//GEN-LAST:event_Provider_List_EditSelectedMouseClicked

    private void Provider_Edit_labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_Edit_labelSelectMouseClicked
        Provider_Dialog_Select.setLocationRelativeTo(null);
        Provider_Dialog_Select.pack();
        Provider_refreshTable();
        Provider_Dialog_Select.setVisible(true);
    }//GEN-LAST:event_Provider_Edit_labelSelectMouseClicked

    private void Provider_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Provider_TabbedPaneStateChanged
        try {
            switch (Provider_TabbedPane.getSelectedIndex()) {
                case 0: {
                    Provider_Add_refresh();
                    break;
                }
                case 1: {
                    Provider_refreshTable();
                    break;
                }
                case 2: {
                    Provider_Edit_refresh();
                    Provider_Edit_Name.setEnabled(false);
                    Provider_Edit_Email.setEnabled(false);
                    Provider_Edit_Phone.setEnabled(false);
                    Provider_Edit_Address.setEnabled(false);
                    Provider_Edit_RTN.setEnabled(false);
                    break;
                }
                default: {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Provider_TabbedPaneStateChanged

    private void Provider_Edit_labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_Edit_labelDoneMouseClicked
        if (Provider_Edit_labelDone.isEnabled() && !Provider_Edit_Name.getText().isEmpty() && !Provider_Edit_Address.getText().isEmpty()
                && !Provider_Edit_RTN.getText().isEmpty() && !Provider_Edit_Email.getText().isEmpty() && !Provider_Edit_Phone.getText().isEmpty()) {
            try {
                property.getProviderList().set(Provider_Selected_row, new Provider(
                        Provider_Edit_RTN.getText(), Provider_Edit_Name.getText(),
                        Provider_Edit_Address.getText(), Provider_Edit_Email.getText(), Provider_Edit_Phone.getText()
                ));
                Provider_Edit_Name.setEnabled(false);
                Provider_Edit_Email.setEnabled(false);
                Provider_Edit_Phone.setEnabled(false);
                Provider_Edit_Address.setEnabled(false);
                Provider_Edit_RTN.setEnabled(false);
                Provider_Edit_refresh();
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Provider_Edit_labelDoneMouseClicked

    private void Provider_Add_labelDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_Add_labelDoneMouseClicked
        if (!Provider_Add_Name.getText().isEmpty() && !Provider_Add_Address.getText().isEmpty()
                && !Provider_Add_RTN.getText().isEmpty() && !Provider_Add_Email.getText().isEmpty() && !Provider_Add_Phone.getText().isEmpty()) {
            try {
                property.getProviderList().add(new Provider(Provider_Add_RTN.getText(), Provider_Add_Name.getText(),
                        Provider_Add_Address.getText(), Provider_Add_Email.getText(), Provider_Add_Phone.getText()
                ));
                Provider_Add_refresh();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Provider_Add_labelDoneMouseClicked

    private void Provider_Select_labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_Select_labelBackMouseClicked
        Provider_Dialog_Select.dispose();
    }//GEN-LAST:event_Provider_Select_labelBackMouseClicked

    private void Provider_Dialog_labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Provider_Dialog_labelSelectMouseClicked
        if (Provider_Dialog_Select_Table.getSelectedRow() > -1) {
            Provider_Dialog_Select.dispose();
            Provider_SelectProvider(Provider_Selected_row = Provider_Dialog_Select_Table.getSelectedRow());
            Provider_Edit_Name.setEnabled(true);
            Provider_Edit_Email.setEnabled(true);
            Provider_Edit_Phone.setEnabled(true);
            Provider_Edit_Address.setEnabled(true);
            Provider_Edit_RTN.setEnabled(true);
        }
    }//GEN-LAST:event_Provider_Dialog_labelSelectMouseClicked

    private void CV_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CV_TabbedPaneStateChanged
        try {

            switch (CV_TabbedPane.getSelectedIndex()) {
                case 0: {
                    Purchases_refreshTable();
                    break;
                }
                case 1: {
                    Sells_refreshTable();
                    break;
                }
                case 2: {
                    Pays_refreshTable();
                    break;
                }
                default: {
                    break;
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_CV_TabbedPaneStateChanged
    /**
     *
     * Establece ícono de ventana
     *
     * @return Ícono
     */
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("ICO/100px/icons8_Connect_Develop_100px.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Admin_User_Table;
    private javax.swing.JTextField Admin_user_edit;
    private javax.swing.JTabbedPane CV_TabbedPane;
    private javax.swing.JTextField Client_Add_City;
    private javax.swing.JTextField Client_Add_Department;
    private javax.swing.JTextField Client_Add_Email;
    private javax.swing.JFormattedTextField Client_Add_ID_RTN;
    private javax.swing.JLabel Client_Add_Label_Type;
    private javax.swing.JLabel Client_Add_Label_Type2;
    private javax.swing.JLabel Client_Add_Label_Type3;
    private javax.swing.JTextField Client_Add_Municipio;
    private javax.swing.JTextField Client_Add_Name;
    private javax.swing.JTextField Client_Add_Phone;
    private javax.swing.JScrollPane Client_Add_SP;
    private javax.swing.JRadioButton Client_Add_Type_Bussines;
    private javax.swing.ButtonGroup Client_Add_Type_Group;
    private javax.swing.JRadioButton Client_Add_Type_Person;
    private javax.swing.JLabel Client_Add_labelDone;
    private javax.swing.JLabel Client_Dialog_Label_Type;
    private javax.swing.JPanel Client_Dialog_Panel;
    private javax.swing.JDialog Client_Dialog_Select;
    private javax.swing.JTable Client_Dialog_Select_Table;
    private javax.swing.JLabel Client_Dialog_labelChangeType;
    private javax.swing.JLabel Client_Dialog_labelSelect;
    private javax.swing.JTextField Client_Edit_City;
    private javax.swing.JTextField Client_Edit_Department;
    private javax.swing.JTextField Client_Edit_Email;
    private javax.swing.JFormattedTextField Client_Edit_ID_RTN;
    private javax.swing.JLabel Client_Edit_Label_Type;
    private javax.swing.JTextField Client_Edit_Municipio;
    private javax.swing.JTextField Client_Edit_Name;
    private javax.swing.JTextField Client_Edit_Phone;
    private javax.swing.JScrollPane Client_Edit_SP;
    private javax.swing.JRadioButton Client_Edit_Type_Bussines;
    private javax.swing.ButtonGroup Client_Edit_Type_Group;
    private javax.swing.JRadioButton Client_Edit_Type_Person;
    private javax.swing.JLabel Client_Edit_labelDone;
    private javax.swing.JLabel Client_Edit_labelSelect;
    private javax.swing.JLabel Client_List_EditSelected;
    private javax.swing.JLabel Client_List_Label_Type;
    private javax.swing.JLabel Client_List_Remove;
    private javax.swing.JScrollPane Client_List_SP;
    private javax.swing.JTable Client_List_Table;
    private javax.swing.JLabel Client_List_labelChangeType;
    private javax.swing.JPanel Client_SP_AddPanel;
    private javax.swing.JPanel Client_SP_EditPanel;
    private javax.swing.JPanel Client_SP_ListPanel;
    private javax.swing.JLabel Client_Select_labelBack;
    private javax.swing.JTabbedPane Client_TabbedPane;
    private javax.swing.JScrollPane Compras_SP;
    private javax.swing.JPanel Compras_SP_panel;
    private javax.swing.JTable Compras_Table;
    private javax.swing.JScrollPane Employee_SP;
    private javax.swing.JPanel Employee_SP_panel;
    private javax.swing.JTabbedPane Employee_TabbedPane;
    private javax.swing.JTable Employee_Table;
    private javax.swing.JPanel FirstPlane;
    private javax.swing.JTextField ID;
    private javax.swing.JScrollPane Pagos_SP;
    private javax.swing.JPanel Pagos_SP_panel;
    private javax.swing.JTable Pagos_Table;
    private javax.swing.JSpinner Product_Add_CantBox;
    private javax.swing.JSpinner Product_Add_CantU;
    private com.toedter.calendar.JDateChooser Product_Add_Date;
    private javax.swing.JTextField Product_Add_Name;
    private javax.swing.JScrollPane Product_Add_SP;
    private javax.swing.JTextField Product_Add_Type;
    private javax.swing.JFormattedTextField Product_Add_impu;
    private javax.swing.JLabel Product_Add_labelDone;
    private javax.swing.JFormattedTextField Product_Add_priceBox;
    private javax.swing.JFormattedTextField Product_Add_priceBoxSell;
    private javax.swing.JFormattedTextField Product_Add_priceU;
    private javax.swing.JFormattedTextField Product_Add_priceUSell;
    private javax.swing.JPanel Product_Dialog_Panel;
    private javax.swing.JDialog Product_Dialog_Select;
    private javax.swing.JTable Product_Dialog_Select_Table;
    private javax.swing.JLabel Product_Dialog_labelSelect;
    private javax.swing.JSpinner Product_Edit_CantBox;
    private javax.swing.JSpinner Product_Edit_CantU;
    private com.toedter.calendar.JDateChooser Product_Edit_Date;
    private javax.swing.JTextField Product_Edit_Name;
    private javax.swing.JScrollPane Product_Edit_SP;
    private javax.swing.JTextField Product_Edit_Type;
    private javax.swing.JFormattedTextField Product_Edit_impu;
    private javax.swing.JLabel Product_Edit_labelDone;
    private javax.swing.JLabel Product_Edit_labelSelect;
    private javax.swing.JFormattedTextField Product_Edit_priceBox;
    private javax.swing.JFormattedTextField Product_Edit_priceBoxSell;
    private javax.swing.JFormattedTextField Product_Edit_priceU;
    private javax.swing.JFormattedTextField Product_Edit_priceUSell;
    private javax.swing.JLabel Product_List_EditSelected;
    private javax.swing.JLabel Product_List_Remove;
    private javax.swing.JScrollPane Product_List_SP;
    private javax.swing.JTable Product_List_Table;
    private javax.swing.JPanel Product_SP_AddPanel;
    private javax.swing.JPanel Product_SP_EditPanel;
    private javax.swing.JPanel Product_SP_ListPanel;
    private javax.swing.JLabel Product_Select_labelBack;
    private javax.swing.JTabbedPane Product_TabbedPane;
    private javax.swing.JTextField Provider_Add_Address;
    private javax.swing.JTextField Provider_Add_Email;
    private javax.swing.JTextField Provider_Add_Name;
    private javax.swing.JTextField Provider_Add_Phone;
    private javax.swing.JFormattedTextField Provider_Add_RTN;
    private javax.swing.JScrollPane Provider_Add_SP;
    private javax.swing.JLabel Provider_Add_labelDone;
    private javax.swing.JPanel Provider_Dialog_Panel;
    private javax.swing.JDialog Provider_Dialog_Select;
    private javax.swing.JTable Provider_Dialog_Select_Table;
    private javax.swing.JLabel Provider_Dialog_labelSelect;
    private javax.swing.JTextField Provider_Edit_Address;
    private javax.swing.JTextField Provider_Edit_Email;
    private javax.swing.JTextField Provider_Edit_Name;
    private javax.swing.JTextField Provider_Edit_Phone;
    private javax.swing.JFormattedTextField Provider_Edit_RTN;
    private javax.swing.JScrollPane Provider_Edit_SP;
    private javax.swing.JLabel Provider_Edit_labelDone;
    private javax.swing.JLabel Provider_Edit_labelSelect;
    private javax.swing.JLabel Provider_List_EditSelected;
    private javax.swing.JLabel Provider_List_Remove;
    private javax.swing.JScrollPane Provider_List_SP;
    private javax.swing.JTable Provider_List_Table;
    private javax.swing.JPanel Provider_SP_AddPanel;
    private javax.swing.JPanel Provider_SP_EditPanel;
    private javax.swing.JPanel Provider_SP_ListPanel;
    private javax.swing.JLabel Provider_Select_labelBack;
    private javax.swing.JTabbedPane Provider_TabbedPane;
    private javax.swing.JPanel User_SPAdministrar_panel;
    private javax.swing.JScrollPane User_SPAdminstrar;
    private javax.swing.JScrollPane User_SPGeneral;
    private javax.swing.JPanel User_SPGeneral_panel;
    private javax.swing.JTabbedPane User_TabbedPane;
    private javax.swing.JScrollPane Ventas_SP;
    private javax.swing.JPanel Ventas_SP_panel;
    private javax.swing.JTable Ventas_Table;
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
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelCancel;
    private javax.swing.JLabel labelDone;
    private javax.swing.JLabel labelDone1;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPasswordR;
    private javax.swing.JPanel pCV;
    private javax.swing.JPanel pCaja;
    private javax.swing.JPanel pClientes;
    private javax.swing.JPanel pEmpleados;
    private javax.swing.JPanel pProductos;
    private javax.swing.JPanel pProveedores;
    private javax.swing.JPanel panelAjustes;
    private javax.swing.JPanel panelCV;
    private javax.swing.JPanel panelCaja;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelProveedores;
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
    /**
     * Fila de producto seleccionada para editar.
     */
    private int Product_Selected_row;
    /**
     * Fila de ciente seleccionada para editar.
     */
    private int Client_Selected_row;
    /**
     * Fila de Proveedor seleccionada para editar.
     */
    private int Provider_Selected_row;
    /**
     * Tipo de Cliente.
     */
    private boolean Client_ChangeType = false;

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
            pCV.setBackground(this.getBackground());
            pCaja.setBackground(this.getBackground());
            pClientes.setBackground(this.getBackground());
            pEmpleados.setBackground(this.getBackground());
            pProductos.setBackground(this.getBackground());
            pProveedores.setBackground(this.getBackground());
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
            Product_Add_SP.setBackground(this.getBackground());
            Product_Dialog_Select.setBackground(this.getBackground());
            Product_Dialog_Panel.setBackground(this.getBackground());
            Product_List_SP.setBackground(this.getBackground());
            Product_Edit_SP.setBackground(this.getBackground());
            Product_SP_ListPanel.setBackground(this.getBackground());
            Product_SP_AddPanel.setBackground(this.getBackground());
            Product_SP_EditPanel.setBackground(this.getBackground());
            Product_TabbedPane.setBackground(this.getBackground());
            Client_SP_ListPanel.setBackground(this.getBackground());
            Client_SP_AddPanel.setBackground(this.getBackground());
            Client_SP_EditPanel.setBackground(this.getBackground());
            Client_TabbedPane.setBackground(this.getBackground());
            Client_List_SP.setBackground(this.getBackground());
            Client_Edit_SP.setBackground(this.getBackground());
            Client_Add_SP.setBackground(this.getBackground());
            Client_Dialog_Select.setBackground(this.getBackground());
            Client_Dialog_Panel.setBackground(this.getBackground());
            Provider_SP_ListPanel.setBackground(this.getBackground());
            Provider_SP_AddPanel.setBackground(this.getBackground());
            Provider_SP_EditPanel.setBackground(this.getBackground());
            Provider_TabbedPane.setBackground(this.getBackground());
            Provider_List_SP.setBackground(this.getBackground());
            Provider_Edit_SP.setBackground(this.getBackground());
            Provider_Add_SP.setBackground(this.getBackground());
            Provider_Dialog_Select.setBackground(this.getBackground());
            Provider_Dialog_Panel.setBackground(this.getBackground());
            CV_TabbedPane.setBackground(this.getBackground());
            Compras_SP.setBackground(this.getBackground());
            Compras_SP_panel.setBackground(this.getBackground());
            Ventas_SP.setBackground(this.getBackground());
            Ventas_SP_panel.setBackground(this.getBackground());
            Pagos_SP.setBackground(this.getBackground());
            Pagos_SP_panel.setBackground(this.getBackground());
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
                    "ID", "Usuario", "Administrador"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

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
            model.addRow(new Object[]{accountRow.getID(), accountRow.getName(), level});
        });
        Admin_User_Table.setModel(model);
    }

    private void Employee_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Usuario", "Cargo", "Correo", "Teléfono"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getAccountList().forEach((accountRow) -> {
            if (accountRow.getLevel() == 1) {
                model.addRow(new Object[]{accountRow.getID(), accountRow.getName(), accountRow.getEmail(), "Administrador"});
            } else {
                model.addRow(new Object[]{accountRow.getID(), accountRow.getName(), accountRow.getEmail(), "Empleado"});
            }
        });
        Employee_Table.setModel(model);
    }

    private void Product_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Nombre", "Tipo", "Precio unidad", "Precio venta unidad", "Precio caja", "Precio venta caja", "Impuesto", "Fecha vencimiento", "Existencia unidad", "Existencia caja"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getProductList().forEach((p) -> {
            model.addRow(new Object[]{p.getIdProducto(), p.getNombreProducto(), p.getTipo(), p.getPrecioUnidad(), p.getPrecioVentaUnidad(), p.getPrecioCaja(), p.getPrecioVentaCaja(), p.getImpuesto(), p.getFechaVencimiento(), p.getCantidadUnidad(), p.getCantidadCaja()});
        });
        Product_List_Table.setModel(model);
        Product_Dialog_Select_Table.setModel(model);
    }

    private void Client_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "#", "ID", "Nombre", "Correo", "Teléfono", "Departamento", "Municipio", "Ciudad"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getClientList().forEach((c) -> {
            if (c instanceof PersonaJuridica && Client_ChangeType == true) {
                model.setColumnIdentifiers(new String[]{"#", "RTN", "Nombre", "Correo", "Teléfono", "Departamento", "Municipio", "Ciudad"});
                PersonaJuridica p = (PersonaJuridica) c;
                model.addRow(new Object[]{p.getNumClient(), p.getRtn(), p.getNombre(), p.getCorreo(), p.getTelefono(), p.getDepartamento(), p.getMunicipio(), p.getCiudad()});
            } else if (c instanceof PersonaNatural && Client_ChangeType == false) {
                model.setColumnIdentifiers(new String[]{"#", "ID", "Nombre", "Correo", "Teléfono", "Departamento", "Municipio", "Ciudad"});
                PersonaNatural p = (PersonaNatural) c;
                model.addRow(new Object[]{p.getNumClient(), p.getId(), p.getNombre(), p.getCorreo(), p.getTelefono(), p.getDepartamento(), p.getMunicipio(), p.getCiudad()});
            }
        });
        Client_List_Table.setModel(model);
        Client_Dialog_Select_Table.setModel(model);
    }

    private void Provider_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "RTN", "Nombre", "Correo", "Teléfono", "Dirección"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getProviderList().forEach((p) -> {
            model.addRow(new Object[]{p.getRtn_provider(), p.getName(), p.getEmail(), p.getCellphone(), p.getAddress()});

        });
        Provider_List_Table.setModel(model);
        Provider_Dialog_Select_Table.setModel(model);
    }

    private void Product_Add_refresh() {
        Product_Add_Name.setText("");
        Product_Add_Type.setText("");
        Product_Add_impu.setText("15");
        Product_Add_priceU.setText("0");
        Product_Add_priceUSell.setText("0");
        Product_Add_priceBoxSell.setText("0");
        Product_Add_priceBox.setText("0");
        Product_Add_CantU.setValue(1);
        Product_Add_CantBox.setValue(1);
        Product_Add_Date.setDate(new Date());
    }

    private void Product_Edit_refresh() {
        Product_Edit_Name.setText("");
        Product_Edit_Type.setText("");
        Product_Edit_impu.setText("15");
        Product_Edit_priceU.setText("0");
        Product_Edit_priceUSell.setText("0");
        Product_Edit_priceBoxSell.setText("0");
        Product_Edit_priceBox.setText("0");
        Product_Edit_CantU.setValue(1);
        Product_Edit_CantBox.setValue(1);
        Product_Edit_Date.setDate(new Date());
    }

    private void Product_SelectProduct(int i) {
        Product_Edit_Name.setText(property.getProductList().get(i).getNombreProducto());
        Product_Edit_Type.setText(property.getProductList().get(i).getTipo());
        Product_Edit_impu.setText(property.getProductList().get(i).getImpuesto() + "");
        Product_Edit_priceU.setText(property.getProductList().get(i).getPrecioUnidad() + "");
        Product_Edit_priceUSell.setText(property.getProductList().get(i).getPrecioVentaUnidad() + "");
        Product_Edit_priceBoxSell.setText(property.getProductList().get(i).getPrecioVentaCaja() + "");
        Product_Edit_priceBox.setText(property.getProductList().get(i).getPrecioCaja() + "");
        Product_Edit_CantU.setValue(property.getProductList().get(i).getCantidadUnidad());
        Product_Edit_CantBox.setValue(property.getProductList().get(i).getCantidadCaja());
        Product_Edit_Date.setDate(new Date(property.getProductList().get(i).getFechaVencimiento()));
    }

    private void Client_Add_refresh() {
        Client_Add_Name.setText("");
        Client_Add_Email.setText("");
        Client_Add_Phone.setText("");
        Client_Add_Department.setText("");
        Client_Add_Municipio.setText("");
        Client_Add_City.setText("");
        Client_Add_ID_RTN.setText("");
        Client_Add_Type_Person.setSelected(true);
        Client_Add_Type_Bussines.setSelected(false);
    }

    private void Client_Edit_refresh() {
        Client_Edit_Name.setText("");
        Client_Edit_Email.setText("");
        Client_Edit_Phone.setText("");
        Client_Edit_Department.setText("");
        Client_Edit_Municipio.setText("");
        Client_Edit_City.setText("");
        Client_Edit_ID_RTN.setText("");
        Client_Edit_Type_Person.setSelected(true);
        Client_Edit_Type_Bussines.setSelected(false);
    }

    private void Client_SelectClient(int i) {
        Client_Edit_Name.setText(property.getClientList().get(i).getNombre());
        Client_Edit_Email.setText(property.getClientList().get(i).getCorreo());
        Client_Edit_Phone.setText(property.getClientList().get(i).getTelefono());
        Client_Edit_Department.setText(property.getClientList().get(i).getDepartamento());
        Client_Edit_Municipio.setText(property.getClientList().get(i).getMunicipio());
        Client_Edit_City.setText(property.getClientList().get(i).getCiudad());
        if (property.getClientList().get(i) instanceof PersonaJuridica) {
            Client_Edit_ID_RTN.setText(((PersonaJuridica) property.getClientList().get(i)).getRtn());
            Client_Edit_Type_Bussines.setSelected(true);
            Client_Edit_Type_Person.setSelected(false);
        } else {
            Client_Edit_ID_RTN.setText(((PersonaNatural) property.getClientList().get(i)).getId());
            Client_Edit_Type_Bussines.setSelected(false);
            Client_Edit_Type_Person.setSelected(true);
        }
    }

    private void Provider_Add_refresh() {
        Provider_Add_Name.setText("");
        Provider_Add_Email.setText("");
        Provider_Add_Phone.setText("");
        Provider_Add_Address.setText("");
        Provider_Add_RTN.setText("");
    }

    private void Provider_Edit_refresh() {
        Provider_Edit_Name.setText("");
        Provider_Edit_Email.setText("");
        Provider_Edit_Phone.setText("");
        Provider_Edit_Address.setText("");
        Provider_Edit_RTN.setText("");
    }

    private void Provider_SelectProvider(int i) {
        Provider_Edit_Name.setText(property.getProviderList().get(i).getName());
        Provider_Edit_Email.setText(property.getProviderList().get(i).getEmail());
        Provider_Edit_Phone.setText(property.getProviderList().get(i).getCellphone());
        Provider_Edit_Address.setText(property.getProviderList().get(i).getAddress());
        Provider_Edit_RTN.setText(property.getProviderList().get(i).getRtn_provider());
    }

    private void Purchases_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "RTN Proveedor", "CAI", "Número de documentos fiscales", "Subtotal compra", "Fecha"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getPurchaseList().forEach((p) -> {
            model.addRow(new Object[]{p.getProviderRTN(), p.getCAI(), p.getFiscalDocumentNumber(), p.getPurchasesSubtotal(), p.getPurchaseID(), p.getPurchaseDate()});

        });
        Compras_Table.setModel(model);
    }

    private void Sells_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Ingreso exento", "Ingreso gravado", "Impuesto", "Fecha"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getSellList()
                .forEach((s) -> {
                    model.addRow(new Object[]{s.getSaleID(), s.getExemptIncome(), s.getExemptTaxed(), s.getTax(), s.getDate()});
                });
        Ventas_Table.setModel(model);
    }

    private void Pays_refreshTable() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Número crédito", "Abono", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        property.getPayList().forEach((p) -> {
            model.addRow(new Object[]{p.getID(), p.getCredit(), p.getDeposit(), p.getDate()});

        });
        Pagos_Table.setModel(model);
    }

}
