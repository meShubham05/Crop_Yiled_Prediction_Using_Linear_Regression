package model;

public class OldDataSetModel {
	
	private int datasetId;
	private int cropid;
	private String fertilizer;
	private float pH;
	private float temp;
	private float rainfall;
	private float yield;
	private int year;
	private String [] season;
	private int cityid;
	private int districtId;
	private int stateId;
	
	
	public int getDatasetId() {
		return datasetId;
	}
	public void setDatasetId(int datasetId) {
		this.datasetId = datasetId;
	}
	public int getCropid() {
		return cropid;
	}
	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	public String getFertilizer() {
		return fertilizer;
	}
	public void setFertilizer(String fertilizer) {
		this.fertilizer = fertilizer;
	}
	public float getpH() {
		return pH;
	}
	public void setpH(float pH) {
		this.pH = pH;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getRainfall() {
		return rainfall;
	}
	public void setRainfall(float rainfall) {
		this.rainfall = rainfall;
	}
	public float getYield() {
		return yield;
	}
	public void setYield(float yield) {
		this.yield = yield;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String [] getSeason() {
		return season;
	}
	public void setSeason(String[] season) {
		this.season = season;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	
	
	

}
