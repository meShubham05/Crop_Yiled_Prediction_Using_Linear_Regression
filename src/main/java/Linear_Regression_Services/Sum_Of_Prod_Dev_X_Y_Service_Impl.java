package Linear_Regression_Services;

import Linear_Regression_Model.Sum_Of_Product_Of_Dev_X_Y_Repo_Impl;
import Linear_Regression_Model.Sum_Of_Product_Of_Dev_of_X_Y_Repository;

public class Sum_Of_Prod_Dev_X_Y_Service_Impl  implements Sum_Of_Prod_Dev_X_Y_Service{

	Sum_Of_Product_Of_Dev_of_X_Y_Repository sum_of_Product_Dev_X_Y = new Sum_Of_Product_Of_Dev_X_Y_Repo_Impl();
	 
	@Override
	public float getSum_OfDeviation_X_Y(String cropName) {
		
		return sum_of_Product_Dev_X_Y.getSum_OfDeviation_X_Y(cropName);
	}

}
