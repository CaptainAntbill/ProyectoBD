<%-- 
    Document   : index
    Created on : 4/05/2020, 06:42:52 PM
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
            <h2>Pacientes</h2>
            <form action="ServletPaciente" method="POST">
                <a type="submit" href="plantalist.jsp">Planta</a><br>
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>No Carne</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Fecha Naci</th>
                        <th>Localidad</th>
                        <th>Genero</th>
                        <th>Direccion</th>
                        <th>Direccion</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="datos" items="${datos}">
                    <tr>
                        <td>${datos.getNo_carne()}</td>
                        <td>${datos.getNombres()}</td>
                        <td>${datos.getApellidos()}</td>
                        <td>${datos.getFecha_nac()}</td>
                        <td>${datos.getLocalidad()}</td>
                        <td>${datos.getGenero()}</td>
                        <td>${datos.getDirreccion()}</td>
                        <td>
                            <form action="ServletPaciente" method="POST">
                                <input type="hidden" name="id" value="${datos.getNo_carne()}">
                                <input type="submit" name="accion" value="Editar">
                                <input type="submit" name="accion" value="Delete">
                            </form>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </center>
    </body>
</html>
