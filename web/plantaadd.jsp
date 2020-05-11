<%-- 
    Document   : plantaadd
    Created on : 8/05/2020, 03:56:27 PM
    Author     : Anthony Mejía
--%>

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
            <h3>Agregar Paciente</h3>
        </div>
        <hr>
        <div>
            <form action="ServletPlanta" method="POST">
                No. Planta
                <input type="number" name="txtno"><br>
                Nombre:
                <input type="text" name="txtnom"><br>
                Total Camas:
                <input type="text" name="txttol"><br>
                <input type="submit" name="accion" value="Guardar">
            </form>
        </div>
    </center>
    </body>
</html>
