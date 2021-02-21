package edac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloJdbc5 {
	
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://192.168.64.5:3306/edac";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "edac2020";
	
	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		try {
			
			Class.forName(DB_DRIVER);
			con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

			String sql = "INSERT INTO USERS (USERNAME, EMAIL, PASSWORD, MOBILE) VALUES (?, ?, ?, ?)";
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		

}
}
