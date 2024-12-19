package repository;

import java.util.*;


import model.CityModel;

public class CityRepositoryImp extends DBState implements CityRepository {

	Scanner sc = new Scanner(System.in);
	public boolean isCityAdded(CityModel citymodel)
	{
		try
		{
			System.out.println("Enter the City Name You want to add :");
			String CityName =sc.nextLine();
		
			
			stmt =conn.prepareStatement("insert into citymaster values('0',?)");
			stmt.setString(1, CityName);
			int result =stmt.executeUpdate();
			
			if(result >0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public List<CityModel> cityList() 
	{
		
		try
		{
			stmt=conn.prepareStatement("select * from citymaster");
			rs =stmt.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("cityId");
				String cityName = rs.getString("cityName");				
				System.out.println("City ID : "+id +" City Name : "+cityName); 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	

}
