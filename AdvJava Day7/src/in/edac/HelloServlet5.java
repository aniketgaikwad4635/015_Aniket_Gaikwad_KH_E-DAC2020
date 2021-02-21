package in.edac;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet5 extends HttpServlet {
     public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	 try {
    		 PrintWriter out=response.getWriter();
    		 out.println("hi this from simple java class in which here we used public method and tr catch block");
    		 out.println("we give url in web content web.xml using servlet name class name url-pattern");
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
     }
}
