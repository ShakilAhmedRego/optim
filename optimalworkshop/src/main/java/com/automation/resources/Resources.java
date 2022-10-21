package com.automation.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;

public class Resources extends PageBase {
	
	// this is a constructor	
		
	public Resources (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
	public Resources () {
			super();
		}

}
