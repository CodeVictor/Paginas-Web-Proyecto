<%-- 
    Document   : IngresarPaquete
    Created on : 18/11/2015, 08:43:52 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paquete</title>
    </head>
    <h:body>
        <h1>Ingresar Paquete</h1>
        <form action="PaqueteControllerdo" method="post">
            <input type="hidden" name="txtTabla" value="Paquete">
            <input type="hidden" name="txtMetodo" value="Ingresar">
        <table>
                   <!-- <tr>
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
                        <td><input type="submit" name="Ingresar" /></td>
                    </tr>
        </table>
        </form>
        <div id="boton3"><a href="MenuPaquete.jsp"><span id="bo">Regresar</span></a></div>
    </h:body>
</html>
