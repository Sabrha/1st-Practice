package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_LibraryPage_Locator extends RGPS_Base{
	
	public RGPS_LibraryPage_Locator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[1]")
	public WebElement VerifyLabrarypageappearafterclickingLibrarylink ;

}
