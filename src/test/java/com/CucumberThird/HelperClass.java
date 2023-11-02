package com.CucumberThird;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelperClass {
	private static HelperClass helperClass;
	
	private static WebDriver driver;
	public final static int TIMEOUT = 10;
	
	HelperClass() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperClass == null) {
			helperClass = new HelperClass();
		}
	}
	public static void teardown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		helperClass = null;
	}
}
