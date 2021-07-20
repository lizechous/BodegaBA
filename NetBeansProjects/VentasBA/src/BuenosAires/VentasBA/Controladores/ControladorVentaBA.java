/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.VentasBA.Controladores;

import BuenosAires.Modelo.BodegaProducto;
import BuenosAires.Modelo.VentaFacturaWeb;
import db.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Liz
 */
public class ControladorVentaBA {
    
    public String realizarPago(VentaFacturaWeb factura, String nombreCliente, String direccionCliente,
                                String telefonoCliente, String correoCliente) throws Exception
    {
        Conexion conexion = new Conexion(); 
        try
        {
            Connection conn = conexion.getConnection();
//            IN_RUT_CLIENTE IN VARCHAR2 
//          , IN_TIPO_FACTURA IN VARCHAR2 
//          , IN_FECHA_DESPACHO IN DATE 
//          , IN_VALOR_TOTAL IN NUMBER 
//          , IN_DIRECCION_ENVIO IN VARCHAR2 
//          , IN_CANTIDAD IN NUMBER 
//          , IN_ID_PRODUCTO IN NUMBER
//          , IN_NOMBRE_CLIENTE IN VARCHAR2
//          , IN_DIRECCION_CLIENTE IN VARCHAR2
//          , IN_TELEFONO_CLIENTE IN VARCHAR2
//          , IN_CORREO_CLIENTE IN VARCHAR2
//          , OUT_COD_RESULTADO OUT VARCHAR2 
            CallableStatement cs = conn.prepareCall("call SP_GENERAR_VENTA(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            cs.registerOutParameter(12, OracleTypes.VARCHAR);
            
            cs.setString(1, factura.getRutCliente());
            cs.setString(2, factura.getTipoFactura());
            cs.setDate(3, new java.sql.Date(factura.getFechaDespacho().getTime()));
            cs.setLong(4, factura.getValorTotal().longValue());
            cs.setString(5, factura.getDireccionEnvio());
            cs.setInt(6, factura.getCantidad().intValue());
            cs.setInt(7, factura.getIdProducto().intValue());
            cs.setString(8, nombreCliente);
            cs.setString(9, direccionCliente);
            cs.setString(10, telefonoCliente);
            cs.setString(11, correoCliente);
            cs.execute();
            
            return cs.getString(12);

        }
        catch(Exception err)
        {
            System.out.println("ERROR: "+err.getMessage());
            throw err;
        }
    }
    
    public ArrayList<BodegaProducto> obtenerProductos()
    {
	ArrayList<BodegaProducto> listaProductos = new ArrayList<>();
	Conexion conexion = new Conexion();

	try
	{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_PRODUCTO, NOMBRE_PRODUCTO, PRECIO, CANTIDAD"
                   + " FROM BODEGA_PRODUCTO";            
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("CONSULTA: "+ consulta);
         
            while(rs.next())
            {
                BodegaProducto producto = new BodegaProducto();

                producto.setIdProducto(rs.getInt(1));
                producto.setNombreProducto(rs.getString(2));
                producto.setPrecio(rs.getInt(3));
                producto.setCantidad(rs.getInt(4));
                listaProductos.add(producto);
            }
            return listaProductos;
        }
        catch(Exception err)
        {
            System.out.println("ERROR: "+err.getMessage());
            return new ArrayList<BodegaProducto>();
        }
    }
    
    public ArrayList<BodegaProducto> listarProductos()
    {
	ArrayList<BodegaProducto> listaProductos = new ArrayList<>();
	Conexion conexion = new Conexion();

	try
	{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT NOMBRE_PRODUCTO, PRECIO, CANTIDAD FROM BODEGA_PRODUCTO";
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("CONSULTA: "+ consulta);
         
         while(rs.next())
         {
             BodegaProducto producto = new BodegaProducto();
             
             producto.setNombreProducto(rs.getString(1));
             producto.setPrecio(rs.getInt(2));
             producto.setCantidad(rs.getInt(3));
             listaProductos.add(producto);
             
         }
        return listaProductos;
        
        }
        catch(Exception err)
        {
            System.out.println("ERROR: "+err.getMessage());
            return new ArrayList<BodegaProducto>();
        }
    }
}
