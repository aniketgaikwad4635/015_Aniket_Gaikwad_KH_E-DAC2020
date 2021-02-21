package day4;


	
	
	import java.sql.Connection;
	import java.sql.DriverManager;

	public class HelloDatabase {

		public static void main(String[] args) {
			try {
				// ST.1
				String driver = "com.mysql.cj.jdbc.Driver";
				// String url = "jdbc:mysql://localhost:3306";
				String url = "jdbc:mysql://192.168.64.5:3306/test"; // in my case
				String user = "mysql"; // root
				String password = "mysql"; // ""
				

				// ST.2 :: Assignment
				Class.forName(driver);
				
				// ST.3
				Connection con = DriverManager.getConnection(url, user, password);
				
				// LOGIC
				System.out.println("CONNECTION.SUCCESS");
				
				// ST.LAST
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

