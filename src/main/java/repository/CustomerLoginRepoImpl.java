package repository;

import java.util.List;

import model.CustomerLoginModel;

public class CustomerLoginRepoImpl  extends DBState implements CustomerLoginRepo{

	@Override
	public List<CustomerLoginModel> allLoginCustomer( String email) {
		
		try
		{
			stmt=conn.prepareStatement("select * from customerlogin where customerEmail = '?' ");
			stmt.setString(1, email);
			rs =stmt.executeQuery();
			
		//	 customerId | firstName | lastName | customerEmail  | password  | customerPhoneNumber | customerAddress | dateOfBirth | registrationDate
			String firstName = rs.getString("firstName");
			String lastName  = rs.getString("lastName");
			String phoneNumber = rs.getString("customerPhoneNumber");
			String customerAddress = rs.getString("customerAddress");
			 
			while(rs.next())
			{
				System.out.println("Customer Name :"+firstName+" "+lastName+" PhoneNumber : "+phoneNumber+"  CustomerAddress : "+customerAddress);
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
