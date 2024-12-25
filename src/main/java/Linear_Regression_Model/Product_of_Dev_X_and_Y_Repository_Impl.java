package Linear_Regression_Model;

import repository.DBState;

public class Product_of_Dev_X_and_Y_Repository_Impl  extends DBState implements Product_Of_Dev_Xand_Y_Repository{

	DeviationOfX_Repository devRepo= new DeviationOf_X_Repository_Impl();
	
	Deviation_Of_Y_Repository devOf_Y_Repo = new Deviation_Of_Y_Repository_Impl();
	@Override
	public float product_of_Dev_X_and_Y(String croopname) {
		
		try
		{
			float devOfX = devRepo.getDeviationofTemp(croopname);
			float devOfY = devOf_Y_Repo.deviation_Of_Y(croopname);
			
			float productOfDev_X_Y = ( devOfX ) * ( devOfY);
			
			return productOfDev_X_Y;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	
}
