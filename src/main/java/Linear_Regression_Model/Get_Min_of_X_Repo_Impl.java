package Linear_Regression_Model;

import repository.DBState;

public class Get_Min_of_X_Repo_Impl extends DBState implements GetMinOf_X_Repository{

	public float getMinOfTemp(String cropName) {
		
		try
		{
			stmt=conn.prepareStatement("select avg(temp) from olddataset where cropname = ?");
			stmt.setString(1, cropName);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getFloat(1);
			}			
			else
			{
				return 0;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			return -1;
		}
	}


	public float getMinofRainfall(String cropName) {
	
		try
		{
			stmt=conn.prepareStatement("select avg(rainfall) from olddataset where cropname = ?");
			stmt.setString(1, cropName);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}

	
	public float getMinOfpH(String cropName) {

		try
		{
			stmt=conn.prepareStatement("select avg(pH) from olddataset where cropname = ?");
			stmt.setString(1, cropName);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}

	
	public float getMinOfFertilizer(String cropName) {
		try
		{
			stmt=conn.prepareStatement("select avg(fertilizer) from olddataset where cropname = ?");
			stmt.setString(1, cropName);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return 0;
	}

	public float getMinOfYeild(String cropName) {
		try
		{
			stmt=conn.prepareStatement("select avg(yield) from olddataset where cropname =? ");
			stmt.setString(1, cropName);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}

}
