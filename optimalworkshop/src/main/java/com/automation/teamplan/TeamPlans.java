package com.automation.teamplan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class TeamPlans extends PageBase {

	public UIAction action = new UIAction();

	public TeamPlans(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}

	public TeamPlans() {
		super();
	}

	public TeamPlans validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickTeamPLans");
		WebElement teamplansText = driver.findElement(By
				.xpath("//h1[@id='unlock-the-potential-of-your-research-team-with-our-suite-of-user-research-tools']"));
		String expected_title = "Unlock the potential of your research team with our suite of user research tools";
		action.softAssert(teamplansText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickTeamPLans");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

}
