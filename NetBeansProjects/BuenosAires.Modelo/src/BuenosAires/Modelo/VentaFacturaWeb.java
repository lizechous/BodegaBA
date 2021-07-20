/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.Modelo;

import java.util.Date;

/**
 *
 * @author Liz
 */
public class VentaFacturaWeb {
    private Number idFactura;
    private String rutCliente;
    private String tipoFactura;
    private Date fechaDespacho;
    private Number valorTotal;
    private String direccionEnvio;
    private Number cantidad;
    private Number idProducto;

    public VentaFacturaWeb() {
    }

    public Number getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Number idFactura) {
        this.idFactura = idFactura;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public Number getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Number valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public void setCantidad(Number cantidad) {
        this.cantidad = cantidad;
    }

    public Number getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Number idProducto) {
        this.idProducto = idProducto;
    }

}
