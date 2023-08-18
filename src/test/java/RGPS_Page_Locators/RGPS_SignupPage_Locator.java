package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_SignupPage_Locator extends RGPS_Base{
	
	public RGPS_SignupPage_Locator() {
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath = "//a[text()='Sign up']")
	public WebElement clicksignup;
	
	@FindBy(xpath = "//h1[text()='Signup']")
	public WebElement SignupDisplay;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	public WebElement Verifysignuppagedisplay;
	
	@FindBy(id  = "name")
	public WebElement VerifyNamefielddisplaysignuppage;
	
	@FindBy(id  = "email")
	public WebElement VerifyEmailfielddisplaysignuppage;
	
	@FindBy(id  = "password")
	public WebElement VerifyPasswordfielddisplaysignuppage;
	
	@FindBy(xpath  = "//button[text()='Sign Up']")
	public WebElement VerifySignupfielddisplaysignuppage;
	
	@FindBy(id  = "image")
	public WebElement VerifyChooseFilebuttonisavailableinsignuppage;
	
	@FindBy(xpath  = "/html/body/div/div[2]/div[3]/div/p")
	public WebElement VerifyAlreadyhaveanaccountyetSignIn;
	
	@FindBy(xpath  = "//a[text()='Sign In']")
	public WebElement clickSigninlink;
}
