package Resources;

import Entities.User;
import java.awt.Image;
import java.io.Serializable;
import java.util.Objects;

/**
 * Objeto contenedor de los datos de acceso del usuario.
 *
 * @author CJ
 */
public class Account extends User implements Serializable, Comparable<Object> {

    public Account() {
        this.password = "";
        this.name = "";
        this.email = "";
        this.level = 0;
    }

    public Account(String password, int level, String user, String email, int ID, String phone) {
        this.password = password;
        this.level = level;
        this.name = user;
        this.email = email;
        this.ID = ID + "";
        this.phone = phone;
    }

    public Account(String password, String user, String email, int level) {
        this.password = password;
        this.name = user;
        this.email = email;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Account{" + "password=" + password + ", level=" + level + ", user=" + name + ", email=" + email + '}';
    }

    public int getID_int() {
        return Integer.parseInt(ID);
    }

    public void setID(int ID) {
        this.ID = ID + "";
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            if (((Account) o).getName().equals(this.name)) {
                return true;
            }
        } else if (o instanceof String) {
            if (o.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
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
            if (((Account) t).getName().equals(this.name)) {
                return 0;
            }
        } else if (t instanceof String) {
            if (t.equals(this.name)) {
                return 0;
            }
        }
        return 1;
    }

}
