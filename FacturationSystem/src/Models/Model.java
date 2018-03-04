package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Arles Cerrato
 */

/**
 * Clase Padre para los modelos de las entidades fuertes y debiles
*/
public abstract class  Model {
    
    /**
     * direccion donde esta la base de datos del sistema de facturacion
     */
    private final String url = "./database/SistemaFacturacion.db";
    
    /**
     * Atributo para conectarte a la base de  datos
    */
    protected Connection connect;
    
    /**
     * Metodo para insertar una tupla. 
     * @param array: Arreglo donde contendra los datos correspondientes para la inserccion
    */
    public abstract void insert(Object [] array);
    
    /**
     * Metodo para actualizar los datos de una tupla
     * @param array: donde contendra los datos que se actualizaran
     */
    public abstract void update(Object[] array);
    
    /**
     * Metodo para eliminar una tupla.
     * @param id
    */
    public abstract void delete(Object id);
    
    /**
     * Metodo que realiza la conexion a la base de datos.
     * Es obligatorio declararlo para realizar una consulata.
     * @return retorna un booleano para saber si se realizo la conecccion
    */
    protected boolean connect(){
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    /**
     * Metodo para cerrar la conexion a la base de datos.
     * Es obligatiorio declararlo al finalizar la consulta
    */
    protected void close (){
        try {
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la base de datos");
        }
    }
    
}
