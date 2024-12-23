package services;

import java.util.List;

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


	@Override
	public List<CropModel> allCropList() {
		// TODO Auto-generated method stub
		return cropRepo.allCropList();
	}


	public boolean isAddedBulkCropDataSet(String filePath) {
		// TODO Auto-generated method stub
		return cropRepo.isAddedBulkCropDataSet(filePath);
	}


	


}
