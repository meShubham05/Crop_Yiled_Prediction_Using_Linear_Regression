package Linear_Regression_Services;

import Linear_Regression_Model.DeviationOfX_Repository;
import Linear_Regression_Model.DeviationOf_X_Repository_Impl;

public class Deviation_Of_X_Service_Impl implements Deviation_Of_X_Service {

	DeviationOfX_Repository devRepo= new DeviationOf_X_Repository_Impl();
	
	
	
	@Override
	public float getDeviationofTemp(String cropName) {
		
		return devRepo.getDeviationofTemp(cropName);
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
