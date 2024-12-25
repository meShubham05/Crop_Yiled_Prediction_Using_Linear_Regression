package Linear_Regression_Model;

import repository.DBState;

public class DeviationOf_X_Repository_Impl extends DBState implements DeviationOfX_Repository {

	GetMinOf_X_Repository getminOfX = new Get_Min_of_X_Repo_Impl();
	@Override
	public float getDeviationofTemp(String cropName) {
		
		try
		{
			float meanOfTemp =getminOfX.getMinOfTemp(cropName);
			System.out.println("The Mean of X is :"+meanOfTemp);
			stmt=conn.prepareStatement("select temp from olddataset where cropname =?");
			stmt.setString(1, cropName);
			rs=stmt.executeQuery();
//			System.out.println("rs returns :"+rs);
			if(rs.next())
			{	
				int temp1= rs.getInt("temp");
			
				System.out.println("The temp1 is :"+temp1);
			
				float finalResult = temp1-meanOfTemp;
			
				return finalResult;
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

	@Override
	public float getDeviationofRainfall(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getDeviationofpH(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getDeviationofFertilizer(String cropName) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
