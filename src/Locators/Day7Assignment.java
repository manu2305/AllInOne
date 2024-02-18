package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7Assignment {
public static void main(String[] args) throws InterruptedException {
	String given_url="https://demowebshop.tricentis.com/";
	String given_registerTitle="Demo Web Shop. Register";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("welcome to DemoWebShop");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		String current_registerTitle = driver.getTitle();
		if(given_registerTitle.contains(current_registerTitle)) {
			System.out.println("you are in Register page");
			driver.findElement(By.name("Gender")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("FirstName")).sendKeys("manikandan");
			Thread.sleep(2000);
			driver.findElement(By.id("LastName")).sendKeys("j");
			Thread.sleep(2000);
			driver.findElement(By.name("Email")).sendKeys("jmani@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("jmani2305");
			Thread.sleep(2000);
			driver.findElement(By.name("ConfirmPassword")).sendKeys("jmani2305");
			Thread.sleep(2000);
			driver.findElement(By.id("register-button")).click();
			Thread.sleep(2000);
			System.out.println("your script is Successfull.....");
			Thread.sleep(2000);
			driver.close();
		}
		else {
			System.out.println("you are not in register page");
			driver.close();
		}
	}
	else {
		System.out.println("entering into DemoWebShop is unSuccessfull");
		driver.close();
	}
}
}
