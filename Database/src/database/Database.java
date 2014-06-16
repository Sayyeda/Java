package database;
import java.sql.*;
import org.apache.*;
public class Database {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection con = DriverManager.getConnection("jdbc:derby:C:\\Users\\Sayyeda_2\\MyDB;");
			Statement query = con.createStatement();
			ResultSet set = query.executeQuery("select * from Persons");
			while(set.next()){
			
				System.out.print(set.getString("FirstName"));
			    System.out.print(set.getString("LastName"));
				System.out.print(("   "));
				
			}
			
		con.close();
		}catch(SQLException e ){
		
			e.printStackTrace();
		}

	}

}
