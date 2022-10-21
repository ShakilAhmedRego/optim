package com.atomation.test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author shakilahmed
 *
 */



public class MiddleAges {

	
	WebDriver driver;
	@SuppressWarnings("unused")
	@Test
	public void middleAges() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.yahoo.com/");
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("QA");
		driver.findElement(By.xpath("//button[@id='ybar-search']")).click();
		
		Thread.sleep(8000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,750)");
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//body/div[@id='doc']/div[@id='bd']/div[@id='results']/div[@id='cols']/div[@id='left']/div[1]/div[1]/div[1]/div[1]/ol[1]/li[5]/div[1]/div[1]/h3[1]/a[1]")).click();
		
		Thread.sleep(8000);
		
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1100)");
		js.executeScript("window.scroll(0,1100)");

		
		Thread.sleep(8000);
		
		WebElement verifytext = driver.findElement(By.xpath("//*[@class='mw-page-title-main'],'Quality assurance')]"));
		String expeted_Title = "Quality assurance";
		String original_Title = verifytext.getText();
		Assert.assertEquals(expeted_Title, expeted_Title);
		
//		String expectedTitle = "Middle Ages";
//		String originalTitle = driver.getTitle();
//		 String getextString= driver.findElement(By.linkText("Middle Ages")).getText();
//	Assert
//		org.testng.Assert.assertEquals("Middle Ages", getextString);

		
	}
	@AfterTest
	public void closeFF() {
		driver.quit();
//		driver.close();
	}
}
