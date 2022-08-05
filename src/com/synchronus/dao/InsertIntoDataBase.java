package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.synchronus.service.RegistrationForm;

public class InsertIntoDataBase {
	private int rowCount = 0;
	
	private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///synchronus healthcare";
    private static String userName = "root";
    private static String password = "";
    private static String insetStatementString = "insert into usercredentials values(?,?,?,?,?,?,?,?,?)";
    private static String firstNameString = null;
    private static String lastNameString = null;
    private String contactString = null;
	private String emailString = null;
	private String DOB = null;
	private String genderString = null;
	private String addreString = null;
	private String passwordString = null;
	public int insertIntoDataBase(ArrayList<String> aList){
		
		firstNameString = aList.get(0);
		lastNameString = aList.get(1);
		DOB = aList.get(2);
		contactString = aList.get(3);
		emailString = aList.get(4);
		passwordString = aList.get(5);
		addreString = aList.get(6);
		genderString = aList.get(7);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url , userName , password);
			if (connection!=null) {
				System.out.println("Connection  created");
			} else {
				System.out.println("Connection not created");
			}
			
			preparedStatement = connection.prepareStatement(insetStatementString);
			preparedStatement.setString(1, null);
			preparedStatement.setString(2, firstNameString);
			preparedStatement.setString(3, lastNameString);
			preparedStatement.setString(4, DOB);
			preparedStatement.setString(5, contactString);
			preparedStatement.setString(6, emailString);
			preparedStatement.setString(7, passwordString);
			preparedStatement.setString(8, genderString);
			preparedStatement.setString(9, addreString);

			
			
			rowCount = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;
		
	}
}
