package Linear_Regression_Services;


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

}
