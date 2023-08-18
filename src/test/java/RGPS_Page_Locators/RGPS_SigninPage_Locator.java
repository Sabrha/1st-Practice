package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_SigninPage_Locator extends RGPS_Base {
	
	public RGPS_SigninPage_Locator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[text()='Sign in']")
	public WebElement signindisplay;
	
	@FindBy(id = "email")
	public WebElement EFieldsDisplay;
	
	@FindBy(id = "password")
	public WebElement PFieldsDisplay;
	
	@FindBy(xpath =  "//button[text()='Forgot password?']")
	public WebElement ForgotPWDisplay;
	
	@FindBy(xpath =  "//a[text()='Sign up']")
	public WebElement SignupDisplay;
	
	@FindBy(id = "email")
	public WebElement EmailAddress;

	@FindBy(id = "password")
	public WebElement Password;
	
	@FindBy(xpath  = "//button[text()='Sign In']")
	public WebElement SigninButton;	
	
	@FindBy(xpath  = "//p[text()='Sign in to access your account']")
	public WebElement Signinappearwhenclicksigninlink;	
	
	@FindBy(xpath  = "//h1[text()='Sign in']")
	public WebElement VerifySigninpageappearafterclickExaminationlink ;	
}
