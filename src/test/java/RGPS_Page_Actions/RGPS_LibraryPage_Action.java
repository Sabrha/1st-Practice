package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_LibraryPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_LibraryPage_Action extends RGPS_Base{
	RGPS_LibraryPage_Locator RRGPS_LibraryPage_Locator = new RGPS_LibraryPage_Locator();
	
	public void VerifyLabrarypageappear_afterclickingLibrarylink() throws Exception
	
	{
		boolean VerifyLabrarypageappear = RRGPS_LibraryPage_Locator.VerifyLabrarypageappearafterclickingLibrarylink.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyLabrarypageappear);
	}

}
