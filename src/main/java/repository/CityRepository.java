package repository;

import model.CityModel;
import java.util.*;

public interface CityRepository {

	public boolean isCityAdded(CityModel citymodel);
	
	public List<CityModel> cityList();
	
	
	
	
	
}
