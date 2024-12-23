package repository;

import model.DistrictModel;
import java.util.*;

public class DistrictRepositoryImp extends DBState implements DistrictRepository{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean isDistrictAdd(DistrictModel distmodel) {
		
		try
		{
			System.out.println("Enter District Name :");
			String distName = sc.nextLine();			
			stmt=conn.prepareStatement("insert into distmaster values('0',?)");
			stmt.setString(1,distName);
			
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
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<DistrictModel> districtList() {
		
		try
		{
			stmt=conn.prepareStatement("select * from distmaster ");
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("distId");
				String districtname = rs.getString("distName");
				
				System.out.println("District Id : "+id+" District Name : " +districtname);
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean isCityAddedUnderDistrict(String distName, String cityName) {
		
		try
		{
			
			callstmt=conn.prepareCall("{ call addCity(?,?)}");
			callstmt.setString(1, distName);
			callstmt.setString(2,cityName);
			boolean result = callstmt.execute();
			if(!result)
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
		}
		return false;
	}

	
}
