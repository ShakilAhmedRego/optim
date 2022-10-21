package com.automation.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class Blog extends PageBase{
public UIAction action = new UIAction();
	
	public Blog (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public Blog () {
		super();
	}
	
	public Blog validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickBlog");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,700)");
		WebElement blogText = driver.findElement(By.xpath("//section[@class='module module--search ow-wrapper ow-wrapper--yellow']//h2[@class='search-module__title module__title'][normalize-space()='What are you looking for?']"));
		String expected_title = "What are you looking for?";
		action.softAssert(blogText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickBlog");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}


	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}
