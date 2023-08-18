package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_BlogPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_BlogPage_Action extends RGPS_Base {
	RGPS_BlogPage_Locator RRGPS_BlogPage_Locator = new RGPS_BlogPage_Locator();
	
		public void Verify_Blogpage_display() throws Exception 
	
		{
		boolean Blogpagedisplay = RRGPS_BlogPage_Locator.Blogpagedisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(Blogpagedisplay);
		}
		
		public void click_thedetails() throws Exception 
		
		{
			RRGPS_BlogPage_Locator.clickdetails.click();	
			Thread.sleep(0);
		}
		
		public void clickannual_details() throws Exception 
		
		{
			RRGPS_BlogPage_Locator.clickannualdetails.click();
			Thread.sleep(2000);
		}
		
		public void click_fieldtrip_details() throws Exception 
		
		{
			RRGPS_BlogPage_Locator.clickfieldtripdetails.click();
			Thread.sleep(2000);
		}
		
		public void clickFestivalCelebrations_details() throws Exception
		
		{
			RRGPS_BlogPage_Locator.clickFestivalCelebrationsdetails.click();
			Thread.sleep(2000);
		}
		
		public void clickScienceFair_details() throws Exception 
		
		{
			RRGPS_BlogPage_Locator.clickScienceFairdetails.click();
			Thread.sleep(2000);
		}
		

}
