package com.automation.pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;
import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class Pricing extends PageBase{
	
	public UIAction action = new UIAction();
	
	public Pricing (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public Pricing() {
		super();
	}
	
	public Pricing validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickPricing");
		WebElement pricingText = driver.findElement(By.xpath("//h2[@id='a-plan-and-price-to-suit-you']"));
		String expected_title = "A plan and price to suit you";
		action.softAssert(pricingText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickPricing");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
