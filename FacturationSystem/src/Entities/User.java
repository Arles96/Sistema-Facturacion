package Entities;

import java.io.Serializable;

/**
 *
 * @author Dario
 */
public class User implements Serializable {

    protected String ID;
    protected String name;
    protected String password;
    protected String email;
    protected String phone;
    protected int level;

<<<<<<< HEAD
    public User(String id, String nombre, String password, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public String getId() {
        return id;
=======
    public String getID() {
        return ID;
>>>>>>> a3e660aa90923ce4f1e8bec6b1c72f1e5ae4250f
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getLevel() {
        return level;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
=======
    public void setLevel(int level) {
        this.level = level;
    }

>>>>>>> a3e660aa90923ce4f1e8bec6b1c72f1e5ae4250f
}
