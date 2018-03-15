package Entities;

/**
 *
 * @author CJ
 */
public class Payment_Model {

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

    // 
}
