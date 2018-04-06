package Entities;

/**
 *
 * @author Dario
 */
public class User {
    private String id;
    private String nombre;
    private String password;
    private String correo;
    private String telefono;

    public User(String id, String nombre, String password, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
}
