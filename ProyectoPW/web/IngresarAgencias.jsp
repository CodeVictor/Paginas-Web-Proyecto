<%-- 
    Document   : IngresarAgencias
    Created on : 17/11/2015, 07:08:02 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agencia</title>
    </head>
    <h:body>
        <h1>Ingresar Agencia</h1>
        <form action="AgenciaControllerdo" method="post">
            <input type="hidden" name="txtTabla" value="Agencias">
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
                        <td>Direccion</td>
                        <td><input type="text" name="txtDireccion" /></td>
                    </tr>
                    <tr>
                        <td>Departamento</td>
                        <td><input type="text" name="txtDepartamento" /></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>
                        <td><input type="text" name="txtTelefono" /></td>
                    </tr>
                   <!-- <tr>
                        <td>No. Empleados</td>
                        <td><input type="text" name="txtNoEmpleados" /></td>
                    </tr>
                    <tr>
                        <td>Administrador</td>
                        <td><input type="text" name="txtAdministrador" /></td>
                    </tr>-->
                    <tr>
                        <td></td>
                        <td><input type="hidden" name="txtAdministrador" value="0"/><input type="hidden" name="txtNoEmpleados" value="0"/><input type="submit" name="Ingresar" /></td>
                    </tr>
        </table>
        </form>
        <div id="boton3"><a href="MenuAgencia.jsp"><span id="bo">Regresar</span></a></div>
    </h:body>
</html>
