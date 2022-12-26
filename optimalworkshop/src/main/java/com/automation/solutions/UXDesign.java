package com.automation.solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class UXDesign extends PageBase {

	public UIAction action = new UIAction();
	
	public UXDesign (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public UXDesign () {
		super();
	}
	
	public UXDesign validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickUXDesign");
		WebElement uxdesignText = driver.findElement(By.xpath("//h1[normalize-space()='Swift design evaluation, so you can ship faster']"));
		String expected_title = "Swift design evaluation, so you can ship faster";
//				"Swift design\\n\" + \"evaluation, so you\\n\" + \"can ship faster";
		action.softAssert(uxdesignText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickUXDesign");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}


