package Linear_Regression_Services;

import Linear_Regression_Model.Sum_of_Square_of_Deviation_Of_X_Repositiry_Impl;
import Linear_Regression_Model.Sum_of_Square_of_Deviation_Of_X_Repository;

public class Sum_of_Square_of_Dev_X_Service_Impl implements Sum_of_Square_of_Dev_X_Service {

	
	Sum_of_Square_of_Deviation_Of_X_Repository sumOfSquare_Dev_X = new Sum_of_Square_of_Deviation_Of_X_Repositiry_Impl();
	
	
	@Override
	public float sumOfProductOfDeviationOf_X(String cropname) {
		
		return sumOfSquare_Dev_X.sumOfProductOfDeviationOf_X(cropname);
	}

	
}
