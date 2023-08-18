package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_BlogPage_Locator extends RGPS_Base{
	
	
	public RGPS_BlogPage_Locator() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[1]/div/div/button")
	public WebElement  Blogpagedisplay;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[1]/div/div/button")
	public WebElement  clickdetails;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div/div/button/a")
	public WebElement  clickannualdetails;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[3]/div/div/button/a")
	public WebElement clickfieldtripdetails;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[4]/div/div/button/a")
	public WebElement clickFestivalCelebrationsdetails;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[6]/div/div/button")
	public WebElement clickScienceFairdetails;
}
