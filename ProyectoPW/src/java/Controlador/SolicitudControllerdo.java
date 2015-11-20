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
import modelo.Conexion;
import modelo.Solicitud;

/**
 *
 * @author V2014
 */
public class SolicitudControllerdo extends HttpServlet {

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
        String no_Solicitud=request.getParameter("txtNoSolicitud");
        String fecha=request.getParameter("txtFecha");
        String dpiCliente=request.getParameter("txtDPICliente");
        String vendedor=request.getParameter("txtVendedor");
        String nombreMod=request.getParameter("txtNombreMod");
        String metodo=request.getParameter("txtMetodo");
        
        if(metodo.equals("Ingresar")){//Metodo ingresar
                if(metodo.equals("")||/*codigo.equals("")||*/no_Solicitud.equals("")||fecha.equals("")||dpiCliente.equals("")||vendedor.equals("")){
            String error="Parametros vacios...";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
                }else{
                int no=0,f=0,dpi=0,v=0;
                try{
                //c=Integer.parseInt(codigo);
                no=Integer.parseInt(no_Solicitud);
                f=Integer.parseInt(fecha);
                dpi=Integer.parseInt(dpiCliente);
                v=Integer.parseInt(vendedor);
                }
                catch(NumberFormatException e){
                    String error="Deve Ingresar Numeros...";
                    request.getSession().setAttribute("error", error);
                    request.getRequestDispatcher("Error.jsp").forward(request, response);
                }
                Solicitud a1=new Solicitud(/*c,*/no,fecha,dpi,v);
                Conexion con=new Conexion();//se crea la conexion con bd
                if(con.InsertarSolicitud(a1)>0){//se inserta el dato
                    request.getRequestDispatcher("Exito.jsp").forward(request, response);
                }
                else{
                    String error="No se pudo Insertar...";
                    request.getSession().setAttribute("error", error);
                    request.getRequestDispatcher("Error.jsp").forward(request, response);
                }
                }
            }
            else{
                if(metodo.equals("Eliminar")){//metodo eliminar
                Conexion con=new Conexion();//se crea la conexion y se inserta en la bd
                    if(con.EliminarSolicitud(no_Solicitud)>0){
                        request.getRequestDispatcher("Exito.jsp").forward(request, response);
                    }
                    else{
                        String error="No se pudo Eliminar...";
                        request.getSession().setAttribute("error", error);
                        request.getRequestDispatcher("Error.jsp").forward(request, response);
                    }
                }
                else{
                    if (metodo.equals("Mostrar")){
                        Conexion con= new Conexion();
                        ResultSet res=con.MostrarAgencia();
                        ArrayList<Solicitud> agencias=new ArrayList<Solicitud>();
                        
                        if(res==null){
                             String error="No Existen Datos...";
                            request.getSession().setAttribute("vacio", error);
                            request.getRequestDispatcher("DatosVacios.jsp").forward(request, response);//Colocar codigo para datos vacios
                        }else{
                            try {
                                while(res.next()){
                                    agencias.add(new Solicitud(/*res.getInt("Codigo"),*/res.getInt("No_Solicitud"),res.getString("Fecha"),res.getInt("DPI_Cliente"),res.getInt("Vendedor")));
                                }
                                    request.getSession().setAttribute("solicitud",agencias);
                                    request.getRequestDispatcher("MostrarSolicitud.jsp").forward(request, response);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        if(metodo.equals("Modificar")){
                                request.getSession().setAttribute("txtNoSolicitud", no_Solicitud);
                                request.getRequestDispatcher("ModificarSolicitud.jsp").forward(request, response);
                         
                            
                            int no=0,f=0,dpi=0,v=0;
                            try{
                           // c=Integer.parseInt(codigo);
                            no=Integer.parseInt(no_Solicitud);
                            f=Integer.parseInt(fecha);
                            dpi=Integer.parseInt(dpiCliente);
                            v=Integer.parseInt(vendedor);
                            }
                            catch(NumberFormatException e){
                                String error="Deve Ingresar Numeros...";
                                request.getSession().setAttribute("error", error);
                                request.getRequestDispatcher("Error.jsp").forward(request, response);
                            }
                                Solicitud a1=new Solicitud(/*c,*/no,fecha,dpi,v);
                                Conexion con=new Conexion();//se crea la conexion con bd
                                if(con.ModificarSolicitud(nombreMod,a1)>0){//se inserta el dato
                                    request.getRequestDispatcher("Exito.jsp").forward(request, response);
                                }
                                else{
                                   // String error="No se pudo Modificar...";
                                   // request.getSession().setAttribute("error", error);
                                  //  request.getRequestDispatcher("Error.jsp").forward(request, response);
                                }
                        }//fin del modificar
                    }//fin del mostrar
                }//fin del Eliminar
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
