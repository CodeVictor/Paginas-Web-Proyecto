<%-- 
    Document   : MenuPaquete
    Created on : 18/11/2015, 09:39:48 PM
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
        <h1>Menu Paquete</h1>
        <div id="boton2"><a href="IngresarPaquete.jsp"><span>Ingresar Agencia</span></a></div>
        <form action="PaqueteControllerdo" method="post">
            <input type="hidden" name="txtMetodo" value="Mostrar">
            <input type="submit" name="Mostrar Paquetes" value="Mostrar"></a>
        </form>
        <div id="boton3"><a href="index.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
