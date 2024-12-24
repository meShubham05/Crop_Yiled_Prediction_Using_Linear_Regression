package Linear_Regression_Model;

import repository.DBState;

public class Get_Min_of_Temp_Repo_Impl extends DBState implements GetMinOfTemp_Repository{

	public float getMinOfTemp(String cropName) {
		
		try
		{
			stmt=conn.prepareStatement("select avg(temp) from crop where cropname = ?");
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
			
		return -1;
		}
	}

	@Override
	public float getMinofRainfall(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMinOfpH(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMinOfFertilizer(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMinOfYeild(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

}
