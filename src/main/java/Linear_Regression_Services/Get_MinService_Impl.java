package Linear_Regression_Services;

import Linear_Regression_Model.GetMinOf_X_Repository;
import Linear_Regression_Model.Get_Min_of_X_Repo_Impl;

public class Get_MinService_Impl implements GetMinOfXService {

	GetMinOf_X_Repository getminOfXRepo=  new Get_Min_of_X_Repo_Impl();
	
	public float getMinOfTemp(String cropName)
	{
		return getminOfXRepo.getMinOfTemp(cropName);
	}

	
	public float getMinofRainfall(String cropName) {
		
		return getminOfXRepo.getMinofRainfall(cropName);
	}

	
	public float getMinOfpH(String cropName) {
		// TODO Auto-generated method stub
		return getminOfXRepo.getMinOfpH(cropName);
	}

	
	public float getMinOfFertilizer(String cropName) {
		// TODO Auto-generated method stub
		return getminOfXRepo.getMinOfFertilizer(cropName);
	}



	
	
}
