package services;

import model.StateModel;
import repository.StateRepository;
import repository.StateRepositoryImp;

public class StateServiceImpl implements StateService{
	StateRepository staterepo = new StateRepositoryImp();
			
	public Boolean isAddedNewState(StateModel statemodel) {
		
		return staterepo.isAddedNewState(statemodel);
	}
	

}
