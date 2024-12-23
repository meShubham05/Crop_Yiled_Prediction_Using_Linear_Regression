package repository;

import model.StateModel;
import java.util.*;

public  interface StateRepository {
	
	public  boolean isAddedNewState(StateModel statemodel);
	
	public   List<StateModel> allState();
	
	public boolean isDistrictUnderState(String stateName, String distName);
	
	
	

//	default void addState()
//	{
//		
//	}
		
	
}


