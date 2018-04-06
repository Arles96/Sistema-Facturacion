package Models;

import Entities.Client;
import Entities.PersonaJuridica;
import Entities.PersonaNatural;
import Entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Dario
 */
public class ClientModel extends Model{

    @Override
    public void insert(Object entity) {
        super.connect();
        Client client = (Client)entity;
        try{
            PreparedStatement st = connect.prepareStatement("INSERT INTO Cliente(num_cliente, nombre, correo, telefono, departamento, municipio, ciudad) values(?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, "" + client.getNumClient());
            st.setString(2, client.getNombre());
            st.setString(3, client.getCorreo());
            st.setString(4, client.getTelefono());
            st.setString(5, client.getDepartamento());
            st.setString(6, client.getMunicipio());
            st.setString(7, client.getCiudad());
            
            if (entity instanceof PersonaJuridica){
                PreparedStatement st2 = connect.prepareStatement("INSERT INTO PersonaJuridica(num_cliente, rtn) values(?, ?)");
                st2.setString(1, "" + ((PersonaJuridica)entity).getNumClient());
                st2.setString(2, "" + ((PersonaJuridica)entity).getRtn());
                st2.execute();
            }
            
            if (entity instanceof PersonaNatural){
                PreparedStatement st2 = connect.prepareStatement("INSERT INTO PersonaNatural(num_cliente, id) values(?, ?)");
                st2.setString(1, "" + ((PersonaNatural)entity).getNumClient());
                st2.setString(2, "" + ((PersonaNatural)entity).getId());
                st2.execute();
            }
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }

    @Override
    public void update(Object entity) {
        super.connect();
        Client client = (Client)entity;
        try{
            PreparedStatement st = connect.prepareStatement("Update Cliente set nombre=?, correo=?, telefono=?, departamento=?, municipio=?, ciudad=? where num_cliente=?");
            st.setString(1, client.getNombre());
            st.setString(2, client.getCorreo());
            st.setString(3, client.getTelefono());
            st.setString(4, client.getDepartamento());
            st.setString(5, client.getMunicipio());
            st.setString(6, client.getCiudad());
            st.setString(7, "" + client.getNumClient());
            
            if (entity instanceof PersonaJuridica){
                PreparedStatement st2 = connect.prepareStatement("Update PersonaJuridica set rtn=? where num_cliente=?");
                st2.setString(1, "" + ((PersonaJuridica)entity).getRtn());
                st2.setString(2, "" + ((PersonaJuridica)entity).getNumClient());
                st2.execute();
            }
            
            if (entity instanceof PersonaNatural){
                PreparedStatement st2 = connect.prepareStatement("Update PersonaNatural set id=? where num_cliente=?");
                st2.setString(1, "" + ((PersonaNatural)entity).getId());
                st2.setString(2, "" + ((PersonaNatural)entity).getNumClient());
                st2.execute();
            }
            st.execute();
        }catch(Exception ex){
        }
        super.close();
    }

    @Override
    public void delete(Object id) {
        super.connect();
        try{
            PreparedStatement st = connect.prepareStatement("Delete from Cliente where num_cliente=?");
            st.setString(1, (String)id);
            
            PreparedStatement st2 = connect.prepareStatement("Delete from PersonaJuridica where num_cliente=?");
            st2.setString(1, (String)id);
            
            PreparedStatement st3 = connect.prepareStatement("Delete from PersonaNatural where num_cliente=?");
            st3.setString(1, (String)id);
            
            st.execute();
            st2.execute();
            st3.execute();
        }catch(Exception ex){
        }
        super.close();
    }
    
    public LinkedList getView(){
        LinkedList<Client> view = new LinkedList();
        super.connect();
        try{
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_CLIENTE");
            while(rs.next()){
                int numClient = rs.getInt("num_cliente");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String departamento = rs.getString("departamento");
                String municipio = rs.getString("municipio");
                String ciudad = rs.getString("ciudad");

                view.add(new Client(numClient, nombre, correo, telefono, departamento, municipio, ciudad));
            }
            
        }catch(Exception ex){
        }
        super.close();
        return view;
    }
    
    public LinkedList getViewJuridica(){
        LinkedList<PersonaJuridica> view = new LinkedList();
        super.connect();
        try{
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_PERSONAJURIDICA");
            while(rs.next()){
                int numCliente = rs.getInt("num_cliente");
                String rtn = rs.getString("rtn");
                
                view.add(new PersonaJuridica(numCliente, rtn));
            }
            
        }catch(Exception ex){
        }
        super.close();
        return view;
    }
    
    public LinkedList getViewNatural(){
        LinkedList<PersonaNatural> view = new LinkedList();
        super.connect();
        try{
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("Select * from VW_PERSONANATURAL");
            while(rs.next()){
                int numCliente = rs.getInt("num_cliente");
                String rtn = rs.getString("rtn");
                
                view.add(new PersonaNatural( rtn, numCliente));
            }
            
        }catch(Exception ex){
        }
        super.close();
        return view;
    }
}
