package blazedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import blaze_demo_utilities.ReadingTestdataFile;

public class negative_page {
	WebDriver driver;

	public negative_page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/a[3]")
	WebElement home_btn;

	@FindBy(how = How.NAME, using = "email")
	WebElement email_btn;
	
	@FindBy(how = How.NAME, using = "password")
	WebElement password_btn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement login_btn;

	public void negative_test_page(String email_id, String password) throws InterruptedException {

		
		home_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		email_btn.sendKeys(email_id);
		password_btn.sendKeys(password);
		login_btn.click();
		
		Thread.sleep(2000);
		
		

	}

}
