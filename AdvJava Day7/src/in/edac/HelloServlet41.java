package in.edac;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet41
 */
@WebServlet("/Servlet41")
public class HelloServlet41 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	try {
    		
    		PrintWriter out=response.getWriter();
    		out.println("hi from HelloServlet41 here method is public no any throws because try and catch block is used");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }

}
