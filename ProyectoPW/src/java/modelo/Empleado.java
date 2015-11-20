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
public class Empleado {
    private int Codigo;
    private String Nombre;
    private String Nit;
    private int Edad;
    private int Salario;
    private String Cargo;
    private int Codigo_Agencia;

    public Empleado(/*int Codigo,*/ String Nombre, String Nit, int Edad, int Salario, String Cargo, int Codigo_Agencia) {
       // this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.Edad = Edad;
        this.Salario = Salario;
        this.Cargo = Cargo;
        this.Codigo_Agencia = Codigo_Agencia;
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

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getCodigo_Agencia() {
        return Codigo_Agencia;
    }

    public void setCodigo_Agencia(int Codigo_Agencia) {
        this.Codigo_Agencia = Codigo_Agencia;
    }
    
    
    
}
