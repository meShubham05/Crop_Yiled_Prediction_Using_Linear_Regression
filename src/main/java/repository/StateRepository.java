package repository;

import model.StateModel;
import java.util.*;

public  interface StateRepository {
	
	public abstract boolean isAddedNewState(StateModel statemodel);
	
	public  abstract List<StateModel> allState();

//	default void addState()
//	{
//		
//	}
		
	
}


