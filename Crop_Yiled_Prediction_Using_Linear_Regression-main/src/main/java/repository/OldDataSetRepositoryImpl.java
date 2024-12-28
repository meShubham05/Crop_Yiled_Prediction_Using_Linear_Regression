package repository;

import java.util.*;

import model.OldDataSetModel;

public class OldDataSetRepositoryImpl  extends DBState implements OldDataSetRepository{
	
		
	
	
	public boolean isOldDataSetAdded(OldDataSetModel olddataset) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{		
			
			System.out.println("Enter the 3 Year Old DataSet :");
			
			for(int i=0;i<3;i++)
			{
				
			System.out.println("Enter the Crop Details :");
			
			System.err.println("Enter the DataSet Id :");
			 int datasetId = sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter the Crop Id :");
			 int cropid = sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter the Crop Fertilizer you have Used : ");
			 String fertilizer = sc.nextLine();
			 System.out.println("Enter the Ph Level of Your Soil :");
			 float pH = sc.nextFloat();
			 sc.nextLine();
			 System.out.println("Enter the Temperature you have cultivated the Crop :");
			 float temp = sc.nextFloat();
			 sc.nextLine();
			 
			 System.out.println("Enter the Annual Rainfall in your Region :");
			 float rainfall = sc.nextFloat();
			 sc.nextLine();
			 
			 System.out.println("Enter the Previous yield  You have Earned per Acre :");
			 
			 float yield = sc.nextFloat();
			 sc.nextLine();
			 
			 System.out.println("Enter the Year of the Crop ");
			 
			 int year =sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("Enter the Season of the Crop :");
			 
			 String season =sc.nextLine();
			 System.out.println("Enter the City Id :");
			 
//			 stmt=conn.prepareStatement("select ");
			 int cityid = sc.nextInt();
			 
			 sc.nextLine();
			 System.out.println("Enter the District Name :");
			 int districtId = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("Enter the State Name :");
			 
			 int stateId =sc.nextInt();		 
			 
			
			 /*
		// datasetid  | int                          | NO   | PRI | NULL    | auto_increment |
			 | cropid     | int                          | YES  | MUL | NULL    |                |
			 | fertilizer | varchar(200)                 | YES  |     | NULL    |                |
			 | ph         | decimal(4,2)                 | YES  |     | NULL    |                |
			 | temp       | decimal(5,2)                 | YES  |     | NULL    |                |
			 | rainfall   | decimal(6,2)                 | YES  |     | NULL    |                |
			 | yield      | decimal(10,2)                | YES  |     | NULL    |                |
			 | year       | year                         | YES  |     | NULL    |                |
			 | season     | enum('kharif','rabi','zaid') | YES  |     | NULL    |                |
			 | cityid     | int                          | YES  | MUL | NULL    |                |
			 | districtId | int                          | YES  | MUL | NULL    |                |
			 | stateId    | int                          | YES  | MUL | NULL    |     
			 			 
			 */			 
			 
			stmt = conn.prepareStatement("insert into olddataset values(?,?,?,?,?,?,?,?,?,?,?,?) ");
			stmt.setInt(1, datasetId);
			stmt.setInt(2, cropid);
			stmt.setString(3, fertilizer);
			stmt.setFloat(4, pH);
			stmt.setFloat(5, temp);
			stmt.setFloat(6, rainfall);
			stmt.setFloat(7, yield);
			stmt.setInt(8,year);
			stmt.setString(9, season);
			stmt.setInt(10, cityid);
			stmt.setInt(11, districtId);
			stmt.setInt(12, stateId);
			
			
			int result  = stmt.executeUpdate();
			
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			}
		}
			
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return false;
			
	}


	public List<OldDataSetModel> olddataset() {
		
		try
		{
			stmt = conn.prepareStatement("select * from olddataset ");
			rs= stmt.executeQuery();
			//	 datasetid | cropid | fertilizer | ph   | temp  | rainfall | yield | year | season | cityid | districtId | stateId
			
			while(rs.next())
			{	
			int datasetid = rs.getInt("datasetid");
			int cropId = rs.getInt("cropid");
			String fertilizer = rs.getString("fertilizer");
			float pH = rs.getFloat("pH");
			float temp = rs.getFloat("temp");
			int rainfall = rs.getInt("rainfall");
			int yield = rs.getInt("yield");
			int  year = rs.getInt("year");
			String season = rs.getString("season");
			int cityId = rs.getInt("cityid");
			int districtId = rs.getInt("districtId");
			int stateId = rs.getInt("stateId");
			System.out.println("\n====================================================\n");
			System.out.println(" Old_Data_Set_Id : "+datasetid+" cropId : "+cropId+ "Fertilizer :"+fertilizer+"  pH :"+pH+" Temperature :"+temp+" Rainfall :"+rainfall+"  Yield :"+yield+" Season :"+season+" CityId :"+cityId+" District :"+districtId+" StateId :"+stateId);
			System.out.println("\n====================================================\n");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
