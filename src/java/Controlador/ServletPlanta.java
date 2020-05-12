package Controlador;

import Modelo.Planta;
import Modelo.PlantaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anthony Mejía
 */
public class ServletPlanta extends HttpServlet {
    PlantaDAO dao = new PlantaDAO();
    Planta p = new Planta();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPlanta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPlanta at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion){
            case "Listar":
                List<Planta>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("plantalist.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("plantaadd.jsp").forward(request, response);
                break;
            case "Guardar":
                String no_planta = request.getParameter("txtno");
                int numero = Integer.parseInt(no_planta);
                String nombre = request.getParameter("txtnom");
                String total = request.getParameter("txttol");
                int numero2 = Integer.parseInt(total);
                p.setNo_planta(numero);
                p.setNombre(nombre);
                p.setTotal_camas(numero2);
                dao.agregar(p);
                request.getRequestDispatcher("ServletPlanta?accion=Listar").forward(request, response);
                break;
            case "Ver":
                String ide=request.getParameter("id");
                int newid = Integer.parseInt(ide);
                Planta pe=dao.listarId(newid);
                request.setAttribute("planta", pe);
                request.getRequestDispatcher("plantashow.jsp").forward(request, response);
                break;
            case "Actualizar":
                String no1 = request.getParameter("txtno");
                int no2 = Integer.parseInt(no1);
                String nom1 = request.getParameter("txtnom");
                String total2 = request.getParameter("txttol");
                int total1 = Integer.parseInt(total2);
                p.setNo_planta(no2);
                p.setNombre(nom1);
                p.setTotal_camas(total1);
                dao.actualizar(p);
                request.getRequestDispatcher("ServletPlanta?accion=Listar").forward(request, response);
                break;
        }
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
