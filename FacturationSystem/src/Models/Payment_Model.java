package Models;

/**
 *
 * @author CJ
 */
public class Payment_Model extends Model{

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

    @Override
    public void insert(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
