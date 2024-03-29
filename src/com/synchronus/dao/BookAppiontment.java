package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookAppiontment {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql:///synchronus healthcare";
	private static String userName = "root";
	private static String password = "";
	private static String insetStatementString = "insert into vaccinedetails (`Email`,`Aadhar_No`, `Date`, `Vaccine_Choice`, `Vaccine_Center` , `VaccineStatus`) values(?,?,?,?,?,?)";
	private int rowCount = 0;
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	
	public boolean getConnection() throws ClassNotFoundException, SQLException,Exception {
		Class.forName(driverName);
		connection = DriverManager.getConnection(url,userName,password);
		if (connection!=null) {
			System.out.println("Connection established");
			return true;
		}else {
			System.out.println("failed!!!");
			return false;
		}
		
		
	}
	public int insertIntoDataBase(ArrayList<String> al) throws SQLException ,Exception{
		preparedStatement = connection.prepareStatement(insetStatementString);
		preparedStatement.setString(1, al.get(0));
		preparedStatement.setString(2, al.get(1));
		preparedStatement.setString(3, al.get(2));
		preparedStatement.setString(4, al.get(3));
		preparedStatement.setString(5, al.get(4));
		preparedStatement.setString(6, al.get(5));
		
		
		rowCount =  preparedStatement.executeUpdate();
		
		try {
			preparedStatement.close();
			
		} catch (SQLException e) {
			 e.printStackTrace();
		}try {
			connection.close();
		} catch (SQLException e) {
			 e.printStackTrace();
		}
		
		
		return rowCount;
		
	}

}
