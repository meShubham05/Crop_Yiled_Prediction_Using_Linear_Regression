package services;

import java.util.List;

import model.CityModel;

public interface CityService {
	
	public boolean isCityAdded(CityModel citymodel);
	public List<CityModel> cityList();
}
