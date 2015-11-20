<%-- 
    Document   : Error
    Created on : 16/11/2015, 07:10:44 PM
    Author     : V2014
--%>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<% 
    String error=(String)request.getSession().getAttribute("error");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Ops! Ha ocurrido un error: <%=error %></h1>
        <div id="boton3"><a href="index.jsp"><span>Regresar</span></a></div>
    </body>
</html>
