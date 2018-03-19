/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Arles Cerrato
 */
public class Binnacle {
    
    /**
     * El id de la bitacora
     */
    private int id_bitacle;
    /**
     * Id del usuario
     */
    private String id_user;
    /**
     * La fecha que se reaizo la accion
    */
    private Date date;
    /**
     * La descripcion de la accion que realizo el usuario
     */
    private String description;
    
    /**
     * Constructor de la clase bitacora que contiene toda la información de una tupla
     * 
     * @param id_bitacle
     * @param id_user
     * @param date
     * @param description
     */
    public Binnacle(int id_bitacle, String id_user, Date date, String description) {
        this.id_bitacle = id_bitacle;
        this.id_user = id_user;
        this.date = date;
        this.description = description;
    }

    /**
     * Constructor vacio de la clase Bitacora
     */
    public Binnacle() {
    }

    /**
     * Metodo que retorna el id de la botacora
     * 
     * @return 
     */
    public int getId_bitacle() {
        return id_bitacle;
    }
    
    /**
     * Metodo para setear el atributo id_bitacora.
     * 
     * @param id_bitacle
     */
    public void setId_bitacle(int id_bitacle) {
        this.id_bitacle = id_bitacle;
    }

    /**
     * Metodo que retorna el id_usuario
     * 
     * @return 
     */
    public String getId_user() {
        return id_user;
    }

    /**
     * Metodo que setea el id_usuario
     * 
     * @param id_user
     */
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    /**
     * Metodo que retorna la fecha de la botacora
     * 
     * @return 
     */
    public Date getDate() {
        return date;
    }

    /**
     * Metodo que setea la fecha de la bitacora
     * 
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Metodo que retorna la descripcion de la bitacora
     * 
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metodo que setea la descripcion de la bitacora
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Metodo que retorna un numero hash
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id_bitacle;
        hash = 53 * hash + Objects.hashCode(this.id_user);
        hash = 53 * hash + Objects.hashCode(this.date);
        hash = 53 * hash + Objects.hashCode(this.description);
        return hash;
    }

    /**
     * Metodo que verifica si el objeto es igual y retorna verdadero si lo es, sino retorna falso
     * 
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Binnacle other = (Binnacle) obj;
        if (this.id_bitacle != other.id_bitacle) {
            return false;
        }
        if (!Objects.equals(this.id_user, other.id_user)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
    
}
