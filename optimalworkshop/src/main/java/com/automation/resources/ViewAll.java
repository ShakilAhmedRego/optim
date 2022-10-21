package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class ViewAll extends PageBase{
	
	public UIAction action = new UIAction();
	
	public ViewAll (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public ViewAll() {
		super();
	}
	
	public ViewAll validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickViewAll");
		WebElement viewallText = driver.findElement(By.xpath("//h1[normalize-space()='Learn HUB']"));
		String expected_title = "Learn HUB";
		action.softAssert(viewallText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickViewAll");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
