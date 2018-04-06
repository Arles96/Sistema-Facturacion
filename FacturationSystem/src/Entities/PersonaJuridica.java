package Entities;

import java.io.Serializable;

/**
 *
 * @author Dario
 */
public class PersonaJuridica extends Client implements Serializable{

<<<<<<< HEAD
    public PersonaJuridica(int numCliente, String rtn) {
        this.numCliente = numCliente;
        this.rtn = rtn;
    }

    public PersonaJuridica(int numCliente, String rtn, int numClient, String nombre, String correo, String telefono, String departamento, String municipio, String ciudad) {
        super(numClient, nombre, correo, telefono, departamento, municipio, ciudad);
        this.numCliente = numCliente;
        this.rtn = rtn;
    }
    
    public int getNumCliente() {
        return numCliente;
    }
=======
    private String rtn;
>>>>>>> a3e660aa90923ce4f1e8bec6b1c72f1e5ae4250f

    public PersonaJuridica(String rtn, int numClient, String nombre, String correo, String telefono, String departamento, String municipio, String ciudad) {
        super(numClient, nombre, correo, telefono, departamento, municipio, ciudad);
        this.rtn = rtn;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }
}
