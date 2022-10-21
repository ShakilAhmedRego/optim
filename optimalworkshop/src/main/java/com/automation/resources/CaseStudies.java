package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class CaseStudies extends PageBase {
public UIAction action = new UIAction();
	
	public CaseStudies (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public CaseStudies() {
		super();
	}
	
	public CaseStudies validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickCaseStudies");
		WebElement casestudiesText = driver.findElement(By.xpath("//h1[normalize-space()='Case studies']"));
		String expected_title = "Case studies";
		action.softAssert(casestudiesText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickCaseStudies");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
