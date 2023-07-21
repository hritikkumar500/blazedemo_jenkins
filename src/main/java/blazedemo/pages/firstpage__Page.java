package blazedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import blaze_demo_utilities.ReadingTestdataFile;

public class firstpage__Page {
	WebDriver driver;

	public firstpage__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "fromPort")
	WebElement departure_city;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/select[1]/option[4]")
	WebElement portland_option;

	@FindBy(how = How.NAME, using = "toPort")
	WebElement destination_city;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/select[2]/option[3]")
	WebElement london_option;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div/input")
	public static WebElement findflight_btn;

	public void appliancesPage() throws InterruptedException {

		
		departure_city.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("blazedemoPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("blazedemoPageTitle"));
		portland_option.click();
		destination_city.click();
		london_option.click();
		findflight_btn.click();
		
		
		

	}

}
