package RGPS_Page_Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import RGPS_Page_Locators.RGPS_HomePage_Locator;
import RGPS_Utility.RGPS_Base;

public class RGPS_HomePage_Action extends RGPS_Base{
	
	RGPS_HomePage_Locator RRGPS_HomePage_Locator = new RGPS_HomePage_Locator();
	
	public void Login_button() throws Exception {
		RRGPS_HomePage_Locator.LoginButton.click();
		Thread.sleep(2000);
	}
	
	public void mouse_hover() throws Exception {
		
		RRGPS_HomePage_Locator.mousehover.isEnabled();
		Actions action = new Actions(driver);
		WebElement web = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/a"));
		action.moveToElement(web).build().perform();
		Thread.sleep(2000);
	}
	
	public void Option_Page_Display() throws Exception{	
		boolean optiondisplay = RRGPS_HomePage_Locator.OptionlinkDisplay.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(optiondisplay);
		
	}
	
	public void Click_Notice_Link() throws Exception {
		RRGPS_HomePage_Locator.Clicknoticelink.click();
		Thread.sleep(2000);
			
	}
	
	public void Click_Blog_Link() throws Exception {
		RRGPS_HomePage_Locator.clickBlogLink.click();
		Thread.sleep(2000);
	}
	
	public void clickexamination_link() throws Exception {
		RRGPS_HomePage_Locator.clickexaminationlink.click();
		Thread.sleep(2000);
	}
	
	public void click_Librarylink() throws Exception {
		RRGPS_HomePage_Locator.clicklibrarylink.click();
		Thread.sleep(2000);
	}
	
	public void click_StudentSupportlink() throws Exception {
		RRGPS_HomePage_Locator.clickStudentSupportlink.click();
		Thread.sleep(2000);
	}
	
	public void click_Teacherslink() throws Exception {
		RRGPS_HomePage_Locator.clickTeacherslink.click();
		Thread.sleep(2000);
	}
			
}










