package com.automation.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;

public class Product extends PageBase { 
	
// this is a constructor
	
	public Product (final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
//		this.driver = parent;
		PageFactory.initElements(driver, this);
	}
	
	public Product () {
		super();
	}
	
	

	

}
