package Entities;

/**
 *
 * @author CJ
 */
public class DailySales_Model {

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

    //
}
