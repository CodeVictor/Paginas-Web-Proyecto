<%-- 
    Document   : ModificarEmpleado
    Created on : 18/11/2015, 07:11:33 PM
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
        <title>Empleado</title>
    </head>
    <body>
        <h1>Modificar Empleado</h1>
        
        <table>
            <form action="EmpleadoControllerdo" method="post">
       <input type="hidden" name="txtTabla" value="Empleados">
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
                    <tr>
                        <td>Codigo de Agencia</td>
                        <td><input type="text" name="txtCodigoAgencia" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Modificar" /></td>
                    </tr>
        </table>
        </form>
        </table>
        <div id="boton3"><a href="MenuEmpleado.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
