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
			ResultSet set = query.executeQuery("select * from Persons");
			while(set.next()){
			
				System.out.print(set.getString("FirstName"));
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



