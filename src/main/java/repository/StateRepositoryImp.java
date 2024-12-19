package repository;

import java.util.*;

import org.apache.log4j.Logger;

import model.StateModel;

import java.sql.*;




public class StateRepositoryImp  extends DBState implements StateRepository{
	Scanner sc = new Scanner(System.in); 
	
	
	DBState state = new DBState();
	StateModel statemodel;
	
	public boolean isAddedNewState(StateModel statemodel) {
		
		try
		{ 			
			if(conn!=null)
			{
				System.out.println("The Connnection is Successfull"); 
				
				System.out.println("Enter the StateName :");
				String state=sc.nextLine();
				
			stmt=conn.prepareStatement("insert into statemaster values('0',?)");
			stmt.setString(1, state);
			int result = stmt.executeUpdate();
			
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			}
			else
			{
				System.out.println("The Connection is Failed !!!!");				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		
		return false;		
	}

	
	
	@Override
	public List<StateModel> allState() 
	{
		 List<StateModel> allState = new ArrayList<StateModel>();
		
		try
		{
			stmt =conn.prepareStatement("select * from statemaster ");
			rs = stmt.executeQuery();
		
			while(rs.next())
			{
				int stateId = rs.getInt("stateId");
				String stateName = rs.getString("stateName");
				
				System.out.println("State ID : "+stateId+" State Name :"+stateName);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return allState;
	}

}
