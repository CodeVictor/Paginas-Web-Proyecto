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
import modelo.Empleado;

/**
 *
 * @author V2014
 */
public class EmpleadoControllerdo extends HttpServlet {

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
        String codigo=request.getParameter("txtCodigo");
        String nombre=request.getParameter("txtNombre");
        String nit=request.getParameter("txtNit");
        String edad=request.getParameter("txtEdad");
        String salario=request.getParameter("txtSalario");
        String cargo=request.getParameter("txtCargo");
        String codigo_Agencia=request.getParameter("txtCodigoAgencia");
        String nombreMod=request.getParameter("txtNombreMod");
        String metodo=request.getParameter("txtMetodo");
        
        
        
            if(metodo.equals("Ingresar")){
                if(/*codigo.equals("")||*/nombre.equals("")||nit.equals("")||edad.equals("")||salario.equals("")||cargo.equals("")||codigo_Agencia.equals("")){
                    String error="Parametros vacios...";
                    request.getSession().setAttribute("error", error);
                    request.getRequestDispatcher("Error.jsp").forward(request, response);
                }
                else{
                    int c=0,ed=0,s=0,ca=0;
                    try{
                   // c=Integer.parseInt(codigo);
                    ed=Integer.parseInt(edad);
                    ca=Integer.parseInt(codigo_Agencia);
                    s=Integer.parseInt(salario);
                    }
                    catch(NumberFormatException e){
                        String error="Deve Ingresar Numeros...";
                        request.getSession().setAttribute("error", error);
                        request.getRequestDispatcher("Error.jsp").forward(request, response);
                    }
                    Empleado a1=new Empleado(/*c,*/nombre,nit,ed,s,cargo,ca);
                    Conexion con=new Conexion();
                    if(con.InsertarEmpleado(a1)>0){
                        request.getRequestDispatcher("Exito.jsp").forward(request, response);
                    }
                    else{
                        String error="No se pudo Insertar...";
                        request.getSession().setAttribute("error", error);
                        request.getRequestDispatcher("Error.jsp").forward(request, response);
                    }
                }
            }else{
                 if(metodo.equals("Eliminar")){//metodo eliminar
                Conexion con=new Conexion();//se crea la conexion y se inserta en la bd
                    if(con.EliminarEmpleado(nombre)>0){
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
                        ArrayList<Empleado> empleados=new ArrayList<Empleado>();
                        
                        if(res==null){
                             String error="No Existen Datos...";
                            request.getSession().setAttribute("vacio", error);
                            request.getRequestDispatcher("DatosVacios.jsp").forward(request, response);//Colocar codigo para datos vacios
                        }else{
                            try {
                                while(res.next()){
                                    empleados.add(new Empleado(/*res.getInt("Codigo"),*/res.getString("Nombre"),res.getString("Nit"),res.getInt("Edad"),res.getInt("Salario"),res.getString("Cargo"),res.getInt("Codigo_Agencia")));
                                }
                                    request.getSession().setAttribute("empleado",empleados);
                                    request.getRequestDispatcher("MostrarEmpleado.jsp").forward(request, response);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        if(metodo.equals("Modificar")){
                                request.getSession().setAttribute("txtNombre", nombre);
                                request.getRequestDispatcher("ModificarEmpleado.jsp").forward(request, response);
                         
                            
                            int ed=0,ca=0,s=0;
                            try{
                           // c=Integer.parseInt(codigo);
                                ed=Integer.parseInt(edad);
                                ca=Integer.parseInt(codigo_Agencia);
                                s=Integer.parseInt(salario);
                            }
                            catch(NumberFormatException e){
                                String error="Deve Ingresar Numeros...";
                                request.getSession().setAttribute("error", error);
                                request.getRequestDispatcher("Error.jsp").forward(request, response);
                            }
                                Empleado a1=new Empleado(/*c,*/nombre,nit,ed,s,cargo,ca);
                                Conexion con=new Conexion();//se crea la conexion con bd
                                if(con.ModificarEmpleado(nombreMod,a1)>0){//se inserta el dato
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
            }//
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
