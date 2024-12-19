package repository;

import java.sql.*;
public class DBState
{

		DBConfig config = DBConfig.getDBconfig();
		protected Connection conn= config.getConnection();
		protected PreparedStatement stmt = config.getStatement();
		protected ResultSet rs = config.getResultSet();
		
		
		
		
}
