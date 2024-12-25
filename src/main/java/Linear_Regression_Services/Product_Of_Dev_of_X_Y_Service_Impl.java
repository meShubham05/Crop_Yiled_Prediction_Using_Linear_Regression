package Linear_Regression_Services;

import Linear_Regression_Model.Product_Of_Dev_Xand_Y_Repository;
import Linear_Regression_Model.Product_of_Dev_X_and_Y_Repository_Impl;

public class Product_Of_Dev_of_X_Y_Service_Impl  implements Product_Of_Dev_of_X_Y_Service{

	Product_Of_Dev_Xand_Y_Repository productDev_X_Y_Repo = new Product_of_Dev_X_and_Y_Repository_Impl();
	@Override
	public float product_of_Dev_X_and_Y(String croopname) {
		
		return productDev_X_Y_Repo.product_of_Dev_X_and_Y(croopname);
	}

	
}
