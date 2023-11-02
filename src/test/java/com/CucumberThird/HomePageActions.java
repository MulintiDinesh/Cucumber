package com.CucumberThird;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
	HomePageLocators homePageLocators = null;

	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
	}
	public String getVerifyText() {
		return homePageLocators.homepagetext.getText();
	}
}
