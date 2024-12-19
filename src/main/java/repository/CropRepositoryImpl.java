package repository;

import model.CropModel;
import java.util.*;
public class CropRepositoryImpl  extends DBState implements CropRepository {

	@Override
	public boolean isCropAdded(CropModel cropmodel) {

			Scanner sc = new Scanner(System.in);
			
		try
		{
			System.out.println("Enter the Crop details in Crop Data :");
			System.out.println();
			int cropId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Crop Name :");
			String cropName = sc.nextLine();
			
			System.out.println("Enter the Crop Fertilizer :");
			String fertilizer =sc.nextLine();
			
			System.out.println("Enter the Temperature of your region :");
			float temp = sc.nextFloat();
			
			sc.nextLine();
			
			System.out.println("Enter the pH of Soil :");
			float pH= sc.nextFloat();
			sc.nextLine();
			
			System.out.println("Enter the Annual rainfall of your Region :");
			float rainfall = sc.nextFloat();
			sc.nextLine();
			
			System.out.println("Enter the StateID :");
			int stateId =sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter the District Id :");
			int distId = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the CityId :");
			int cityId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Area of Your Farm :");
			int area = sc.nextInt();
			
			
			
			
			stmt = conn.prepareStatement("insert into crop values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, cropId);
			stmt.setString(2, cropName);
			stmt.setString(3,fertilizer);
			stmt.setFloat(4, temp);
			stmt.setFloat(5, pH);
			stmt.setFloat(6, rainfall);
			stmt.setInt(7, stateId);
			stmt.setInt(8, distId);
			stmt.setInt(9, cityId);
			stmt.setInt(10, area);
			
			int result = stmt.executeUpdate();
			
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
