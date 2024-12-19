package services;

import java.util.List;

import model.StateModel;
import repository.StateRepository;
import repository.StateRepositoryImp;

public class StateServiceImpl implements StateService
{
	
	StateRepository staterepo = new StateRepositoryImp();
	
	public boolean isAddedNewState(StateModel statemodel) 
	{
		return staterepo.isAddedNewState(statemodel);
	}
	
	
	public List <StateModel> allState()
	{
		return staterepo.allState();
	}

}
  