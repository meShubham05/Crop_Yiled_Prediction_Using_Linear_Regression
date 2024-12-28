package services;

import java.util.List;

import model.DistrictModel;

public interface DistrictService {

	public boolean isDistrictAdd(DistrictModel distmodel);
	public List<DistrictModel> districtList();
	public boolean isCityAddedUnderDistrict(String distName, String cityName);
}
