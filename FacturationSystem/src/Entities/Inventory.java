/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Dario
 */
public class Inventory {
    private int idProducto;
    private String NombreProducto;
    private float impuesto;
    private float precioCaja;
    private float precioUnidad;
    private float precioVentaCaja;
    private float precioVentaUnidad;
    private String fechaVencimiento;
    private int cantidadCaja;
    private int cantidadUnidad;
    private String tipo;

    public Inventory(int idProducto, String NombreProducto, float impuesto, float precioCaja, float precioUnidad, float precioVentaCaja, float precioVentaUnidad, String fechaVencimiento, int cantidadCaja, int cantidadUnidad, String tipo) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.impuesto = impuesto;
        this.precioCaja = precioCaja;
        this.precioUnidad = precioUnidad;
        this.precioVentaCaja = precioVentaCaja;
        this.precioVentaUnidad = precioVentaUnidad;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadCaja = cantidadCaja;
        this.cantidadUnidad = cantidadUnidad;
        this.tipo = tipo;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProcto) {
        this.NombreProducto = NombreProcto;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(float precioCaja) {
        this.precioCaja = precioCaja;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public float getPrecioVentaCaja() {
        return precioVentaCaja;
    }

    public void setPrecioVentaCaja(float precioVentaCaja) {
        this.precioVentaCaja = precioVentaCaja;
    }

    public float getPrecioVentaUnidad() {
        return precioVentaUnidad;
    }

    public void setPrecioVentaUnidad(float precioVentaUnidad) {
        this.precioVentaUnidad = precioVentaUnidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidadCaja() {
        return cantidadCaja;
    }

    public void setCantidadCaja(int cantidadCaja) {
        this.cantidadCaja = cantidadCaja;
    }

    public int getCantidadUnidad() {
        return cantidadUnidad;
    }

    public void setCantidadUnidad(int cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
