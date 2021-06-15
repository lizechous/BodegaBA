/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.BodegaBA.Controladores;

import BuenosAires.Cliente.ClienteWsAnwo;
import BuenosAires.Herramientas.XMLSerializer;
import BuenosAires.Modelo.AnwoProducto;
import BuenosAires.Modelo.AnwoStockProducto;
import BuenosAires.Modelo.ResultadoSP;
import java.util.ArrayList;

/**
 *implements ActionListener : permite controlar los botones de la ventan
 * @author Liz
 */
public class ControladorInventarioAnwo {
        
    public ArrayList<AnwoProducto> obtenerInventarioAnwo() {
        try {
            String xml = ClienteWsAnwo.consultarProductos();
            ArrayList<AnwoProducto> lista = (ArrayList)XMLSerializer.fromXMLString(xml);
            return lista;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ArrayList<AnwoStockProducto> obtenerStockAnwo() {
        try {
            String xml = ClienteWsAnwo.consultarProductosDisponibles();
            ArrayList<AnwoStockProducto> lista = (ArrayList)XMLSerializer.fromXMLString(xml);
            return lista;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultadoSP reservar(int idStock){
         try {
            String xml = ClienteWsAnwo.reservarProducto(idStock);
            ResultadoSP resultado = (ResultadoSP)XMLSerializer.fromXMLString(xml);
            return resultado;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
