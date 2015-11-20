<%-- 
    Document   : MostrarSolicitud
    Created on : 18/11/2015, 10:51:36 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Solicitud" %>
<% 
    ArrayList<Solicitud> agencias=(ArrayList<Solicitud>)request.getSession().getAttribute("solicitud");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mostrar Solicitud</h1>
        <table border id="tabla">
        <%
    out.println("<tr><td>No. Solicitud</td><td>Fecha</td><td>Cliente (DPI)</td><td>Vendedor (Codigo)</td><td>Operaciones</td><td>Operaciones</td></tr>");
    for(int i=0;i<agencias.size();i++){
        out.println("<tr><td><p>"+agencias.get(i).getNo_Solicitud()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getFecha()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getDPI_Cliente()+"</p></td>");
        out.println("<td><p>"+agencias.get(i).getVendedor()+"</p></td>");
        
        out.println("<form action=\"SolicitudControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtNoSolicitud\" value=\""+agencias.get(i).getNo_Solicitud()+"\">");
        out.println("<input type=\"hidden\" name=\"txtFecha\" value=\""+agencias.get(i).getFecha()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCliente\" value=\""+agencias.get(i).getDPI_Cliente()+"\">");
        out.println("<input type=\"hidden\" name=\"txtVendedor\" value=\""+agencias.get(i).getVendedor()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Eliminar\"></td>");
        out.println("</form>");
        
        out.println("<form action=\"SolicitudControllerdo\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"txtNoSolicitud\" value=\""+agencias.get(i).getNo_Solicitud()+"\">");
        out.println("<input type=\"hidden\" name=\"txtFecha\" value=\""+agencias.get(i).getFecha()+"\">");
        out.println("<input type=\"hidden\" name=\"txtCliente\" value=\""+agencias.get(i).getDPI_Cliente()+"\">");
        out.println("<input type=\"hidden\" name=\"txtVendedor\" value=\""+agencias.get(i).getVendedor()+"\">");
        out.println("<td><input type=\"submit\" name=\"txtMetodo\" value=\"Modificar\"></td></tr>");
        out.println("</form>");
    }
    
        %>
        </table>
        <div id="boton3"><a href="MenuSolicitud.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
