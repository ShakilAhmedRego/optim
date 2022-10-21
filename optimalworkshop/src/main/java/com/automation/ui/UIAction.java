package com.automation.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.automation.base.PageBase;

public class UIAction extends PageBase {

	public void softAssert(WebElement element, String expectedText) {
		System.out.println("PULLED");
		WebElement elementVerify = element;
		String expected_title = expectedText;
		String actual_title = elementVerify.getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expected_title, actual_title);
		softAssert.assertAll();

	}

	public static void hardassertTrue(String pageName) {
		String getUrl = driver.getCurrentUrl().trim();
		String urlName = pageName;
		Assert.assertTrue(getUrl.contains(urlName));

	}

}
