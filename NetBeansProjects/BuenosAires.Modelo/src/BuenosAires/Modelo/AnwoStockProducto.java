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
public class AnwoStockProducto {
    private Number idStock;
    private Number idProducto;
    private String codigo;
    private String reservadoBa;

    public AnwoStockProducto() {
    }

    public AnwoStockProducto(Number idStock, Number idProducto, String codigo, String reservadoBa) {
        this.idStock = idStock;
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.reservadoBa = reservadoBa;
    }

    public Number getIdStock() {
        return idStock;
    }

    public void setIdStock(Number idStock) {
        this.idStock = idStock;
    }

    public Number getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Number idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getReservadoBa() {
        return reservadoBa;
    }

    public void setReservadoBa(String reservadoBa) {
        this.reservadoBa = reservadoBa;
    }

    @Override
    public String toString() {
        return "AnwoStockProducto{" + "idStock=" + idStock + ", idProducto=" + idProducto + ", codigo=" + codigo + ", reservadoBa=" + reservadoBa + '}';
    }
    
    
}
