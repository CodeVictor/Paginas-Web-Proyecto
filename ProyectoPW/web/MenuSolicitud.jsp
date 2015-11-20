<%-- 
    Document   : MenuSolicitud
    Created on : 18/11/2015, 11:01:56 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <h1>Menu Solicitud</h1>
        <div id="boton2"><a href="IngesarSolicitud.jsp"><span>Ingresar Solicitud</span></a></div>
        <form action="SolicitudControllerdo" method="post">
            <input type="hidden" name="txtMetodo" value="Mostrar">
            <input type="submit" name="Mostrar Solicitud" value="Mostrar"></a>
        </form>
        <div id="boton3"><a href="index.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
