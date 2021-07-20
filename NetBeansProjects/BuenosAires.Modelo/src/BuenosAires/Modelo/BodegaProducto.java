/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.Modelo;

/**
 *
 * @author Liz
 */
public class BodegaProducto {
    private Number idProducto;
    private String nombreProducto;
    private String descripcion;
    private String marca;
    private Number precio;
    private Number cantidad;

    public BodegaProducto() {
        this.idProducto = 0;
        this.nombreProducto = "";
        this.descripcion = "";
        this.marca = "";
        this.precio = 0;
        this.cantidad = 0;

    }

    public Number getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Number idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public void setCantidad(Number cantidad) {
        this.cantidad = cantidad;
    }

}
