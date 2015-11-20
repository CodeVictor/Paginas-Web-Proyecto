<%-- 
    Document   : AsignarAgencia
    Created on : 18/11/2015, 11:53:06 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Agencia" %>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Empleado" %>
<% 
    ArrayList<Empleado> empleados=(ArrayList<Empleado>)request.getSession().getAttribute("empleado");

%>
<% 
    ArrayList<Agencia> agencias=(ArrayList<Agencia>)request.getSession().getAttribute("agencia");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignacion</title>
    </head>
    <body>
        <h1>Asignacion de Agencias</h1>
        <form action="AsignacionControllerdo" method="post">
        <h2>Agencia</h2>
        
        <select name="Agg">
         <%
    for(int i=0;i<agencias.size();i++){
        out.print("<option>"+agencias.get(i).getNombre()+"</option>");
        out.println("<input type=\"hidden\" name=\"txtCodigo\" value=\""+agencias.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDireccion\" value=\""+agencias.get(i).getDireccion()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDepartamento\" value=\""+agencias.get(i).getDepartamento()+"\">");
        out.println("<input type=\"hidden\" name=\"txtTelefono\" value=\""+agencias.get(i).getTelefono()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNoEmpleados\" value=\""+agencias.get(i).getNo_Empleados()+"\">");
        out.println("<input type=\"hidden\" name=\"txtAdministrador\" value=\""+agencias.get(i).getAdministrador()+"\">");
    }
    %>
    </select>
    <h2>Empleado</h2>
    <select name="emp">
         <%
    for(int i=0;i<empleados.size();i++){
        out.print("<option>"+empleados.get(i).getNombre()+"</option>");
        out.println("<input type=\"hidden\" name=\"txtCodigoe\" value=\""+empleados.get(i).getCodigo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNombree\" value=\""+empleados.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtNit\" value=\""+empleados.get(i).getNit()+"\">");
        out.println("<input type=\"hidden\" name=\"txtEdad\" value=\""+empleados.get(i).getEdad()+"\">");
        out.println("<input type=\"hidden\" name=\"txtSalario\" value=\""+empleados.get(i).getSalario()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCargo\" value=\""+empleados.get(i).getCargo()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCodigoAgencia\" value=\""+empleados.get(i).getCodigo_Agencia()+"\">");
    }
    %>
    </select>
    <input type="submit" value="Asignar" name="Asignar">
        </form>
    <div id="boton3"><a href="MenuAgencia.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
