package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class CardSorting101 extends PageBase{
	
	public UIAction action = new UIAction();

	public CardSorting101(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;

	}

	public CardSorting101() {
		super();
	}

	public CardSorting101 validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickCardsorting101tab");
		WebElement cardsorting101Text = driver
				.findElement(By.xpath("//h1[normalize-space()='Card Sorting 101']"));
		String expected_title = "Card Sorting 101";
		action.softAssert(cardsorting101Text, expected_title);
		logger.info(methoExited + getClass().getName() + "clickCardsorting101tab");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

}
