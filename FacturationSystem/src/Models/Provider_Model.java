/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Payment;
import Entities.Provider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Provider_Model extends Model {

    @Override
    public void insert(Object entity) {
        super.connect();
        Provider provider = (Provider) entity;
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO PROVEEDOR(rtn_proveedor , nombre , direccion "
                    + ",correo , telefono) values(? ,? , ?,?,?)");
            st.setString(1, provider.getRtn_provider());
            st.setString(2, provider.getName());
            st.setString(3, provider.getAddress());
            st.setString(4, provider.getEmail());
            st.setString(5, provider.getCellphone());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Provider_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        Provider provider = (Provider) entity;
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE Proveedor SET nombre = ? , direccion =? , correo =?  , telefono =? "
                    + " where rtn_proveedor =?");
            st.setString(1, provider.getName());
            st.setString(2, provider.getAddress());
            st.setString(3, provider.getEmail());
            st.setString(4, provider.getCellphone());
            st.setString(5, provider.getRtn_provider());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Provider_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
        String idrtn = (String) id;
        System.out.println(id);
        try {
            PreparedStatement st = connect.prepareStatement("DELETE FROM Proveedor "
                    + "WHERE rtn_proveedor = ?");
            st.setString(1, idrtn);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Provider_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }

    public LinkedList getView() {
        LinkedList<Provider> view = new LinkedList();
        super.connect();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_PROVIDER");
            while (rs.next()) {
                String name = rs.getString("nombre");
                String address = rs.getString("direccion");
                String email = rs.getString("correo");
                String cellphone = rs.getString("telefono");
                String rtn_provider = rs.getString("rtn_proveedor");
                view.add(new Provider(rtn_provider, name, address, email, cellphone));
            }

        } catch (Exception ex) {
        }
        super.close();
        return view;
    }
}
