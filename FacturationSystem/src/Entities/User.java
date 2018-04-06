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

    public User() {
    }

    
    public User(String id, String nombre, String password, String correo, String telefono) {
        this.ID = id;
        this.name = nombre;
        this.password = password;
        this.email = correo;
        this.phone = telefono;
    }

    public String getId() {
        return ID;
    }

    public String getID() {
        return ID;
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

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", name=" + name + ", password=" + password + ", email=" + email + ", phone=" + phone + ", level=" + level + '}';
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
