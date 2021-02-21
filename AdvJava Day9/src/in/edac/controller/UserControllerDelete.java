package in.edac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.edac.dao.UserDao;

@WebServlet("/user-delete")
public class UserControllerDelete extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
    	 try {
    		 UserDao dao=new UserDao();
    		 dao.deleteUser();
    		 
    		 request.getRequestDispatcher("user-read").forward(request, response);
    	 }
    	 catch(Exception e){   
    		 e.printStackTrace();
    		 request.getRequestDispatcher("error.jsp").forward(request, response);
    	 }
     }
}
