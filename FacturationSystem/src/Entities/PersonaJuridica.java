package Entities;

/**
 *
 * @author Dario
 */
public class PersonaJuridica extends Client{
    private int numCliente;
    private String rtn;

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

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }
}
