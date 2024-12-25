package Linear_Regression_Services;

import Linear_Regression_Model.GetMin_Of_Y_Repository_Impl;

public class Get_MinOf_Service_Impl  implements Get_Min_of_Y_Service{


	
	GetMin_Of_Y_Repository_Impl getMinOfY =  new GetMin_Of_Y_Repository_Impl();
	public float getMinOfYeild(String cropName)
	{
		return getMinOfY.getMinOfYeild(cropName);
	}
}
