package blazedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import blaze_demo_utilities.ReadingTestdataFile;

public class passenger_detail_page {
	WebDriver driver;

	public passenger_detail_page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "inputName")
	WebElement name_btn;

	@FindBy(how = How.NAME, using = "address")
	WebElement address_btn;
	
	@FindBy(how = How.NAME, using = "city")
	WebElement city_btn;
	
	@FindBy(how = How.NAME, using = "state")
	WebElement state_btn;
	
	@FindBy(how = How.NAME, using = "zipCode")
	WebElement zipcode_btn;
	
	@FindBy(how = How.NAME, using = "creditCardNumber")
	WebElement creditcardnumber_btn;
	
	@FindBy(how = How.NAME, using = "creditCardMonth")
	WebElement ceditcardmonth_btn;
	
	@FindBy(how = How.NAME, using = "creditCardYear")
	WebElement creditcardyear_btn;
	
	@FindBy(how = How.NAME, using = "nameOnCard")
	WebElement nameoncard_btn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[11]/div/input")
	WebElement purchase_flight_btn;

	public void passenger_detail_page_test(String name, String address, String city, String state, String zipcode,String creditcardnumber, String 
			creditcardmonth, String ceditcardyear, String nameoncard) throws InterruptedException {

		
		//home_btn.click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		name_btn.sendKeys(name);
		address_btn.sendKeys(address);
		city_btn.sendKeys(city);
		state_btn.sendKeys(state);
		zipcode_btn.sendKeys(zipcode);
		creditcardnumber_btn.sendKeys(creditcardnumber);
		ceditcardmonth_btn.sendKeys(creditcardmonth);
		creditcardyear_btn.sendKeys(ceditcardyear);
		nameoncard_btn.sendKeys(nameoncard);
		
		purchase_flight_btn.click();
		Thread.sleep(4000);
		
		

	}

}
