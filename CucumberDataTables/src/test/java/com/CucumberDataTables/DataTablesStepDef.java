package com.CucumberDataTables;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTablesStepDef {
	WebDriver driver;
	@Before
	public void browserlaunch() {
		System.out.println("------------------------Before Execution----------------------------------");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
	}
	@Given("User is on HRM Login webpage")
	public void user_is_on_hrm_login_webpage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
 
	@When("User provides credentials")
	public void user_provides_credentials(DataTable dataTable)throws InterruptedException {
		System.out.println("Credentials Entered");
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> form : signUpForm) {
			String userName = form.get("Username");
//			String userName = signUpForm.get(0).get("Username");
			System.out.println("Username: "+ userName);
			driver.findElement(By.name("username")).sendKeys(userName);
			String passWord = form.get("Password");
//			String passWord = signUpForm.get(0).get("Password");
			System.out.println("Password");
			driver.findElement(By.name("password")).sendKeys(passWord);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		}
	}
 
	@Then("User should be able to login successfully and see homepage")
	public void user_should_be_able_to_login_successfully_and_see_homepage() {
		String nextPageText = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//child::h6")).getText();
	    System.out.println("nextPageText: "+nextPageText);
	    Assert.assertTrue(nextPageText.equals("Dashboard"));
	}
 
	@Then("User should be able to see unsuccessfull with error message")
	public void user_should_be_able_to_see_unsuccessfull_with_error_message() {
	    String expectedError = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	    Assert.assertTrue(expectedError.contains("Invalid credentials"));
	    System.out.println("Expected Error Message:"+ expectedError);
	}
}
