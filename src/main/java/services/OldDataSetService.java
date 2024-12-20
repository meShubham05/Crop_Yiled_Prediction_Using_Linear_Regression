package services;

import java.util.List;

import model.OldDataSetModel;

public interface OldDataSetService {

	public boolean isOldDataSetAdded(OldDataSetModel olddataset);
	public List<OldDataSetModel> olddataset();
}
