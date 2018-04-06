/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Binnacle;
import Entities.Inventory;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arles Cerrato
 */
public class BinnacleModel extends Model {

    public BinnacleModel() {
    }
    /**
     * Metodo para insertar en la tabla bitacora.
     * @param entity Tiene que ser un Objeto Binnacle
     */
    @Override
    public void insert(Object entity) {
        connect();
        Binnacle binnacle = (Binnacle) entity;
        String sql = "INSERT INTO Bitacora (id_usuario, descripcion, fecha) VALUES (?,?,?)";
        try {
            PreparedStatement query = connect.prepareStatement(sql);
            query.setString(1, binnacle.getId_user());
            query.setString(2, binnacle.getDescription());
            query.setDate(3, binnacle.getDate());
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error fatal");
        }
        close();
    }

    @Override
    public void update(Object entity) {
        // La bitacora no se actualiza
    }

    @Override
    public void delete(Object id) { 
        super.connect();
        try{
            PreparedStatement st = connect.prepareStatement("Delete from Bitacora where id_producto=?");
            st.setInt(1, (int)id);
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }
    
     public ArrayList<Binnacle> getView(){
        ArrayList<Binnacle> view = new ArrayList();
        super.connect();
        try{
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_BITACORA");
            while(rs.next()){
                int id_bitacora = rs.getInt("id_bitacora");
                String id_usuario = rs.getString("id_usuario");
                String descripcion = rs.getString("descripcion");
                Date fecha = rs.getDate("fecha");
                view.add(new Binnacle(id_bitacora, id_usuario, fecha, descripcion));
            }
            
        }catch(Exception ex){
        }
        super.close();
        return view;
     }
}
