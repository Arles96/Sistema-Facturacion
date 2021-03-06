package Models;

import Entities.User;
import Resources.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Dario
 */
public class UserModel extends Model {

    @Override
    public void insert(Object entity) {
        super.connect();
        User user = (User) entity;
        try {
            //PreparedStatement st = connect.prepareStatement("INSERT INTO usuario (id_usuario, nombre, contrasenia, correo, telefono) values(?, ?, ?, ?, ?)");
            PreparedStatement st = connect.prepareStatement("INSERT INTO usuario (id_usuario, nombre, contrasenia, correo, telefono, nivel) values(?, ?, ?, ?, ?, ?)");
            st.setString(1, user.getID());
            st.setString(2, user.getName());
            st.setString(3, user.getPassword());
            st.setString(4, user.getEmail());
            st.setString(5, user.getPhone());
            st.setString(6, user.getLevel() + "");
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        User user = (User) entity;
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE INTO usuario set nombre=?, contrasenia=?, correo=?, telefono=?, nivel=?, where id_usuario=?");
            //PreparedStatement st = connect.prepareStatement("UPDATE usuario set nombre=?, contrasenia=?, correo=?, telefono=? where id_usuario=?");
            st.setString(1, user.getName());
            //PreparedStatement st = connect.prepareStatement("UPDATE INTO usuario set nombre=?, contrasenia=?, correo=?, telefono=? where id_usuario=?");
            st.setString(1, user.getName());
            st.setString(2, user.getPassword());
            st.setString(3, user.getEmail());
            st.setString(4, user.getPhone());
            st.setString(5, user.getID());
            st.setString(6, user.getLevel() + "");
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
        try {
            PreparedStatement st = connect.prepareStatement("Delete from usuario where id_usuario=?");
            st.setString(1, (String) id);
            st.execute();
        } catch (Exception ex) {
        }
        super.close();
    }

    public ArrayList<Account> getView() {
        ArrayList<Account> view = new ArrayList();
        super.connect();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_USUARIO");
            while (rs.next()) {
                String id = rs.getString("id_usuario");
                String nombre = rs.getString("nombre");
                String password = rs.getString("contrasenia");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");

                view.add(new Account(password, 0, nombre, correo, Integer.parseInt(id), telefono));
            }

        } catch (Exception ex) {
        }
        super.close();
        return view;
    }
}
