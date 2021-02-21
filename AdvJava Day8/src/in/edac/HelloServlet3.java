package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv3")
public class HelloServlet3 extends HttpServlet {
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String method=request.getMethod().toLowerCase();
		
		String username=request.getParameter("un");
		String password=request.getParameter("ps");

		PrintWriter out=response.getWriter();
		
		if("get".equals(method)) {
			out.println("get-- username= "+username+"  password= "+password);
		}
		else if("post".equals(method)) {
			out.println("post-- username= "+username+"  password= "+password);
		}
		
	}
	
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
        doGet(request,response);
	}
}
