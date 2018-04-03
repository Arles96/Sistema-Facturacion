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
     * Nivel del usuario.
     */
    private int level;
    /**
     * Nombre del usuario.
     */
    private String user;
    /**
     * Correo electrónico del usuario.
     */
    private String email;

    /**
     * Define si la cuenta está conectada en ese momento.
     */
//    private boolean enable;
    public Account() {
        this.password = "";
        this.user = "";
        this.email = "";
        this.level = 0;
    }

    public Account(String password, String user, String email, int level) {
        this.password = password;
        this.user = user;
        this.email = email;
        this.level = level;
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

    @Override
    public String toString() {
        return "Account{" + "password=" + password + ", level=" + level + ", user=" + user + ", email=" + email + '}';
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
