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
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     String docType = "<!doctype html public \\\"-//w3c//dtd html 4.0" + "transitional//en\">\n";
	     out.println(
	       docType +
   "<html> <head> <meta charset=\"UTF-8\"> <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"> <title>Empresa Prevención De Riesgosr</title> </head> <body> <nav class=\"navbar navbar-expand-lg navbar-light bg-light\"> <div class=\"container-fluid\"> <a class=\"navbar-brand\" href=\"#\">Menu</a> <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button> <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\"> <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\"> <li class=\"nav-item\"> <a class=\"nav-link active\" aria-current=\"page\" href=\"Inicio\">Inicio</a> </li> <li class=\"nav-item\"> <a class=\"nav-link active\" aria-current=\"page\" href=\"Contacto\">Contacto</a> </li> <li class=\"nav-item\"> <a class=\"nav-link active\" aria-current=\"page\" href=\"CrearCapacitacion\">Crear Capacitación</a> </li> </ul> </div> </div> </nav> <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script> </body> </html>"
	     );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
