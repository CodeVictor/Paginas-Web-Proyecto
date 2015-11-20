<%-- 
    Document   : MostrarPaquete
    Created on : 18/11/2015, 09:21:05 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Paquete" %>
<% 
    ArrayList<Paquete> agencias=(ArrayList<Paquete>)request.getSession().getAttribute("paquete");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paquete</title>
    </head>
    <body>
        <h1>Mostrar Paquete</h1>
        <table border id="tabla">
        <%
    out.println("<tr><td>Nombre</td><td>Descripcion</td><td>Fecha</td><td>Precio</td><td>Operaciones</td><td>Operaciones</td></tr>");
    for(int i=0;i<agencias.size();i++){
        out.println("<tr><td><p>"+agencias.get(i).getNombre()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getDescripcion()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getFecha()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getPrecio()+"</p></td>");
        
        out.println("<form action=\"PaqueteControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDescripcion\" value=\""+agencias.get(i).getDescripcion()+"\">");
        out.println("<input type=\"hidden\" name=\"txtFecha\" value=\""+agencias.get(i).getFecha()+"\">");
        out.println("<input type=\"hidden\" name=\"txtPrecio\" value=\""+agencias.get(i).getPrecio()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Eliminar\"></td>");
        out.println("</form>");
        
        out.println("<form action=\"PaqueteControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtNombre\" value=\""+agencias.get(i).getNombre()+"\">");
        out.println("<input type=\"hidden\" name=\"txtDescripcion\" value=\""+agencias.get(i).getDescripcion()+"\">");
        out.println("<input type=\"hidden\" name=\"txtFecha\" value=\""+agencias.get(i).getFecha()+"\">");
        out.println("<input type=\"hidden\" name=\"txtPrecio\" value=\""+agencias.get(i).getPrecio()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Modificar\"></td></tr>");
        out.println("</form>");
    }
    
        %>
        </table>
        <div id="boton3"><a href="MenuPaquete.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
