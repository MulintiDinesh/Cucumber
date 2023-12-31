package com.CucumberThird;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(name="username")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement passWord;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement login;
}
