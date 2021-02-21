package in.edac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.edac.dao.User;
import in.edac.dao.UserDao;

@WebServlet("/user-create")
public class UserControllerCreate extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
    	 try {
    		 String un=request.getParameter("USERNAME");
    		 String em=request.getParameter("EMAIL");
    		 String mob=request.getParameter("MOBILE");
    		 
    		 //create object of user and set values
    		 User user=new User();
    		 user.setUsername(un);
    		 user.setEmail(em);
    		 user.setMobile(mob);
    		 
    		 //use method of UserDao pass passing user object in create user method
    		 UserDao dao=new UserDao();
    		 dao.createUserConstr(user);
    		 
    		 request.getRequestDispatcher("user-read").forward(request, response);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    		 request.getRequestDispatcher("error").forward(request, response);
    	 }
     } 
}
