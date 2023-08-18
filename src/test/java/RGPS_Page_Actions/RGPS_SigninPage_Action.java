package RGPS_Page_Actions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_SigninPage_Locator;
import RGPS_Page_Locators.RGPS_SignupPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_SigninPage_Action extends RGPS_Base{
	RGPS_SigninPage_Locator RRGPS_SigninPage_Locator = new RGPS_SigninPage_Locator();
	RGPS_SignupPage_Locator RRGPS_SignupPage_Locator = new RGPS_SignupPage_Locator();
	
public void Signin_display() throws Exception {
		
		boolean sign = RRGPS_SigninPage_Locator.signindisplay.isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(sign);
	}

	public void Signup_display() throws Exception {
		
		boolean sign = RRGPS_SigninPage_Locator.SignupDisplay.isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(sign);
	}
	
	public void Fieldsdisplay() throws Exception {
		
		boolean EField = RRGPS_SigninPage_Locator.EFieldsDisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(EField);
		
		boolean PField = RRGPS_SigninPage_Locator.PFieldsDisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(PField);
	}
	
  public void Signupclick () throws Exception {
		
		RRGPS_SignupPage_Locator.clicksignup.click();
		Thread.sleep(2000);
    }
	public void forgetpassword() throws Exception{
		
		boolean PwDisplay = RRGPS_SigninPage_Locator.ForgotPWDisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(PwDisplay);
	}
	
		
	public void enteremailpassword() throws Exception {
		
		RRGPS_SigninPage_Locator.EmailAddress.sendKeys("uthso123@gmail.com ");
		RRGPS_SigninPage_Locator.Password.sendKeys("uthso123");
		Thread.sleep(2000);
	}
	public void signin_button() throws Exception {
		
		RRGPS_SigninPage_Locator.SigninButton.click();
		Thread.sleep(2000);
	}
	
	public void Verify_Signinpageappearwhenclick_SignInlink() throws Exception
	
	{
		boolean Signinappear_whenclicksigninlink  = RRGPS_SigninPage_Locator.Signinappearwhenclicksigninlink.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(Signinappear_whenclicksigninlink);
	}
	
	public void Verify_Signinpageappearafterclick_Examinationlink() throws Exception
	
	{
		boolean VerifySigninpageafterclickExaminationlink = RRGPS_SigninPage_Locator.VerifySigninpageappearafterclickExaminationlink.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifySigninpageafterclickExaminationlink);
		
	}
		
	}

