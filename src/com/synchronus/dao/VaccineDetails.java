package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VaccineDetails {
	private ArrayList<String> aList = new ArrayList<String>();
	private ArrayList<String> arrayList = new ArrayList<String>();
	private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///synchronus healthcare";
    private static String userName = "root";
    private static String password = "";
    private static String email;
    private static char[] emailArray = new char[15];
    private Connection connection = null;
    private Statement statement = null;
    ResultSet reaResultSet = null;
    String aadharNumberString ,vaccineNameString , vaccineDateString , vaccineCenterString;
    
    public ArrayList<String> userDeatils (String email) throws ClassNotFoundException, SQLException , Exception{
    	this.email = email;
    	emailArray = email.toCharArray();
    	System.out.println(emailArray);
    	Class.forName(driverName);
    	connection = DriverManager.getConnection(url,userName,password);
    	statement = connection.createStatement();
    	reaResultSet = statement.executeQuery("select FirstName,DOB,Contact,Email,Gender,Address from usercredentials where Email="+"'"+VaccineDetails.email+"'");
    	
    	while(reaResultSet.next()) {
    	arrayList.add(reaResultSet.getString("FirstName"));
    	arrayList.add(reaResultSet.getString("DOB"));
    	arrayList.add(reaResultSet.getString("Contact"));
    	arrayList.add(reaResultSet.getString("Email"));
    	arrayList.add(reaResultSet.getString("Gender"));
    	arrayList.add(reaResultSet.getString("Address"));
    	
    	}
    	
    	try {
    		
			reaResultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
    	
		return arrayList;
    	
    }
    public ArrayList<String> vaccineDeatailsArrayList (String email) throws ClassNotFoundException, SQLException , Exception{
    	Class.forName(driverName);
    	connection = DriverManager.getConnection(url,userName,password);
    	statement = connection.createStatement();
    	reaResultSet = statement.executeQuery("select * from vaccinedetails where Email= '"+email+"'");
    	
    	while(reaResultSet.next()) {
    	aList.add(reaResultSet.getString("Aadhar_No"));
    	aList.add(reaResultSet.getString("Date"));
    	aList.add(reaResultSet.getString("Vaccine_Choice"));
    	aList.add(reaResultSet.getString("Vaccine_Center"));
    	aList.add(reaResultSet.getString("VaccineStatus"));
    	System.out.println(reaResultSet.getString("VaccineStatus"));
    	}
    	
    	try {
    		
			reaResultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
    	
		return aList;
    	
    }
}
