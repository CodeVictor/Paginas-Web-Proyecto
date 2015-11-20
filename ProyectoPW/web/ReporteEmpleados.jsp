<%-- 
    Document   : ReporteEmpleados
    Created on : 19/11/2015, 02:22:52 AM
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
        <title>Agencia Empleados</title>
    </head>
    <body>
        <h1>Reporte de Empleados</h1>
         <%
    out.println("<tr><td>Codigo</td><td>Nombre</td><td>Nit</td><td>Edad</td><td>Salario</td><td>Cargo</td><td>Codigo de Agencia</td></tr>");
    for(int i=0;i<agencias.size();i++){
        out.println("<td><p>"+agencias.get(i).getCodigo()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getNombre()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getNit()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getEdad()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getSalario()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getCargo()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getCodigo_Agencia()+"</p></td></tr>");
    }
        %>
    </body>
    <div id="boton3"><a href="MenuEmpleado.jsp"><span id="bo">Regresar</span></a></div>
</html>
