package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DemoTest {
	WebDriver driver;
	
	
	@Test
	public void f() {
		
		driver.get("http://www.toolsqa.com");
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/hrishikesh_pai/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
