/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Provider {
    private String rtn_provider;
    private String name;
    private String address;
    private String email;
    private String cellphone;

    public Provider(String rtn_provider, String name, String address, String email, String cellphone) {
        this.rtn_provider = rtn_provider;
        this.name = name;
        this.address = address;
        this.email = email;
        this.cellphone = cellphone;
    }

    public Provider() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.rtn_provider);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.cellphone);
        return hash;
    }

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
        final Provider other = (Provider) obj;
        if (!Objects.equals(this.rtn_provider, other.rtn_provider)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cellphone, other.cellphone)) {
            return false;
        }
        return true;
    }

    public String getRtn_provider() {
        return rtn_provider;
    }

    public void setRtn_provider(String rtn_provider) {
        this.rtn_provider = rtn_provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    
    
    
    
}
