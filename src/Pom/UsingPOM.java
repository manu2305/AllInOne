package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingPOM {
	@Test
public void search() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	DWSHomePage action = new DWSHomePage(driver);
	
//	action.search_field.sendKeys("mobile");
//	action.search_button.click();
	action.searchField("mobile");
	action.searchButton();
}
}
