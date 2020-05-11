package Controlador;

import Modelo.Paciente;
import Modelo.PacienteDAO;
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
public class ServletPaciente extends HttpServlet {
    PacienteDAO dao = new PacienteDAO();
    Paciente p = new Paciente();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPaciente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPaciente at " + request.getContextPath() + "</h1>");
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
                List<Paciente>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("add.jsp").forward(request, response);
                break;
            case "Guardar":
                String no_carne = request.getParameter("txtno");
                int numero = Integer.parseInt(no_carne);
                String nombres = request.getParameter("txtnom");
                String apellidos = request.getParameter("txtape");
                String fecha_nac = request.getParameter("txtfec");
                String localidad = request.getParameter("txtloc");
                String genero = request.getParameter("txtgen");
                String direccion = request.getParameter("txtdir");
                p.setNo_carne(numero);
                p.setNombres(nombres);
                p.setApellidos(apellidos);
                p.setFecha_nac(fecha_nac);
                p.setLocalidad(localidad);
                p.setGenero(genero);
                p.setDirreccion(direccion);
                dao.agregar(p);
                request.getRequestDispatcher("ServletPaciente?accion=Listar").forward(request, response);
                break;
            case "Editar":
                String ide=request.getParameter("id");
                int newid = Integer.parseInt(ide);
                Paciente pe=dao.listarId(newid);
                request.setAttribute("paciente", pe);
                request.getRequestDispatcher("edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                String no1 = request.getParameter("txtno");
                int no2 = Integer.parseInt(no1);
                String nom1 = request.getParameter("txtnom");
                String ape1 = request.getParameter("txtape");
                String fec1 = request.getParameter("txtfec");
                String loc1 = request.getParameter("txtloc");
                String gen1 = request.getParameter("txtgen");
                String dir1 = request.getParameter("txtdir");
                p.setNo_carne(no2);
                p.setNombres(nom1);
                p.setApellidos(ape1);
                p.setFecha_nac(fec1);
                p.setLocalidad(loc1);
                p.setGenero(gen1);
                p.setDirreccion(dir1);
                dao.actualizar(p);
                request.getRequestDispatcher("ServletPaciente?accion=Listar").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
