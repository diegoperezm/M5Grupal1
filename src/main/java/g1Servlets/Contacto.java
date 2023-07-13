package g1Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Contacto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String correo      = request.getParameter("correo");
      String comentarios = request.getParameter("comentarios");
//		doGet(request, response);

/*	
 *       String run      = request.getParameter("RUN");
      String nombre   = request.getParameter("Nombre");
      String apellido = request.getParameter("Apellido");

 */
	}

}
