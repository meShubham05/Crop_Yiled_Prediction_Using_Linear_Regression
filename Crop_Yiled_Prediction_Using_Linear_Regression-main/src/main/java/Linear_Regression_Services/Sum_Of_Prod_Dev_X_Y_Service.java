package Linear_Regression_Services;

public interface Sum_Of_Prod_Dev_X_Y_Service {
	
	public float getSum_OfDeviation_X_Y(String cropName);


	float getSum_OfDeviation_X_rainfall_Y(String cropname);
	
	float getSum_OfDeviation_X_pH_Y(String cropname);
	
	float getSum_OfDeviation_X_fertilizer_Y(String cropname);
	
}
