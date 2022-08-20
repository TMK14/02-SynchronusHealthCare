package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectStatement {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql:///synchronus healthcare";
	private static String userName = "root";
	private static String password = "";
	private static String vaccineName = null;
	private Connection connection = null;
	private Statement statement= null , statement2 = null;
	private ResultSet rSet = null;
	private int vaccineCount;
	private ArrayList<Integer> arrayList = new ArrayList<>();
	
	public ArrayList<Integer> checkAvalability() {
		
		
		
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			if (connection!=null) {
				System.out.println("Done");
			} else {
					System.out.println("fail");
			}
		    statement = connection.createStatement();
			
			rSet =statement.executeQuery("Select CoviShield , CoVaxin from vaccine_stocks");
			rSet.next();
			arrayList.add(rSet.getInt("CoviShield"));
			arrayList.add(rSet.getInt("CoVaxin"));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
		
	}
	
	public int checkAvalability(String vaccineName) {
		SelectStatement.vaccineName = vaccineName;
		
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			if (connection!=null) {
				System.out.println("Done");
			} else {
					System.out.println("fail");
			}
		    statement = connection.createStatement();
			
			rSet =statement.executeQuery("Select "+vaccineName+" from vaccine_stocks");
			rSet.next();
			vaccineCount =  rSet.getInt(vaccineName);
			System.out.println("Covaxin Stocks:"+vaccineCount);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vaccineCount;
		
	}
	public void updateStock() throws SQLException {
		 statement2 = connection.createStatement();
		 statement2.executeUpdate("update vaccine_stocks set "+vaccineName+" ="+vaccineName+"-1");
		
		
		
	}
}
