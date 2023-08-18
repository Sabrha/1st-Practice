package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_TeachersPage_Locator extends RGPS_Base{
	
	public RGPS_TeachersPage_Locator(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath =  "//h1[text()='Our Teachers']")
	public WebElement VerifyTeacherspageappearafterclickingTeacherslink ;

}
