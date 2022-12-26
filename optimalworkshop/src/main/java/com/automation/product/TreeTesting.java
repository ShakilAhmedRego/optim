package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class TreeTesting extends PageBase {

	public UIAction action = new UIAction();

	public TreeTesting(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
		PageFactory.initElements(driver, this);

	}

	public TreeTesting() {
		super();
	}

	public TreeTesting validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickTreeTestingTab");
		WebElement treetestingText = driver
				.findElement(By.xpath("//h1[normalize-space()='Evaluate the findability of your content']"));
		String expected_title = "Evaluate the findability of your content";
				//"Evaluate the\\n\" + \"findability of your\\n\" + \"content";
		action.softAssert(treetestingText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickTreeTestingTab");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}
}
