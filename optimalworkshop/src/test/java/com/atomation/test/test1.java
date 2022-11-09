package com.atomation.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.PageBase;
import com.automation.driverfactory.DriverFactory;

public class test1 extends PageBase {

	public PageBase basepage = new PageBase();
	private DriverFactory driverfactory = new DriverFactory();

	@BeforeMethod
	public void initiate() throws Exception {

//		driverfactory.createInstance("chrome");
//		driverfactory.createInstance("chromeHTML");

//		driverfactory.createInstance("firefox");
		driverfactory.createInstance("firefoxHTML");

//		driverfactory.createInstance("edge");
//		driverfactory.createInstance("edgeHTML");

		driver.navigate().to("https://www.optimalworkshop.com");
	}

	@AfterTest
	public void closing() {
//		driver.close();
		driver.quit();
	}

	@Test
	public void Test1() {
//		driverfactory.navigateToURL(methAccssed);
		System.out.println("we made to test");
		basepage.clickOverviewTab().validateTitle().clickQualitativeRTab().validateTitle().clickCardSortingTab()
				.validateTitle().clickTreeTestingTab().validateTitle().clickOnlineSurveysTab().validateTitle()
				.clickFirstclickTestingTab().validateTitle().clickParticipantRecruitmentTab().validateTitle()
				.clickProductDemos().validateTitle().clickUserResearch().validateTitle().clickUXDesign().validateTitle()
				.clickInformationA().validateTitle().clickPricing().validateTitle().clickTeamPLans().validateTitle()
				.clickTreetesting101Tab().validateTitle().clickCardsorting101tab().validateTitle()
				.clickFirstclickTesting101().validateTitle().clickUsabilityTesting101().validateTitle().clickBlog()
				.validateTitle().clickCaseStudies().validateTitle().clickViewAll().validateTitle().clickHelpCenter()
				.validateTitle();

	}

}
