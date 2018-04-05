package Resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author CJ
 */
public class Property implements Serializable {

    /**
     * Paleta de colores MODERN.
     */
    public static final int MODERN[][] = {{19, 22, 41}, {49, 55, 69}, {215, 49, 23}, {184, 184, 184}, {237, 237, 237}};
    /**
     * Paleta de colores FIBER.
     */
    public static final int FIBER[][] = {{244, 83, 88}, {88, 89, 83}, {242, 194, 136}, {243, 242, 237}, {216, 106, 107}};
    /**
     * Paleta de colores SELFIE.
     */
    public static final int SELFIE[][] = {{88, 126, 140}, {242, 238, 172}, {242, 194, 136}, {242, 143, 121}, {217, 102, 102}};
    /**
     * Paleta de colores EAST.
     */
    public static final int EAST[][] = {{222, 50, 59}, {55, 63, 66}, {240, 242, 247}, {74, 217, 217}, {54, 177, 191}};
    /**
     * Paleta establecida.
     */
    private int mix[][];
    /**
     * Define si ya se ha establecido una configuración previa.
     */
    public static boolean logged;
    /**
     * Código de creación.
     */
    public final String CREATE_KEY;
    /**
     * Código de Administrador.
     */
    private ArrayList<Account> accountList;
    /**
     * Usuario Administradores.
     */
    private ArrayList<Account> adminList;
    /**
     * Usuario conectado.
     */
    private Account account;
    /**
     * Último Id de Usuario añadido.
     */
    private int lastId;

    public Property(int mix[][], Account account) {
        //this.CREATE_KEY = "03jK9In42yr4i17fj7CY";
        this.CREATE_KEY = " ";
        this.mix = mix;
        this.account = account;
        accountList = new ArrayList();
        adminList = new ArrayList();
        accountList.add(account);
    }

    public ArrayList<Account> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Account> adminList) {
        this.adminList = adminList;
    }

    public int[][] getMix() {
        return mix;
    }

    public void setMix(int[][] mix) {
        this.mix = mix;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public static boolean isLogged() {
        return logged;
    }

    public static void setLogged(boolean logged) {
        Property.logged = logged;
    }

    public int getLastId() {
        return lastId;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }

    @Override
    public String toString() {
        return "Property{" + "mix=" + Arrays.deepToString(mix) + ", account=" + account + '}';
    }

    public int contains(Object o) {
        if (o instanceof Account) {
            for (int i = 0; i < accountList.size(); i++) {
                if (((Account) o).getName().equals(accountList.get(i).getName())) {
                    return i;
                }
            }
        } else if (o instanceof String) {
            for (int i = 0; i < accountList.size(); i++) {
                if (o.equals(accountList.get(i).getName())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int adminKey(Object o) {
        if (o instanceof Account) {
            for (int i = 0; i < accountList.size(); i++) {
                if (((Account) o).getPassword().equals(accountList.get(i).getPassword())) {
                    return i;
                }
            }
        } else if (o instanceof String) {
            for (int i = 0; i < accountList.size(); i++) {
                if (o.equals(accountList.get(i).getPassword())) {
                    return i;
                }
            }
        }
        return -1;
    }

}
