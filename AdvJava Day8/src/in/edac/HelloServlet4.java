package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet4")
public class HelloServlet4 extends HttpServlet{

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		   request.setAttribute("city", "pune");
	
	}
}
