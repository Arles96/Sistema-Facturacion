package Resources;

import Entities.Client;
import Entities.DailySales;
import Entities.Inventory;
import Entities.Payment;
import Entities.Provider;
import Entities.Purchases;
import Models.*;
import Models.DailySales_Model;
import Models.InventarioModel;
import Models.Provider_Model;
import Models.Purchases_Model;
import Models.UserModel;
import Models.ClientModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
     * Lista de Usuarios. (Temporal -> BD)
     */
    private ArrayList<Account> accountList;
    /**
     * Lista de productos. (Temporal -> BD)
     */
    private ArrayList<Inventory> productList;
    /**
     * Lista de clientes. (Temporal -> BD)
     */
    private ArrayList<Client> clientList;
    /**
     * Lista de proveedores. (Temporal -> BD)
     */
    private ArrayList<Provider> providerList;
    /**
     * Lista de compas. (Temporal -> BD)
     */
    private ArrayList<Purchases> PurchaseList;
    /**
     * Lista de ventas. (Temporal -> BD)
     */
    private ArrayList<DailySales> SellList;
    /**
     * Lista de pagos. (Temporal -> BD)
     */
    private ArrayList<Payment> PayList;
    /**
     * Lista de Usuario Administradores.
     */
    private ArrayList<Account> adminList;
    /**
     * Usuario conectado.
     */
    private Account account;
    /**
     * Último Id de Usuario añadido.
     */
    private int lastUserId;
    /**
     * Último Id de Producto añadido.
     */
    private int lastProductId;
    /**
     * Último Id de Cliente añadido.
     */
    private int lastNumClient;

    public Property(int mix[][], Account account) {
        //this.CREATE_KEY = "03jK9In42yr4i17fj7CY";
        this.CREATE_KEY = " ";
        this.mix = mix;
        this.account = account;
        productList = new ArrayList();
        accountList = new ArrayList();
        clientList = new ArrayList();
        providerList = new ArrayList();
        adminList = new ArrayList();
        PurchaseList = new ArrayList();
        SellList = new ArrayList();
        PayList = new ArrayList();
        accountList.add(account);
        lastProductId = 0;
        lastUserId = 0;
        lastNumClient = 0;
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
        UserModel m = new UserModel();
        accountList = m.getView();
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

    public int getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(int lastUserId) {
        this.lastUserId = lastUserId;

    }

    public ArrayList<Inventory> getProductList() {
        InventarioModel m = new InventarioModel();
        productList = m.getView();
        return productList;
    }

    public void setProductList(ArrayList<Inventory> productList) {
        this.productList = productList;
    }

    public int getLastProductId() {
        return lastProductId;
    }

    public void setLastProductId(int lastProductId) {
        this.lastProductId = lastProductId;
    }

    public int getLastNumClient() {
        return lastNumClient;
    }

    public void setLastNumClient(int lastNumClient) {
        this.lastNumClient = lastNumClient;
    }

    public ArrayList<Client> getClientList() {
        ClientModel m = new ClientModel();
        clientList = m.getView();
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    public ArrayList<Provider> getProviderList() {
        Provider_Model m = new Provider_Model();
        providerList = m.getView();
        return providerList;
    }

    public void setProviderList(ArrayList<Provider> providerList) {
        this.providerList = providerList;
    }

    public ArrayList<Purchases> getPurchaseList() {
        Purchases_Model m = new Purchases_Model();
        productList = m.getView();
        return PurchaseList;
    }

    public void setPurchaseList(ArrayList<Purchases> PurchaseList) {
        this.PurchaseList = PurchaseList;
    }

    public ArrayList<DailySales> getSellList() {
        DailySales_Model m = new DailySales_Model();
        SellList = m.getView();
        return SellList;
    }

    public void setSellList(ArrayList<DailySales> SellList) {
        this.SellList = SellList;
    }

    public ArrayList<Payment> getPayList() {
        Payment_Model m = new Payment_Model();
        PayList = m.getView();
        return PayList;
    }

    public void setPayList(ArrayList<Payment> PayList) {
        this.PayList = PayList;
    }

    @Override
    public String toString() {
        return "Property{" + "mix=" + Arrays.deepToString(mix) + ", account=" + account + '}';
    }

    public int containsAccount(Object o) {
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
