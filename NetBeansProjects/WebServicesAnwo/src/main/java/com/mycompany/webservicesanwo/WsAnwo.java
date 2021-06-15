/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicesanwo;

import BuenosAires.Herramientas.XMLSerializer;
import BuenosAires.Modelo.AnwoProducto;
import BuenosAires.Modelo.AnwoStockProducto;
import BuenosAires.Modelo.ResultadoSP;
import database.AnwoStoreProcedures;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Liz
 */
@WebService(serviceName = "WsAnwo")
public class WsAnwo {
    
    @WebMethod(operationName = "ConsultarProductos")
    public String consultarProductos() {
        ArrayList<AnwoProducto> lista = new AnwoStoreProcedures().listarProductos();
        return XMLSerializer.toXMLString(lista);
    }
    
    @WebMethod(operationName = "ConsultarProductosDisponibles")
    public String consultarProductosDisponibles() {
        ArrayList<AnwoStockProducto> lista = new AnwoStoreProcedures().listarProductosDisponibles();
        return XMLSerializer.toXMLString(lista);
    }
    
    @WebMethod(operationName = "ReservarProducto")
    public String reservarProducto(int idStockProducto) {
        ResultadoSP resultado = new AnwoStoreProcedures().reservarProducto(idStockProducto);
        return XMLSerializer.toXMLString(resultado);
    }
}
