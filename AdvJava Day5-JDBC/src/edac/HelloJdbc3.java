package edac;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;

public class HelloJdbc3 {
	
	
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/edac";
	public static final String DB_USER="root";
	public static final String DB_PASSWORD="edac2020";
	
	public static void main(String []args)
	{
		Connection con=null;
		try {
			Class.forName(DB_DRIVER);
			con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			System.out.println("Horray!!!DB Connected");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
