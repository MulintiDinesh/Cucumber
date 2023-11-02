package com.CucumberThird;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	UtilityClass data = new UtilityClass();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User opens HRM login page")
	public void user_opens_hrm_login_page() {
		HelperClass.openPage(data.url);
	    System.out.println("login page");
	}

	@When("User gives valid username and password")
	public void user_gives_valid_username_and_password() {
		objLogin.login(data.username, data.password);
		System.out.println("Username and password");
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		objLogin.clickLogin();
		System.out.println("login button");
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		System.out.println("sucessfull login");
	}

}
