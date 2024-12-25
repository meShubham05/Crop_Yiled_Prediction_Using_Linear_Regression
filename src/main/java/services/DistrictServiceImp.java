package services;

import java.util.List;

import model.DistrictModel;
import repository.DistrictRepository;
import repository.DistrictRepositoryImp;

public class DistrictServiceImp implements DistrictService{

	DistrictRepository distrepo = new DistrictRepositoryImp();
	
	public boolean isDistrictAdd(DistrictModel distmodel) 
	{
		
		return  distrepo.isDistrictAdd(distmodel);
	}

	public List<DistrictModel> districtList() {
	
		return distrepo.districtList();
	}
	
	public boolean isCityAddedUnderDistrict(String distName, String cityName)
	{
		return distrepo.isCityAddedUnderDistrict(distName, cityName);
	}
	

}
