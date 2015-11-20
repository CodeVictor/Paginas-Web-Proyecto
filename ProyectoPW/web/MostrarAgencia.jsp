<%-- 
    Document   : MostrarAgencia
    Created on : 17/11/2015, 09:53:40 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Agencia" %>
<% 
    ArrayList<Agencia> agencias=(ArrayList<Agencia>)request.getSession().getAttribute("agencia");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agencias</title>
    </head>
    <body>
        <h1>Mostrar Agencias</h1>
        <table border id="tabla">
        <%
    out.println("<tr><td>Codigo</td><td>Nombre</td><td>Direccion</td><td>Departamento</td><td>Telefono</td><td>Numero de Empleados</td><td>Administrador</td><td>Operacion</td><td>Operaciones</td><td>Operaciones</td></tr>");
    for(int i=0;i<agencias.size();i++){
        out.println("<tr><td><p>"+agencias.get(i).getCodigo()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getNombre()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getDireccion()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getDepartamento()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getTelefono()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getNo_Empleados()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getAdministrador()+"</p></td></tr>");
        
        out.println("<form action=\"AgenciaControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtCodigo\" value=\""+agencias.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDireccion\" value=\""+agencias.get(i).getDireccion()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDepartamento\" value=\""+agencias.get(i).getDepartamento()+"\">");
        out.println("<input type=\"hidden\" name=\"txtTelefono\" value=\""+agencias.get(i).getTelefono()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNoEmpleados\" value=\""+agencias.get(i).getNo_Empleados()+"\">");
        out.println("<input type=\"hidden\" name=\"txtAdministrador\" value=\""+agencias.get(i).getAdministrador()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Eliminar\"></td>");
        out.println("</form>");
        
        out.println("<form action=\"AgenciaControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtCodigo\" value=\""+agencias.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDireccion\" value=\""+agencias.get(i).getDireccion()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDepartamento\" value=\""+agencias.get(i).getDepartamento()+"\">");
        out.println("<input type=\"hidden\" name=\"txtTelefono\" value=\""+agencias.get(i).getTelefono()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNoEmpleados\" value=\""+agencias.get(i).getNo_Empleados()+"\">");
        out.println("<input type=\"hidden\" name=\"txtAdministrador\" value=\""+agencias.get(i).getAdministrador()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Modificar\"></td>");
        out.println("</form>");
        
        out.println("<form action=\"AgenciaControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtCodigo\" value=\""+agencias.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDireccion\" value=\""+agencias.get(i).getDireccion()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDepartamento\" value=\""+agencias.get(i).getDepartamento()+"\">");
        out.println("<input type=\"hidden\" name=\"txtTelefono\" value=\""+agencias.get(i).getTelefono()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNoEmpleados\" value=\""+agencias.get(i).getNo_Empleados()+"\">");
        out.println("<input type=\"hidden\" name=\"txtAdministrador\" value=\""+agencias.get(i).getAdministrador()+"\">");
        out.println("<input type=\"hidden\" name=\"txtMetodo\" value=\"Reporte\">");
        out.println("<td><input type=\"submit\" name=\"Reporte Empleados\" value=\"Reporte\"></a></td></tr>");
        out.println("</form>");
    }
    
        %>
        </table>
        <div id="boton3"><a href="MenuAgencia.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
