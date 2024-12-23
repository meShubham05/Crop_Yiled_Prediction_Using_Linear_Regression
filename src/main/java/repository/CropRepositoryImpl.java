package repository;

import model.CropModel;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

// For .xlsx files


import java.io.*;
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


	public List<CropModel> allCropList() {

		try
		{
			stmt = conn.prepareStatement("select * from crop");
			rs= stmt.executeQuery();
			
			while(rs.next())
			{
				int cropId = rs.getInt("cropid");
				String cropName = rs.getString("cropname");
				String fertilizer = rs.getString("fertilizer");
				float temp = rs.getFloat("temp");
				float pH = rs.getFloat("pH");
				int rainfall = rs.getInt("rainfall");
				int stateId = rs.getInt("stateId");
				int distId = rs.getInt("distId");
				int cityId = rs.getInt("cityId");
				int Area = rs.getInt("Area");
				
				System.out.println("Crop Id :"+ cropId +" Crop Name : "+cropName+ " Crop Fertilizer : "+fertilizer+ " Region Temperature :"+temp+" Soil pH :"
						+pH+ "  Rainfall :  "+rainfall + " State ID :"+stateId+" DistName :"+distId+" CityId :"+cityId+"Area : "+Area);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	public boolean isAddedBulkCropDataSet(String filePath) {

	        FileInputStream fileInputStream = null;
	        Workbook workbook = null;
	         stmt = null;

	        try {
	            // Open the Excel file
	            fileInputStream = new FileInputStream(filePath);
	            workbook = WorkbookFactory.create(fileInputStream);

	            // Get the first sheet
	            Sheet sheet = workbook.getSheetAt(0);

	            // SQL query for inserting data
	            String insertQuery = "INSERT INTO crop(cropname, fertilizer, temp, pH, rainfall, stateId, distId, cityId, Area) " +
	                                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	            stmt = conn.prepareStatement(insertQuery);

	            // Iterate through the rows in the sheet
	            for (Row row : sheet) {
	                // Skip the header row
	                if (row.getRowNum() == 0) continue;

	                // Read cell values
	                String cropname = row.getCell(0).getStringCellValue();
	                String fertilizer = row.getCell(1).getStringCellValue();
	                double temp = row.getCell(2).getNumericCellValue();
	                double pH = row.getCell(3).getNumericCellValue();
	                double rainfall = row.getCell(4).getNumericCellValue();
	                int stateId = (int) row.getCell(5).getNumericCellValue();
	                int distId = (int) row.getCell(6).getNumericCellValue();
	                int cityId = (int) row.getCell(7).getNumericCellValue();
	                int area = (int) row.getCell(8).getNumericCellValue();

	                // Set values in the PreparedStatement
	                stmt.setString(1, cropname);
	                stmt.setString(2, fertilizer);
	                stmt.setDouble(3, temp);
	                stmt.setDouble(4, pH);
	                stmt.setDouble(5, rainfall);
	                stmt.setInt(6, stateId);
	                stmt.setInt(7, distId);
	                stmt.setInt(8, cityId);
	                stmt.setInt(9, area);

	                // Add the query to the batch
	                stmt.addBatch();
	            }

	            // Execute batch
	            int[] result = stmt.executeBatch();
	            System.out.println("Data inserted successfully! Rows affected: " + result.length);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close resources
	            try { if (stmt != null) stmt.close(); } catch (Exception e) { e.printStackTrace(); }
	            try { if (workbook != null) workbook.close(); } catch (Exception e) { e.printStackTrace(); }
	            try { if (fileInputStream != null) fileInputStream.close(); } catch (Exception e) { e.printStackTrace(); }
	        }
			return false;
	    }

	}
	
