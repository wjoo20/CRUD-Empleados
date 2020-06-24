
package com.empleado.pe.bo;

import com.empleado.pe.dao.EmpleadoDAO;
import com.empleado.pe.db.Conexion;
import com.empleado.pe.entity.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class EmpleadoBO {
    private String mensaje = "";
    private EmpleadoDAO edao = new EmpleadoDAO();
    
    public String agregarEmpleado(Empleado emp){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarEmpleado(conn, emp);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String modificarEmpleado(Empleado emp){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modificarEmpleado(conn, emp);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String eliminarEmpleado(int id){
    Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarEmpleado(conn, id);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public void listarEmpleado(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.listarEmpleado(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
    }
    
    public int getMaxID(){
        Connection conn = Conexion.getConnection();
        int id = edao.getMaxID(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return id;
    }
}
