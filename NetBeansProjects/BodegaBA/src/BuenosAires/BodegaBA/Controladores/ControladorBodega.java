/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package BuenosAires.BodegaBA.Controladores;

import BuenosAires.Modelo.BodegaDespacho;
import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import BuenosAires.Modelo.BodegaProducto;
/**
 *
 * @author Liz
 */
public class ControladorBodega {
    public void almacenarProducto(BodegaProducto producto) throws Exception
    {
       Conexion conexion = new Conexion(); 

       try
       {
           Connection conn = conexion.getConnection();
           Statement stmt = conn.createStatement();

           String consulta = "INSERT INTO BODEGA_PRODUCTO (ID_PRODUCTO, NOMBRE_PRODUCTO, DESCRIPCION,"
                   + "MARCA, PRECIO, CANTIDAD) VALUES ("
                   +"SQ_CODIGO.NEXTVAL, "
                   +"'"+producto.getNombreProducto()+"', "
                   +"'"+producto.getDescripcion()+"', "
                   +"'"+producto.getMarca()+"', "
                   +""+producto.getPrecio()+", "
                   +""+producto.getCantidad()+")";

           System.out.println("Consulta: "+ consulta);
           stmt.executeUpdate(consulta);
           System.out.println("CONSULTA INSERT EXITOSA");


       }
       catch(Exception err)
       {
           System.out.println("ERROR: "+err.getMessage());
           throw err;
       }
    }
    
    public void actualizarCantidad(int idProducto, int cantidad) throws Exception
    {
       Conexion conexion = new Conexion(); 

       try
       {
           Connection conn = conexion.getConnection();
           Statement stmt = conn.createStatement();
           
           String query = "UPDATE BODEGA_PRODUCTO SET CANTIDAD "
                   + "= "+cantidad+" WHERE ID_PRODUCTO="+idProducto;

           System.out.println("Consulta: "+ query);
           stmt.executeUpdate(query);
           if(stmt.getUpdateCount() < 1){
               throw new Exception("fila no actualizada");
           }
           System.out.println("CONSULTA UPDATE EXITOSA");


       }
       catch(Exception err)
       {
           System.out.println("ERROR: "+err.getMessage());
           throw err;
       }
    }
    
    public void actualizarEstado(int idOrden, String estado) throws Exception
    {
       Conexion conexion = new Conexion(); 

       try
       {
           Connection conn = conexion.getConnection();
           Statement stmt = conn.createStatement();
           
           String query = "UPDATE BODEGA_DESPACHO SET ESTADO_OD "
                   + "= '"+estado+"' WHERE ID_OD="+idOrden;

           System.out.println("Consulta: "+ query);
           stmt.executeUpdate(query);
           if(stmt.getUpdateCount() < 1){
               throw new Exception("fila no actualizada");
           }
           System.out.println("CONSULTA UPDATE EXITOSA");


       }
       catch(Exception err)
       {
           System.out.println("ERROR: "+err.getMessage());
           throw err;
       }
    }
    
        //Buscar Producto
    public ArrayList<BodegaProducto> listarProductos()
    {
	ArrayList<BodegaProducto> listaProductos = new ArrayList<>();
	Conexion conexion = new Conexion();

	try
	{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_PRODUCTO, NOMBRE_PRODUCTO, MARCA, PRECIO, CANTIDAD FROM BODEGA_PRODUCTO";
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("CONSULTA: "+ consulta);
         
         while(rs.next())
         {
             BodegaProducto producto = new BodegaProducto();
             
             producto.setIdProducto(rs.getInt(1));
             producto.setNombreProducto(rs.getString(2));
             producto.setMarca(rs.getString(3));
             producto.setPrecio(rs.getInt(4));
             producto.setCantidad(rs.getInt(5));
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
    
    public ArrayList<BodegaDespacho> listarDespachos()
    {
	ArrayList<BodegaDespacho> listaDespachos = new ArrayList<>();
	Conexion conexion = new Conexion();

	try
	{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_OD, ID_FACTURA, ESTADO_OD FROM BODEGA_DESPACHO";
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("CONSULTA: "+ consulta);
         
            while(rs.next())
            {
                BodegaDespacho orden = new BodegaDespacho();

                orden.setIdOd(rs.getInt(1));
                orden.setIdFactura(rs.getInt(2));
                orden.setEstadoOd(rs.getString(3));
                listaDespachos.add(orden);
            }
        return listaDespachos;
        
        }
        catch(Exception err)
        {
            System.out.println("ERROR: "+err.getMessage());
            return new ArrayList<BodegaDespacho>();
        }
    }  
}