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
public class Solicitud {
    private int No_Solicitud;
    private String Fecha;
    private int DPI_Cliente;
    private int Vendedor;

    public Solicitud(int No_Solicitud, String Fecha, int DPI_Cliente, int Vendedor) {
        this.No_Solicitud = No_Solicitud;
        this.Fecha = Fecha;
        this.DPI_Cliente = DPI_Cliente;
        this.Vendedor = Vendedor;
    }

    public int getNo_Solicitud() {
        return No_Solicitud;
    }

    public void setNo_Solicitud(int No_Solicitud) {
        this.No_Solicitud = No_Solicitud;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getDPI_Cliente() {
        return DPI_Cliente;
    }

    public void setDPI_Cliente(int DPI_Cliente) {
        this.DPI_Cliente = DPI_Cliente;
    }

    public int getVendedor() {
        return Vendedor;
    }

    public void setVendedor(int Vendedor) {
        this.Vendedor = Vendedor;
    }
    
    
}
