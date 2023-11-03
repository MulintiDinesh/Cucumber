package com.CucumberParabank;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankStepDef {
	UtilityClassParabank registerData = new UtilityClassParabank();
	RegisterActionsParabank objRegister = new RegisterActionsParabank();
	
	
	@Given("User opens the parabank register page")
	public void user_opens_the_parabank_register_page() {
		HelperClassParabank.openPage(registerData.newurl);
	    System.out.println("login page");
	}

	@When("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
		objRegister.register(registerData.newFname, registerData.newLname,registerData.newaddress,registerData.newcity,registerData.newstate,registerData.newzipCode,registerData.newphoneNumber,registerData.newssn,registerData.newusername,registerData.newpassword,registerData.newcpassword);
		System.out.println("Valid Credentials entered");
	}

	@When("User clicks the register")
	public void user_clicks_the_register() {
		objRegister.clickRegister2();
		System.out.println("Register button");
	}

	@Then("User should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {
		Assert.assertTrue(objRegister.getWelcomePageText().contains("Your account was created successfully. You are now logged in."));
		System.out.println("sucessfull login");
	}
}
