/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Agencia;
import modelo.Conexion;
import modelo.Empleado;

/**
 *
 * @author V2014
 */
public class AsignacionControllerdo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Agenciass=request.getParameter("Agg");
        String Empleadoss=request.getParameter("Emp");
        if(Agenciass!=null&&Empleadoss!=null){
        String codigo=request.getParameter("txtCodigo");
        String nombre=request.getParameter("txtNombre");
        String direccion=request.getParameter("txtDireccion");
        String departamento=request.getParameter("txtDepartamento");
        String telefono=request.getParameter("txtTelefono");
        String noEmpleados=request.getParameter("txtNoEmpleados");
        String administrador=request.getParameter("txtAdministrador");
        String nombreMod=request.getParameter("txtNombreMod");
        String metodo=request.getParameter("txtMetodo");
        
        String codigoe=request.getParameter("txtCodigoe");
        String nombree=request.getParameter("txtNombree");
        String nit=request.getParameter("txtNit");
        String edad=request.getParameter("txtEdad");
        String salario=request.getParameter("txtSalario");
        String cargo=request.getParameter("txtCargo");
        String codigo_Agencia=request.getParameter("txtCodigoAgencia");
        
                        if(Agenciass.equals("")||Empleadoss.equals("")){
                             String error="Parametros vacios...";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
                }else{
                             int c=0,t=0,no=0,a=0;
                            try{
                            c=Integer.parseInt(codigoe);
                            t=Integer.parseInt(telefono);
                            no=Integer.parseInt(noEmpleados);
                            a=Integer.parseInt(administrador);
                            }
                            catch(NumberFormatException e){
                                String error="Deve Ingresar Numeros...";
                                request.getSession().setAttribute("error", error);
                                request.getRequestDispatcher("Error.jsp").forward(request, response);
                            }
                            Agencia a1=new Agencia(/*c,*/nombre,direccion,departamento,t,no,a);
                            Conexion con1=new Conexion();//se crea la conexion con bd
                            if(con1.AsignacionA(c,a1)>0 &&con1.AsignacionE(c, a1)>0){//se inserta el dato
                                request.getRequestDispatcher("Exito.jsp").forward(request, response);
                            }
                            else{
                                String error="No se pudo Asignar...";
                                request.getSession().setAttribute("error", error);
                                request.getRequestDispatcher("Error.jsp").forward(request, response);
                            }
                        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
