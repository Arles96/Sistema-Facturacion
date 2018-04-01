package Common_Panels;

import Resources.Property;
import com.toedter.calendar.JCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        labelDate.setForeground(new java.awt.Color(51, 51, 51));
        labelDate.setText("date");

        labelUser.setForeground(new java.awt.Color(51, 51, 51));
        labelUser.setText("User");

        labelInfo.setForeground(new java.awt.Color(51, 51, 51));
        labelInfo.setText("info-user-sells");

        labelRunTime.setForeground(new java.awt.Color(51, 51, 51));
        labelRunTime.setText("run time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(labelRunTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(labelInfo)
                .addGap(117, 117, 117))
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
        // Variables
    /**
     * Propiedades generales de la interfaz gráfica.
     */
    private Property property;
    /**
     * Date del sistema
     */
    private Date date;
    /**
     * Calendar del sistema
     */
    private Calendar calendar;
    int hours;
    int minutes;
    int seconds;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
        Time_Thread timer = new Time_Thread();
        Thread thread = new Thread(timer);
        thread.start();
        date = new Date();
    }

    private void setDate() {
        calendar = new GregorianCalendar();
        labelDate.setText(calendar.get(Calendar.DATE)
                + "/" + (calendar.get(Calendar.MONTH) + 1)
                + "/" + calendar.get(Calendar.YEAR));
        labelDate.setSize(labelDate.getHeight(), labelDate.getText().length());
    }

    private void setRuntime() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
            }
        }
        String H = "";
        String M = "";
        String S = "";
        if (hours < 10) {
            H = "0";
        }
        H += hours;
        if (minutes < 10) {
            M = "0";
        }
        M += minutes;
        if (seconds < 10) {
            S = "0";
        }
        S += seconds;
        labelRunTime.setText("Tiempo de ejecución: " + H + ":" + M + ":" + S);
    }

    private void setUser() {
        labelUser.setText("Usuario: " + property.getAccount().getUser());
    }

    private void setInfo(String info) {
        labelInfo.setText(info);
    }

    public class Time_Thread implements Runnable {

        public boolean go = true;

        @Override
        public void run() {
            hours = 0;
            minutes = 0;
            seconds = 0;
            setDate();
            setUser();
            setInfo("------");
            do {
                setRuntime();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("StatusBar_Thread");
                }
                if (new GregorianCalendar().get(Calendar.DATE) != calendar.get(Calendar.DATE)) {
                    setDate();
                }
            } while (go == true);
        }
    }

    /**
     * Actualiza los datos de la barra de estado
     */
    public void refresh() {
        setUser();
        setInfo("------");
    }
}
