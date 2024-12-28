package services;

import java.util.List;

import model.CityModel;
import repository.CityRepository;
import repository.CityRepositoryImp;

public class CityServiceImpl implements CityService{
	
	CityRepository cityRepo= new CityRepositoryImp();
	
	public boolean isCityAdded(CityModel citymodel)
	{
		return  cityRepo.isCityAdded(citymodel);
	}

	
	public List<CityModel> cityList() 
	{		
		return cityRepo.cityList();
	}
	

}
