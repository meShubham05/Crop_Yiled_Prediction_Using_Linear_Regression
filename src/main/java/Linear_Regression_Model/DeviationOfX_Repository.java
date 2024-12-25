package Linear_Regression_Model;

import java.util.List;

public interface DeviationOfX_Repository {

	public List<Float> getDeviationOfTemp(String cropName);
	public List<Float> getDeviationofRainfall(String cropName);
	public List<Float> getDeviationofpH(String cropName);
	public List<Float> getDeviationofFertilizer(String cropName);
	

}
