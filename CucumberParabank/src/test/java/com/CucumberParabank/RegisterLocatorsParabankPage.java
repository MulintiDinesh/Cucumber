package com.CucumberParabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocatorsParabankPage {
	
//	@FindBy(xpath="//a[text()='Register']")
//	public WebElement register;
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	public WebElement fName;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	public WebElement lName;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public WebElement zipCode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	public WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='customer.ssn']")
	public WebElement ssn;
	
	@FindBy(xpath="//input[@id='customer.username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='customer.password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	public WebElement cpassword;
	
	@FindBy(xpath="//input[@value='Register']")
	public WebElement register2;
	
	@FindBy(xpath="//p[text()='Your account was created successfully. You are now logged in.']")
	public WebElement welcomePageText;
}
