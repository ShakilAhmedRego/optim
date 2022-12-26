package com.automation.solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class UserResearch extends PageBase {
	
public UIAction action = new UIAction();
	
	public UserResearch (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}
	public UserResearch() {
		super();
	}
	
	public UserResearch validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickUserResearch");
		WebElement userresearchText = driver.findElement(By.xpath("//h1[normalize-space()='Understand how your users think quickly and easily']"));
		String expected_title = "Understand how your users think quickly and easily";
//				"Understand how\\n\" + \"your users think\\n\" + \"quickly and easily";
		action.softAssert(userresearchText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickUserResearch");
		return this;
	}
	protected void load() {
		// TODO Auto-generated method stub
		
	}
	
	
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
