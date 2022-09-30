package Homework21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

@FindBy(xpath = "//a[@class='header-branding-lockup__link']") WebElement logo;

@FindBy(xpath = "//span[text()='Search']")WebElement searchButton;
@FindBy(xpath = "//header/div[5]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]")WebElement searchTaxes;
@FindBy(xpath = "//span[contains(text(),'Motor Vehicles')]")WebElement searchMotor;
@FindBy(xpath = "//span[contains(text(),'Forms')]")WebElement searchForm;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public boolean isLogoDisplayed() {
	boolean validation=logo.isDisplayed();
	System.out.println("Is logo displayed: "+validation);
	return validation;
	}
	
	public void clickingsearchButton() {
	searchButton.click();
	}
	public void clickingsearchTaxes() {
	searchTaxes.click();
	}
			
	public void searchMotor() {
	searchMotor.click();
	}
	
	public void searchFrom() {
	searchForm.click();
	}
	 
	
		
	}
		
	
	
		
		
	


			
	
	



}
