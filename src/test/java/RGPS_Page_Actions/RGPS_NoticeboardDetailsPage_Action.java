package RGPS_Page_Actions;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_NoticeBoardDetailsPage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_NoticeboardDetailsPage_Action extends RGPS_Base{
	
	RGPS_NoticeBoardDetailsPage_Locator RRGPS_NoticeBoardDetailsPage_Locator = new RGPS_NoticeBoardDetailsPage_Locator();
	
	
	public void Verify_noticeboard_detailsdisplay() throws Exception {
		
		boolean noticedetaildisplay = RRGPS_NoticeBoardDetailsPage_Locator.noticeboarddetailsdisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(noticedetaildisplay);
	}

}
