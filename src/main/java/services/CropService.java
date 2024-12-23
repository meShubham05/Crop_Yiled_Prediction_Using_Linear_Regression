package services;

import java.util.List;

import model.CropModel;

public interface CropService {

	public boolean isCropAdded(CropModel cropmodel);
	public List<CropModel> allCropList(); 
	public boolean isAddedBulkCropDataSet(String filePath); 
	

}
