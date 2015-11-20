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
import modelo.Paquete;

/**
 *
 * @author V2014
 */
public class PaqueteControllerdo extends HttpServlet {

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
        String nombre=request.getParameter("txtNombre");
        String descripcion=request.getParameter("txtDescripcion");
        String fecha=request.getParameter("txtFecha");
        String precio=request.getParameter("txtPrecio");
        String nombreMod=request.getParameter("txtNombreMod");
        String metodo=request.getParameter("txtMetodo");
        
        if(metodo.equals("Ingresar")){//Metodo ingresar
                if(metodo.equals("")||/*codigo.equals("")||*/nombre.equals("")||descripcion.equals("")||fecha.equals("")||precio.equals("")){
            String error="Parametros vacios...";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
                }else{
                int p=0;
                try{
                //c=Integer.parseInt(codigo);
                p=Integer.parseInt(precio);
                }
                catch(NumberFormatException e){
                    String error="Deve Ingresar Numeros...";
                    request.getSession().setAttribute("error", error);
                    request.getRequestDispatcher("Error.jsp").forward(request, response);
                }
                Paquete a1=new Paquete(/*c,*/nombre,descripcion,fecha,p);
                Conexion con=new Conexion();//se crea la conexion con bd
                if(con.InsertarPaquete(a1)>0){//se inserta el dato
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
                    if(con.EliminarPaquete(nombre)>0){
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
                        ArrayList<Paquete> agencias=new ArrayList<Paquete>();
                        
                        if(res==null){
                             String error="No Existen Datos...";
                            request.getSession().setAttribute("vacio", error);
                            request.getRequestDispatcher("DatosVacios.jsp").forward(request, response);//Colocar codigo para datos vacios
                        }else{
                            try {
                                while(res.next()){
                                    agencias.add(new Paquete(/*res.getInt("Codigo"),*/res.getString("Nombre"),res.getString("Descripcion"),res.getString("Fecha"),res.getInt("Precio")));
                                }
                                    request.getSession().setAttribute("paquete",agencias);
                                    request.getRequestDispatcher("MostrarPaquete.jsp").forward(request, response);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        if(metodo.equals("Modificar")){
                                request.getSession().setAttribute("txtNombre", nombre);
                                request.getRequestDispatcher("ModificarPaquete.jsp").forward(request, response);
                         
                            
                            int p=0;
                            try{
                           // c=Integer.parseInt(codigo);
                            p=Integer.parseInt(precio);
                            }
                            catch(NumberFormatException e){
                                String error="Deve Ingresar Numeros...";
                                request.getSession().setAttribute("error", error);
                                request.getRequestDispatcher("Error.jsp").forward(request, response);
                            }
                                Paquete a1=new Paquete(/*c,*/nombre,descripcion,fecha,p);
                                Conexion con=new Conexion();//se crea la conexion con bd
                                if(con.ModificarPaquete(nombreMod,a1)>0){//se inserta el dato
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
