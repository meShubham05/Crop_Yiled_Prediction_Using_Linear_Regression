package Linear_Regression_Model;

import repository.DBState;
import java.util.*;

public class Product_of_Dev_X_and_Y_Repository_Impl  extends DBState implements Product_Of_Dev_Xand_Y_Repository{

	DeviationOfX_Repository devRepo= new DeviationOf_X_Repository_Impl();
	
	Deviation_Of_Y_Repository devOf_Y_Repo = new Deviation_Of_Y_Repository_Impl();
	@Override
	public List<Float> product_of_Dev_X_and_Y(String cropName) {

	    List<Float> productList = new ArrayList<>();

	    try {
	        // Get the list of deviations for X and Y
	        List<Float> devOfXList = devRepo.getDeviationOfTemp(cropName);
	        List<Float> devOfYList = devOf_Y_Repo.deviation_Of_Y(cropName);

	        // Ensure both lists have the same size
	        if (devOfXList.size() != devOfYList.size()) {
	            System.out.println("Error: Deviation lists size mismatch.");
	            return productList; // Return empty list in case of mismatch
	        }

	        // Calculate the product of deviations for each row
	        for (int i = 0; i < devOfXList.size(); i++) {
	            float productOfDev_X_Y = devOfXList.get(i) * devOfYList.get(i);
	            productList.add(productOfDev_X_Y); // Add to product list
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return productList; // Return the list of products
	}

	
}
