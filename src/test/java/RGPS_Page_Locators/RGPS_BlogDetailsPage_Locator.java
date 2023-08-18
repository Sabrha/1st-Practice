package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_BlogDetailsPage_Locator extends RGPS_Base {
	
	
	public RGPS_BlogDetailsPage_Locator() 
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[text()='Grandparents Day Celebration']")
	public WebElement  BlogdetailsdisplayGp;

	@FindBy(xpath = "//h1[text()='Annual Day Function']")
	public WebElement  Verifyannualdetailsdisplay;
	
	@FindBy(xpath = "//h1[text()='Field Trip to the Local Zoo']")
	public WebElement  VerifyFieldTripdetailsdisplay;
	
	@FindBy(xpath = "//h1[text()='Festival Celebrations at Play Group School']")
	public WebElement  VerifyFestivaldetailsdisplay;
	
	@FindBy(xpath = "//h1[text()='Science Fair for Play Group Students']")
	public WebElement  VerifyScienceFairdetailsdisplay;
	
}
