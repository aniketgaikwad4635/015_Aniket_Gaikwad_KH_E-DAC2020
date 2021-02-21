package day4;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloDatabase2 {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://192.168.64.5:3306/test"; // in my case
	public static final String DB_USER = "mysql"; // root
	public static final String DB_PASSWORD = "mysql"; // ""

	public static void main(String[] args) {
		try {

			// ST.2
			Class.forName(DB_DRIVER);

			// ST.3
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// LOGIC
			System.out.println("CONNECTION.SUCCESS");

			// ST.LAST
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}