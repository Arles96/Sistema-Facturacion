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
 * @author Diego
 */
public class Bill {
    private int numberBill;
    private String codeBill;
    private int idSell;
    private boolean credit;
    private float tax;
    private float totalBill;
    private int numberClient;
    private Date emisionDate;

    public int getNumberBill() {
        return numberBill;
    }

    public void setNumberBill(int numberBill) {
        this.numberBill = numberBill;
    }

    public String getCodeBill() {
        return codeBill;
    }

    public void setCodeBill(String codeBill) {
        this.codeBill = codeBill;
    }

    public int getIdSell() {
        return idSell;
    }

    public void setIdSell(int idSell) {
        this.idSell = idSell;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(float totalBill) {
        this.totalBill = totalBill;
    }

    public int getNumberClient() {
        return numberClient;
    }

    public void setNumberClient(int numberClient) {
        this.numberClient = numberClient;
    }

    public Date getEmisionDate() {
        return emisionDate;
    }

    public void setEmisionDate(Date emisionDate) {
        this.emisionDate = emisionDate;
    }

    public Bill(int numberBill, String codeBill, int idSell, boolean credit, float tax, float totalBill, int numberClient, Date emisionDate) {
        this.numberBill = numberBill;
        this.codeBill = codeBill;
        this.idSell = idSell;
        this.credit = credit;
        this.tax = tax;
        this.totalBill = totalBill;
        this.numberClient = numberClient;
        this.emisionDate = emisionDate;
    }

    public Bill() {
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.numberBill;
        hash = 79 * hash + Objects.hashCode(this.codeBill);
        hash = 79 * hash + this.idSell;
        hash = 79 * hash + (this.credit ? 1 : 0);
        hash = 79 * hash + Float.floatToIntBits(this.tax);
        hash = 79 * hash + Float.floatToIntBits(this.totalBill);
        hash = 79 * hash + this.numberClient;
        hash = 79 * hash + Objects.hashCode(this.emisionDate);
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
        final Bill other = (Bill) obj;
        if (this.numberBill != other.numberBill) {
            return false;
        }
        if (this.idSell != other.idSell) {
            return false;
        }
        if (this.credit != other.credit) {
            return false;
        }
        if (Float.floatToIntBits(this.tax) != Float.floatToIntBits(other.tax)) {
            return false;
        }
        if (Float.floatToIntBits(this.totalBill) != Float.floatToIntBits(other.totalBill)) {
            return false;
        }
        if (this.numberClient != other.numberClient) {
            return false;
        }
        if (!Objects.equals(this.codeBill, other.codeBill)) {
            return false;
        }
        if (!Objects.equals(this.emisionDate, other.emisionDate)) {
            return false;
        }
        return true;
    }
    
    
    
}
