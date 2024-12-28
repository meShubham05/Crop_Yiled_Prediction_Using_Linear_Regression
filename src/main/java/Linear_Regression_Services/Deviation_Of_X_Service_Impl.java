package Linear_Regression_Services;

<<<<<<< HEAD
import java.util.List;

import Linear_Regression_Model.DeviationOfX_Repository;
import Linear_Regression_Model.DeviationOf_X_Repository_Impl;

public class Deviation_Of_X_Service_Impl implements Deviation_Of_X_Service {

	DeviationOfX_Repository devRepo= new DeviationOf_X_Repository_Impl();

	@Override
	public List<Float> getDeviationOfTemp(String cropName) {
		
		return devRepo.getDeviationOfTemp(cropName);
	}

	@Override
	public List<Float> getDeviationofRainfall(String cropName) {
		
		return devRepo.getDeviationofRainfall(cropName);
	}

	@Override
	public List<Float> getDeviationofpH(String cropName) {
		
		return devRepo.getDeviationofpH(cropName);
	}

	@Override
	public List<Float> getDeviationofFertilizer(String cropName) {
		
		return devRepo.getDeviationofFertilizer(cropName);
	}
	
=======
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

>>>>>>> branch 'main' of https://github.com/meShubham05/Crop_Yiled_Prediction_Using_Linear_Regression.git
	

}
