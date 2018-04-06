package Models;

import Entities.Inventory;
import Entities.Payment;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ
 */
public class Payment_Model extends Model {

    @Override
    public void insert(Object entity) {
        super.connect();
        Payment pay = (Payment) entity;
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO pago (id_pago, numero_credito, abono, fecha) "
                    + "values(?, ?, ?, ?)");
            st.setString(1, "" + pay.getID());
            st.setString(2, "" + pay.getCredit());
            st.setString(3, "" + pay.getDeposit());
            st.setString(4, pay.getDate());
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        Payment pay = (Payment) entity;
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE pago set id_pago=?, numero_credito=?, abono=?, fecha=?");
            st.setString(1, "" + pay.getID());
            st.setString(2, "" + pay.getCredit());
            st.setString(3, "" + pay.getDeposit());
            st.setString(4, pay.getDate());
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
        String idrtn = (String) id;
        System.out.println(id);
        try {
            PreparedStatement st = connect.prepareStatement("DELETE FROM Pago "
                    + "WHERE id_pago = ?");
            st.setString(1, idrtn);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Payment_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }
}
