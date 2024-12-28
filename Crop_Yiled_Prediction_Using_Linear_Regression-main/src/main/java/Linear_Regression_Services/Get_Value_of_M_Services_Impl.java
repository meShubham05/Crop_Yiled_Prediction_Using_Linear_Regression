package Linear_Regression_Services;

import Linear_Regression_Model.Get_Value_Of_M_Repository;
import Linear_Regression_Model.Get_Value_of_M_Repository_Impl;

public class Get_Value_of_M_Services_Impl implements Get_ValueOf_M_Services {

	
	Get_Value_Of_M_Repository getMinRepo= new Get_Value_of_M_Repository_Impl();
	
	@Override
	public float get_M_of_Temp(String cropname) {
		// TODO Auto-generated method stub
		return getMinRepo.get_M_of_Temp(cropname);
	}

	@Override
	public float get_M_of_Rainfall(String cropname) {
		
		return getMinRepo.get_M_of_Rainfall(cropname);
	}

	@Override
	public float get_M_of_Soil_pH(String cropname) {
		// TODO Auto-generated method stub
		return getMinRepo.get_M_of_Soil_pH(cropname);
	}

	@Override
	public float get_M_of_Fertilizer(String cropname) {
		// TODO Auto-generated method stub
		return getMinRepo.get_M_of_Fertilizer(cropname);
	}

	
}
