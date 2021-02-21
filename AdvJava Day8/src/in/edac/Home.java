package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/hm")
public class Home extends HttpServlet {

	 protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		 PrintWriter out=response.getWriter();
		 
		 HttpSession session=request.getSession();
		 if(session.getAttribute("IS_USER_LOGGED_IN")==null) {
			 response.sendRedirect("/day8/Login");
		 }
		 out.print("Home servlet");
	 }
}
