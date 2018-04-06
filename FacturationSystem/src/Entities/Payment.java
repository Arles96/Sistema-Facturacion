package Entities;

import java.io.Serializable;

/**
 *
 * @author CJ
 */
public class Payment implements Serializable{

    // ATRIBUTOS
    /**
     * Número identificador del pago hecho. (Llave primaria, auto incrementado)
     */
    private int ID;
    /**
     * Número del crédito abonado. (Clave Foránea)
     */
    private int credit;
    /**
     * Cantidad monetaria recibida.
     */
    private float deposit;
    /**
     * Fecha de efectuación de pago.
     */
    private String date;

    public Payment(int ID, int credit, float deposit, String date) {
        this.ID = ID;
        this.credit = credit;
        this.deposit = deposit;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
