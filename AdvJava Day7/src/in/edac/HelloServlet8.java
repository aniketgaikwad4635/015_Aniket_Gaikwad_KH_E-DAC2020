package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet8")
public class HelloServlet8 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.println("simple java program method protected throws io and servlet ecxeption ");
		out.println("<div style='color:skyblue'> This is from doGet methos html tag is applied here</div>");
	}
	
   protected void doPost(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.println("this from doPost response");
	}
}
