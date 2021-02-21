package edac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class HelloJdbc6 {
	
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost/edac";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "edac2020";
	
	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter Username");
			String username = scanner.nextLine();
			
			System.out.println("Enter password");
			String password=scanner.nextLine();
			
			System.out.println("enter email");
			String email=scanner.nextLine();
			
			System.out.println("enter mobile");
			String mobile=scanner.nextLine();
			
			System.out.println(username+password+email+mobile);
			
			Class.forName(DB_DRIVER);
			
			con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			
			String sql = "INSERT INTO  USER (USERNAME, PASSWORD, EMAIL, MOBILE) VALUES ('" + username + "', '" + password + "', '" + email+ "', '" + mobile+ "')";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			
			System.out.println("Insert Successful!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block executed");
			
			con.close();
		}

	}
}