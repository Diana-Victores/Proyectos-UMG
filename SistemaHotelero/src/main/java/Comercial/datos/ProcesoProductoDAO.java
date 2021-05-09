/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.datos;

import Comercial.dominio.ProcesoProducto;
import Comercial.vista.Proceso_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class ProcesoProductoDAO {

    
    private static final String SQL_SELECT = "SELECT PK_id_procesoproducto, nombre_producto, nombre_bodega, existencias_producto FROM tbl_proceso_producto";
private static final String SQL_INSERT = "INSERT INTO tbl_proceso_producto (PK_id_procesoproducto, nombre_producto, nombre_bodega, existencias_producto) VALUES(?,?,?,?)";
private static final String SQL_UPDATE = "UPDATE tbl_proceso_producto SET   nombre_producto= ?, nombre_bodega= ?, existencias_producto= ?   WHERE PK_id_procesoproducto= ?";
private static final String SQL_QUERY = "SELECT PK_id_procesoproducto, nombre_producto, nombre_bodega, existencias_producto FROM tbl_proceso_producto WHERE PK_id_producto=?";
private static final String SQL_DELETE = "DELETE FROM tbl_proceso_producto WHERE PK_id_producto=?";
 
 
// public List<Proceso_Producto> select() {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        Proceso_Producto procesoproducto = null;
//        List<Proceso_Producto> procesoproductos = new ArrayList<Proceso_Producto>();
//
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_SELECT);
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                int PK_id_producto = rs.getInt("PK_id_procesoproducto");
//                String nombre_producto = rs.getString("nombre_producto");
//                String precio_producto = rs.getString("nombre_bodega");
//                String descripcion_producto = rs.getString("existencias_producto");
//               
//                
//                 
//                procesoproducto = new Proceso_Producto();
//                procesoproducto.setPK_id_producto(PK_id_producto);
//                procesoproducto.setNombre_producto(nombre_producto);
//                procesoproducto.setPrecio_producto(precio_producto);
//                procesoproducto.setDescripcion_producto(descripcion_producto);
//                procesoproducto.setEstatus_producto(estatus_producto);
//                procesoproductos.add(procesoproducto);
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(rs);
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        return productos;
//    }
// 
// 
// public int insert(Producto aplicacion) {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_INSERT);
//            stmt.setInt(1, aplicacion.getPK_id_producto());
//            stmt.setString(2, aplicacion.getNombre_producto());
//            stmt.setString(3, aplicacion.getPrecio_producto());
//            stmt.setString(4, aplicacion.getDescripcion_producto());
//            stmt.setString(5, aplicacion.getEstatus_producto());
//            
//             
//            //System.out.println("ejecutando query:" + SQL_INSERT);
//            rows = stmt.executeUpdate();
//            //System.out.println("Registros afectados:" + rows);
//            JOptionPane.showMessageDialog(null, "Registro Exitoso");
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        return rows;
//    }
//  public int update(Producto aplicacion) {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//
//        try {
//            conn = Conexion.getConnection();
//            System.out.println("ejecutando query: " + SQL_UPDATE);
//            stmt = conn.prepareStatement(SQL_UPDATE);
//            
//            stmt.setString(1, aplicacion.getNombre_producto());
//            stmt.setString(2, aplicacion.getPrecio_producto());
//            stmt.setString(3, aplicacion.getDescripcion_producto());
//            stmt.setString(4, aplicacion.getEstatus_producto());
//            stmt.setInt(5, aplicacion.getPK_id_producto());
//            
//            
//            rows = stmt.executeUpdate();
//            //System.out.println("Registros actualizado:" + rows);
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        return rows;
//    }
//  public Producto query(Producto producto) {    
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        List<Producto> productos = new ArrayList<Producto>();
//        int rows = 0;
//
//        try {
//            conn = Conexion.getConnection();
//            System.out.println("Ejecutando query:" + SQL_QUERY);
//            stmt = conn.prepareStatement(SQL_QUERY);
//            stmt.setInt(1, producto.getPK_id_producto());
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//               int PK_id_producto = rs.getInt("PK_id_producto");
//                String nombre_producto = rs.getString("nombre_producto");
//                String precio_producto = rs.getString("precio_producto");
//                String descripcion_producto = rs.getString("descripcion_producto");
//                String estatus_producto = rs.getString("estatus_producto");
//                 
//                
//                producto = new Producto();
//                producto.setNombre_producto(nombre_producto);
//                producto.setPrecio_producto(precio_producto);
//                producto.setDescripcion_producto(descripcion_producto);
//                producto.setEstatus_producto(estatus_producto);
//                
//                //empleados.add(empleado); // Si se utiliza un ArrayList
//            }
//            //System.out.println("Registros buscado:" + empleado);
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(rs);
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        //return empleados;  // Si se utiliza un ArrayList
//        return producto;
//    } 
// public int delete(Producto aplicacion) {
//
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//
//        try {
//            conn = Conexion.getConnection();
//            //System.out.println("Ejecutando query:" + SQL_DELETE);
//            stmt = conn.prepareStatement(SQL_DELETE);
//            stmt.setInt(1, aplicacion.getPK_id_producto());
//            rows = stmt.executeUpdate();
//            //System.out.println("Registros eliminados:" + rows);
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        return rows;
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    public List<ProcesoProducto> select() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public List<ProcesoProducto> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
