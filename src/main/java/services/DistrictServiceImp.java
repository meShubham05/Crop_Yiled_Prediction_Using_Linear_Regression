package services;

import java.util.List;

import model.DistrictModel;
import repository.DistrictRepository;
import repository.DistrictRepositoryImp;

public class DistrictServiceImp implements DistrictService{

	DistrictRepository distrepo = new DistrictRepositoryImp();
	
	@Override
	public boolean isDistrictAdd(DistrictModel distmodel) 
	{
		
		return  distrepo.isDistrictAdd(distmodel);
	}

	@Override
	public List<DistrictModel> districtList() {
	
		return distrepo.districtList();
	}
	

}
