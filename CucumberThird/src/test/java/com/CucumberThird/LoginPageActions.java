package com.CucumberThird;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;
	String strUserName, strPassword;
	
	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	public void setUserName(String strUserName) {
		loginPageLocators.userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		loginPageLocators.passWord.sendKeys(strPassword);
	}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	public void login(String strUserName,String strPassword) {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
	}
}
