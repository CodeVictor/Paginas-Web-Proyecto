<%-- 
    Document   : MostrarEmpleado
    Created on : 18/11/2015, 07:16:45 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Empleado" %>
<% 
    ArrayList<Empleado> agencias=(ArrayList<Empleado>)request.getSession().getAttribute("empleado");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
    </head>
    <body>
        <h1>Mostrar Empleados</h1>
        <table border id="tabla">
        <%
    out.println("<tr><td>Codigo</td><td>Nombre</td><td>Nit</td><td>Edad</td><td>Salario</td><td>Cargo</td><td>Codigo de Agencia</td><td>Operaciones</td><td>Operaciones</td></tr>");
    for(int i=0;i<agencias.size();i++){
        out.println("<tr><td><p>"+agencias.get(i).getCodigo()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getNombre()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getNit()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getEdad()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getSalario()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getCargo()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getCodigo_Agencia()+"</p></td>");
        
         out.println("<form action=\"EmpleadoControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtCodigo\" value=\""+agencias.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNit\" value=\""+agencias.get(i).getNit()+"\">");
        out.println("<input type=\"hidden\" name=\"txtEdad\" value=\""+agencias.get(i).getEdad()+"\">");
        out.println("<input type=\"hidden\" name=\"txtSalario\" value=\""+agencias.get(i).getSalario()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCargo\" value=\""+agencias.get(i).getCargo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCodigoAgencia\" value=\""+agencias.get(i).getCodigo_Agencia()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Eliminar\"></td>");
        out.println("</form>");
        
        out.println("<form action=\"EmpleadoControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtCodigo\" value=\""+agencias.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNit\" value=\""+agencias.get(i).getNit()+"\">");
        out.println("<input type=\"hidden\" name=\"txtEdad\" value=\""+agencias.get(i).getEdad()+"\">");
        out.println("<input type=\"hidden\" name=\"txtSalario\" value=\""+agencias.get(i).getSalario()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCargo\" value=\""+agencias.get(i).getCargo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCodigoAgencia\" value=\""+agencias.get(i).getCodigo_Agencia()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Modificar\"></td></tr>");
        out.println("</form>");
    }
    
        %>
        </table>
        <div id="boton3"><a href="MenuEmpleado.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
