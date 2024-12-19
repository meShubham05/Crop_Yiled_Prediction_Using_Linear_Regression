package services;

import model.OldDataSetModel;
import repository.OldDataSetRepository;
import repository.OldDataSetRepositoryImpl;

public class OldDataSetServiceImpl  implements OldDataSetService{

	OldDataSetRepository olddataRepo = new OldDataSetRepositoryImpl();
	
	public boolean isOldDataSetAdded(OldDataSetModel olddataset) {
		
		return olddataRepo.isOldDataSetAdded(olddataset) ;
	}

}
