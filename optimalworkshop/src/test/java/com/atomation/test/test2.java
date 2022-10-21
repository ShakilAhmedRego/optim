package com.atomation.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.automation.base.PageBase;
import com.automation.driverfactory.DriverFactory;

public class test2 extends PageBase {

	public PageBase basepage = new PageBase();
	private DriverFactory driverfactory = new DriverFactory();
//	@BeforeMethod
//	public void initiate() throws Exception {
//	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}

	@Test(priority = 1, enabled = true)
	public void chromeTest() throws Exception {
		System.out.println("we made to test");
//		driverfactory.createInstance("chrome");
		driverfactory.createInstance("chromeHTML");
		driverfactory.navigateToURL(methAccssed);
		driver.navigate().to("https://www.optimalworkshop.com");
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

	@Test(priority = 2, enabled = true)
	public void fftest() throws Exception {
		System.out.println("we made to test");
//		driverfactory.createInstance("firefox");
		driverfactory.createInstance("firefoxHTML");
		driverfactory.navigateToURL(methAccssed);
		driver.navigate().to("https://www.optimalworkshop.com");
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

	@Test(priority = 3, enabled = true)
	public void ieTest() throws Exception {
		System.out.println("we made to test");
//		driverfactory.createInstance("edge");
		driverfactory.createInstance("edgeHTML");
		driverfactory.navigateToURL(methAccssed);
		driver.navigate().to("https://www.optimalworkshop.com");
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

	@AfterMethod
	public void closing() {
//		takescreenshot();
		driver.close();
		driver.quit();

	}

	public void takescreenshot() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			FileUtils.copyFile(scrFile,
					new File("/Users/shakilahmed/Desktop/Selenium Project/optimalworkshop/screenshots/" + timestamp
							+ "testfailure.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("Capturing Screenshot for the Failed Test --" + result.getName());

	}

}
