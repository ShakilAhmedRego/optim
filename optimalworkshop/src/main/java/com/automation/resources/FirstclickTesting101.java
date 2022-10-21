package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class FirstclickTesting101 extends PageBase{
	
	public UIAction action = new UIAction();

	public FirstclickTesting101(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;

	}

	public FirstclickTesting101() {
		super();
	}

	public FirstclickTesting101 validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickFirstclickTesting101");
		WebElement firstclicktesting101Text = driver
				.findElement(By.xpath("//h1[normalize-space()='First-click Testing 101']"));
		String expected_title = "First-click Testing 101";
		action.softAssert(firstclicktesting101Text, expected_title);
		logger.info(methoExited + getClass().getName() + "clickFirstclickTesting101");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

}
