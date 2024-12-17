package repository;

import model.StateModel;

import java.sql.*;

public class StateRepositoryImp  extends DBState implements StateRepository{

	DBState state = new DBState();
	StateModel statemodel;
	public Boolean isAddedNewState(StateModel statemodel) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driveer");
			Connection conn=DriverManager.getConnection("jdbc:mysql// localhost:3306:/cropyieldpred","root","Shubham123");
			if(conn!=null)
			{
				System.out.println("The Connnection is Successfull"); 
				
				
			}
			else
			{
				System.out.println("The Connection is Failed !!!!");				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
			
		}
		return null;
		
		
	
		
		
	}

}
