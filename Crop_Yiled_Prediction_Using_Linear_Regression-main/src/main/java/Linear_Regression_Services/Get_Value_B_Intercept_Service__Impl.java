package Linear_Regression_Services;

import Linear_Regression_Model.Get_Value_of_B_Intercept_Repository;

import Linear_Regression_Model.Get_Value_of_B_Intercept_Repository_Impl;

public class Get_Value_B_Intercept_Service__Impl  implements Get_Value_B_Intercept_Service{

	Get_Value_of_B_Intercept_Repository valueOfB = new Get_Value_of_B_Intercept_Repository_Impl();
	@Override
	public float valueOfB_Intercept(String CropName) {
		
		return valueOfB.valueOfB_Intercept(CropName);
	}

}
