package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class CardSorting extends PageBase {
	
		public UIAction action = new UIAction();
	
	
	public CardSorting (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
		PageFactory.initElements(driver, this);
		
	}
	
	public CardSorting () {
		super();
	}
	
	
	public CardSorting validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickCardSortingTab");
		WebElement cardsortingText= driver.findElement(By.xpath("//h1[@id='discover-how-people-categorize-information']"));
		String expected_title = "Discover how people categorize information";
		action.softAssert(cardsortingText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickCardSortingTab");
		return this;
	}
	
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
