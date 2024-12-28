package Linear_Regression_Services;


import java.util.List;

public interface Deviation_Of_X_Service {

	public List<Float> getDeviationOfTemp(String cropName);
	public List<Float> getDeviationofRainfall(String cropName);
	public List<Float> getDeviationofpH(String cropName);
	public List<Float> getDeviationofFertilizer(String cropName);
	
}
