package Linear_Regression_Model;

import repository.DBState;


import java.util.*;
public class Deviation_Of_Y_Repository_Impl extends DBState implements  Deviation_Of_Y_Repository{

	GetMInOf_Y_Repository getMin_of_Y = new GetMin_Of_Y_Repository_Impl();
	
	@Override
	public List<Float> deviation_Of_Y(String cropName) {

	    List<Float> deviationList = new ArrayList<>();

	    try {
	        float min_of_Y = getMin_of_Y.getMinOfYeild(cropName);
	        System.out.println("The Min_Of_Y is :" + min_of_Y);

	        stmt = conn.prepareStatement("select yield from olddataset where cropname = ?");
	        stmt.setString(1, cropName);
	        rs = stmt.executeQuery();

	        while (rs.next()) {  // Use a loop to process multiple rows
	            float yield1 = rs.getFloat("yield");
	            float deviation_of_Y = yield1 - min_of_Y;
	            System.out.println("The Deviation of Y is :" + deviation_of_Y);

	            deviationList.add(deviation_of_Y);  // Add to the list
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return deviationList;  // Return the list of deviations
	}

}