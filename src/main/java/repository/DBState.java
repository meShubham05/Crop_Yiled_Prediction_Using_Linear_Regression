package repository;

import java.sql.*;
public class DBState extends DBConfig
{

		DBConfig config = DBConfig.getDBconfig();
		Connection conn= config.getConnection();
		PreparedStatement stmt = config.getStatement();
		ResultSet rs = config.getResultSet();
		
		public DBState()
		{
			
		}
		
}
