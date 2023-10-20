package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppointmentDeatails {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql:///synchronus healthcare";
	private static String userName = "root";
	private static String password = "";
	private static String selectQuery = "select * from vaccinedetails";
	private static String selectQueryVaccineStatus = "select * from vaccinedetails where Email";
	private static String updateQuery = "update vaccinedetails set Email=(?) , Aadhar_No=(?) , VaccineStatus=(?)";
	private Connection connection = null;
	private Statement statement= null ;
	private PreparedStatement preparedStatement = null ;
	Statement statement2 = null;
	private ResultSet rSet = null , resultSet = null;
	
	public ResultSet appiontmentDetails() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			if (connection!=null) {
				System.out.println("Done");
			} else {
					System.out.println("fail");
			}
		    statement = connection.createStatement();
			
			rSet =statement.executeQuery(selectQuery);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			finally {
//			try {
//				rSet.close();
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}try {
//				statement.close();
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}try {
//				connection.close();
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}
//		}
		return rSet;
	}
	
	
	public int updateAppiontmentDeatils(String emailString , String aadharString , String vaccineStatusString) {
		
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			if (connection!=null) {
				System.out.println("Done");
			} else {
					System.out.println("fail");
			}
		    preparedStatement = connection.prepareStatement(updateQuery);
		    preparedStatement.setString(1, emailString);
		    preparedStatement.setString(2, aadharString);
		    preparedStatement.setString(3, vaccineStatusString);
		    
		    preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
}
