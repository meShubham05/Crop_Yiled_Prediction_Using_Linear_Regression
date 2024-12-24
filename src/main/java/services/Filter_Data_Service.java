package services;

import java.util.List;

import model.CropModel;

public interface Filter_Data_Service {

	public List<CropModel>  filterbyCropName(String CropName); 
	public List<CropModel> filterCropBySeason(String seasonName);
	
}
