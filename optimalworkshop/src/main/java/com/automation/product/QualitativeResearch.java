package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class QualitativeResearch extends PageBase {
	
	public UIAction action = new UIAction();
	
	public QualitativeResearch (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
		PageFactory.initElements(driver, this);
		
	}
	
	public QualitativeResearch () {
		super();
	}
	
	public QualitativeResearch validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickQualitativeRTab");
		WebElement qualitativeresearchText = driver.findElement(By.xpath
				("//h1[normalize-space()='One tool for all your insights and analysis']"));
		String expected_title = "One tool for all your insights and analysis";
		action.softAssert(qualitativeresearchText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickQualitativeRTab");
		return this;
		
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
