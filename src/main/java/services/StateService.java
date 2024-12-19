package services;

import java.util.List;

import model.StateModel;


public interface StateService {
	
		public abstract  boolean isAddedNewState(StateModel statemodel);
		public List<StateModel> allState();

}
