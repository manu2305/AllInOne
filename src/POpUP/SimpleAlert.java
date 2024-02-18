package POpUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().alert().accept();
}
}
