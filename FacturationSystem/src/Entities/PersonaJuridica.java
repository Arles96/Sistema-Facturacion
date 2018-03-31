package Entities;

/**
 *
 * @author Dario
 */
public class PersonaJuridica extends Client{
    private int numCliente;
    private String rtn;

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
