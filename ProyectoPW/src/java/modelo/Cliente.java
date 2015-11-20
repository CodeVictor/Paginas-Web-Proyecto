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
public class Cliente {
    private int No_Solicitud;
    private String Nombre;

    public Cliente(int No_Solicitud, String Nombre) {
        this.No_Solicitud = No_Solicitud;
        this.Nombre = Nombre;
    }

    public int getNo_Solicitud() {
        return No_Solicitud;
    }

    public void setNo_Solicitud(int No_Solicitud) {
        this.No_Solicitud = No_Solicitud;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
