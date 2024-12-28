package Linear_Regression_Model;

public class Get_Value_of_M_Repository_Impl implements Get_Value_Of_M_Repository {

	Sum_Of_Product_Of_Dev_of_X_Y_Repository sum_of_X_Y = new Sum_Of_Product_Of_Dev_X_Y_Repo_Impl();
	Sum_of_Square_of_Deviation_Of_X_Repository sum_Square_Of_X_Y = new Sum_of_Square_of_Deviation_Of_X_Repositiry_Impl();

	public float get_M_of_Temp(String cropname) {
		
		float sum_Of_Product_Dev_X_Y = sum_of_X_Y.getSum_OfDeviation_X_Y(cropname);
		float sum_Square_X_Y = sum_Square_Of_X_Y.sumOfProductOfDeviationOf_X(cropname);
		
		
		float M = (sum_Of_Product_Dev_X_Y) / (sum_Square_X_Y);
		return M;
	}

	@Override
	public float get_M_of_Rainfall(String cropname) {
		
		float sum_Of_Product_Dev_Rainfall_X_Y = sum_of_X_Y.getSum_OfDeviation_X_rainfall_Y(cropname);
		float sum_Square_Rainfall_X_Y = sum_Square_Of_X_Y.sumOfProductOfDeviationOf_X_rainfall(cropname);
		
		
		float M = (sum_Of_Product_Dev_Rainfall_X_Y) / (sum_Square_Rainfall_X_Y);
		return M;
	}

	@Override
	public float get_M_of_Soil_pH(String cropname) {
		float sum_Of_Product_Dev_Soil_pH_X_Y = sum_of_X_Y.getSum_OfDeviation_X_pH_Y(cropname);
		float sum_Square_pH_X_Y = sum_Square_Of_X_Y.sumOfProductOfDeviationOf_X_pH(cropname);
		
		
		float M = (sum_Of_Product_Dev_Soil_pH_X_Y) / (sum_Square_pH_X_Y);
		return M;
	}

	@Override
	public float get_M_of_Fertilizer(String cropname) {
		float sum_Of_Product_Dev_Fertilizer_X_Y = sum_of_X_Y.getSum_OfDeviation_X_fertilizer_Y(cropname);
		float sum_Square_Fertilizer_X_Y = sum_Square_Of_X_Y.sumOfProductOfDeviationOf_X_fertilizer(cropname);
		
		
		float M = (sum_Of_Product_Dev_Fertilizer_X_Y) / (sum_Square_Fertilizer_X_Y);
		return M;
	}
	
	

}
