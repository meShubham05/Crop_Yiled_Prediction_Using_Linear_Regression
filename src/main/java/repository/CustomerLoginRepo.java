package repository;

import java.util.*;

import model.CustomerLoginModel;

public interface CustomerLoginRepo {

	public List<CustomerLoginModel> allLoginCustomer(String email);
	
	public boolean isAddedCustomerLogin ();
	
	
}
