package model;

public class CropModel {
	
	/*
	+------------+--------------+------+-----+---------+----------------+
	| Field      | Type         | Null | Key | Default | Extra          |
	+------------+--------------+------+-----+---------+----------------+
	| cropid     | int          | NO   | PRI | NULL    | auto_increment |
	| cropname   | varchar(50)  | NO   |     | NULL    |                |
	| fertilizer | varchar(200) | YES  |     | NULL    |                |
	| temp       | varchar(20)  | YES  |     | NULL    |                |
	| pH         | decimal(4,2) | YES  |     | NULL    |                |
	| rainfall   | int          | YES  |     | NULL    |                |
	| stateId    | int          | YES  | MUL | NULL    |                |
	| distId     | int          | YES  | MUL | NULL    |                |
	| cityId     | int          | YES  | MUL | NULL    |                |
	| Area       | int          | YES  |     | NULL    |                |
	+------------+--------------+------+-----+---------+----------------+
*/
	
	private int cropid;
	private String cropname;
	private String fertilizer;
	private float temp;
	private float pH;
	private float rainfall;
	private int stateId;
	private int distId;
	private int cityId;
	private float Area;
	public int getCropid() {
		return cropid;
	}
	
	public CropModel()
	{
		
	}
	
	
	public CropModel(int cropid, String cropname, String fertilizer, float temp, float pH, float rainfall, int stateId,
			int distId, int cityId, float area) {
		
		this.cropid = cropid;
		this.cropname = cropname;
		this.fertilizer = fertilizer;
		this.temp = temp;
		this.pH = pH;
		this.rainfall = rainfall;
		this.stateId = stateId;
		this.distId = distId;
		this.cityId = cityId;
		Area = area;
	}


	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getFertilizer() {
		return fertilizer;
	}
	public void setFertilizer(String fertilizer) {
		this.fertilizer = fertilizer;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getpH() {
		return pH;
	}
	public void setpH(float pH) {
		this.pH = pH;
	}
	public float getRainfall() {
		return rainfall;
	}
	public void setRainfall(float rainfall) {
		this.rainfall = rainfall;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getDistId() {
		return distId;
	}
	public void setDistId(int distId) {
		this.distId = distId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public float getArea() {
		return Area;
	}
	public void setArea(float area) {
		Area = area;
	}
	
	
	
	
	 
}
