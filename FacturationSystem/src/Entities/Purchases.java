package Entities;

import java.io.Serializable;

/**
 *
 * @author CJ
 */
public class Purchases implements Serializable{
// ATRIBUTOS

    /**
     * Contiene el RTN del proveedor.
     */
    private int providerRTN;
    /**
     * Código de autorización de impresión.
     */
    private String CAI; // Requiere validación de tamaño 100
    /**
     * Atributo compuesto (Establecimiento, Punto de emisión, tipo de documento,
     * correlativo).
     */
    private String fiscalDocumentNumber; // Requiere validación de tamaño 40
    /**
     * Importe exento, importe gravado 15%, e importe gravado 18%.
     */
    private float purchasesSubtotal;
    /**
     * Identificador de la compra.
     */
    private int purchaseID;
    /**
     * Fecha de efectuación de la compra.
     */
    private String purchaseDate;

    public Purchases(int providerRTN, String CAI, String fiscalDocumentNumber, float purchasesSubtotal, int purchaseID, String purchaseDate) {
        this.providerRTN = providerRTN;
        this.CAI = CAI;
        this.fiscalDocumentNumber = fiscalDocumentNumber;
        this.purchasesSubtotal = purchasesSubtotal;
        this.purchaseID = purchaseID;
        this.purchaseDate = purchaseDate;
    }

    public int getProviderRTN() {
        return providerRTN;
    }

    public void setProviderRTN(int providerRTN) {
        this.providerRTN = providerRTN;
    }

    public String getCAI() {
        return CAI;
    }

    public void setCAI(String CAI) {
        this.CAI = CAI;
    }

    public String getFiscalDocumentNumber() {
        return fiscalDocumentNumber;
    }

    public void setFiscalDocumentNumber(String fiscalDocumentNumber) {
        this.fiscalDocumentNumber = fiscalDocumentNumber;
    }

    public float getPurchasesSubtotal() {
        return purchasesSubtotal;
    }

    public void setPurchasesSubtotal(float purchasesSubtotal) {
        this.purchasesSubtotal = purchasesSubtotal;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
