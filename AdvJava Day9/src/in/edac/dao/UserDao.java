package in.edac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class UserDao {
      
	//create driver url user password
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/PROJECT";
	public static final String DB_USER="root";
	public static final String DB_PASSWORD="edac20";
	
	//old connection using try catch block
	public void connectionOld1() {
		try {
			
			Class.forName(DB_DRIVER);
			Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			con.close();
			System.out.println("old connection 1 with mysql with try catch");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//old connection using try(resources write connection here ... ) catch block
	//                         (if u write like this then no need to close connection con.close())
	public void connectionOld2() {
		
		try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);){
			Class.forName(DB_DRIVER);
			System.out.println("old connection 2 with mysql with with try(resources) catch");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//create user using hard core values and with try(connection) catch
	public void createUserHard() {
		try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);){
			Class.forName(DB_DRIVER);
			
			//String sql="INSERT INTO USER (USERNAME,EMAIL,MOBILE) VALUES ('giri', 'gst@gmail.com','9850050020')";
			
			String sql="INSERT INTO USER (USERNAME,EMAIL,MOBILE) VALUES (?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, "giri");
			ps.setString(2,"gst@gmail.com" );
			ps.setString(3, "9850050020");
			
			ps.executeUpdate();
			System.out.println("insert record by giving hardcore values ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	} 
	
	
	// add user inforamtion with the help of User class 
	//we pass values by creating object of user....send that values with the help of constructor in main method
	public void createUserConstr(User user) {
		try(Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)) {
			Class.forName(DB_DRIVER);
			
			String sql="INSERT INTO USER (USERNAME,EMAIL,MOBILE) VALUES (?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getMobile());
			ps.executeUpdate();
			System.out.println("insert record by passing value to User class constructor then that values use by getters");
			System.out.println("and insert into database");
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
	} 
	
	//update user....pass which value to user constructor
	//by passing id we update that record
	public boolean updateUser(User userUp) throws Exception  {
		Class.forName(DB_DRIVER);
		
		try(Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);) {
			
			String sql="UPDATE USER SET USERNAME=?, EMAIL=? , MOBILE=? WHERE ID=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userUp.getUsername());
			ps.setString(2, userUp.getEmail());
			ps.setString(3, userUp.getMobile());
			ps.setInt(4,8);
			ps.executeUpdate();
			
			System.out.println("at id=11 b=value updated succcess");
			
			return true; 
		}
		catch(Exception e) {
			e.printStackTrace();
              return false;
		}
	}
	
	
	//delete record
	public boolean deleteUser() throws Exception {
		Class.forName(DB_DRIVER);
		try(Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);) {
			String sql="DELETE FROM USER WHERE ID=11";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.executeUpdate();
			System.out.println("at id=11 value deleted succcess");
			return true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<User> readAllUser() throws Exception{
		
		Class.forName(DB_DRIVER);
		try(Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);) {
			String sql="SELECT * FROM USER";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
		List<User> list=new ArrayList<User>();
			while(rs.next()) {
			//take values from database into java program	
		     String colun=rs.getString("USERNAME");
		     String colem=rs.getString("EMAIL");
		     String colmob=rs.getString("MOBILE");
		     
			 User user=new User();
			 user.setUsername(colun);
			 user.setEmail(colem);
		     user.setMobile(colmob);
		     
		     list.add(user);
		     
			}
			return list;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	
	public static void main(String args[]) throws Exception {
		UserDao dao=new UserDao();
		//dao.connectionOld1();
		//dao.connectionOld2();
		//dao.createUserHard();
		
		//pass values to User class
		//User user=new User("bank","bank@gmail.com","0216425625");
		//dao.createUserConstr(user);
		
		//pass value which you want to update
		//User userUp=new User("Sbi","sbi@gmail.com", "0216144889");
		//userUp.setId(8);
		//dao.updateUser(userUp);
		
		//delete id=8 record
		//dao.deleteUser();
		
		List<User> lt=dao.readAllUser();
		System.out.println(lt);
	}
}
