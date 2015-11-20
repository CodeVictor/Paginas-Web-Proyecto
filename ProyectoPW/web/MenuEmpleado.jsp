<%-- 
    Document   : MenuEmpleado
    Created on : 18/11/2015, 07:29:01 PM
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
        <h1>Menu de Empleado</h1>
        <div id="boton2"><a href="IngresarEmpleados.jsp"><span>Ingresar Agencia</span></a></div>
        <form action="EmpleadoControllerdo" method="post">
            <input type="hidden" name="txtMetodo" value="Mostrar">
            <input type="submit" name="Mostrar Empleados" value="Mostrar"></a>
        </form>
        <form action="EnviarEAControllerdo" method="post">
            <input type="hidden" name="txtMetodo" value="Mostrar">
            <input type="submit" name="Mostrar Empleados" value="Asignar Agencia"></a>
        </form>
        <div id="boton3"><a href="index.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
