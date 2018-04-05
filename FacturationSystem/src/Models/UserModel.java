package Models;

import Entities.User;
import java.sql.PreparedStatement;

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
            PreparedStatement st = connect.prepareStatement("INSERT INTO usuario (id_usuario, nombre, contrasenia, correo, telefono) values(?, ?, ?, ?, ?)");
            //PreparedStatement st = connect.prepareStatement("INSERT INTO usuario (id_usuario, nombre, contrasenia, correo, telefono, nivel) values(?, ?, ?, ?, ?, ?)");
            st.setString(1, user.getID());
            st.setString(2, user.getName());
            st.setString(3, user.getPassword());
            st.setString(4, user.getEmail());
            st.setString(5, user.getPhone());
            //st.setString(6, user.getLevel());
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
            PreparedStatement st = connect.prepareStatement("UPDATE INTO usuario set nombre=?, contrasenia=?, correo=?, telefono=? where id_usuario=?");
            //PreparedStatement st = connect.prepareStatement("UPDATE INTO usuario set nombre=?, contrasenia=?, correo=?, telefono=?, nivel=?, where id_usuario=?");
            st.setString(1, user.getName());
            st.setString(2, user.getPassword());
            st.setString(3, user.getEmail());
            st.setString(4, user.getPhone());
            st.setString(5, user.getID());
            //st.setString(6, user.getLevel());
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
}
