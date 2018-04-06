package Entities;

import java.io.Serializable;

/**
 *
 * @author CJ
 */
public class DailySales implements Serializable{

    // ATRIBUTOS
    /**
     * Cantidad de ingreso exento diario.
     */
    private int saleID;
    /**
     * Identificador de la venta efectuada. (Llave primaria, auto incrementado)
     */
    private float exemptIncome;
    /**
     * Cantidad de ingreso gravado diario.
     */
    private float exemptTaxed;
    /**
     * Porcentaje de impuesto aplicado a la venta.
     */
    private float tax;
    /**
     * Fecha de efectuación de la venta.
     */
    private String date;

    public DailySales(int saleID, float exemptIncome, float exemptTaxed, float tax, String date) {
        this.saleID = saleID;
        this.exemptIncome = exemptIncome;
        this.exemptTaxed = exemptTaxed;
        this.tax = tax;
        this.date = date;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public float getExemptIncome() {
        return exemptIncome;
    }

    public void setExemptIncome(float exemptIncome) {
        this.exemptIncome = exemptIncome;
    }

    public float getExemptTaxed() {
        return exemptTaxed;
    }

    public void setExemptTaxed(float exemptTaxed) {
        this.exemptTaxed = exemptTaxed;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
