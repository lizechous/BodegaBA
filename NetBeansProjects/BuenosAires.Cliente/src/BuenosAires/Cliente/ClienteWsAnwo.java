/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.Cliente;

/**
 *
 * @author Liz
 */
public class ClienteWsAnwo {

    public static String consultarProductosDisponibles() {
        com.mycompany.webservicesanwo.WsAnwo_Service service = new com.mycompany.webservicesanwo.WsAnwo_Service();
        com.mycompany.webservicesanwo.WsAnwo port = service.getWsAnwoPort();
        return port.consultarProductosDisponibles();
    }
    
    public static String consultarProductos() {
        com.mycompany.webservicesanwo.WsAnwo_Service service = new com.mycompany.webservicesanwo.WsAnwo_Service();
        com.mycompany.webservicesanwo.WsAnwo port = service.getWsAnwoPort();
        return port.consultarProductos();
    }

    public static String reservarProducto(int arg0) {
        com.mycompany.webservicesanwo.WsAnwo_Service service = new com.mycompany.webservicesanwo.WsAnwo_Service();
        com.mycompany.webservicesanwo.WsAnwo port = service.getWsAnwoPort();
        return port.reservarProducto(arg0);
    }
    
}
