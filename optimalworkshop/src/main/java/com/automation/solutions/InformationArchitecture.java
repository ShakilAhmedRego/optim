package com.automation.solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class InformationArchitecture extends PageBase{
public UIAction action = new UIAction();
	
	public InformationArchitecture (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public InformationArchitecture() {
		super();
	}
	
	public InformationArchitecture validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickInformationA");
		WebElement informationaText = driver.findElement(By.xpath("//h1[normalize-space()='Help people find the information they need']"));
		String expected_title = "Help people find the information they need";
		action.softAssert(informationaText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickInformationA");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}
