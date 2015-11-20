<%-- 
    Document   : ModificarPaquete
    Created on : 18/11/2015, 09:17:31 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<% 
    String nombre=(String)request.getSession().getAttribute("txtNombre");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paquete</title>
    </head>
    <body>
        <h1>Modificar Paquete</h1>
        
        <table>
            <form action="PaqueteControllerdo" method="post">
       <input type="hidden" name="txtTabla" value="Paquetes">
            <input type="hidden" name="txtMetodo" value="Modificar">
           <% out.println("<input type=\"hidden\" name=\"txtNombreMod\" value=\""+nombre+"\">");
           %>
        <table>
                    <!--<tr>
                        <td>Codigo</td>
                        <td><input type="text" name="txtCodigo" ></td>
                    </tr>-->
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" /></td>
                    </tr>
                    <tr>
                        <td>Descripcion</td>
                        <td><input type="text" name="txtDescripcion" /></td>
                    </tr>
                    <tr>
                        <td>Fecha</td>
                        <td><input type="text" name="txtFecha" /></td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <td><input type="text" name="txtPrecio" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Modificar" /></td>
                    </tr>
        </table>
        </form>
        </table>
        <div id="boton3"><a href="MenuPaquete.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
