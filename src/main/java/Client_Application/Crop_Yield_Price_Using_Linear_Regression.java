package Client_Application;

import model.StateModel;
import repository.StateRepository;
import repository.StateRepositoryImp;
import java.util.*;
public class Crop_Yield_Price_Using_Linear_Regression {
	
		
	public static void main(String[] args) {
		StateRepository staterepo = new StateRepositoryImp();
		StateModel statemodel = new StateModel();
			int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Welcome to the Crop Yield Prediction App ");
			System.out.println("1 : Add State");
			System.out.println("2 : View all State :");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:					
				break;
					
			}
		
		}while(choice!=0);
		
		
	}

}
