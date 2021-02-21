package edac;
import java.sql.Connection;
import java.sql.DriverManager;

public class HelloJdbc2 {
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://LocalHost/edac";
	public static final String DB_USER="root";
	public static final String DB_PASSWORD="edac2020";
	
	public static void main(String[] args)
	{
		try {
			Class.forName(DB_DRIVER);
			Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			
			System.out.println("Horray!!!! DB Connected!!");
			con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
