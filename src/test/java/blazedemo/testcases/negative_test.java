package blazedemo.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import blaze_demo_utilities.BasePage;


import blazedemo.pages.negative_page;
//import flipkart_project.pages.appliancesBtn__Page;
//import flipkart_project.utilities.BasePage;

import blaze_demo_utilities.ReadingTestdataFile;

public class negative_test extends BasePage {
	@Test
	public void negative_test_test() throws InterruptedException {

		negative_page negative_test_test = PageFactory.initElements(driver, negative_page.class);
		
		negative_test_test.negative_test_page(ReadingTestdataFile.getProperty("email_id"),
				ReadingTestdataFile.getProperty("password"));

	}
}
