package com.atomation.test;

import java.time.Duration;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.base.PageBase;

public class TestNgTest extends PageBase {
	
public PageBase basepage;
	
	
	@BeforeTest
	public void beforeTest() {
//		WebDriverManager.safaridriver().setup();
		SafariDriver driver = new SafariDriver();
//		driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (15));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
		driver.navigate().to("https://www.optimalworkshop.com");
		
	}
	
	@AfterTest
	private void afterTest() {
		
		
		driver.close();
		driver.quit();

	}
	
	@BeforeMethod
	public void waitForElement() {
		System.out.println("We are in @BeforeMethod ");
		driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
		
	}
	@Test
	public void smokeTest() throws InternalError, InterruptedException{
		System.out.println("We are in @TestNow ");
	basepage = new PageBase();
//		basepage.VerifyLogo().clickOverviewTab();
		
	
		
	}

}
