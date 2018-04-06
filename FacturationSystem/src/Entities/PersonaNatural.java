package Entities;

/**
 *
 * @author Dario
 */
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

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
