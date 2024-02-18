package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9XpathByAttribute {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the DWS page
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manikandan");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
