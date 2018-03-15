package Entities;

/**
 *
 * @author CJ
 */
public class Purchases_Model {

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

    //
}
