package model;

public class AdminMaster {

	/*
	
	mysql> desc admin;
	+-----------+--------------+------+-----+-------------------+-------------------+
	| Field     | Type         | Null | Key | Default           | Extra             |
	+-----------+--------------+------+-----+-------------------+-------------------+
	| adminId   | int          | NO   | PRI | NULL              | auto_increment    |
	| username  | varchar(100) | NO   | UNI | NULL              |                   |
	| password  | varchar(255) | NO   |     | NULL              |                   |
	| createdAt | timestamp    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
	+-----------+--------------+------+-----+-------------------+-------------------+
	*/
	
	private int adminId;
	private String username;
	private String password;
	
	
	public AdminMaster() 
	{
	
	}
	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
		
}
