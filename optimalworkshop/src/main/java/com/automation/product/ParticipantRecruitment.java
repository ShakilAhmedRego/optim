package com.automation.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.automation.base.PageBase;
import com.automation.ui.UIAction;

public class ParticipantRecruitment extends PageBase {

	public UIAction action = new UIAction();

	public ParticipantRecruitment(final LoadableComponent<?> parent, WebDriver driver) {
		PageBase.driver = driver;
		this.parent = parent;
	}

	public ParticipantRecruitment() {
		super();
	}

	public ParticipantRecruitment validateTitle() {
		logger.info(methAccssed + getClass().getName() + "clickParticipantRecruitmentTab");
		WebElement participantrecruitmentText = driver
				.findElement(By.xpath("//h2[@id='you-do-the-research-leave-the-participant-recruitment-to-us']"));
		String expected_title = "You do the research, leave the participant recruitment to us";
//		System.out.println("this is the fail text=" + participantrecruitmentText.getText());
		action.softAssert(participantrecruitmentText, expected_title);
		logger.info(methoExited + getClass().getName() + "clickParticipantRecruitmentTab");
		return this;
	}

	protected void load() {
		// TODO Auto-generated method stub

	}

	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}
}
