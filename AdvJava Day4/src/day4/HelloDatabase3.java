package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HelloDatabase3 {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://192.168.64.5:3306/SAMPLEDB"; // in my case
	public static final String DB_USER = "mysql"; // root
	public static final String DB_PASSWORD = "mysql"; // ""

	public static void main(String[] args) {
		try {

			// ST.2
			Class.forName(DB_DRIVER);

			// ST.3
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// ST.4 :: KEEP YOUR QUERY IN UPPSERCASE
			String sql = "SELECT * FROM STUDENT";
			
			// ST.5
			PreparedStatement ps = con.prepareStatement(sql);
			
			// ST.6
			ResultSet rs = ps.executeQuery();
			
			// ST.7
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				
				System.out.print(id);
				System.out.println(name);
			}
			

			// ST.LAST
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}