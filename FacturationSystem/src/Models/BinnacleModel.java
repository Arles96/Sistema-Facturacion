/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Binnacle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        
    }

    @Override
    public void delete(Object id) {
        
    }
    
}
