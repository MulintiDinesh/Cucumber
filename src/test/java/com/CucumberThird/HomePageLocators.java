package com.CucumberThird;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
	public WebElement homepagetext;
	
}
