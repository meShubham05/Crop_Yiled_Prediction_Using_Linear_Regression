package Linear_Regression_Services;

import Linear_Regression_Model.Sum_of_Square_of_Deviation_Of_X_Repositiry_Impl;
import Linear_Regression_Model.Sum_of_Square_of_Deviation_Of_X_Repository;

public class Sum_of_Square_of_Dev_X_Service_Impl implements Sum_of_Square_of_Dev_X_Service {

	
	Sum_of_Square_of_Deviation_Of_X_Repository sumOfSquare_Dev_X = new Sum_of_Square_of_Deviation_Of_X_Repositiry_Impl();
	
	
	@Override
	public float sumOfProductOfDeviationOf_X(String cropname) {
		
		return sumOfSquare_Dev_X.sumOfProductOfDeviationOf_X(cropname);
	}


	@Override
	public float sumOfProductOfDeviationOf_X_Rainfall(String cropname) {
		
		return sumOfSquare_Dev_X.sumOfProductOfDeviationOf_X_rainfall(cropname);
	}


	@Override
	public float sumOfProductOfDeviationOf_X_pH(String cropname) {
		
		return sumOfSquare_Dev_X.sumOfProductOfDeviationOf_X_pH(cropname);
	}


	@Override
	public float sumOfProductOfDeviationOf_X_Fertilizer(String cropname) {
		
		return sumOfSquare_Dev_X.sumOfProductOfDeviationOf_X_fertilizer(cropname);
	}

	
}
