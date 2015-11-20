<%-- 
    Document   : IngesarSolicitud
    Created on : 18/11/2015, 10:43:44 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud</title>
    </head>
    <h:body>
        <h1>Ingresar Solicitud</h1>
        <form action="SolicitudControllerdo" method="post">
            <input type="hidden" name="txtTabla" value="Solicitud">
            <input type="hidden" name="txtMetodo" value="Ingresar">
        <table>
                   <!-- <tr>
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
                        <td><input type="submit" name="Ingresar" /></td>
                    </tr>
        </table>
        </form>
        <div id="boton3"><a href="MenuSolicitud.jsp"><span id="bo">Regresar</span></a></div>
    </h:body>
</html>
