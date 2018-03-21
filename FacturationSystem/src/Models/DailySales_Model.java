package Models;

/**
 *
 * @author CJ
 */
public class DailySales_Model extends Model {

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
