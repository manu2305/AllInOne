package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8CssSelector {
public static void main(String[] args) {
	String given_url="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("you are in DWS page");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobile");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("your script is successfull");
		driver.close();
	}
	else {
		System.out.println("check the Url");
		driver.close();
	}
	
}
}
