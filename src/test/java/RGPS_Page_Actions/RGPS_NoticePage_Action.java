package RGPS_Page_Actions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import RGPS_Page_Locators.RGPS_NoticePage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_NoticePage_Action extends RGPS_Base{
	
	RGPS_NoticePage_Locator RRGPS_NoticePage_Locator = new RGPS_NoticePage_Locator();
	
	public void VerifyNoticepageappear_whenclickNoticelink() throws Exception 
	
	{
		boolean noticepageappear_whenclicknoticelink = RRGPS_NoticePage_Locator.noticepageappear.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(noticepageappear_whenclicknoticelink);
	}
	
	public void Notice_Board_Display() throws Exception {
		boolean noticeBdisplay = RRGPS_NoticePage_Locator.noticeboardDisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(noticeBdisplay);
		
	}
	
	public void Title_Data_View_Display() throws Exception 
	
	{
		
		boolean Noticeboardtableheadingsdisplay = RRGPS_NoticePage_Locator.TitleDataView_Display.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(Noticeboardtableheadingsdisplay);
		
	}
	
	public void Click_View () throws Exception 
	
	{
		RRGPS_NoticePage_Locator.ClickView.click();
		Thread.sleep(2000);
	
    }

}
