/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author V2014
 */
public class Conexion {
    Connection cnn;
    Statement stmt;
    ResultSet result;

    public Conexion() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            cnn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "proyecto", "111");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int AsignacionE(int codigoE,Agencia a){
        int resultado=0;
        if(a.getNo_Empleados()<=8){
        
            try {
                String query="UPDATE Empleados SET Codigo_Agencia="+a.getCodigo()+" WHERE Codigo="+codigoE+"";
                stmt=cnn.createStatement();
                resultado=stmt.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return resultado;
        }else{
            return resultado;
        }
    }
     public int AsignacionA(int codigoE,Agencia a){
        int resultado=0;
        int in=a.getNo_Empleados()+1;
        if(a.getNo_Empleados()<=8){
        
            
            try {
                String query="UPDATE Agencias SET No_Empleados="+in+" WHERE Codigo="+a.getCodigo()+"";
                stmt=cnn.createStatement();
                resultado=stmt.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return resultado;
        }else{
            return resultado;
        }
    }
     public ResultSet ReporteEmpleados(int cod){
        try {
            String query="SELECT * FROM Empleados WHERE Codigo_Agencia="+cod+"";
            stmt=cnn.createStatement();
            result=stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
     
    public int InsertarAgencia(Agencia a){
        int resultado=0;
        try {
            String query="INSERT INTO Agencias (Codigo,Nombre,Direccion,Departamento,Telefono,No_Empleados,Administrador)"+" values(seq_CodigoAgencia.nextval,'"+a.getNombre()+"','"+a.getDireccion()+"','"+a.getDepartamento()+"',"+a.getTelefono()+","+a.getNo_Empleados()+","+a.getAdministrador()+")";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int EliminarAgencia(String n){
        int resultado=0;
        try {
            String query="DELETE FROM Agencias WHERE Nombre='"+n+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int ModificarAgencia(String a,Agencia b){
        int resultado=0;
        try {
            String query="UPDATE Agencias SET Nombre='"+b.getNombre()+"',Direccion='"+b.getDireccion()+"',Departamento='"+b.getDepartamento()+"',Telefono="+b.getTelefono()+",No_Empleados="+b.getNo_Empleados()+",Administrador="+b.getAdministrador()+" WHERE Nombre='"+a+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet MostrarAgencia(){
        try {
            String query="SELECT * FROM Agencias";
            stmt=cnn.createStatement();
            result=stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public int InsertarEmpleado(Empleado a){
        int resultado=0;
        try {
            String query="INSERT INTO Empleados (Codigo,Nombre,Nit,Edad,Salario,Cargo,Codigo_Agencia)"+" values(seq_CodigoEmpleado.nextval,'"+a.getNombre()+"','"+a.getNit()+"',"+a.getEdad()+","+a.getSalario()+","+a.getCargo()+","+a.getCodigo_Agencia()+")";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int EliminarEmpleado(String n){
        int resultado=0;
        try {
            String query="DELETE FROM Empleados WHERE Nombre='"+n+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int ModificarEmpleado(String a,Empleado b){
        int resultado=0;
        try {
            String query="UPDATE Empleados SET Nombre='"+b.getNombre()+"',Nit='"+b.getNit()+"',Edad='"+b.getEdad()+"',Salario="+b.getSalario()+",Cargo="+b.getCargo()+",Codigo_Agencia="+b.getCodigo_Agencia()+" WHERE Nombre='"+a+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet MostrarEmpleado(){
        try {
            String query="SELECT * FROM Empleados";
            stmt=cnn.createStatement();
            result=stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
     public int InsertarPaquete(Paquete a){
        int resultado=0;
        try {
            String query="INSERT INTO Paquete (Nombre,Descripcion,Fecha,Precio)"+" values('"+a.getNombre()+"','"+a.getDescripcion()+"','"+a.getFecha()+"',"+a.getPrecio()+")";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int EliminarPaquete(String n){
        int resultado=0;
        try {
            String query="DELETE FROM Paquete WHERE Nombre='"+n+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int ModificarPaquete(String a,Paquete b){
        int resultado=0;
        try {
            String query="UPDATE Paquete SET Nombre='"+b.getNombre()+"',Descripcion='"+b.getDescripcion()+"',Fecha='"+b.getFecha()+"',Precio="+b.getPrecio()+" WHERE Nombre='"+a+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet MostrarPaquete(){
        try {
            String query="SELECT * FROM Paquete";
            stmt=cnn.createStatement();
            result=stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int InsertarSolicitud(Solicitud a){
        int resultado=0;
        try {
            String query="INSERT INTO Solicitud (No_Solicitud,Fecha,DPI_Cliente,Vendedor)"+" values("+a.getNo_Solicitud()+",'"+a.getFecha()+"',"+a.getDPI_Cliente()+","+a.getVendedor()+")";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int EliminarSolicitud(String n){
        int resultado=0;
        try {
            String query="DELETE FROM Solicitud WHERE No_Solicitud="+n+"";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int ModificarSolicitud(String a,Solicitud b){
        int resultado=0;
        try {
            String query="UPDATE Solicitud SET Fecha='"+b.getFecha()+"',DPI_Cliente="+b.getDPI_Cliente()+",Vendedor="+b.getVendedor()+" WHERE No_Solicitud='"+a+"'";
            stmt=cnn.createStatement();
            resultado=stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet MostrarSolicitud(){
        try {
            String query="SELECT * FROM Solicitud";
            stmt=cnn.createStatement();
            result=stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
