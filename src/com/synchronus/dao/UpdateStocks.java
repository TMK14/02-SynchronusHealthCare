package com.synchronus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStocks {
	private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///synchronus healthcare";
    private static String userName = "root";
    private static String password = "";
    private static String updateStatementString = "update vaccine_stocks set CoviShield=(?) , CoVaxin =(?) where ID=1";
//    int updateCheck;
    
    Connection connection = null;
	PreparedStatement preparedStatement = null;
	
	public void updateStocks(int coVishield , int coVaxin) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url , userName , password);
			if (connection!=null) {
				System.out.println("Connection  created");
			} else {
				System.out.println("Connection not created");
			}
			
			preparedStatement = connection.prepareStatement(updateStatementString);
			preparedStatement.setInt(1, coVishield);
			preparedStatement.setInt(2, coVaxin);
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e2) {
				 e2.printStackTrace();
			}
		}
		
		
	}
}
