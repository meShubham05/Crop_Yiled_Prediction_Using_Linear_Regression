package services;

import java.util.List;

import model.CropModel;
import repository.Filter_Data_Repository;
import repository.Filter_Data_Repository_Impl;

public class FilterData_Service_Impl implements Filter_Data_Service{

	Filter_Data_Repository filterRepo = new Filter_Data_Repository_Impl();
	public List<CropModel> filterbyCropName(String CropName) {
		// TODO Auto-generated method stub
		return filterRepo.filterbyCropName(CropName);
	}
	public List<CropModel> filterCropBySeason(String seasonName) {
		// TODO Auto-generated method stub
		return filterRepo.filterCropBySeason(seasonName);
	}

}
