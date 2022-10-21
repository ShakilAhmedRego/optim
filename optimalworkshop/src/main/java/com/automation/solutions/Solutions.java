package com.automation.solutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;

public class Solutions extends PageBase {
	
	// this is a constructor
	
	public Solutions (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	public Solutions () {
		super();
	}

}
