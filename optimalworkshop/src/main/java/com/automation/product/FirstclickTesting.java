package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class FirstclickTesting  extends PageBase{
	
	public UIAction action = new UIAction();
	
	public FirstclickTesting (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
		PageFactory.initElements(driver, this);
	}
	
	public FirstclickTesting () {
		super();
	}
	
	public FirstclickTesting validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickFirstclickTestingTab");
		WebElement firstclicktestingText = driver.findElement(By.xpath("//h1[normalize-space()='Make sure the first click is the right click']"));
		String expected_title = "Make sure the first click is the right click";
		action.softAssert(firstclicktestingText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickFirstclickTestingTab");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}
