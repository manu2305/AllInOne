package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10IsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into DWS page
	driver.get("https://demowebshop.tricentis.com/");	
	WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
	if(register.isDisplayed()) {
		System.out.println("register link is present");
		register.click();
		WebElement male_ratio_button = driver.findElement(By.id("gender-male"));
		male_ratio_button.click();
		if(male_ratio_button.isSelected()) {
			System.out.println("radio button is clicked");
			WebElement firstName = driver.findElement(By.id("FirstName"));
			if(firstName.isEnabled()) {
				System.out.println(" First Name TextField is Enabled");
			firstName.sendKeys("manikandan");
			}
			else {
				System.out.println("First Name TextField is Not Enabled");
			}
		}
		else
			System.out.println("radio button is not clicked ");
	}
	else {
		System.out.println("register link is not present");
		driver.close();
	}
}
}
