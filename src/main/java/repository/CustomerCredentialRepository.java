package repository;

public interface CustomerCredentialRepository {

	public boolean isCustomerMatch(String custEmail,String pass);
	
}
