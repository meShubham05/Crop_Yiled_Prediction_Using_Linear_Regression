package repository;

public class AdminCredentialMatchRepositoryImpl  extends DBState  implements AdminCredentialRepository{

	public boolean isAdminMatch(String user,String pass) {
	
		try
		{
			
			stmt =conn.prepareStatement("select * from admin where username=? and password=?");
			
			stmt.setString(1,user);
			stmt.setString(2,pass);
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
