package RGPS_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import RGPS_Utility.RGPS_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//public class RGPS_TestRunner {

	@CucumberOptions(features = {"src\\test\\resources\\RGPS_Features"},
			plugin = {"json:target/cucumber.json"},
			glue = "RGPS_StepDeff", tags = {"@Regression1,@Regression2,@Regression3,@Regression4,@Regression5"})

			public class RGPS_TestRunner extends AbstractTestNGCucumberTests {

						@BeforeTest
				public void RGPS_Starturl() {
				
					RGPS_Base starturl = new RGPS_Base();
					starturl.RGPS_Browser();
				}
					@AfterTest
					public void RGPS_Closeurl() {
						
						RGPS_Base Closeurl = new RGPS_Base();
						Closeurl.driver.quit();												
					}
				}