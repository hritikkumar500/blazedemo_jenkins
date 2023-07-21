package blazedemo.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import blaze_demo_utilities.BasePage;

import blazedemo.pages.firstpage__Page;
//import flipkart_project.pages.appliancesBtn__Page;
//import flipkart_project.utilities.BasePage;

public class firstpage__Test extends BasePage {
	@Test
	public void appliancesTest() throws InterruptedException {

		firstpage__Page appliances = PageFactory.initElements(driver, firstpage__Page.class);
		appliances.appliancesPage();
//		appliancesBtn__Page.gotoHomePage_btn.click();
//		test.log(LogStatus.PASS, "Appliances buton tested");
		Thread.sleep(3000);
	}
}
