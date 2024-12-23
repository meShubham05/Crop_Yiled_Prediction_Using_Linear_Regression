package repository;

import java.util.List;

import model.CropModel;

public interface Filter_Data_Repository  {

	public List<CropModel>  filterbyCropName(String CropName); 
	
}
