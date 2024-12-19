package Client_Application;

import model.*;

import model.*;
import services.*;
import java.util.*;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
public class Crop_Yield_Price_Using_Linear_Regression {
	
	
		
	public static void main(String[] args) {		
			
		Logger log=Logger.getLogger(Crop_Yield_Price_Using_Linear_Regression.class);
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender console = new ConsoleAppender(layout);
		log.setLevel(Level.ALL);
		log.addAppender(console);	
		
		System.out.println(" Welcome to Crop Yield Prediction App !!! ");
		
		StateService stateService = new StateServiceImpl();
		DistrictService distService = new DistrictServiceImp();
		CityService cityService = new CityServiceImpl();
		OldDataSetService olddataService = new OldDataSetServiceImpl();
		CropService cropservice = new CropServiceImpl();
		
		
		
		StateModel statemodel = new StateModel();
		DistrictModel distmodel = new DistrictModel();
		CityModel citymodel = new CityModel();
		OldDataSetModel olddataModel  = new OldDataSetModel();
		CropModel cropModel = new CropModel();
		int choice;
		
		Scanner sc = new Scanner(System.in);	
		
		do
		{
			System.out.println("Welcome to the Crop Yield Prediction App ");
			System.out.println("1 : Add State");
			System.out.println("2 : View all State :");
			System.out.println("3 : Add District :");
			System.out.println("4 : Display all District :");
			System.out.println("5 : Add City :");
			System.out.println("6 : View All Cities :");
			System.out.println("7 : Add Crop Data of Farmer :");
			System.out.println("8 : View All Crops :");
			System.out.println("7 : To Add Old Data Set ");
			
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:	
					boolean isStateAdd = stateService.isAddedNewState(statemodel);
					
					if(isStateAdd)
					{
						log.info("State Added Succcessfully");
					}
					else
					{
						log.info("Statte is not Added :");
					}
						
					break;
				
				case 2:
					
					stateService.allState();					
					
					break;
					
				case 3:
					boolean isDistAdd = distService.isDistrictAdd(distmodel);
					if(isDistAdd)
					{
						log.info("District Added Successfully :");
					}
					else
					{
						log.info("Opps !!! Some Error Happens :");
					}
					break;
					
				case 4:
					
					distService.districtList();
					
					break;
					
				case 5:
					
					boolean isCityAdded = cityService.isCityAdded(citymodel);
					if(isCityAdded)
					{
						log.info("City Added Successfully ");
					}
					else
					{
						log.info("Opps !!! Some Problem Occured :");
					}
					
					break;					
					
				case 6:
					
					cityService.cityList();			
					break;	
					
				case 7:
					
					boolean isCropAdded =cropservice.isCropAdded(cropModel);
					if(isCropAdded)
					{
						log.info("Crop Added to the Database :");
						
					}
					else
					{
						log.info("Opps !!! Some problem occurs :");
					}
					
					break;
					
					
				case 8:	
					
					
					break;
					
					
				case 9 :
					
					boolean is_Old_Data_Set_Added = olddataService.isOldDataSetAdded(olddataModel);
					
					if(is_Old_Data_Set_Added)
					{
						log.info("Old Data Set is Successfully Added to your DataBase :");
						
					}
					else
					{
						log.info("Opps !!! Some problem is Occured While entering the data in OLD DATA SET table :");
					}
					
			}
		
		}while(choice!=0);
		
		
	}

}
