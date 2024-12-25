package Linear_Regression_Model;

import java.util.*;
public class Sum_of_Square_of_Deviation_Of_X_Repositiry_Impl implements  Sum_of_Square_of_Deviation_Of_X_Repository {

	DeviationOfX_Repository devXRepo = new DeviationOf_X_Repository_Impl();

 

	@Override
	public float sumOfProductOfDeviationOf_X(String cropname) {

		float sumOfSquares = 0;
        
        try {
            // Get the list of deviations for X (Temperature)
            List<Float> deviationList = devXRepo.getDeviationOfTemp(cropname);
            
            // Sum the squares of deviations
            for (float deviation : deviationList) {
                sumOfSquares += Math.pow(deviation, 2); // Squaring each deviation and adding to the sum
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sumOfSquares; // Return the sum of squares
    
	}
}
