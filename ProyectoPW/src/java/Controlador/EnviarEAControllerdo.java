/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
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
public class EnviarEAControllerdo extends HttpServlet {

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
        Conexion con= new Conexion();
                        ResultSet res=con.MostrarAgencia();
                        ArrayList<Agencia> agencias=new ArrayList<Agencia>();
                        Conexion con2= new Conexion();
                        ResultSet res2=con2.MostrarEmpleado();
                        ArrayList<Empleado> empleados=new ArrayList<Empleado>();
                        
                        try {
                                while(res.next()){
                                    agencias.add(new Agencia(/*res.getInt("Codigo"),*/res.getString("Nombre"),res.getString("Direccion"),res.getString("Departamento"),res.getInt("Telefono"),res.getInt("No_Empleados"),res.getInt("Administrador")));
                                }
                                    request.getSession().setAttribute("agencia",agencias);
                                    
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        try {
                                while(res2.next()){
                                    empleados.add(new Empleado(/*res.getInt("Codigo"),*/res.getString("Nombre"),res.getString("Nit"),res.getInt("Edad"),res.getInt("Salario"),res.getString("Cargo"),res.getInt("Codigo_Agencia")));
                                }
                                    request.getSession().setAttribute("empleado",empleados);
                                    request.getRequestDispatcher("AsignarAgencia.jsp").forward(request, response);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
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
