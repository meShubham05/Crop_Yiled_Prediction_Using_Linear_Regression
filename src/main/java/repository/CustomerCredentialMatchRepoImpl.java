package repository;

public class CustomerCredentialMatchRepoImpl  extends DBState implements CustomerCredentialRepository {

	public boolean isCustomerMatch(String custEmail ,String pass) {
		try
		{
			stmt=conn.prepareStatement(" select * from  customerLogin where ? = customerEmail and ? = password");
			stmt.setString(1, custEmail);
			stmt.setString(2, pass);
			
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

}
