package Entities;

import java.io.Serializable;

/**
 *
 * @author Dario
 */
<<<<<<< HEAD
public class PersonaNatural{
    private int numClient;
    private String id;

    public PersonaNatural() {
    }

    public PersonaNatural(int numClient, String id) {
        this.numClient = numClient;
        this.id = id;
    }
    
    public int getNumClient() {
        return numClient;
    }
=======
public class PersonaNatural extends Client implements Serializable {

    private String id;
>>>>>>> a3e660aa90923ce4f1e8bec6b1c72f1e5ae4250f

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
