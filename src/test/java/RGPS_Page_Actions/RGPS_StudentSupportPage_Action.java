package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_StudentSupportPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_StudentSupportPage_Action extends RGPS_Base {
	RGPS_StudentSupportPage_Locator RRGPS_StudentSupportPage_Locator = new RGPS_StudentSupportPage_Locator();
	
	public void VerifyStudentSupportpageappear_afterclickingStudentSupportlink() throws Exception
	
	{
		boolean VerifyStudentSupportpageappear = RRGPS_StudentSupportPage_Locator.VerifyafterclickingStudentSupportlinkStudentSupportpageappear.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyStudentSupportpageappear);
		
	}

}
