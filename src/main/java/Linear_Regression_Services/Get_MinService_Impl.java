package Linear_Regression_Services;

import Linear_Regression_Model.GetMinOfTemp_Repository;
import Linear_Regression_Model.Get_Min_of_Temp_Repo_Impl;

public class Get_MinService_Impl implements GetMinOfXService {

	GetMinOfTemp_Repository getminTempRepo=  new Get_Min_of_Temp_Repo_Impl();
	
	public float getMinOfTemp(String cropName)
	{
		return getminTempRepo.getMinOfTemp(cropName);
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
