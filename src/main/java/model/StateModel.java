package model;

public class StateModel {

	private int stateid;
	private String statename;
	
	public StateModel()
	{
		
	}
	
	public StateModel(int stateid , String statename)
	{
		this.stateid=stateid;
		this.statename = statename;
		
	}

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	
}
