package com.automation.base;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.automation.enterprise.Enterprise;
import com.automation.pricing.Pricing;
import com.automation.product.CardSorting;
import com.automation.product.FirstclickTesting;
import com.automation.product.OnlineSurveys;
import com.automation.product.Overview;
import com.automation.product.ParticipantRecruitment;
import com.automation.product.Product;
import com.automation.product.ProductDemos;
import com.automation.product.QualitativeResearch;
import com.automation.product.TreeTesting;
import com.automation.resources.Blog;
import com.automation.resources.CardSorting101;
import com.automation.resources.CaseStudies;
import com.automation.resources.FirstclickTesting101;
import com.automation.resources.HelpCenter;
import com.automation.resources.InformationArchitecture101;
import com.automation.resources.Resources;
import com.automation.resources.TreeTesting101;
import com.automation.resources.UsabilityTesting101;
import com.automation.resources.ViewAll;
import com.automation.solutions.InformationArchitecture;
import com.automation.solutions.Solutions;
import com.automation.solutions.UXDesign;
import com.automation.solutions.UserResearch;

/**
 * 
 * @author Shakil Ahmed
 * @param <Product>
 *
 */
public class PageBase extends LoadableComponent<PageBase> {

	public static WebDriver driver;
	public LoadableComponent<?> parent;
	protected String methAccssed = "Access ing Method";
	protected String methoExited = "Exiting method";
	protected List<String> errormessage = null;
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	public String methodAccessed = "Accessing Method";
	public String methodExited = "Exited Method";

//	@FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/a[1]\n")
//	@CacheLookup
//	public WebElement Product;
//	@FindBy(linkText = "Product")
//	@CacheLookup
//	public WebElement ProductTab;
//	@FindBy(id = "_36px_OW-primary-logo")
//	@CacheLookup
//	public WebElement Logo;
//
//	public PageBase() {
//		super();
//
//	}
//
//	public PageBase(final LoadableComponent<?> parent, WebDriver driver) {
////		this.driver = driver;
//		this.parent = parent;
//		// errorMessage = new ArrayList<>();
//		PageFactory.initElements(driver, this);
//
//	}

//	// _36px_OW-primary-logo
//	public PageBase verifyOptimalworkshopLogo() throws InterruptedException {
//		logger.info(methAccssed + getClass().getName() + "verifyOptimalworkshopLogo");
////		System.out.println("driver" + driver);
////		System.out.println("verify logo OptimalWorkshop");
//		Thread.sleep(200);
////		System.out.println("driver" + driver);
////		System.out.println("before going into isDisplay");
//
//		driver.findElement(By.linkText("optimalworkshop.com")).isDisplayed();
////		OptimalworkshopLogo.isDisplayed();
//		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).isDisplayed();
//		logger.info(methodExited + getClass().getName() + "verifyOptimalworkshopLogo");
//		return this;
//
//	}

// clickOptimalWorkshopLink
	// need to click on the button to go to that page
//	once you click on that page verify the title 
//	public PageBase clickOptimalWorkshopLink() {
//		Actions action = new Actions(driver);
//		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
//		action.moveToElement(we).build().perform();
//		WebElement clickOverviewtab = driver
//				.findElement(By.xpath("(//a[@class='menu-link sub-menu-link'][normalize-space()='Overview'])[1]"));
//		clickOverviewtab.click();
//		return this;
//
//	}

	public PageBase verifyLogin() {
		driver.findElement(By.xpath("//*[@xpath=\"1\"]")).isDisplayed();
		return this;

	}

	public PageBase verifySignup() {
		driver.findElement(By.xpath("//*[@xpath=\"1\"]")).isDisplayed();
		return this;

	}

	// I update this to return this because you have public PageBase and return
	// should be this

	// this is where click dropdowna and find subject .
	public Product clickProductDropDown() {
		logger.info(methAccssed + getClass().getName() + "clickProductDropDown");
		WebElement productTab = driver.findElement(By.xpath("(//a[normalize-space()='Product'])[1]"));
		Select dropdown = new Select(productTab);
		dropdown.selectByVisibleText("Product");
		logger.info(methodExited + getClass().getName() + "clickProductDropDown");
		return new Product();

	}

	// if return is class you need to have constructor
	public Overview clickOverviewTab() {
		logger.info(methAccssed + getClass().getName() + "clickOverviewTab");
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		action.moveToElement(we).build().perform();
		WebElement clickOverviewtab = driver
				.findElement(By.xpath("(//a[@class='menu-link sub-menu-link'][normalize-space()='Overview'])[1]"));
		clickOverviewtab.click();
		logger.info(methoExited + getClass().getName() + "clickOverviewTab");
		return new Overview();
	}

	public QualitativeResearch clickQualitativeRTab() {
		logger.info(methAccssed + getClass().getName() + "clickQualitativeRTab");
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		action.moveToElement(we).build().perform();
		WebElement clickQualitativeRTab = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1088']//a[@class='menu-link sub-menu-link'][normalize-space()='Qualitative research']"));
		clickQualitativeRTab.click();
		logger.info(methoExited + getClass().getName() + "clickQualitativeRTab");
		return new QualitativeResearch();
	}

	public CardSorting clickCardSortingTab() {
		logger.info(methAccssed + getClass().getName() + "clickCardSortingTab");
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		action.moveToElement(we).build().perform();
		WebElement clickCardSortingTab = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1085']//a[@class='menu-link sub-menu-link'][normalize-space()='Card sorting']"));
		clickCardSortingTab.click();
		logger.info(methoExited + getClass().getName() + "clickCardSortingTab");
		return new CardSorting();

	}

	public TreeTesting clickTreeTestingTab() {
		logger.info(methAccssed + getClass().getName() + "clickTreeTestingTab");
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		action.moveToElement(we).build().perform();
		WebElement clickTreeTestingTab = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1089']//a[@class='menu-link sub-menu-link'][normalize-space()='Tree testing']"));
		clickTreeTestingTab.click();
		logger.info(methoExited + getClass().getName() + "clickTreeTestingTab");
		return new TreeTesting();
	}

	public OnlineSurveys clickOnlineSurveysTab() {
		logger.info(methAccssed + getClass().getName() + "clickOnlineSurveysTab");
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		action.moveToElement(we).build().perform();
		WebElement clickOnlineSurverysTab = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1337']//a[@class='menu-link sub-menu-link'][normalize-space()='Online surveys']"));
		clickOnlineSurverysTab.click();
		logger.info(methoExited + getClass().getName() + "clickOnlineSurveysTab");
		return new OnlineSurveys();
	}

	public FirstclickTesting clickFirstclickTestingTab() {
		logger.info(methAccssed + getClass().getName() + "clickFirstclickTestingTab");
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		action.moveToElement(we).build().perform();
		WebElement clickFirstclickTestingTab = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1086']//a[@class='menu-link sub-menu-link'][normalize-space()='First-click testing']"));
		clickFirstclickTestingTab.click();
		logger.info(methoExited + getClass().getName() + "clickFirstclickTestingTab");
		return new FirstclickTesting();
	}

	public ParticipantRecruitment clickParticipantRecruitmentTab() {
		logger.info(methAccssed + getClass().getName() + "clickParticipantRecruitmentTab");
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		actions.moveToElement(we).build().perform();
		WebElement clickParticipantRecruitmentTab = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-100']//a[@class='menu-link sub-menu-link'][normalize-space()='Participant recruitment']"));
		clickParticipantRecruitmentTab.click();
		logger.info(methoExited + getClass().getName() + "clickParticipantRecruitmentTab");
		return new ParticipantRecruitment();
	}

	public ProductDemos clickProductDemos() {
		logger.info(methAccssed + getClass().getName() + "clickProductDemos");
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
		actions.moveToElement(we).build().perform();
		WebElement clickProductDemos = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1116']//a[@class='menu-link sub-menu-link'][normalize-space()='Product demos']"));
		clickProductDemos.isDisplayed();
		clickProductDemos.click();
		logger.info(methoExited + getClass().getName() + "clickProductDemos");
		return new ProductDemos();
	}

	// this is where click second dropdowna and find subject .
	public Solutions clickSolutionsDropdown() {
		logger.info(methAccssed + getClass().getName() + "clickSolutionsDropdown");
//		System.out.println("click Solutions dropdown");
		WebElement solutionsTab = driver.findElement(By.xpath("//a[normalize-space()='Solutions']"));
		Select dropdown = new Select(solutionsTab);
		dropdown.selectByVisibleText("Solutions");
		logger.info(methoExited + getClass().getName() + "clickSolutionsDropdown");
		return new Solutions();

	}

	public UserResearch clickUserResearch() {
		logger.info(methAccssed + getClass().getName() + "clickUserResearch");
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Solutions']"));
		actions.moveToElement(we).build().perform();
		WebElement clickUserResearch = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1094']//a[@class='menu-link sub-menu-link'][normalize-space()='User research']"));
		clickUserResearch.click();
		logger.info(methoExited + getClass().getName() + "clickUserResearch");
		return new UserResearch();

	}

	public UXDesign clickUXDesign() {
		logger.info(methAccssed + getClass().getName() + "clickUXDesign");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Solutions']"));
		actions.moveToElement(we).build().perform();
		WebElement clickUXDesign = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1906']//a[@class='menu-link sub-menu-link'][normalize-space()='UX design']"));
		clickUXDesign.click();
		logger.info(methoExited + getClass().getName() + "clickUXDesign");
		return new UXDesign();
	}

	public InformationArchitecture clickInformationA() {
		logger.info(methAccssed + getClass().getName() + "clickInformationA");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Solutions']"));
		actions.moveToElement(we).build().perform();
		WebElement clickInformationA = driver.findElement(By.xpath(
				"//li[@id='nav-menu-item-1093']//a[@class='menu-link sub-menu-link'][normalize-space()='Information architecture']"));
		clickInformationA.click();
		logger.info(methoExited + getClass().getName() + "clickInformationA");
		return new InformationArchitecture();

	}

	public Pricing clickPricing() {
		logger.info(methAccssed + getClass().getName() + "clickPricing");
		WebElement clickPricing = driver
				.findElement(By.xpath("//a[@class='menu-link main-menu-link'][normalize-space()='Pricing']"));
		clickPricing.click();
		logger.info(methoExited + getClass().getName() + "clickPricing");
		return new Pricing();
	}

	public Enterprise clickEnterprise() {
		logger.info(methAccssed + getClass().getName() + "clickEnterprise");
		WebElement clickEnterprise = driver
				.findElement(By.xpath("//a[normalize-space()='Enterprise']"));
		clickEnterprise.click();
		logger.info(methoExited + getClass().getName() + "clickEnterprise");
		return new Enterprise();
	}

//	this is where click dropdowna and find subject .
	public Resources clickResourcesDropdown() {
		logger.info(methAccssed + getClass().getName() + "clickResourcesDropdown");
//		System.out.println("click Resources dropdown");
		WebElement resourcesTab = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		Select dropdown = new Select(resourcesTab);
		dropdown.selectByVisibleText("Resources");
		logger.info(methoExited + getClass().getName() + "clickResourcesDropdown");
		return new Resources();

	}

	public TreeTesting101 clickTreetesting101Tab() {
		logger.info(methAccssed + getClass().getName() + "clickTreetesting101Tab");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		Actions actions1 = new Actions(driver);
		WebElement we1 = driver
				.findElement(By.xpath("//span[normalize-space()='Put methods into practice using our tools']"));
		actions1.moveToElement(we1).build().perform();
		WebElement clicktreetesting101 = driver.findElement(By.xpath("//a[normalize-space()='Tree testing 101']"));
		clicktreetesting101.click();
		logger.info(methoExited + getClass().getName() + "clickTreetesting101Tab");
		return new TreeTesting101();

	}

	public CardSorting101 clickCardsorting101tab() {
		logger.info(methAccssed + getClass().getName() + "clickCardsorting101tab");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		Actions actions1 = new Actions(driver);
		WebElement we1 = driver
				.findElement(By.xpath("//span[normalize-space()='Put methods into practice using our tools']"));
		actions1.moveToElement(we1).build().perform();
		WebElement clickCardsorting101tab = driver.findElement(By.xpath("//a[normalize-space()='Card sorting 101']"));
		clickCardsorting101tab.click();
		logger.info(methoExited + getClass().getName() + "clickCardsorting101tab");
		return new CardSorting101();
	}

	public FirstclickTesting101 clickFirstclickTesting101() {
		logger.info(methAccssed + getClass().getName() + "clickFirstclickTesting101");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		Actions actions1 = new Actions(driver);
		WebElement we1 = driver
				.findElement(By.xpath("//span[normalize-space()='Put methods into practice using our tools']"));
		actions1.moveToElement(we1).build().perform();
		WebElement clickFirstclickTesting101 = driver
				.findElement(By.xpath("//a[normalize-space()='First-click testing 101']"));
		clickFirstclickTesting101.click();
		logger.info(methoExited + getClass().getName() + "clickFirstclickTesting101");
		return new FirstclickTesting101();

	}
	public InformationArchitecture101 clickInformationArchitecture101() {
		logger.info(methAccssed + getClass().getName() + "clickInformationArchitecture101");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		Actions actions1 = new Actions(driver);
		WebElement we1 = driver
				.findElement(By.xpath("//span[normalize-space()='Put methods into practice using our tools']"));
		actions1.moveToElement(we1).build().perform();
		WebElement clickInformationArchitecture101 = driver
				.findElement(By.xpath("//a[normalize-space()='Information Architecture 101']"));
		clickInformationArchitecture101.click();
		logger.info(methoExited + getClass().getName() + "clickInformationArchitecture101");
		return new InformationArchitecture101();

	}

	public UsabilityTesting101 clickUsabilityTesting101() {
		logger.info(methAccssed + getClass().getName() + "clickUsabilityTesting101");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		Actions actions1 = new Actions(driver);
		WebElement we1 = driver
				.findElement(By.xpath("//span[normalize-space()='Put methods into practice using our tools']"));
		actions1.moveToElement(we1).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement clickUsabilityTesting101 = driver
				.findElement(By.xpath("//a[normalize-space()='Usability testing 101']"));
		clickUsabilityTesting101.click();
		logger.info(methoExited + getClass().getName() + "clickUsabilityTesting101");
		return new UsabilityTesting101();

	}

	public Blog clickBlog() {
		logger.info(methAccssed + getClass().getName() + "clickBlog");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		WebElement clickBlog = driver
				.findElement(By.xpath("//span[normalize-space()='Explore articles, news and product updates']"));
		clickBlog.click();
		logger.info(methoExited + getClass().getName() + "clickBlog");
		return new Blog();
	}

	public CaseStudies clickCaseStudies() {
		logger.info(methAccssed + getClass().getName() + "clickCaseStudies");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		WebElement clickCaseStudies = driver
				.findElement(By.xpath("//span[normalize-space()='See how our customers use our tools']"));
		clickCaseStudies.click();
		logger.info(methoExited + getClass().getName() + "clickCaseStudies");
		return new CaseStudies();
	}

	public HelpCenter clickHelpCenter() {
		logger.info(methAccssed + getClass().getName() + "clickHelpCenter");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		WebElement clickHelpCenter = driver
				.findElement(By.xpath("//span[normalize-space()='Find advice and support for our tools']"));
		clickHelpCenter.click();
		logger.info(methoExited + getClass().getName() + "clickHelpCenter");
		return new HelpCenter();
	}

	public ViewAll clickViewAll() {
		logger.info(methAccssed + getClass().getName() + "clickViewAll");
		Actions actions = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		actions.moveToElement(we).build().perform();
		WebElement clickViewAll = driver.findElement(By.xpath("//a[normalize-space()='View all']"));
		clickViewAll.click();
		logger.info(methoExited + getClass().getName() + "clickViewAll");
		return new ViewAll();
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}
	// public PageBase

}
