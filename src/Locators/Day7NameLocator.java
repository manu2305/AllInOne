package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7NameLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.name("q")).sendKeys("anything");
	Thread.sleep(2000);
	driver.findElement(By.id("small-searchterms")).sendKeys("books");
	Thread.sleep(2000);
	driver.close();
}
}
