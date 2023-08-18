package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_NoticeBoardDetailsPage_Locator extends RGPS_Base {
	
	
	
	public RGPS_NoticeBoardDetailsPage_Locator() 
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Eid Vacation']" )
	public WebElement noticeboarddetailsdisplay ;

}
