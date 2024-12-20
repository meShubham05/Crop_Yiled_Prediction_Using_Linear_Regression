package services;

import java.util.List;

import model.CustomerLoginModel;

public interface CustomerLoginService {

	public boolean isCustomerMatch(String user ,String pass);
	
	public List<CustomerLoginModel> allLoginCustomer(String email);
	
	public boolean isAddedCustomerLogin() ;
}
