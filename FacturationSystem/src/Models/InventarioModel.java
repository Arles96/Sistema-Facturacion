package Models;

import Entities.Inventory;
import Entities.User;
import java.sql.PreparedStatement;

/**
 *
 * @author Dario
 */
public class InventarioModel extends Model {

    
    
    @Override
    public void insert(Object entity) {
        super.connect();
        Inventory inv = (Inventory)entity;
        try{
            PreparedStatement st = connect.prepareStatement("INSERT INTO producto (id_producto, cantidadCaja, cantidadUnidad, fechaVencimiento, costoCaja, ventaCaja, ventaUnidad, tipo, impuesto, costoUnidad, nombreProducto) "
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, "" + inv.getIdProducto());
            st.setString(2, "" + inv.getCantidadCaja());
            st.setString(3, "" + inv.getCantidadUnidad());
            st.setString(4, inv.getFechaVencimiento());
            st.setString(5, "" + inv.getPrecioCaja());
            st.setString(6, "" + inv.getPrecioVentaCaja());
            st.setString(7, "" + inv.getPrecioVentaUnidad());
            st.setString(8, inv.getTipo());
            st.setString(9, "" + inv.getImpuesto());
            st.setString(10, "" + inv.getPrecioUnidad());
            st.setString(11, inv.getNombreProducto());
            
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        Inventory inv = (Inventory)entity;
        try{
            PreparedStatement st = connect.prepareStatement("UPDATE producto set cantidadCaja=?, cantidadUnidad=?, fechaVencimiento=?, costoCaja=?, ventaCaja=?, ventaUnidad=?, tipo=?, impuesto=?, costoUnidad=?, nombreProducto=? where id_producto=?");
            st.setString(1, "" + inv.getCantidadCaja());
            st.setString(2, "" + inv.getCantidadUnidad());
            st.setString(3, inv.getFechaVencimiento());
            st.setString(4, "" + inv.getPrecioCaja());
            st.setString(5, "" + inv.getPrecioVentaCaja());
            st.setString(6, "" + inv.getPrecioVentaUnidad());
            st.setString(7, inv.getTipo());
            st.setString(8, "" + inv.getImpuesto());
            st.setString(9, "" + inv.getPrecioUnidad());
            st.setString(10, inv.getNombreProducto());
            st.setString(11, "" + inv.getIdProducto());
            
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
        try{
            PreparedStatement st = connect.prepareStatement("Delete from producto where id_producto=?");
            st.setString(1, (String)id);
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }
}
