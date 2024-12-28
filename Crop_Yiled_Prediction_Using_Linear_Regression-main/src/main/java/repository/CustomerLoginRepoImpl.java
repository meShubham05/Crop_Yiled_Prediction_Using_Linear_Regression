package repository;

import java.util.*;

import model.CustomerLoginModel;


public class CustomerLoginRepoImpl  extends DBState implements CustomerLoginRepo{

		Scanner sc = new Scanner(System.in);
	public List<CustomerLoginModel> allLoginCustomer( String email) {
		
		try
		{
			stmt=conn.prepareStatement("select * from customerlogin where customerEmail = ? ");
			stmt.setString(1, email);
			rs =stmt.executeQuery();
			
		//	 customerId | firstName | lastName | customerEmail  | password  | customerPhoneNumber | customerAddress | dateOfBirth | registrationDate
			
			 
			while(rs.next())
			{
				String firstName = rs.getString("firstName");
				String lastName  = rs.getString("lastName");
				String phoneNumber = rs.getString("customerPhoneNumber");
				String customerAddress = rs.getString("customerAddress");
				
				System.out.println("\n=================================================================================================================\n");
				System.out.println("Customer Name :"+firstName+" "+lastName+" PhoneNumber : "+phoneNumber+"  CustomerAddress : "+customerAddress);
				System.out.println("\n=================================================================================================================\n");
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return null;
		
	}

	public boolean isAddedCustomerLogin() {

		/*
		 * 
		 * mysql> select * from customerlogin;
+------------+-----------+----------+------------------------+-----------+---------------------+-----------------+-------------+---------------------+
| customerId | firstName | lastName | customerEmail          | password  | customerPhoneNumber | customerAddress | dateOfBirth | registrationDate    |
		 */
		
	
		    try {
		        // Collect customer details
		      
		        
		        System.out.print("Enter First Name: ");
		        String firstName = sc.nextLine();
		        
		        System.out.print("Enter Last Name: ");
		        String lastName = sc.nextLine();
		        
		        System.out.print("Enter Email: ");
		        String email = sc.nextLine();
		        
		        System.out.print("Enter Password: ");
		        String password = sc.nextLine();
		        
		        System.out.print("Enter Phone Number: ");
		        String phoneNumber = sc.nextLine();
		        
		        System.out.print("Enter Address: ");
		        String address = sc.nextLine();
		        
		        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
		        String dateOfBirth = sc.nextLine();
		      	
		        stmt = conn.prepareStatement( "INSERT INTO customerlogin (firstName, lastName, customerEmail, password, customerPhoneNumber, customerAddress, dateOfBirth) VALUES (?, ?, ?, ?, ?, ?, ?)");
		        
		  
		        stmt.setString(1, firstName);
		        stmt.setString(2, lastName);
		        stmt.setString(3, email);
		        stmt.setString(4, password);
		        stmt.setString(5, phoneNumber);
		        stmt.setString(6, address);
		        stmt.setString(7, dateOfBirth);
		       

		        // Execute the update
		        int rowsInserted = stmt.executeUpdate();
		        
		        if (rowsInserted > 0) {
		            System.out.println("Customer added successfully!");
		            return true;
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return false;
		}


}
