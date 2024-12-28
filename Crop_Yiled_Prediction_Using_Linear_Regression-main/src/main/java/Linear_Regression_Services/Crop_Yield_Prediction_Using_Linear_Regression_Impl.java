package Linear_Regression_Services;

import Linear_Regression_Model.Get_Value_Of_M_Repository;
import Linear_Regression_Model.Get_Value_of_M_Repository_Impl;

public class Crop_Yield_Prediction_Using_Linear_Regression_Impl  implements Crop_Yield_Prediction_Using_Linear_Regression{

	Get_Value_Of_M_Repository getMinRepo= new Get_Value_of_M_Repository_Impl();
	
	Get_ValueOf_M_Services  getValue_M = new Get_Value_of_M_Services_Impl();
	Get_Value_B_Intercept_Service getValueOfB  = new Get_Value_B_Intercept_Service__Impl();
	
	
	@Override
	public float getCropYield(String cropName, float temp, float rainfall, float pH, float fertilizer) {
		
		float m_temp = getValue_M.get_M_of_Temp(cropName);
		float m_rainfall = getValue_M.get_M_of_Rainfall(cropName);
		float m_pH = getValue_M.get_M_of_Soil_pH(cropName);
		float m_fertilizer = getValue_M.get_M_of_Fertilizer(cropName);
		
		float valueOfB= getValueOfB.valueOfB_Intercept(cropName);
		
		float cropYield = (m_temp * temp)+(m_rainfall * rainfall)+(m_pH*pH)+ (m_fertilizer *fertilizer) + valueOfB;
		
		
		return cropYield/100;
	}

}
