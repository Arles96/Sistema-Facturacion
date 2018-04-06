package Entities;

import java.io.Serializable;

/**
 *
 * @author Dario
 */
public class Client implements Serializable {

    private int numClient;
    private String nombre;
    private String correo;
    private String telefono;
    private String departamento;
    private String municipio;
    private String ciudad;

    public Client(int numClient, String nombre, String correo, String telefono, String departamento, String municipio, String ciudad) {
        this.numClient = numClient;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.departamento = departamento;
        this.municipio = municipio;
        this.ciudad = ciudad;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
