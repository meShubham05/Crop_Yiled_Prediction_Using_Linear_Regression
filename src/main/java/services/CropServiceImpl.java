package services;

import model.CropModel;
import repository.CropRepository;
import repository.CropRepositoryImpl;

public class CropServiceImpl implements CropService{

	CropRepository cropRepo = new CropRepositoryImpl();
	
	
	public boolean isCropAdded(CropModel cropmodel) 
	{
		// TODO Auto-generated method stub
		return cropRepo.isCropAdded(cropmodel);
	}

}
