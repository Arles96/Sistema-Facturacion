package Resources;

import java.awt.Image;
import java.io.Serializable;
import java.util.Objects;

/**
 * Objeto contenedor de los datos de acceso del usuario.
 *
 * @author CJ
 */
public class Account implements Serializable, Comparable<Object> {

    /**
     * Contraseña del usuario.
     */
    private String password;
    /**
     * Nombre del usuario.
     */
    private String user;
    /**
     * Correo electrónico del usuario.
     */
    private String email;
    /**
     * Imagen de perfil del usuario.
     */
    private Image picture;
    /**
     * Define si la cuenta está conectada en ese momento.
     */
    private boolean enable;

    public Account() {
        this.password = "";
        this.user = "";
        this.email = "";
        this.picture = null;
        this.enable = false;
    }

    public Account(String password, String user, String email, Image picture) {
        this.password = password;
        this.user = user;
        this.email = email;
        this.picture = picture;
        this.enable = false;
    }

    // ACCESORES
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "Account{" + "password=" + password + ", user=" + user + ", email=" + email + ", picture=" + picture + ", enable=" + enable + '}';
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            if (((Account) o).getUser().equals(this.user)) {
                return true;
            }
        } else if (o instanceof String) {
            if (o.equals(this.user)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.user);
        return hash;
    }

    /**
     *
     * @param t
     * @return
     */
    @Override
    public int compareTo(Object t) {
        if (t instanceof Account) {
            if (((Account) t).getUser().equals(this.user)) {
                return 0;
            }
        } else if (t instanceof String) {
            if (t.equals(this.user)) {
                return 0;
            }
        }
        return 1;
    }

}
