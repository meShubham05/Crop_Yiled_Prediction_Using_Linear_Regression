package repository;

import model.CropModel;
import java.util.*;

public interface CropRepository {

	public boolean isCropAdded(CropModel cropmodel);
	public List<CropModel> allCropList();
	
	
}
