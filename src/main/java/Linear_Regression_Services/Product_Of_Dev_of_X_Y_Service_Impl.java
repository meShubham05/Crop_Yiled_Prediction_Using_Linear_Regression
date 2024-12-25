package Linear_Regression_Services;

<<<<<<< HEAD
import java.util.List;

import Linear_Regression_Model.Product_Of_Dev_Xand_Y_Repository;
import Linear_Regression_Model.Product_of_Dev_X_and_Y_Repository_Impl;

public class Product_Of_Dev_of_X_Y_Service_Impl  implements Product_Of_Dev_of_X_Y_Service{

	Product_Of_Dev_Xand_Y_Repository productDev_X_Y_Repo = new Product_of_Dev_X_and_Y_Repository_Impl();
	@Override
	public  List<Float> product_of_Dev_X_and_Y(String croopname) {
=======
import Linear_Regression_Model.Product_Of_Dev_Xand_Y_Repository;
import Linear_Regression_Model.Product_of_Dev_X_and_Y_Repository_Impl;

public class Product_Of_Dev_of_X_Y_Service_Impl  implements Product_Of_Dev_of_X_Y_Service{

	Product_Of_Dev_Xand_Y_Repository productDev_X_Y_Repo = new Product_of_Dev_X_and_Y_Repository_Impl();
	@Override
	public float product_of_Dev_X_and_Y(String croopname) {
>>>>>>> branch 'main' of https://github.com/meShubham05/Crop_Yiled_Prediction_Using_Linear_Regression.git
		
		return productDev_X_Y_Repo.product_of_Dev_X_and_Y(croopname);
	}

	
}
