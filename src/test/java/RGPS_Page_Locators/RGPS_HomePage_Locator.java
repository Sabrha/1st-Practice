package RGPS_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RGPS_Utility.RGPS_Base;

public class RGPS_HomePage_Locator extends RGPS_Base{
	
	public RGPS_HomePage_Locator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath =  "//button[text()='LogIn']")
	public WebElement LoginButton;
	
	@FindBy(xpath =  "/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/a")
	public WebElement mousehover;
	
	@FindBy(xpath =  "/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/ul")
	public WebElement OptionlinkDisplay;
	
	@FindBy(xpath =  "/html/body/div/div[2]/div[2]/div/div[2]/ul/li[4]/a")
	public WebElement Clicknoticelink;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/ul/li[5]")
	public WebElement clickBlogLink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/ul/li[2]/ul/li[1]/a")
	public WebElement clickexaminationlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/ul/li[2]/ul/li[2]/a")
	public WebElement clicklibrarylink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/ul/li[2]/ul/li[3]/a")
	public WebElement clickStudentSupportlink;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/ul/li[4]/a")
	public WebElement clickTeacherslink;
}









