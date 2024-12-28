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
	        String insertQuery = "INSERT INTO crop(cropname, fertilizer, temp, pH, rainfall, yield, year, season, cityId, distId, stateId) " +
	                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        stmt = conn.prepareStatement(insertQuery);

	        // Iterate through the rows in the sheet
	        for (Row row : sheet) {
	            // Skip the header row
	            if (row.getRowNum() == 0) continue;

	            try {
	                // Extract and parse cell values
	                String cropname = getCellValueAsString(row.getCell(0));
	                String fertilizer = getCellValueAsString(row.getCell(1));
	                double ph = Double.parseDouble(getCellValueAsString(row.getCell(2)));
	                double temp = Double.parseDouble(getCellValueAsString(row.getCell(3)));
	                double rainfall = Double.parseDouble(getCellValueAsString(row.getCell(4)));
	                double yield = Double.parseDouble(getCellValueAsString(row.getCell(5)));
	                int year = (int) Double.parseDouble(getCellValueAsString(row.getCell(6)));
	                String season = getCellValueAsString(row.getCell(7));
	                int cityId = (int) Double.parseDouble(getCellValueAsString(row.getCell(8)));
	                int districtId = (int) Double.parseDouble(getCellValueAsString(row.getCell(9)));
	                int stateId = (int) Double.parseDouble(getCellValueAsString(row.getCell(10)));

	                // Set values in PreparedStatement
	                stmt.setString(1, cropname);
	                stmt.setString(2, fertilizer);
	                stmt.setDouble(3, temp);
	                stmt.setDouble(4, ph);
	                stmt.setDouble(5, rainfall);
	                stmt.setDouble(6, yield);
	                stmt.setInt(7, year);
	                stmt.setString(8, season);
	                stmt.setInt(9, cityId);
	                stmt.setInt(10, districtId);
	                stmt.setInt(11, stateId);

	                // Add to batch
	                stmt.addBatch();
	            } catch (Exception e) {
	                System.err.println("Error processing row " + row.getRowNum() + ": " + e.getMessage());
	            }
	        }

	        // Execute batch
	        stmt.executeBatch();

	        // If successful, return true
	        return true;
	    } catch (Exception e) {
	        System.err.println("Error processing file: " + e.getMessage());
	        return false;
	    } finally {
	        // Close resources
	        try { if (stmt != null) stmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        try { if (workbook != null) workbook.close(); } catch (Exception e) { e.printStackTrace(); }
	        try { if (fileInputStream != null) fileInputStream.close(); } catch (Exception e) { e.printStackTrace(); }
	    }
	}



	@Override
	public boolean isAddedBulkOldDataSet(String filePath) {
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
	        String insertQuery = "INSERT INTO olddataset(cropname, fertilizer, ph, temp, rainfall, yield, year, season, cityid, districtId, stateId) " +
	                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        stmt = conn.prepareStatement(insertQuery);

	        for (Row row : sheet) {
	            // Skip the header row
	            if (row.getRowNum() == 0) continue;

	            // Read and handle all cell types
	            String cropname = getCellValueAsString(row.getCell(0));
	            String fertilizer = getCellValueAsString(row.getCell(1));
	            double ph = Double.parseDouble(getCellValueAsString(row.getCell(2)));
	            double temp = Double.parseDouble(getCellValueAsString(row.getCell(3)));
	            double rainfall = Double.parseDouble(getCellValueAsString(row.getCell(4)));
	            double yield = Double.parseDouble(getCellValueAsString(row.getCell(5)));
	            int year = Integer.parseInt(getCellValueAsString(row.getCell(6)));
	            String season = getCellValueAsString(row.getCell(7));
	            int cityId = Integer.parseInt(getCellValueAsString(row.getCell(8)));
	            int districtId = Integer.parseInt(getCellValueAsString(row.getCell(9)));
	            int stateId = Integer.parseInt(getCellValueAsString(row.getCell(10)));

	            // Set values in the PreparedStatement
	            stmt.setString(1, cropname);
	            stmt.setString(2, fertilizer);
	            stmt.setDouble(3, ph);
	            stmt.setDouble(4, temp);
	            stmt.setDouble(5, rainfall);
	            stmt.setDouble(6, yield);
	            stmt.setInt(7, year);
	            stmt.setString(8, season);
	            stmt.setInt(9, cityId);
	            stmt.setInt(10, districtId);
	            stmt.setInt(11, stateId);

	            // Add the query to the batch
	            stmt.addBatch();
	        }

	        // Execute batch
	        int[] result = stmt.executeBatch();
	        System.out.println("Data inserted successfully! Rows affected: " + result.length);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    } finally {
	        // Close resources
	        try { if (stmt != null) stmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        try { if (workbook != null) workbook.close(); } catch (Exception e) { e.printStackTrace(); }
	        try { if (fileInputStream != null) fileInputStream.close(); } catch (Exception e) { e.printStackTrace(); }
	    }
	    return true;
	}

	// Utility method to handle all cell types
	private String getCellValueAsString(Cell cell) {
	    if (cell == null) {
	        return "";
	    }
	    switch (cell.getCellType()) {
	        case STRING:
	            return cell.getStringCellValue();
	        case NUMERIC:
	            if (DateUtil.isCellDateFormatted(cell)) {
	                return cell.getDateCellValue().toString();
	            } else {
	                // Handle numeric values
	                double numericValue = cell.getNumericCellValue();
	                // If the value is an integer (e.g., 2000.0), return without a decimal
	                if (numericValue == (int) numericValue) {
	                    return String.valueOf((int) numericValue);
	                }
	                return String.valueOf(numericValue);
	            }
	        case BOOLEAN:
	            return String.valueOf(cell.getBooleanCellValue());
	        case FORMULA:
	            return cell.getCellFormula();
	        case BLANK:
	            return "";
	        default:
	            return "";
	    }
	}


	}
	
