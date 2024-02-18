package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7ClassName {
public static void main(String[] args) throws InterruptedException {
	String given_DwsUrl="https://demowebshop.tricentis.com/";
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the DemoWebShop page
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	//get the Current Url of the Page
	String current_DwsUrl = driver.getCurrentUrl();
	Thread.sleep(2000);
	if(given_DwsUrl.equals(current_DwsUrl)) {
		System.out.println("you are in DemoWebShop Page");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		System.out.println("your script is Successfull");
	}
	else {
		System.out.println("You are not in DemoWebShop page");
		driver.close();
	}
}
}
