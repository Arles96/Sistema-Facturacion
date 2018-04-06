package Models;

import Entities.Payment;
import Entities.Provider;
import Entities.Purchases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
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
            PreparedStatement st = connect.prepareStatement(
                    "UPDATE compra set rtn_proveedor=?, cai=?, numero_doc_fiscal=?, subtotal_compra=?, id_compra=?, fecha=?");
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

    public LinkedList getView() {
        LinkedList<Purchases> view = new LinkedList();
        super.connect();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_COMPRAS");
            while (rs.next()) {
                int providerRTN = rs.getInt("rtn_proveedor");
                String CAI = rs.getString("cai");
                String fiscalDocumentNumber = rs.getString("numero_doc_fiscal");
                float purchasesSubtotal = rs.getFloat("subtotal_compra");
                int purchaseID = rs.getInt("id_compra");
                String purchaseDate = rs.getString("date");
                view.add(new Purchases(providerRTN, CAI, fiscalDocumentNumber, purchasesSubtotal, purchaseID, purchaseDate));
            }
        } catch (Exception ex) {
        }
        super.close();
        return view;
    }
}
