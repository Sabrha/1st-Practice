package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_SignupPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_SignupPage_Action extends RGPS_Base{
	RGPS_SignupPage_Locator RRGPS_SignupPage_Locator = new RGPS_SignupPage_Locator();
	
	
		public void signupdisplay() throws Exception
		{
		boolean SignupD = RRGPS_SignupPage_Locator.SignupDisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(SignupD);
		}
		
		public void Verifysignuppage_display() throws Exception 
		
		{
			boolean  Verifypagesignupdisplay = RRGPS_SignupPage_Locator.Verifysignuppagedisplay.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(Verifypagesignupdisplay);
		}
		
		public void VerifyNamefielddisplay_signuppage() throws Exception 
		
		{
			boolean VerifyNamefielddisplaySUp = RRGPS_SignupPage_Locator.VerifyNamefielddisplaysignuppage.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(VerifyNamefielddisplaySUp);
		}
		
		public void VerifyEmailfielddisplay_signuppage() throws Exception 
		
		{
			boolean VerifyEmailfielddisplaySUp = RRGPS_SignupPage_Locator.VerifyEmailfielddisplaysignuppage.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(VerifyEmailfielddisplaySUp);
		}
		
        public void VerifyPasswordfielddisplay_signuppage() throws Exception 
		
		{
			boolean VerifyPasswordfielddisplaySUp = RRGPS_SignupPage_Locator.VerifyPasswordfielddisplaysignuppage.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(VerifyPasswordfielddisplaySUp);
		}

        public void VerifySignUpfielddisplay_signuppage() throws Exception 
		
		{
			boolean VerifySignupfielddisplaySUp = RRGPS_SignupPage_Locator.VerifySignupfielddisplaysignuppage.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(VerifySignupfielddisplaySUp);
		}
	
		public void Verify_ChooseFilebuttonavailable_signuppage() throws Exception 
		
		{
			boolean VerifyChooseFileiinsignuppage = RRGPS_SignupPage_Locator.VerifyChooseFilebuttonisavailableinsignuppage.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(VerifyChooseFileiinsignuppage);
		}
		
		public void Verify_AlreadyhaveanaccountyetSignIn_isavailable() throws Exception 
		
		{
			boolean VerifyAlreadyhaveanaccountyetSignIn_A = RRGPS_SignupPage_Locator.VerifyAlreadyhaveanaccountyetSignIn.isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(VerifyAlreadyhaveanaccountyetSignIn_A);
		}
		
		public void click_SignIn_link() throws Exception
		
		{
			RRGPS_SignupPage_Locator.clickSigninlink.click();
			Thread.sleep(2000);
		}
	}


