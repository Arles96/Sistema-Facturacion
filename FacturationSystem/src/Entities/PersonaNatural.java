package Entities;

import java.io.Serializable;

/**
 *
 * @author Dario
 */
public class PersonaNatural extends Client implements Serializable {

    private String id;

    public PersonaNatural(String id, int numClient) {
        super(numClient);
        this.id = id;
    }

    public PersonaNatural(String id, int numClient, String nombre, String correo, String telefono, String departamento, String municipio, String ciudad) {
        super(numClient, nombre, correo, telefono, departamento, municipio, ciudad);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
