//package com.atomation.test;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class optimalworkspacetest1 {
//	
//	//protected WebDriver driver;
//	WebDriver driver;
//	
//	@BeforeTest
//	public void beforeTest() {
//		
//		WebDriverManager.chromiumdriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.optimalworkshop.com");
//		
//	}
//	
//	@AfterTest
//	private void afterTest() {
//		
//		driver.close();
//		driver.quit();
//	}
//	
//	@BeforeMethod
//	public void waitforElement() {
//		System.out.println("We are in @BeforeMethod ");
//	//	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//	}
//	
//	@Test
//	public void smokeTest() {
//		System.out.println("We are in @TestNow ");
//		try {
//			Thread.sleep(90);
//		//	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//			driver.findElement(By.name("Get started for free")).isDisplayed();
//			
//			System.out.print("able to verify");
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
