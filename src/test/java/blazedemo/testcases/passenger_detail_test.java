package blazedemo.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import blaze_demo_utilities.BasePage;


import blazedemo.pages.negative_page;
import blazedemo.pages.passenger_detail_page;
import blaze_demo_utilities.ReadingTestdataFile;

public class passenger_detail_test extends BasePage {
	@Test
	public void negativepassenger_detail_test_test() throws InterruptedException {

		passenger_detail_page negative_test_test = PageFactory.initElements(driver, passenger_detail_page.class);
		
		negative_test_test.passenger_detail_page_test(ReadingTestdataFile.getProperty("name"),
				ReadingTestdataFile.getProperty("address"),
				ReadingTestdataFile.getProperty("city"),
				ReadingTestdataFile.getProperty("state"),
				ReadingTestdataFile.getProperty("zipcode"),
				ReadingTestdataFile.getProperty("creditcardnumber"),
				ReadingTestdataFile.getProperty("creditcardmonth"),
				ReadingTestdataFile.getProperty("ceditcardyear"),
				ReadingTestdataFile.getProperty("nameoncard"));

	}
}
