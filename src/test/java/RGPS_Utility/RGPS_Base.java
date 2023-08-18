package RGPS_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class RGPS_Base {
	
	public static WebDriver driver;
	public static Properties QPro;

	public RGPS_Base () {   
		try {
			FileInputStream Q_file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\RGPS_Configuration\\RGPS_Config.Properties");
			QPro = new Properties();
			QPro.load(Q_file);			
		} catch (FileNotFoundException e) {
			System.out.println("Please check the Constructor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
				
	public void RGPS_Browser() {   
		
		String RGPSBrowser = QPro.getProperty("Browser1");
		
		if(RGPSBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Chrome_Driver\\chromedriver.exe");		
			ChromeOptions Chromeco = new ChromeOptions();
			Chromeco.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();  		
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(RGPS_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(RGPS_Utility.implicitlyWait));
			driver.manage().window().maximize();
			
		}
		
		else if(RGPSBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.Edge.driver", System.getProperty("user.dir")+ "\\Edge_Driver\\msedgedriver.exe");		
			EdgeOptions Edgeco = new EdgeOptions();
			Edgeco.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();  		
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			//driver.switchTo().alert().accept();
		}
	}
	
	public static void RGPSLaunchingURL(String URL) {   // Putting URL in Browser
		
		RGPS_Utility.takeMyScreenshot(driver, "HomePage");
		
		driver.get(QPro.getProperty("RGPS_URL"));
		
	}
}


