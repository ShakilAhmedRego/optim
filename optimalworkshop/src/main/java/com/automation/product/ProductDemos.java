package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class ProductDemos extends PageBase {
	
	public UIAction action = new UIAction();
	
	public ProductDemos (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
		PageFactory.initElements(driver, this);
	}
	public ProductDemos() {
		super();
	}
	
	public ProductDemos validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickProductDemos");
		WebElement productdemoText = driver.findElement(By.xpath("//h1[normalize-space()='Experience our product demos']"));
		String expected_title = "Experience our product demos";
		action.softAssert(productdemoText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickProductDemos");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}
