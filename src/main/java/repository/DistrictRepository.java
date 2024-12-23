package repository;

import model.DistrictModel;
import java.util.*;

public interface DistrictRepository {

	public  boolean isDistrictAdd(DistrictModel distmodel);
	
	public  List<DistrictModel>  districtList ();
	
	public boolean isCityAddedUnderDistrict(String distName, String cityName);
	
	
	
}
