package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class InformationArchitecture101 extends PageBase{
	
	
	public UIAction action = new UIAction();

	public InformationArchitecture101(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;

	}

	public InformationArchitecture101() {
		super();
	}

	public InformationArchitecture101 validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickInformationArchitecture101");
		WebElement informationarchitecture101Text = driver
				.findElement(By.xpath("//h1[normalize-space()='Learn about information architecture']"));
		String expected_title = "Learn about information architecture";
		action.softAssert(informationarchitecture101Text, expected_title);
		logger.info(methoExited + getClass().getName() + "clickInformationArchitecture101");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

}
