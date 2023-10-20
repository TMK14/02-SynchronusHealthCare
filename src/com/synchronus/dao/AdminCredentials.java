package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminCredentials {

	private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///synchronus healthcare";
    private static String userName = "root";
    private static String password = "";
    private static String adminName;
    private Connection connection = null;
    private PreparedStatement statement = null;
    ResultSet reaResultSet = null;
    String userNametempString , passwordtempString;
    Boolean boolean1;
    private static String selectString = "select userID,Password from admincredentials where userID= (?)";
    
    public boolean selectUserCredentials(String userNameLogin , String pwd) {
    	try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url , userName , password);
			statement = connection.prepareStatement(selectString);
			statement.setString(1, userNameLogin);
			reaResultSet = statement.executeQuery();
			reaResultSet.next();
			this.userNametempString = reaResultSet.getString(1);
			passwordtempString = reaResultSet.getString(2);
			System.out.println(passwordtempString);
			System.out.println(pwd);
			
			if (passwordtempString.equals(pwd)) {
				boolean1 = true;
			} else {
				boolean1 = false;
			}
			
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return boolean1;
    }

}
