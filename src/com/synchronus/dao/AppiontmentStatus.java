package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppiontmentStatus {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql:///synchronus healthcare";
	private static String userName = "root";
	private static String password = "";
	private static String vaccineStatus = "";
	private static String selectStatement = "select VaccineStatus from vaccinedetails where Email=(?)"; 
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet ;
	
	public String checkAppointmentStatus(String userEmail) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url,userName,password);
			preparedStatement = connection.prepareStatement(selectStatement);
			preparedStatement.setString(1, userEmail);
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			vaccineStatus = resultSet.getString("VaccineStatus");
			System.out.println(vaccineStatus);
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vaccineStatus;
	}

}
