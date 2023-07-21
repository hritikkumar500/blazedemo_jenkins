package blazedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import blaze_demo_utilities.ReadingTestdataFile;

public class choose_flight_page {
	WebDriver driver;

	public choose_flight_page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr[1]/td[1]/input")
	WebElement choose_this_flight_btn;

//	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/select[1]/option[4]")
//	WebElement portland_option;
//
//	@FindBy(how = How.NAME, using = "toPort")
//	WebElement destination_city;
//
//	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/select[2]/option[3]")
//	WebElement london_option;
//
//	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div/input")
//	public static WebElement findflight_btn;

	public void choose_flightpage() throws InterruptedException {

		
		choose_this_flight_btn.click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		
		Thread.sleep(4000);
		
		

	}

}
