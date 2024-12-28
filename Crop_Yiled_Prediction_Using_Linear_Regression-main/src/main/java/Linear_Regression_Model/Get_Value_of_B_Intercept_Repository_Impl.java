package Linear_Regression_Model;

public class Get_Value_of_B_Intercept_Repository_Impl  implements Get_Value_of_B_Intercept_Repository{

	//  B = Mean of Y - (mi * Mean of Xi)		

	GetMInOf_Y_Repository getminOf_Y = new GetMin_Of_Y_Repository_Impl();
	Get_Value_Of_M_Repository getValueOf_M = new Get_Value_of_M_Repository_Impl();
	GetMinOf_X_Repository getMinOf_X_temp = new Get_Min_of_X_Repo_Impl();
	
	@Override
	public float valueOfB_Intercept(String CropName) {

		float meanOf_Y= getminOf_Y.getMinOfYeild(CropName);
		float valueOf_M = getValueOf_M.get_M_of_Temp(CropName);
		float valueOf_X_temp = getMinOf_X_temp.getMinOfTemp(CropName);
		
		
		float B = meanOf_Y -(valueOf_M * valueOf_X_temp);
		
		return B;
	}

}
