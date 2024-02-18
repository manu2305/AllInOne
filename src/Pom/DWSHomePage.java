package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {
	DWSHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="small-searchterms")
	WebElement search_field;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement search_button;
	
	public void searchField(String value) {
		search_field.sendKeys(value);
	}
	public void searchButton() {
		search_button.click();
	}
	
	
}
