/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import BuenosAires.Modelo.AnwoProducto;
import BuenosAires.Modelo.AnwoStockProducto;
import BuenosAires.Modelo.ResultadoSP;
import java.util.ArrayList;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author cgomezvega
 */
public class AnwoStoreProcedures {
    
    // Para ejecutar el store procedure en SQL Developer usar:
    // variable rc refcursor;
    // exec LISTAR_PRODUCTOS( :rc );
    
    public ArrayList<AnwoProducto> listarProductos() {
        try {
            Connection conn = new OracleDataBaseConnection().getConnection();
            CallableStatement stmt = conn.prepareCall("BEGIN LISTAR_PRODUCTOS(?); END;");
            stmt.registerOutParameter(1, OracleTypes.CURSOR); // Tipo de dato Oracle refcusor asdf
            stmt.execute();
            ResultSet rs = ((OracleCallableStatement)stmt).getCursor(1);
            ArrayList lista = new ArrayList<AnwoProducto>();
            while (rs.next()) {
                lista.add(new AnwoProducto(
                        rs.getInt("ID_PRODUCTO"), 
                        rs.getString("NOM_PRODUCTO"), 
                        rs.getInt("PRECIO")));
            }
            rs.close();
            stmt.close();
            conn.close();
            return lista;
        }
        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
    
    public ArrayList<AnwoStockProducto> listarProductosDisponibles() {
        try {
            Connection conn = new OracleDataBaseConnection().getConnection();
            CallableStatement stmt = conn.prepareCall("BEGIN LISTAR_PRODUCTOS_DISPONIBLES(?); END;");
            stmt.registerOutParameter(1, OracleTypes.CURSOR); 
            stmt.execute();
            ResultSet rs = ((OracleCallableStatement)stmt).getCursor(1);
            ArrayList lista = new ArrayList<AnwoStockProducto>();
            while (rs.next()) {
                lista.add(new AnwoStockProducto(
                        rs.getInt("ID_STOCK_PRODUCTO"), 
                        rs.getInt("ID_PRODUCTO"), 
                        rs.getString("CODIGO"), 
                        rs.getString("RESERVADO_BA")));
            }
            rs.close();
            stmt.close();
            conn.close();
            return lista;
        }
        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
    
    public ResultadoSP reservarProducto(int idStockProducto) {
        try {
            Connection conn = new OracleDataBaseConnection().getConnection();
            // Los signos de interrogación se refieren a la cantidad de parámetros del sp
            CallableStatement stmt = conn.prepareCall("{call RESERVAR_PRODUCTO(?,?,?)}");
            // asigno el valor al primer parámetro, que sería el de entrada del sp
            stmt.setInt(1, idStockProducto);
            stmt.registerOutParameter(2, OracleTypes.VARCHAR); 
            stmt.registerOutParameter(3, OracleTypes.VARCHAR); 
            ResultadoSP resultado = new ResultadoSP();
            // ejecuto el sp
            stmt.executeUpdate();
            // una vez ejecutado, puedo obtener los valores de salida del sp, respetando el orden de los parámetros de salida (2 y 3)
            resultado.setCodigo(stmt.getString(2));
            resultado.setDescripcion(stmt.getString(3));
            stmt.close();
            conn.close();
            return resultado;
        }
        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}
