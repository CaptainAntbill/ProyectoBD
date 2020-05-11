<%-- 
    Document   : plantashow
    Created on : 8/05/2020, 04:11:53 PM
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
                 <input type="number" name="txtno" value="${planta.getNo_planta()}"><br>
                Nombre:
                <input type="text" name="txtnom" value="${planta.getNombre()}"><br>
                Total Camas:
                <input type="text" name="txttol" value="${planta.getTotal_camas()}"><br> 
                <input type="submit" name="accion" value="Actualizar">
            </form>
        </div>
    </center>
    </body>
</html>
