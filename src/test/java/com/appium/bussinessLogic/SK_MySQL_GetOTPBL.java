package com.appium.bussinessLogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.appium.commonutils.ExcelUtils;

public class SK_MySQL_GetOTPBL {
	
	String LoginDataSheet = "Login";

	
	public void getOTPfromDB() throws ClassNotFoundException, SQLException, IOException {
	
		
           Class.forName("com.mysql.jdbc.Driver");
			
		   System.out.println("MySQL Driver Loaded");
			
			Connection dbconnection=DriverManager.getConnection("jdbc:mysql://safety-kuvrr-red5pro.caybjakxkdgf.us-east-1.rds.amazonaws.com:3306/safety_kuvrr_red5pro","safetyred5pro","NS_KUVRR$12345");
			
			System.out.println("Connected to MySQL DB");
			
			Statement stmnt=dbconnection.createStatement();
			
			ResultSet rs=stmnt.executeQuery("SELECT otp FROM safety_kuvrr_red5pro.emc_userotp where user_id=455;");
			
			while(rs.next())
			
			{
				
				int otp=rs.getInt(1);
				System.out.println("OTP:"+ otp);
				ExcelUtils.WriteExcel(LoginDataSheet, 1, 3, otp+"" );
				
		}
			
			//Close DB Connection
			dbconnection.close();
			System.out.println("DataBase Connection closed");
	} 


}



