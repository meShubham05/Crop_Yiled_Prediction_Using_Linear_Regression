package repository;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class DBConfig {

    protected static DBConfig config;
    public static Connection conn;
    public static PreparedStatement stmt;
    public static ResultSet rs;

    private DBConfig() {

    	try {
            File file = new File(".");
            String path = file.getAbsolutePath();
            FileInputStream inputstream = new FileInputStream(path + "\\src\\main\\resources\\application.properties");

            Properties p = new Properties();
            p.load(inputstream);

            String driver = p.getProperty("driver");
            String username = p.getProperty("username");
            String password = p.getProperty("password");
            String url = p.getProperty("url");

        
            System.out.println("The Driver Name is :" + driver);
            System.out.println("The username is : " + username);
            System.out.println("The Password is :" + password);

            
            Class.forName("com.mysql.cj.jdbc.Driver");

      
            try {
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            if (conn != null) {
                System.out.println("The connection is Successful");
            } else {
                System.out.println("Connection failed !!");
            }

            if (config == null) {
                config = new DBConfig();
            }
    	}catch(Exception e)
    	{
    			e.printStackTrace();
    	}
    	        
    }

    public static DBConfig getDBconfig() {
        return config;
    }

    public static Connection getConnection() {
        return conn;
    }

    public static PreparedStatement getStatement() {
        return stmt;
    }

    public static ResultSet getResultSet() {
        return rs;
    }

    public static void main(String[] args) {
        
    }
}
