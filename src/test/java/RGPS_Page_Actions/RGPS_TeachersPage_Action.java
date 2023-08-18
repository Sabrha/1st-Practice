package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_TeachersPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_TeachersPage_Action extends RGPS_Base{
	RGPS_TeachersPage_Locator RRGPS_TeachersPage_Locator = new RGPS_TeachersPage_Locator();
	
	public void VerifyTeacherspageappear_afterclickingTeacherslink() throws Exception
	
	{
		boolean VerifyTeacherspageappear = RRGPS_TeachersPage_Locator.VerifyTeacherspageappearafterclickingTeacherslink.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyTeacherspageappear);
	}

}
