package services;

import java.util.List;

import model.CustomerLoginModel;
import repository.CustomerCredentialMatchRepoImpl;
import repository.CustomerCredentialRepository;
import repository.CustomerLoginRepo;
import repository.CustomerLoginRepoImpl;

public class CustomerLoginServiceImpl implements CustomerLoginService{

	CustomerCredentialRepository customerLoginRepo=new CustomerCredentialMatchRepoImpl();
	
	CustomerLoginRepo custologinRepo=  new  CustomerLoginRepoImpl();
	
	public boolean isCustomerMatch(String user, String pass) {
		// TODO Auto-generated method stub
		return customerLoginRepo.isCustomerMatch(user, pass);
	}

	
	public List<CustomerLoginModel> allLoginCustomer(String email) {
	
		return custologinRepo.allLoginCustomer(email);
	}

}
