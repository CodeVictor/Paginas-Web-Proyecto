<%-- 
    Document   : MenuAgencia
    Created on : 18/11/2015, 12:16:53 AM
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
        <h1>Menu de Agencia</h1>
        <div id="boton2"><a href="IngresarAgencias.jsp"><span>Ingresar Agencia</span></a></div><hr>
        <form action="AgenciaControllerdo" method="post">
            <input type="hidden" name="txtMetodo" value="Mostrar">
            <input type="submit" name="Mostrar Agencias" value="Mostrar"></a>
        </form><hr>
        
        <div id="boton3"><a href="index.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
