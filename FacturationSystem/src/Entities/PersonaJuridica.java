package Entities;

import java.io.Serializable;

/**
 *
 * @author Dario
 */
public class PersonaJuridica extends Client implements Serializable {

    public PersonaJuridica(int numCliente, String rtn) {
        this.numClient = numCliente;
        this.rtn = rtn;
    }

    public PersonaJuridica(int numCliente, String rtn, int numClient, String nombre, String correo, String telefono, String departamento, String municipio, String ciudad) {
        super(numClient, nombre, correo, telefono, departamento, municipio, ciudad);
        this.numClient = numCliente;
        this.rtn = rtn;
    }

    public int getNumCliente() {
        return numClient;
    }

    private String rtn;

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
