package Models;

import Entities.Payment;
import Entities.Purchases;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ
 */
public class Purchases_Model extends Model {

    @Override
    public void insert(Object entity) {
        super.connect();
        Purchases pur = (Purchases) entity;
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO compra (rtn_proveedor, cai, numero_doc_fiscal, subtotal_compra, id_compra, fecha) "
                    + "values(?, ?, ?, ?, ?, ?)");
            st.setString(1, "" + pur.getProviderRTN());
            st.setString(2, "" + pur.getCAI());
            st.setString(3, "" + pur.getFiscalDocumentNumber());
            st.setString(4, "" + pur.getPurchasesSubtotal());
            st.setString(5, "" + pur.getPurchaseID());
            st.setString(6, pur.getPurchaseDate());
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        Purchases pur = (Purchases) entity;
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE compra set rtn_proveedor=?, cai=?, numero_doc_fiscal=?, subtotal_compra=?, id_compra=?, fecha=?");
            st.setString(1, "" + pur.getProviderRTN());
            st.setString(2, "" + pur.getCAI());
            st.setString(3, "" + pur.getFiscalDocumentNumber());
            st.setString(4, "" + pur.getPurchasesSubtotal());
            st.setString(5, "" + pur.getPurchaseID());
            st.setString(6, pur.getPurchaseDate());
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
            PreparedStatement st = connect.prepareStatement("DELETE FROM Compra "
                    + "WHERE id_compra = ?");
            st.setString(5, idrtn);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Purchases_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }
}
