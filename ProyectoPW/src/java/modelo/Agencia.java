/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author V2014
 */
public class Agencia {
    private int Codigo;
    private String Nombre;
    private String Direccion;
    private String Departamento;
    private int Telefono;
    private int No_Empleados;
    private int Administrador;

    public Agencia(/*int Codigo,*/ String Nombre, String Direccion, String Departamento, int Telefono, int No_Empleados, int Administrador) {
       // this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Departamento = Departamento;
        this.Telefono = Telefono;
        this.No_Empleados = No_Empleados;
        this.Administrador = Administrador;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getNo_Empleados() {
        return No_Empleados;
    }

    public void setNo_Empleados(int No_Empleados) {
        this.No_Empleados = No_Empleados;
    }

    public int getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(int Administrador) {
        this.Administrador = Administrador;
    }
    
    
}
