package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class OnlineSurveys extends PageBase {

	public UIAction action = new UIAction();

	public OnlineSurveys(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;

	}

	public OnlineSurveys() {
		super();
	}

	public OnlineSurveys validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickOnlineSurveysTab");
		WebElement onlinesurveysText = driver
				.findElement(By.xpath("//h1[normalize-space()='Run surveys to get the answers you need']"));
		String expected_title = "Run surveys\n" + "to get the\n" + "answers you need";
		action.softAssert(onlinesurveysText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickOnlineSurveysTab");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}
}
