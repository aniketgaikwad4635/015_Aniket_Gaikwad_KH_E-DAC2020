package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv2")
public class HelloServlet2 extends HttpServlet {
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String username=request.getParameter("un");
		String password=request.getParameter("ps");

		PrintWriter out=response.getWriter();
		out.println("get-- username= "+username+"  password= "+password);
	}
	
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
	doGet(request,response);

	}
}
