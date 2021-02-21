package in.edac;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet7")
public class HelloServlet7 extends HttpServlet {
	//include public  init doGet and distroy use either try catch block or throws exception
	
	public void init() throws ServletException{
		System.out.println("this is coming from init method which execute only once throws sevletException");
	    System.out.println("sysout is shortcut and it will print out console");
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out=response.getWriter();
			out.println("hi from simple java class and public try catch. it will print on browser");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void destroy() {
		System.out.println("this is from distroy method . here object is distroyed ");
	}

}
