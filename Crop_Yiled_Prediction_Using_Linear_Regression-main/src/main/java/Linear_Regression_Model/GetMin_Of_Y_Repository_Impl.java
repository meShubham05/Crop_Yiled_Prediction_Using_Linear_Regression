package Linear_Regression_Model;

import repository.DBState;

public class GetMin_Of_Y_Repository_Impl  extends DBState implements GetMInOf_Y_Repository{

	public float getMinOfYeild(String cropName)
	{
			try
			{
				stmt =conn.prepareStatement("select avg(yield)  from olddataset where cropname = ?");
				stmt.setString(1, cropName);
				rs=stmt.executeQuery();
				
				if(rs.next())
				{
				return rs.getFloat(1);
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
