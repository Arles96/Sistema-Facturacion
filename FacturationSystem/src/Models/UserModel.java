/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Dario
 */
public class UserModel extends Model{

    @Override
    public void insert(Object entity) {
        super.connect();
        User user = (User)entity;
        try{
            PreparedStatement st = connect.prepareStatement("INSERT INTO usuario (id_usuario, nombre, contrasenia, correo, telefono) values(?, ?, ?, ?, ?)");
            st.setString(1, user.getId());
            st.setString(2, user.getNombre());
            st.setString(3, user.getPassword());
            st.setString(4, user.getCorreo());
            st.setString(5, user.getTelefono());
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        User user = (User)entity;
        try{
            PreparedStatement st = connect.prepareStatement("UPDATE usuario set nombre=?, contrasenia=?, correo=?, telefono=? where id_usuario=?");
            st.setString(1, user.getNombre());
            st.setString(2, user.getPassword());
            st.setString(3, user.getCorreo());
            st.setString(4, user.getTelefono());
            st.setString(5, user.getId());
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
        try{
            PreparedStatement st = connect.prepareStatement("Delete from usuario where id_usuario=?");
            st.setString(1, (String)id);
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }
    
    public LinkedList getView(){
        LinkedList<User> view = new LinkedList();
        super.connect();
        try{
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_USUARIO");
            while(rs.next()){
                String id = rs.getString("id_usuario");
                String nombre = rs.getString("nombre");
                String password = rs.getString("contrasenia");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");

                view.add(new User(id, nombre, password, correo, telefono));
            }
            
        }catch(Exception ex){
        }
        super.close();
        return view;
    }
}
