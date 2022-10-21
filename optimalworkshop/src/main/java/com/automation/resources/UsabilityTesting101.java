package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class UsabilityTesting101 extends PageBase{
	
	public UIAction action = new UIAction();

	public UsabilityTesting101(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;

	}

	public UsabilityTesting101() {
		super();
	}

	public UsabilityTesting101 validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickUsabilityTesting101");
		WebElement usabilitytest101Text = driver
				.findElement(By.xpath("//h1[normalize-space()='Usability Testing 101']"));
		String expected_title = "Usability Testing 101";
		action.softAssert(usabilitytest101Text, expected_title);
		logger.info(methoExited + getClass().getName() + "clickUsabilityTesting101");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

}
