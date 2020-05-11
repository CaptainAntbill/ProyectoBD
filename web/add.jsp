<%-- 
    Document   : add
    Created on : 6/05/2020, 08:51:17 PM
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
            <form action="ServletPaciente" method="POST">
                No. Carne:
                <input type="number" name="txtno"><br>
                Nombres:
                <input type="text" name="txtnom"><br>
                Apellidos:
                <input type="text" name="txtape"><br>
                Nacimiento
                <input type="text" name="txtfec"><br>
                Localidad
                <input type="text" name="txtloc"><br>
                Genero
                <input type="text" name="txtgen"><br>
                Direccion
                <input type="text" name="txtdir"><br>
                <input type="submit" name="accion" value="Guardar">
            </form>
        </div>
    </center>
    </body>
</html>
