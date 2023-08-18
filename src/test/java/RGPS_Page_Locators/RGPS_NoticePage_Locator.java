package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_NoticePage_Locator extends RGPS_Base {
	
	public RGPS_NoticePage_Locator() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[3]/div[1]")
	public WebElement noticepageappear;
	
	@FindBy(xpath = "//h1[text()='Notice Board']")
	public WebElement noticeboardDisplay;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[2]/div/table/thead/tr/th[1]")
	public WebElement TitleDataView_Display;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/a/td")
	public WebElement ClickView;

}
