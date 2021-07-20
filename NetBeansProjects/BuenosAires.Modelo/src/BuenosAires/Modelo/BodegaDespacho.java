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
public class BodegaDespacho {
    private Number idOd;
    private Number IdFactura;
    private String estadoOd;
    
    public BodegaDespacho() {
        this.idOd = 0;
        this.IdFactura = 0;
        this.estadoOd = "";
    }

    public Number getIdOd() {
        return idOd;
    }

    public void setIdOd(Number idOd) {
        this.idOd = idOd;
    }

    public Number getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(Number IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getEstadoOd() {
        return estadoOd;
    }

    public void setEstadoOd(String estadoOd) {
        this.estadoOd = estadoOd;
    }

    @Override
    public String toString() {
        return "BodegaDespacho{" + "idOd=" + idOd + ", IdFactura=" + IdFactura + ", estadoOd=" + estadoOd + '}';
    }
    
    

}
