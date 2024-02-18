package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9AbsoluteXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	WebElement register = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a"));
	Thread.sleep(2000);
	register.click();
	Thread.sleep(2000);
	driver.close();
}
}
