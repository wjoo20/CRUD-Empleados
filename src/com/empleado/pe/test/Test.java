
package com.empleado.pe.test;

import com.empleado.pe.bo.EmpleadoBO;
import com.empleado.pe.entity.Empleado;

/**
 *
 * @author PC
 */
public class Test {
    EmpleadoBO ebo = new EmpleadoBO();
    Empleado emp = new Empleado();
    String mensaje = "";
    
    public void insertar(){
//        emp.setNombres("JUNIOR");
//        emp.setApellidos("OSIS");
//        emp.setCedula("46769145");
//        emp.setEstadoCivil('S');
//        emp.setGenero('M');
//        emp.setEdad(29);
        emp.setIdEmpleado(2);
        emp.setNombres("MARTIN");
        emp.setApellidos("OSIS");
        emp.setCedula("15485632");
        emp.setEstadoCivil('C');
        emp.setGenero('M');
        emp.setEdad(45);
        mensaje = ebo.agregarEmpleado(emp);
        System.out.println(mensaje);
    }
    
    public void modificar(){
        
        emp.setIdEmpleado(2);
        emp.setNombres("SONIA");
        emp.setApellidos("CHACON");
        emp.setCedula("45859652");
        emp.setEstadoCivil('C');
        emp.setGenero('M');
        emp.setEdad(40);
        mensaje = ebo.modificarEmpleado(emp);
        System.out.println(mensaje);
    }
    
    public void eliminar(){
        
        mensaje = ebo.eliminarEmpleado(0);
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
        //test.modificar();
        //test.eliminar();
    }
}
