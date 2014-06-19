package database;
import java.sql.*;

import javax.swing.JOptionPane;

import org.apache.*;
public class Database {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null; 
		try{
			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\Sayyeda_2\\MyDB;");
			Statement query = con.createStatement();
			Statement sta = con.createStatement(); 

		
			
			     //INSERTING VALUE IN DATABSE:
			
//			      int c = sta.executeUpdate("INSERT INTO Persons"
//			        + " (FirstName, LastName)"
//			        + " VALUES ('Sayyeda', 'Najam')");
//			      int f = sta.executeUpdate("INSERT INTO Persons"
//					        + " (FirstName, LastName)"
//					        + " VALUES ('Tim', 'Riley')");
//			      int g = sta.executeUpdate("INSERT INTO Persons"
//					        + " (FirstName, LastName)"
//					        + " VALUES ('Jack', 'Frost')");
////			      
			      			  
////			    //DELETING VALUE IN DATABASE:
//			       int d = sta.executeUpdate(
//			        "DELETE FROM Persons WHERE FirstName = 'Sayyeda' ");
//			    
//			     //UPDATING DATBASE:  
//			    int e = sta.executeUpdate(
//			    	        "UPDATE Persons SET LastName = 'Najam'");
//			      
			ResultSet set = query.executeQuery("select * from Persons");
			while(set.next()){
			
				System.out.print(set.getString("FirstName"));
				System.out.print((" "));
			    System.out.print(set.getString("LastName"));
				System.out.print(("   "));
				
			}
			
		
		}catch(SQLException e ){
		
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Sorry Database Not Connected Reload application");
			
		}
	
		
		
		finally {
			try{
			con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		}
}



