package Homework21;

import java.sql.Driver;
import java.time.Duration;

/*
 In the home page, validate the logo, the way I validated. Use click() method to click webeElement, create at least 5. Use @FindBy to find web Elelement. You can use at least one as HOW keyword. Use Thread.sleep() to know use of it. Use enabled and priority keyword in test method along with @Test. Push to the github and share the link below
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	WebDriver driver;
	public HomePage hPage;

	@BeforeTest()
	public void openingURL() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\faria\\eclipse-workspace\\gov.portal.cms\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://dor.georgia.gov/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Homework21.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	hPage=new HomePage(driver);
}
	@AfterTest
	public void quit() {
		driver.quit();
	}		
	



	}

}
