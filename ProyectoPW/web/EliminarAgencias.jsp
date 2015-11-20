<%-- 
    Document   : EliminarAgencias
    Created on : 17/11/2015, 07:09:42 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Agencia
        </title>
    </head>
    <body>
        <h1>Eliminar Agencia</h1>
        <form action="AgenciaControllerdo" method="post">
            <input type="hidden" name="txtTabla" value="Agencias">
            <input type="hidden" name="txtMetodo" value="Eliminar">
        <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" /></td>
                    </tr>
                    <tr><td><input type="submit" name="Eliminar"/></td></tr>
        </table>
        </form>
    </body>
</html>
