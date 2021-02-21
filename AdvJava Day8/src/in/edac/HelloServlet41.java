package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servl-41")
public class HelloServlet41 extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.getRequestDispatcher("/servlet4").include(request, response);
		
		String cname=(String)request.getAttribute("city");
		
		PrintWriter out=response.getWriter();
		out.println("city name declare in another program and access in this program by request.getRequestDispatcher() " +cname);
	}
	
}
