package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class TreeTesting101 extends PageBase{
	
public UIAction action = new UIAction();
	
	public TreeTesting101 (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public TreeTesting101() {
		super();
	}
	
	public TreeTesting101 validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickTreetesting101Tab");
		WebElement treetesting101Text = driver.findElement(By.xpath("//h1[@id='our-guide-to-tree-testing']"));
		String expected_title = "Tree Testing 101";
		action.softAssert(treetesting101Text, expected_title);
		logger.info(methoExited + getClass().getName() + "clickTreetesting101Tab");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}


}
