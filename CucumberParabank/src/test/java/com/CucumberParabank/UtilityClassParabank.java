package com.CucumberParabank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClassParabank {
	String newurl;
	String newFname;
	String newLname;
	String newaddress;
	String newcity;
	String newstate;
	String newzipCode;
	String newphoneNumber;
	String newssn;
	String newusername;
	String newpassword;
	String newcpassword;
	
	public UtilityClassParabank() {
		registerData();
	}
	public void registerData() {
		File file = new File("C:\\Users\\dmulinti\\eclipse-workspace\\CucumberParabank\\src\\test\\resources\\registerData.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		}catch(IOException e){
			e.printStackTrace();
		}
		newurl = prop.getProperty("url");
		newFname = prop.getProperty("fName");
		newLname = prop.getProperty("lName");
		newaddress = prop.getProperty("address");
		newcity = prop.getProperty("city");
		newstate = prop.getProperty("state");
		newzipCode = prop.getProperty("zipCode");
		newphoneNumber = prop.getProperty("phoneNumber");
		newssn = prop.getProperty("ssn");
		newusername = prop.getProperty("username");
		newpassword = prop.getProperty("password");
		newcpassword = prop.getProperty("cpassword");
	}
}
