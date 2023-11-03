package com.CucumberParabank;

import org.openqa.selenium.support.PageFactory;

public class RegisterActionsParabank {
	
	RegisterLocatorsParabankPage registerLocators = null;
	String strfname, strlname, straddress, strcity, strstate, strzipcode, strphonenumber, strssn, strusername, strpassword, strcpassword, strwelcomePageText;
	
	public RegisterActionsParabank() {
		this.registerLocators = new RegisterLocatorsParabankPage();
		
		PageFactory.initElements(HelperClassParabank.getDriver(),registerLocators);
	}
//	public void clickRegister() {
//		registerLocators.register.click();
//	}
	public void setFirstName(String strfname) {
		registerLocators.fName.sendKeys(strfname);
	}
	public void setLastName(String strlname) {
		registerLocators.lName.sendKeys(strlname);
	}
	public void setAddress(String straddress) {
		registerLocators.address.sendKeys(straddress);
	}
	public void setCity(String strcity) {
		registerLocators.city.sendKeys(strcity);
	}
	public void setState(String strstate) {
		registerLocators.state.sendKeys(strstate);
	}
	public void setZipCode(String strzipcode) {
		registerLocators.zipCode.sendKeys(strzipcode);
	}
	public void setPhoneNumber(String strphonenumber) {
		registerLocators.phoneNumber.sendKeys(strphonenumber);
	}
	public void setSsn(String strssn) {
		registerLocators.ssn.sendKeys(strssn);
	}
	public void setUsername(String strusername) {
		registerLocators.username.sendKeys(strusername);
	}
	public void setPassword(String strpassword) {
		registerLocators.password.sendKeys(strpassword);
	}
	public void setCpassword(String strcpassword) {
		registerLocators.cpassword.sendKeys(strcpassword);
	}
	public void clickRegister2() {
		registerLocators.register2.click();
	}
	public String getWelcomePageText() {
		return registerLocators.welcomePageText.getText();
	}
	public void register(String strfname,String strlname,String straddress,String strcity,String strstate,String strzipcode,String strphonenumber,String strssn,String strusername,String strpassword,String strcpassword) {
		this.setFirstName(strfname);
		this.setLastName(strlname);
		this.setAddress(straddress);
		this.setCity(strcity);
		this.setState(strstate);
		this.setZipCode(strzipcode);
		this.setPhoneNumber(strphonenumber);
		this.setSsn(strssn);
		this.setUsername(strusername);
		this.setPassword(strpassword);
		this.setCpassword(strcpassword);
	}
}
