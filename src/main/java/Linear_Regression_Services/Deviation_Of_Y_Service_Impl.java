package Linear_Regression_Services;

<<<<<<< HEAD
import java.util.List;

import Linear_Regression_Model.Deviation_Of_Y_Repository;
import Linear_Regression_Model.Deviation_Of_Y_Repository_Impl;

public class Deviation_Of_Y_Service_Impl implements Deviation_Of_Y_Service 
{
	Deviation_Of_Y_Repository devOf_Y_Repo = new Deviation_Of_Y_Repository_Impl();
	@Override
	public List<Float> deviation_Of_Y(String cropName)
	{
		
=======
import Linear_Regression_Model.Deviation_Of_Y_Repository;
import Linear_Regression_Model.Deviation_Of_Y_Repository_Impl;

public class Deviation_Of_Y_Service_Impl implements Deviation_Of_Y_Service 
{
	Deviation_Of_Y_Repository devOf_Y_Repo = new Deviation_Of_Y_Repository_Impl();
	@Override
	public float deviation_Of_Y(String cropName) {
		// TODO Auto-generated method stub
>>>>>>> branch 'main' of https://github.com/meShubham05/Crop_Yiled_Prediction_Using_Linear_Regression.git
		return devOf_Y_Repo.deviation_Of_Y(cropName);
	}
	
	
}
