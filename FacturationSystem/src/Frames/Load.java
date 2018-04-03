package Frames;

import Resources.Account;
import Resources.Property;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ
 */
public class Load extends javax.swing.JFrame {

    /**
     * Creates new form Load
     */
    public Load() {
        initComponents();
        this.pack();
        Board.setBackground(new Color(Property.FIBER[0][0], Property.FIBER[0][1], Property.FIBER[0][2]));
        this.setLocationRelativeTo(null);
        try {
            Progress.setText("");
            loadProperties();
        } catch (Exception e) {
            System.out.println("ERROR_LOADPROPERTIES");
            createProperties();
        }
        //System.out.println(property);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Board = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Tittle = new javax.swing.JLabel();
        Progress = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 83, 88));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        Board.setBackground(new java.awt.Color(244, 83, 88));
        Board.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BoardMouseDragged(evt);
            }
        });
        Board.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BoardMousePressed(evt);
            }
        });

        Logo.setBackground(new java.awt.Color(204, 255, 0));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICO/100px/icons8_Connect_Develop_100px.png"))); // NOI18N

        Tittle.setBackground(new java.awt.Color(244, 83, 88));
        Tittle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        Tittle.setForeground(new java.awt.Color(243, 242, 237));
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("Bienvenido");

        Progress.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        Progress.setForeground(new java.awt.Color(243, 242, 237));
        Progress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Progress.setText(".     .    .   .  . ..");

        Info.setForeground(new java.awt.Color(243, 242, 237));
        Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.setText("Protocolos de inicio ejecutándose...");

        Minimize.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Minimize.setForeground(new java.awt.Color(243, 242, 237));
        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setText("_");
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });

        Close.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(243, 242, 237));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(125, 125, 125)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(BoardLayout.createSequentialGroup()
                .addGroup(BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Tittle)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardLayout.createSequentialGroup()
                .addGroup(BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGroup(BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Minimize)
                            .addComponent(Close))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoardLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(Tittle)
                .addGap(8, 8, 8)
                .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Board, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoardMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardMouseDragged
        // Arrastra la pantalla.
        System.out.println("LOAD: Arrastra");
        this.setLocation(evt.getXOnScreen() - x_Pressed, evt.getYOnScreen() - y_Pressed);
    }//GEN-LAST:event_BoardMouseDragged

    private void BoardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardMousePressed
        // Captura los puntos pulsados en la pantalla.
        System.out.println("LOAD: Pulsa");
        this.x_Pressed = evt.getX();
        this.y_Pressed = evt.getY();
    }//GEN-LAST:event_BoardMousePressed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // Cierra la pantalla.
        System.out.println("LOAD: Cierra");
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // Minimiza la pantalla.
        System.out.println("LOAD: Minimiza");
        this.setState(1);
    }//GEN-LAST:event_MinimizeMouseClicked

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
                if ("Darcula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Load().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Board;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Progress;
    private javax.swing.JLabel Tittle;
    // End of variables declaration//GEN-END:variables

    // EXTRA COMPONENTS
    /**
     * Propiedades generales de la interfaz gráfica.
     */
    private Property property;
    /**
     * Punto x pulsado en frame.
     */
    private int x_Pressed;
    /**
     * Punto y pulsado en frame.
     */
    private int y_Pressed;
    public WorkSheet workSheet;
    private boolean allLoaded;

    /**
     * Carga las propiedades generales..
     */
    private void loadProperties() throws Exception {
        this.allLoaded = false;
        Progress_Thread progress = new Progress_Thread(this);
        progress.load = this;
        Thread thread = new Thread(progress);
        thread.start();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(".properties.pty"));
        property = (Property) in.readObject();
        in.close();
        System.out.println("LOAD: Load Properties");
        this.allLoaded = true;
    }

    /**
     * Sobrescribe las propiedades generales.
     */
    public void createProperties() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(".properties.pty"));
            property = new Property(Property.FIBER, new Account("password", "user", "email", 1));
            property.getAdminList().add(property.getAccount());
            property.logged = false;
            out.writeObject(property);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR_SETPROPERTIES");
        }
        System.out.println("LOAD: Set Properties");
        this.allLoaded = true;
    }

    public void updateProperties() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(".properties.pty"));
            out.writeObject(property);
            out.close();
        } catch (Exception e) {
            System.out.println("ERROR_UPDATEPROPERTIES");
        }
        System.out.println("LOAD: Update Properties");
        this.allLoaded = true;
    }

    /**
     * Hilo para la barra de progreso. // DEBO CREAR BANDERA PARA QUE DEJE DE
     * HACERLO HASTA QUE TERMINE LA CARGA DE TODOS LOS ARCHIVOS.
     */
    public class Progress_Thread implements Runnable {

        public Progress_Thread(Load load) {
            this.load = load;
        }

        public Load load;

        @Override
        public void run() {
            /**
             * Anima la barra de progreso hasta que todas las propiedades se
             * carguen.
             */
            do {
                Progress.setText("");
                try {
                    for (int i = 0; i < 25; i++) {
                        Thread.sleep(100);
                        Progress.setText(Progress.getText() + "/");
                    }
                } catch (InterruptedException ex) {
                    System.out.println("ERROR_PROGRESS_THREAD");
                }
            } while (allLoaded == false);
            /**
             * Abre el programa principal.
             */
            load.setVisible(false);
            WorkSheet.main(new String[]{""}, property, load);
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
