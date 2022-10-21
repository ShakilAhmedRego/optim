package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class HelpCenter extends PageBase{
	public UIAction action = new UIAction();
	
	public HelpCenter (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public HelpCenter() {
		super();
	}
	
	public HelpCenter validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickHelpCenter");
		WebElement helpcenterText = driver.findElement(By.xpath("//h1[normalize-space()='Find help and support from our team']"));
		String expected_title = "Find help and support from our team";
		action.softAssert(helpcenterText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickHelpCenter");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
