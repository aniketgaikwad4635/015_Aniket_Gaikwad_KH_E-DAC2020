package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jspserveletcon")
public class JspServlet extends HttpServlet{

	      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    	  PrintWriter out=response.getWriter();
	    	  request.setAttribute("project","cdac project");
	    	  
	    	  request.getRequestDispatcher("1.jsp").forward(request, response);
	    	  return;
	      }
}
