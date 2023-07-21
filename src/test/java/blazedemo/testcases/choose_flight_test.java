package blazedemo.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import blaze_demo_utilities.BasePage;
import blazedemo.pages.choose_flight_page;
import blazedemo.pages.firstpage__Page;
//import flipkart_project.pages.appliancesBtn__Page;
//import flipkart_project.utilities.BasePage;

public class choose_flight_test extends BasePage {
	@Test
	public void chooseFlightTest() throws InterruptedException {

		choose_flight_page chooseFlightTest = PageFactory.initElements(driver, choose_flight_page.class);
		chooseFlightTest.choose_flightpage();
//		appliancesBtn__Page.gotoHomePage_btn.click();
//		test.log(LogStatus.PASS, "Appliances buton tested");
//		Thread.sleep(4000);
	}
}
