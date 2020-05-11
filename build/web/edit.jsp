<%-- 
    Document   : edit
    Created on : 7/05/2020, 04:42:59 PM
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
                <input type="number" name="txtno" value="${paciente.getNo_carne()}"><br>
                Nombres:
                <input type="text" name="txtnom" value="${paciente.getNombres()}"><br>
                Apellidos:
                <input type="text" name="txtape" value="${paciente.getApellidos()}"><br>
                Nacimiento
                <input type="text" name="txtfec" value="${paciente.getFecha_nac()}"><br>
                Localidad
                <input type="text" name="txtloc" value="${paciente.getLocalidad()}"><br>
                Genero
                <input type="text" name="txtgen" value="${paciente.getGenero()}"><br>
                Direccion
                <input type="text" name="txtdir" value="${paciente.getDirreccion()}"><br>
                <input type="submit" name="accion" value="Actualizar">
            </form>
        </div>
    </center>
    </body>
</html>
