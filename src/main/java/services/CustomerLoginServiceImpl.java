package services;

import repository.CustomerCredentialMatchRepoImpl;
import repository.CustomerCredentialRepository;

public class CustomerLoginServiceImpl implements CustomerLoginService{

	CustomerCredentialRepository customerLoginRepo=new CustomerCredentialMatchRepoImpl();
	
	public boolean isCustomerMatch(String user, String pass) {
		// TODO Auto-generated method stub
		return customerLoginRepo.isCustomerMatch(user, pass);
	}

}
