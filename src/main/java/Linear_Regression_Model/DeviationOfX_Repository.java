package Linear_Regression_Model;

public interface DeviationOfX_Repository {

	public float  getDeviationofTemp(String cropName);
	public float getDeviationofRainfall(String cropName);
	public float getDeviationofpH(String cropName);
	public float getDeviationofFertilizer(String cropName);

}
