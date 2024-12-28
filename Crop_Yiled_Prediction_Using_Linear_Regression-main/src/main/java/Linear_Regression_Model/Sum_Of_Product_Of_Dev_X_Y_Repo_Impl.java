package Linear_Regression_Model;

import java.util.*;

public class Sum_Of_Product_Of_Dev_X_Y_Repo_Impl implements Sum_Of_Product_Of_Dev_of_X_Y_Repository{

	Product_Of_Dev_Xand_Y_Repository prod_of__Dev_X_Y = new Product_of_Dev_X_and_Y_Repository_Impl();
	
	@Override
	public float getSum_OfDeviation_X_Y(String cropName) {
        // List to hold the product of deviations of X and Y
        List<Float> list = prod_of__Dev_X_Y.product_of_Dev_X_and_Y(cropName);

        // Variable to hold the sum of products
        float result = 0;

        // Iterate through the list and calculate the sum of the products
        for (Float product : list) {
            result += product;  // Accumulate the sum of products
        }

        // Return the sum of products
        return result;
    }

	@Override
	public float getSum_OfDeviation_X_rainfall_Y(String cropname) {
		
		
		 List<Float> list = prod_of__Dev_X_Y.product_of_Dev_X_rainfall_and_Y(cropname);

	        // Variable to hold the sum of products
	        float result = 0;

	        // Iterate through the list and calculate the sum of the products
	        for (Float product : list) {
	            result += product;  // Accumulate the sum of products
	        }

	        // Return the sum of products
	        return result;
	    }
	
	
	
	@Override
	public float getSum_OfDeviation_X_pH_Y(String cropname) {
		
		 List<Float> list = prod_of__Dev_X_Y.product_of_Dev_X_pH_and_Y(cropname);

	        // Variable to hold the sum of products
	        float result = 0;

	        // Iterate through the list and calculate the sum of the products
	        for (Float product : list) {
	            result += product;  // Accumulate the sum of products
	        }

	        // Return the sum of products
	        return result;
	    }
	@Override
	public float getSum_OfDeviation_X_fertilizer_Y(String cropname) {
		
		 List<Float> list = prod_of__Dev_X_Y.product_of_Dev_X__fertilizerand_Y(cropname);

	       
	        float result = 0;

	        
	        for (Float product : list) {
	            result += product; 
	        }

	     
	        return result;
	    }
	
	
}