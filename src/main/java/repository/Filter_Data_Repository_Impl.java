package repository;

import java.util.List;

import model.CropModel;
import java.util.*;
public class Filter_Data_Repository_Impl  extends DBState implements Filter_Data_Repository{

	List <CropModel> allCropList = new ArrayList<CropModel>();
	@Override
	public List <CropModel>  filterbyCropName(String CropName) 
	{
	
		try
		{
			stmt = conn.prepareStatement("select * from crop where cropName = ?");
			stmt.setString(1, CropName);
			rs =stmt.executeQuery();
			
			while(rs.next())
			{
				allCropList.add( new CropModel(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4),rs.getFloat(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getFloat(10)));
			}
			return allCropList.size() >0 ? allCropList: null;
			
					
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
