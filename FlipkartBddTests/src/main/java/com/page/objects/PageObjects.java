package com.page.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Utility;

public class PageObjects extends Utility {

	public static WebDriver driver;
	public static String productName;

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	public static WebElement SignIn;
	@FindBy(id= "ap_email" )
	public static WebElement emph;
	@FindBy(id= "ap_password" )
	public static WebElement pass;
	@FindBy(id = "continue")
	public static WebElement cont;
	@FindBy(id = "signInSubmit")
	public static WebElement logsub;
	@FindBy(id = "twotabsearchtextbox")
	public static WebElement search1;
	@FindBy(id = "nav-search-submit-button")
	public static WebElement searchsub;
	@FindBy(xpath="//span[text()='(Renewed) Redmi Note 5 Pro (Gold, 4GB RAM, 64GB Storage)']")
	public static WebElement iphnsearch;
	@FindBy(xpath="//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]")
	public static WebElement hpsearch;
	@FindBy(id = "add-to-cart-button")
	public static WebElement addcart;
	@FindBy(id = "buy-now-button")
	public static WebElement buynow;
	@FindBy(id = "attach-sidesheet-view-cart-button")
	public static WebElement viewcart1;
	@FindBy(id = "sc-subtotal-label-buybox")
	public static WebElement subtotal;
	@FindBy(xpath="//*[@class=\"a-size-small sc-action-delete\"]")
	public static WebElement delete1;
	@FindBy(xpath="//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")
	public static WebElement cartdel;
	@FindBy(xpath="//*[@id=\"buy-now-button\"]")
	public static WebElement proceedbuy;
	@FindBy(xpath="//*[@id=\"shipToThisAddressButton\"]/span")
	public static WebElement useaddress;
	@FindBy(id="nav-hamburger-menu")
	public static WebElement allnav;
	@FindBy(xpath="//a[@class='hmenu-item hmenu-compressed-btn']")
	public static WebElement seeall;
	@FindBy(linkText="Books")
	public static WebElement books1;
	@FindBy(linkText="Exam Central")
	public static WebElement exambk;
	@FindBy(linkText="Customer Service")
	public static WebElement CS1;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div[5]/div/div[1]/div[3]/div[2]/a/div/div/div/div[2]/h3")
	public static WebElement DSDS;
	@FindBy(xpath="//*[@id=\"devicepickeroptions\"]/a[2]/div")
	public static WebElement KD1;
	
	
	@FindBy(id = "single-trip")
	public static WebElement singleTripBtn;
	@FindBy(id = "annual")
	public static WebElement annualTripBtn;
	@FindBy(id = "input-start")
	public static WebElement journeyStartDateField;
	@FindBy(id = "input-end")
	public static WebElement journeyEndDateField;
	@FindBy(xpath = "(//td[@class='rdtDay rdtToday'])[1]")
	public static WebElement currentDayLabel;
	@FindBy(xpath = "((//td[@class='rdtDay rdtActive rdtToday'])[2]/following-sibling::td)[1]")
	public static WebElement futureDayLabel;

	@FindBy(id = "numberOfMainInsuredAdult")
	public static WebElement adultDropdown;
	@FindBy(xpath = "(//div[@id='numberOfMainInsuredAdult']//div[@class='Select-value']//span)[2]")
	public static WebElement AdultCount;

	@FindBy(id = "numberOfMainInsuredChild")
	public static WebElement childWithParentDropdown;
	@FindBy(xpath = "(//div[@id='numberOfMainInsuredChild']//div[@class='Select-value']//span)[2]")
	public static WebElement childCountWithPArent;

	@FindBy(id = "numberOfRelatives")
	public static WebElement childWihtoutParentDropdown;
	@FindBy(xpath = "(//div[@id='numberOfRelatives']//div[@class='Select-value']//span)[2]")
	public static WebElement childCountWithoutPArent;

	@FindBy(xpath = "//button[.='GET A QUOTE']")
	public static WebElement getQuoteBtn;

	@FindBy(xpath = "//h4[.='Annual Cover Coverage']")
	public static WebElement annualCoverageLabel;

	@FindBy(id = "planName-dynamic-0")
	public static WebElement budgetPlanLabel;
	@FindBy(id = "planName-dynamic-1")
	public static WebElement EconomyPlanLabel;
	@FindBy(id = "planName-dynamic-2")
	public static WebElement SuperiorPlanLabel;




	@FindBy(xpath = "//p[.='Sign In/Sign Up']")
	public static WebElement LMSignInSignUpLink;

	@FindBy(id = "email")
	public static WebElement LMUserNameField;

	@FindBy(id = "password")
	public static WebElement LMPasswordField;

	@FindBy(xpath = "//input[@value='Log In']")
	public static WebElement LMLoginButton;

	@FindBy(xpath = "//input[@value='Register']")
	public static WebElement LMRegisterButton;

	@FindBy(xpath = "//p[.='LOGOUT']")
	public static WebElement LMLogoutLink;

	@FindBy(xpath = "(//div[@class='products'])[1]")
	public static WebElement LMDashboardMenu;

	@FindBy(xpath = "(//div[@class='products'])[2]")
	public static WebElement LMProfileSection;

	@FindBy(name = "firstname")
	public static WebElement LMRegisterFirstNameField;

	@FindBy(name = "lastname")
	public static WebElement LMRegisterLastNameField;

	@FindBy(name = "userid")
	public static WebElement LMRegisterUserIdField;

	@FindBy(name = "youremail")
	public static WebElement LMRegisterYourEmailField;

	@FindBy(name = "mobilenumber")
	public static WebElement LMRegisterMobileNumberField;

	@FindBy(name = "dateofbirth")
	public static WebElement LMRegisterDOBField;

	@FindBy(name = "password")
	public static WebElement LMRegisterPwdField;

	@FindBy(name = "iagree")
	public static WebElement LMIAgreeCheckbox;

	@FindBy(id = "register")
	public static WebElement LMRegisterFormButton;

	@FindBy(xpath = "//p[.='successfully Registered']")
	public static WebElement LmRegistrationSuccessMessage;

	@FindBy(xpath = "//button[.='GOTO LOGIN PAGE']")
	public static WebElement GotoLoginPageButton;


	@FindBy(xpath = "//img[@alt='logo']")
	public static WebElement LMLogo;

	@FindBy(xpath = "//a[.='Login']")
	public static WebElement LoginLink;

	@FindBy(xpath = "//span[.='Cart']")
	public static WebElement CartLabel;

	@FindBy(name = "Email")
	public static WebElement userNameField;

	@FindBy(name = "Password")
	public static WebElement passwordField;

	@FindBy(xpath = "(//span[.='Login']/../../../..//button)[1]")
	public static WebElement loginPopCloseButton;

	@FindBy(xpath = "(//a[.='VIEW ALL'])[1]")
	public static WebElement ViewAllButton;

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement SearchField;

	@FindBy(xpath = "//form[@action='/search']")
	public static WebElement searchForm;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement SearchSubmitButton;

	@FindBy(xpath = "//span[.='Filters']")
	public static WebElement filterLabel;

	@FindBy(xpath = "(//div[@class='MIXNux']/..//div[contains(text(),'REDMI')])[1]")
	public static WebElement FirstProductLink;

	@FindBy(xpath = "(//div[@class='MIXNux']/..//div[contains(text(),'REDMI')])[2]")
	public static WebElement SecondProductLink;

	@FindBy(xpath = "//div[.='Highlights']/..")
	public static WebElement ProductHighlights;

	@FindBy(xpath = "//div[@id='sellerName']//span//span")
	public static WebElement SellerLink;
	
	@FindBy(xpath = "(//div[.='About the Seller']/..//div)[5]")
	public static WebElement SellerNameOnPopup;
	
	@FindBy(xpath = "(//div[.='About the Seller']/..//div)[6]")
	public static WebElement SellerRatingOnPopup;
	
	
	@FindBy(id = "pincodeInputId")
	public static WebElement PincodeTextField;
	
	@FindBy(xpath = "//span[.='Check']")
	public static WebElement CheckButton;
	

	@FindBy(xpath = "//button//text()[.='ADD TO CART']/..")
	public static WebElement AddToCartButton;

	@FindBy(xpath = "//span[.='Cart']/..//div")
	public static WebElement CartCount;

	@FindBy(xpath = "(//div[.='Remove'])[last()]")
	public static WebElement RemoveButtonOnCart;

	@FindBy(xpath = "//div[.='Remove Item']/..//div[.='Remove']")
	public static WebElement RemoveButtonOnPopup;

	@FindBy(name = "q")
	public static WebElement googleSearchField;

	@FindBy(name = "btnK")
	public static WebElement googleSearchButton;

	public static void setProductname(String product) {
		productName = product;
	}

	public static String getProductName() {
		return productName;
	}
	
}
