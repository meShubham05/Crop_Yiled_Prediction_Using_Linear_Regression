package Client_Application;

import model.*;
import services.*;
import java.util.*;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Crop_Yield_Price_Using_Linear_Regression {
	public static void main(String[] args) 
	{
		
		Logger log = Logger.getLogger(Crop_Yield_Price_Using_Linear_Regression.class);
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender console = new ConsoleAppender(layout);
		log.setLevel(Level.ALL);
		log.addAppender(console);

		StateService stateService = new StateServiceImpl();
		DistrictService distService = new DistrictServiceImp();
		CityService cityService = new CityServiceImpl();
		OldDataSetService olddataService = new OldDataSetServiceImpl();
		CropService cropservice = new CropServiceImpl();
		AdminCredentialService adminservice = new AdminCredentialServiceImpl();
		CustomerLoginService customerService = new CustomerLoginServiceImpl();
		Filter_Data_Service filterService = new FilterData_Service_Impl();
		
		StateModel statemodel = new StateModel();
		DistrictModel distmodel = new DistrictModel();
		CityModel citymodel = new CityModel();
		OldDataSetModel olddataModel = new OldDataSetModel();
		CropModel cropModel = new CropModel();
		AdminMaster adminmaster = new AdminMaster(); 
		int choice;

		Scanner sc = new Scanner(System.in);
		// System.out.println(" Welcome to Crop Yield Prediction App !!! ");

		
		
		do {
			System.out.println("🙏🙏🙏🙏 Welcome to the Crop Yield Prediction App 🙏🙏🙏🙏 ");
			System.out.println("**********************************************");
			System.out.println(" ⇒⇒⇒⇒⇒⇒ LOGIN for ");
			System.out.println(" ⇒⇒⇒⇒⇒⇒ 1 : ADMIN : ⇐⇐⇐⇐⇐⇐ ");
			System.out.println(" ⇒⇒⇒⇒⇒⇒ 2 : CUSTOMER : ⇐⇐⇐⇐⇐⇐");
			System.out.println(" ⇒⇒⇒⇒⇒⇒ 3 : System Exit : ⇐⇐⇐⇐⇐⇐ ");
			System.out.println("**********************************************");

			System.out.println("Enter Your Choice :");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:

				System.out.println("Enter username :");
				String username = sc.nextLine().trim();

				System.out.println("Enter password :");
				String password = sc.nextLine().trim();

				if (adminservice.isAdminMatch(username, password)) {

					System.out.println("\n ====================================================\n");
					log.info("  Admin Verification Successful :             ");
					System.out.println("\n ====================================================\n");
					int choice2;
					do
					{	
					
					System.out.println("1 : Add State");
					System.out.println("2 : View all State :");
					System.out.println("3 : Add District :");
					System.out.println("4 : Display all District :");
					System.out.println("5 : Add City :");
					System.out.println("6 : View All Cities :");
					System.out.println("7 :  Add District Under State :");
					System.out.println("8 : Add City Under District :");
					System.out.println("9 : Add Crop Data of Farmer :");
					System.out.println("10 : View All Crops :");
					System.out.println("11 : To Add Bulk Crop Dataset ");
					System.out.println("12 : To Add Bulk OldData Set ");
					System.out.println("13 : Display all Old Data  of Three Years :");
					System.out.println("14 : Filter data ");
					
					System.out.println(" 15 :");
					
						// shubhamgborkar99@gmail.com
					
				
					System.out.println("Enter your choice :");
					choice2 = sc.nextInt();
					sc.nextLine();	
					
					switch (choice2) {
					case 1:
						boolean isStateAdd = stateService.isAddedNewState(statemodel);

						if (isStateAdd) {
							System.out.println("\n====================================================\n");
							log.info("State Added Succcessfully");
							System.out.println("\n====================================================\n");

						} else {
							log.info("State is not Added :");
						}

						break;

					case 2:

						stateService.allState();

						break;

					case 3:
						boolean isDistAdd = distService.isDistrictAdd(distmodel);
						if (isDistAdd) {
							System.out.println("\n====================================================\n");

							log.info("District Added Successfully :");
							System.out.println("\n====================================================\n");

						} else {
							log.info("Opps !!! Some Error Happens :");
						}
						break;

					case 4:

						distService.districtList();

						break;  
						
						

					case 5:

						boolean isCityAdded = cityService.isCityAdded(citymodel);
						if (isCityAdded) {
							System.out.println("\n====================================================\n");
							log.info("City Added Successfully ");
						}
						else 
						{
							log.info("Opps !!! Some Problem Occured :");
							System.out.println("\n====================================================\n");
						}

						break;

					case 6:

						cityService.cityList();
						break;
						
					case 7:
						sc.nextLine();
							System.out.println("Enter the StateName :");
							String stateName=sc.nextLine();
							System.out.println("Enter the District Name :");
							String distName = sc.nextLine();
							boolean isDistrictAddedUnderState= stateService.isDistrictUnderState(stateName, distName);
							if(isDistrictAddedUnderState)
							{
								log.info("District Successfully Added Under "+stateName);
								
							}
							else
							{
								log.info("Some Problem Occurs to Add Distict in the State : "+stateName);
							}							
						
						break;
						
					case 8:
						
						sc.nextLine();
						
						System.out.println("Enter the Distrct Name :");
						 distName=sc.nextLine();
						System.out.println("Enter the City Name :");
						String cityName = sc.nextLine();
						
						boolean result = distService.isCityAddedUnderDistrict(distName, cityName);
						if(result)
						{
							log.info("City Added under District :"+distName);
							
						}
						else
						{
							log.info("Oops !!! City Not able to Add Under the District : "+distName);
						}
						break;

					case 9:

						boolean isCropAdded = cropservice.isCropAdded(cropModel);
						if (isCropAdded) {
							log.info("Crop Added to the Database :");

						} else {
							log.info("Opps !!! Some problem occurs :");
						}

						break;

					case 10:

						cropservice.allCropList();

						break;
						
					case 11:
						
						
						System.out.println("Insert your file path");
							
						String excelFilePath =sc.nextLine();
						 
						 result = cropservice.isAddedBulkCropDataSet(excelFilePath);
						 if(result)
						 {
							 System.out.println("Bulk Data of Crop is Successfully Added to the Database : ");
						 }
						 else
						 {
							 System.out.println("Opps !!! Some problem found :");
						 }
						
						break;

					case 12:

						boolean is_Old_Data_Set_Added = olddataService.isOldDataSetAdded(olddataModel);

						if (is_Old_Data_Set_Added) 
						{
							log.info("Old Data Set is Successfully Added to your DataBase :");

						}
						else 
						{
							log.info(
									"Opps !!! Some problem is Occured While entering the data in OLD DATA SET table :");
						}

						break;

					case 13:

						olddataService.olddataset();
						break;
						
						
						
					case 14:
						
						
						System.out.println("1 : Filter Using CROP Name  : ");
						System.out.println("2 : Filter Using Season : ");
						System.out.println("3 : Filter Using Area : ");
						System.out.println("4 : Exit :");
						System.out.println("Enter Your choice :");
						int filterChoice= sc.nextInt();
						sc.nextLine();
						do
						{
							switch(filterChoice)
							{
							case 1 :
									
								System.out.println("Enter the CropName :");
								String cropName =sc.nextLine();
										
								List <CropModel> cropList = filterService.filterbyCropName(cropName);
								
								if(cropList!=null)
								{
									cropList.forEach((cName)->System.out.println("CropName :"+cName.getCropname()+"Crop Id :"+cName.getCropid()+"Crop Fertilizer :"+cName.getFertilizer()));
									cropList.clear();
								}
								
								break;
								
							}
						}while(filterChoice!=0);

					}
				
					}while(choice2!=0);
					
				}
				else 
				{
					log.info("Admin Not Found !!! Thank You ");
				}

				break;

			case 2:

				System.out.println("\n====================================================\n");

				System.out.println(" 1 : Customer LOGIN :");
				System.out.println(" 2 : Customer Already Registered :");
				System.out.println(" 3 : Registration of Customer :");
				System.out.println(" 4 : System Exit :");

				System.out.println("\n====================================================\n");

				System.out.println(" Enter Your Choice : ");
 
				choice = sc.nextInt(); 
				switch (choice) {
				case 1: 

					sc.nextLine();

					System.out.println("Do you have Previous Account : Yes or No");
					String message = sc.nextLine();
					if (message.equalsIgnoreCase("yes")) {
						System.out.println("Enter username :");
						username = sc.nextLine();

						System.out.println("Enter password :");
						password = sc.nextLine();

						if (customerService.isCustomerMatch(username, password)) {
							System.out.println("\n====================================================\n");

							System.out.println("Customer Verification Successful ");
							System.out.println("\n====================================================\n");

						} else {
							System.out.println("Opps !!! Customer Not Found : ");
						}
					} else {
						System.out.println("\n====================================================\n");

						System.out.println("Thank You Visting our App !!!! ");
						System.out.println("\n====================================================\n");

					}
					break;

				case 2:

					sc.nextLine();
					System.out.println("Enter Your Email :");
					String email = sc.nextLine();

					customerService.allLoginCustomer(email);

					break;

				case 3:

					boolean isCustomerLoign = customerService.isAddedCustomerLogin();
					if (isCustomerLoign) 
					{
						System.out.println("\n====================================================\n");

						log.info("Customer Registration is Successful :");
						System.out.println("\n====================================================\n");

					} else {
						System.out.println("\n====================================================\n");

						log.info("Opps !! Some problem Occurs :");

						System.out.println("\n====================================================\n");
		 			}
					 break;
				}
			}
		} while (choice != 0);
	}
}
