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
public class AgenciaControllerdo extends HttpServlet {

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
        String direccion=request.getParameter("txtDireccion");
        String departamento=request.getParameter("txtDepartamento");
        String telefono=request.getParameter("txtTelefono");
        String noEmpleados=request.getParameter("txtNoEmpleados");
        String administrador=request.getParameter("txtAdministrador");
        String nombreMod=request.getParameter("txtNombreMod");
        String metodo=request.getParameter("txtMetodo");
       
        
        
            if(metodo.equals("Ingresar")){//Metodo ingresar
                if(metodo.equals("")||/*codigo.equals("")||*/nombre.equals("")||direccion.equals("")||departamento.equals("")||telefono.equals("")||noEmpleados.equals("")||administrador.equals("")){
            String error="Parametros vacios...";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
                }else{
                int c=0,t=0,no=0,a=0;
                try{
                //c=Integer.parseInt(codigo);
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
                Conexion con=new Conexion();//se crea la conexion con bd
                if(con.InsertarAgencia(a1)>0){//se inserta el dato
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
                    if(con.EliminarAgencia(nombre)>0){
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
                        ArrayList<Agencia> agencias=new ArrayList<Agencia>();
                        
                        if(res==null){
                             String error="No Existen Datos...";
                            request.getSession().setAttribute("vacio", error);
                            request.getRequestDispatcher("DatosVacios.jsp").forward(request, response);//Colocar codigo para datos vacios
                        }else{
                            try {
                                while(res.next()){
                                    agencias.add(new Agencia(/*res.getInt("Codigo"),*/res.getString("Nombre"),res.getString("Direccion"),res.getString("Departamento"),res.getInt("Telefono"),res.getInt("No_Empleados"),res.getInt("Administrador")));
                                }
                                    request.getSession().setAttribute("agencia",agencias);
                                    request.getRequestDispatcher("MostrarAgencia.jsp").forward(request, response);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        if(metodo.equals("Modificar")){
                                request.getSession().setAttribute("txtNombre", nombre);
                                request.getRequestDispatcher("ModificarAgencia.jsp").forward(request, response);
                         
                            
                            int t=0,no=0,a=0;
                            try{
                           // c=Integer.parseInt(codigo);
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
                                Conexion con=new Conexion();//se crea la conexion con bd
                                if(con.ModificarAgencia(nombreMod,a1)>0){//se inserta el dato
                                    request.getRequestDispatcher("Exito.jsp").forward(request, response);
                                }
                                else{
                                   // String error="No se pudo Modificar...";
                                   // request.getSession().setAttribute("error", error);
                                  //  request.getRequestDispatcher("Error.jsp").forward(request, response);
                                }
                        }//fin del modificar
                        else{
                            if(metodo.equals("Reporte")){
                                int c=0;
                                c=Integer.parseInt(codigo);
                                 Conexion con= new Conexion();
                        ResultSet res=con.ReporteEmpleados(c);
                        ArrayList<Empleado> agencias=new ArrayList<Empleado>();
                        
                        if(res==null){
                             String error="No Existen Datos...";
                            request.getSession().setAttribute("vacio", error);
                            request.getRequestDispatcher("DatosVacios.jsp").forward(request, response);//Colocar codigo para datos vacios
                        }else{
                            try {
                                while(res.next()){
                                    agencias.add(new Empleado(/*res.getInt("Codigo"),*/res.getString("Nombre"),res.getString("Nit"),res.getInt("Edad"),res.getInt("Salario"),res.getString("Cargo"),res.getInt("Codigo_Agencia")));
                                }
                                    request.getSession().setAttribute("empleado",agencias);
                                    request.getRequestDispatcher("ReporteEmpleados.jsp").forward(request, response);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(AgenciaControllerdo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                            }//Fin del reporte
                        }
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
