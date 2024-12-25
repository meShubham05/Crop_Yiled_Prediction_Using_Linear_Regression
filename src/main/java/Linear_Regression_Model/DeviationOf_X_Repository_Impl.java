package Linear_Regression_Model;

import repository.DBState;
import java.util.*;

public class DeviationOf_X_Repository_Impl extends DBState implements DeviationOfX_Repository {

	GetMinOf_X_Repository getminOfX = new Get_Min_of_X_Repo_Impl();
	@Override
	public List<Float> getDeviationOfTemp(String cropName) {
	    List<Float> deviations = new ArrayList<>();

	    try {
	        // Get the mean temperature for the crop
	        float meanOfTemp = getminOfX.getMinOfTemp(cropName);
	        System.out.println("The Mean of X is: " + meanOfTemp);

	       
	        stmt = conn.prepareStatement("select temp from olddataset where cropname = ?");
	        stmt.setString(1, cropName);
	        rs = stmt.executeQuery();

	       
	        while (rs.next()) {
	            int temp = rs.getInt("temp");
	            System.out.println("The temp is: " + temp);

	            float deviation = temp - meanOfTemp;
	            deviations.add(deviation);

	            System.out.println("Deviation of X: " + deviation);
	        }

	        return deviations; 

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return deviations; 
	}
	
	
	@Override
	public List<Float> getDeviationofRainfall(String cropName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Float> getDeviationofpH(String cropName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Float> getDeviationofFertilizer(String cropName) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
