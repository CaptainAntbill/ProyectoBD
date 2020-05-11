<%-- 
    Document   : plantalist
    Created on : 8/05/2020, 02:59:28 PM
    Author     : Anthony Mejía
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <div>
            <h2>Planta</h2>
            <form action="ServletPlanta" method="POST">
                <a type="submit" href="plantalist.jsp">Planta</a><br>
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>No Planta</th>
                        <th>Nombre</th>
                        <th>Total Camas</th>
                        <th>Total Camas</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="datos" items="${datos}">                
                    <tr>
                        <td>${datos.getNo_planta()}</td>
                        <td>${datos.getNombre()}</td>
                        <td>${datos.getTotal_camas()}</td>
                        <td>
                            <form action="ServletPlanta" method="POST">
                                <input type="hidden" name="id" value="${datos.getNo_planta()}">
                                <input type="submit" name="accion" value="Ver">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                    
    </body>
</html>
