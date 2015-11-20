<%-- 
    Document   : DatosVacios
    Created on : 17/11/2015, 10:38:01 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<% 
    String vacio=(String)request.getSession().getAttribute("error");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Vacios</title>
    </head>
    <body>
        <h1><%=vacio %></h1>
        <div id="boton3"><a href="index.jsp"><span id="bo">Regresar</span></a></div>
    </body>
</html>
