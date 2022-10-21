package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

/**
 * 
 * @author shakilahmed
 *
 */
public class Overview extends PageBase {

//	@FindBy(xpath = "//*[@xpath=\"1\"]")
//	@CacheLookup
//	public WebElement linkoverview;

	public UIAction action = new UIAction();

	public Overview(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
		PageFactory.initElements(driver, this);

	}

	public Overview() {
		super();

	}

	public Overview validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickOverviewTab");
		WebElement overviewText = driver.findElement(By.xpath("//h2[normalize-space()='Build better experiences']"));
		String expected_title = "Build better experiences";
//		System.out.println("this is the fail text=" + overviewText.getText()); (**take this line out, but this is on fail test**)
		action.softAssert(overviewText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickOverviewTab");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

}
