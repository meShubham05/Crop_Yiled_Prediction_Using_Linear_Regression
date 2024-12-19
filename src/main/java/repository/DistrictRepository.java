package repository;

import model.DistrictModel;
import java.util.*;

public interface DistrictRepository {

	public abstract boolean isDistrictAdd(DistrictModel distmodel);
	
	public abstract List<DistrictModel>  districtList ();
	
	
}
