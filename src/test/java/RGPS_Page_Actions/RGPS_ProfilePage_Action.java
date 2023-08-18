package RGPS_Page_Actions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_ProfilePage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_ProfilePage_Action extends RGPS_Base{
	
	RGPS_ProfilePage_Locator RRGPS_ProfilePage_Locator = new RGPS_ProfilePage_Locator();
	
	public void able_tosign() throws Exception 
	
	{
		boolean Ablesignin = RRGPS_ProfilePage_Locator.abletosignin.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(Ablesignin);
	}

}
