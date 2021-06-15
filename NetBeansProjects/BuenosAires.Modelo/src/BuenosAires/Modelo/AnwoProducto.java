/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.Modelo;

/**
 *
 * @author cgomezvega
 */
public class AnwoProducto {
    private Number idProducto;
    private String nomProducto;
    private Number precio;

    public AnwoProducto() {
    }

    public AnwoProducto(Number idProducto, String nomProducto, Number precio) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public Number getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Number idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "AnwoProducto{" + "idProducto=" + idProducto + ", nomProducto=" + nomProducto + ", precio=" + precio + '}';
    }
}