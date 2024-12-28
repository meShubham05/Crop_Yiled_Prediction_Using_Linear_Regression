package repository;

import model.OldDataSetModel;
import java.util.*;

public interface OldDataSetRepository {

	public boolean isOldDataSetAdded(OldDataSetModel olddataset);
	public List <OldDataSetModel> olddataset(); 
	
	
}
