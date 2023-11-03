package com.CucumberParabank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelperClassParabank {
	private static HelperClassParabank helperClass;
	
	private static WebDriver driver;
	public final static int TIMEOUT=10;
	
	HelperClassParabank(){
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
			helperClass = new HelperClassParabank();
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
