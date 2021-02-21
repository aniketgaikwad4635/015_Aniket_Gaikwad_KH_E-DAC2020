package in.edac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.edac.dao.User;
import in.edac.dao.UserDao;

@WebServlet("/user-update")
public class UserControllerUpdate extends HttpServlet{

	   protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException ,ServletException{
		   
		   try {
			   String un=request.getParameter("USERNAME");
			   String em=request.getParameter("EMAIL");
			   String mob=request.getParameter("MOBILE");
			   
			   UserDao dao=new UserDao();
			   User user=new User();
               user.setUsername(un);
               user.setEmail(em);
               user.setMobile(mob);
			   
			   dao.updateUser(user);
			   
			   request.getRequestDispatcher("success.jsp").forward(request, response);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
			   request.getRequestDispatcher("error.jsp").forward(request, response);
		   }
		   
		   
	   }
	   
	
	
	
}
