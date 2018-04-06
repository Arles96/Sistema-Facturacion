package Models;

import Entities.DailySales;
import Entities.Inventory;
import Entities.Purchases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ
 */
public class DailySales_Model extends Model {

    @Override
    public void insert(Object entity) {
        super.connect();
        DailySales dai = (DailySales) entity;
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO venta_diaria (ingreso_exento, id_venta, ingreso_gravado, impuesto, fecha) "
                    + "values(?, ?, ?, ?, ?)");
            st.setString(1, "" + dai.getExemptIncome());
            st.setString(2, "" + dai.getSaleID());
            st.setString(3, "" + dai.getExemptTaxed());
            st.setString(4, "" + dai.getTax());
            st.setString(5, dai.getDate());
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        DailySales dai = (DailySales) entity;
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE venta_diaria set ingreso_exento=?, id_venta=?, ingreso_gravado=?, impuesto=?, fecha=?");
            st.setString(1, "" + dai.getExemptIncome());
            st.setString(2, "" + dai.getSaleID());
            st.setString(3, "" + dai.getExemptTaxed());
            st.setString(4, "" + dai.getTax());
            st.setString(5, dai.getDate());
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
            PreparedStatement st = connect.prepareStatement("DELETE FROM Venta_diaria "
                    + "WHERE id_venta = ?");
            st.setString(2, idrtn);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DailySales_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.close();
    }
    
    public ArrayList<DailySales> getView(){
        ArrayList<DailySales> view = new ArrayList();
        super.connect();
        try{
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_VENTADIARIA");
            while(rs.next()){
                int id_venta = rs.getInt("id_venta");
                float ingresoExento = rs.getFloat("ingresoExento");
                float ingresoGravado = rs.getFloat("ingresoGravado");
                float impuesto = rs.getFloat("impuesto");
                String fecha = rs.getDate("fecha").toString();
                view.add(new DailySales(id_venta, ingresoExento, ingresoGravado, impuesto, fecha));
            }
        }catch(Exception ex){
            return null;
        }
        super.close();
        return view;
    }
    
}
