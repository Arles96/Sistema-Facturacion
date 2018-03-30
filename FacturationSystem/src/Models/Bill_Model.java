/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Bill;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Bill_Model extends Model{

    @Override
    public void insert(Object entity) {
        super.connect();
        Bill bill = (Bill)entity;
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO Factura(numeroFactura, "
                    + "codigoFactura, id_venta , credito , impuesto  , totalFactura , numeroCliente , fechaEmision)"
                    + " values(? ,? , ?,?,? ,?,?,?)");
            st.setInt(1, bill.getNumberBill());
            st.setString(2, bill.getCodeBill());
            st.setInt(3 , bill.getIdSell());
            st.setBoolean(4, bill.isCredit());
            st.setFloat(5, bill.getTax());
            st.setFloat(6, bill.getTotalBill());
            st.setInt(7, bill.getNumberClient());
            st.setDate(8,bill.getEmisionDate());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Provider_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        Bill bill = (Bill)entity;
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE FACTURA SET codigoFactura =?, id_venta=? , credito=? , impuesto =? , totalFactura=? , numeroCliente=? , fechaEmision=? WHERE NUMEROFACTURA =?");
            
            st.setString(1, bill.getCodeBill());
            st.setInt(2 , bill.getIdSell());
            st.setBoolean(3, bill.isCredit());
            st.setFloat(4, bill.getTax());
            st.setFloat(5, bill.getTotalBill());
            st.setInt(6, bill.getNumberClient());
            st.setDate(7,bill.getEmisionDate());
            st.setInt(8, bill.getNumberBill());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Bill_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
       Integer entero = new Integer((String)id);
        try {
            PreparedStatement st = connect.prepareStatement("DELETE from Factura where numrtoFactura=?");
            st.setInt(1, entero);
        } catch (SQLException ex) {
            Logger.getLogger(Bill_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
       super.close();
    }
    
}
