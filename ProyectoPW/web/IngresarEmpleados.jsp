<%-- 
    Document   : IngresarEmpleados
    Created on : 17/11/2015, 06:03:21 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
    </head>
     <h:body>
        <h1>Ingresar Empleado</h1>
        <form action="EmpleadoControllerdo" method="post">
            <input type="hidden" name="txtTabla" value="Empleado">
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
                        <td>Nit</td>
                        <td><input type="text" name="txtNit" /></td>
                    </tr>
                    <tr>
                        <td>Edad</td>
                        <td><input type="text" name="txtEdad" /></td>
                    </tr>
                    <tr>
                        <td>Salario</td>
                        <td><input type="text" name="txtSalario" /></td>
                    </tr>
                    <tr>
                        <td>Cargo</td>
                        <td><input type="text" name="txtCargo" /></td>
                    </tr>
                   <!-- <tr>
                        <td>Agencia</td>
                        <td><input type="text" name="txtCodigoAgencia" /></td>
                    </tr>-->
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Ingresar" /></td>
                    </tr>
        </table>
        </form>
        <div id="boton3"><a href="MenuEmpleado.jsp"><span id="bo">Regresar</span></a></div>
    </h:body>
</html>
