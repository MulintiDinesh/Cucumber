package com.cucumberreports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
	public WebElement homepagetext;
}
