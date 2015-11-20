<%-- 
    Document   : ModificarSolicitud
    Created on : 18/11/2015, 10:48:12 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<% 
    String nombre=(String)request.getSession().getAttribute("txtNoSolicitud");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud</title>
    </head>
    <body>
        <h1>Modificar Solicitud</h1>
        
        <table>
            <form action="SolicitudControllerdo" method="post">
       <input type="hidden" name="txtTabla" value="Solicitud">
            <input type="hidden" name="txtMetodo" value="Modificar">
           <% out.println("<input type=\"hidden\" name=\"txtNombreMod\" value=\""+nombre+"\">");
           %>
        <table>
                    <!--<tr>
                        <td>Codigo</td>
                        <td><input type="text" name="txtCodigo" ></td>
                    </tr>-->
                    <tr>
                        <td>No_Solicitud</td>
                        <td><input type="text" name="txtNoSolicitud" /></td>
                    </tr>
                    <tr>
                        <td>Fecha</td>
                        <td><input type="text" name="txtFecha" /></td>
                    </tr>
                    <tr>
                        <td>Cliente (DPI)</td>
                        <td><input type="text" name="txtDPICliente" /></td>
                    </tr>
                    <tr>
                        <td>Vendedor (Codigo)</td>
                        <td><input type="text" name="txtVendedor" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Modificar" /></td>
                    </tr>
        </table>
        </form>
        </table>
        <div id="boton3"><a href="ModificarSolicitud.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
