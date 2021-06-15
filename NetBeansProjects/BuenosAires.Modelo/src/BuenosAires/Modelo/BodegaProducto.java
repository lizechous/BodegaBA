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
    private char stock;

    public BodegaProducto() {
    }

    public BodegaProducto(Number idProducto, String nombreProducto, String descripcion, String marca, Number precio, char stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
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

    public char getStock() {
        return stock;
    }

    public void setStock(char stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "BodegaProducto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
