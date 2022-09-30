package homework21;

import org.testng.annotations.Test;

public class TestClass extends Baseclass{

	@Test(priority = 1, enabled = true)
	public void logoValidationOfDOR() throws InterruptedException {
		hPage.isLogoDisplayed();	
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void clickingSearchButtonTest() throws InterruptedException {
		hPage.clickingsearchButton();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void clickingSearchEditTest() throws InterruptedException {
		hPage.clickingsearchTaxes();
		Thread.sleep(3000);
	}

@Test(priority = 4)
public void clickingSearchTaxes() throws InterruptedException {
	hPage.searchMotor();
	Thread.sleep(3000);

}
@Test(priority = 5)
public void clickingSearchForms() {
 hPage.searchFrom();
	}

}

