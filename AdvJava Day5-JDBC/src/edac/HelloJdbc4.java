package edac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloJdbc4 {
	
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/edac";
	public static final String DB_USER="root";
	public static final String DB_PASSWORD="edac2020";
	
	public static void main(String[] args) throws Exception{
		Connection con=null;
		try {
			Class.forName(DB_DRIVER);
			con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			System.out.println("Horray!!!!!DB_Connected");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
			
		}
	}
	

}
