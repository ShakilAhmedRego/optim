package com.automation.driverfactory;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.automation.base.PageBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory extends PageBase { 
	

	

	public void createInstance (final String browserType) throws Exception {
		
		if (browserType.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}
		else if (browserType.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		
		else if (browserType.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
		}
		else if (browserType.equalsIgnoreCase("chromeHTML")) {
			ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		}
		else if (browserType.equalsIgnoreCase("firefoxHTML")) {
			FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--headless");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(opt);
		}
		else if (browserType.equalsIgnoreCase("edgeHTML")) {
			EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--headless");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(opt);
		}
		
		else {
			
			throw new Exception("Invalid Browser Type"+ browserType);
			
		}
		
	}
	

	public void navigateToURL (String url) {

		System.out.println("Cookies");
		driver.manage().deleteAllCookies();
		System.out.println("maxirint");
		driver.manage().window().maximize();
	}
	
	public void tmImplicitlyWait (String url) {
		
		System.out.println("holla");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("dolla");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void closing() {
		System.out.println("SHH");
		driver.quit();
		driver.close();
		
	}

	
		
	

}



