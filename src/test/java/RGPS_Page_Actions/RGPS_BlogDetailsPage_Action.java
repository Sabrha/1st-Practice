package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_BlogDetailsPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_BlogDetailsPage_Action extends RGPS_Base{
	
	RGPS_BlogDetailsPage_Locator RRGPS_BlogDetailsPage_Locator = new RGPS_BlogDetailsPage_Locator();
	
	public void BlogNoticedetailsdisplay_Grandpartents() throws Exception
	
	{
		boolean BlogGpdetailsdisplay = RRGPS_BlogDetailsPage_Locator.BlogdetailsdisplayGp.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(BlogGpdetailsdisplay);
	}
	
	public void Verifyblogdetailsdisplay_AnnualDay() throws Exception 
	
	{ 
	    boolean verifyannualdaydisplay = RRGPS_BlogDetailsPage_Locator.Verifyannualdetailsdisplay.isDisplayed();
	    Thread.sleep(2000);
	    Assert.assertTrue(verifyannualdaydisplay);
	    
	}
	
	public void VerifyBlogNoticedisplay_FieldTrip() throws Exception 
	
	{
		boolean VerifyFieldTripdisplay = RRGPS_BlogDetailsPage_Locator.VerifyFieldTripdetailsdisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyFieldTripdisplay);
	}
	
	public void VerifyBlogNoticedetailsdisplay_Festival() throws Exception
	
	{
		boolean VerifyFestivaldisplay = RRGPS_BlogDetailsPage_Locator.VerifyFestivaldetailsdisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyFestivaldisplay);
	}
	
	public void VerifyBlogNoticedetailsdisplay_ScienceFair() throws Exception 
	
	{
		boolean VerifyScienceFairdisplay = RRGPS_BlogDetailsPage_Locator.VerifyScienceFairdetailsdisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyScienceFairdisplay);
	}
	
}






