package POpUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopUp {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions ch_options=new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ch_options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/");
	driver.findElement(By.id("ddate")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("10/02/2024")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("rdatelbl")).click();
	Thread.sleep(2000);
	WebElement next_month = driver.findElement(By.xpath("(//div[@class='month3'])[2]"));
	Boolean flag=true;
	for (;; ) {
	try {
		next_month = driver.findElement(By.xpath("(//div[@class='month3'])[2]"));
	driver.findElement(By.xpath("//li[@id='frth_1_20/05/2024']")).click();
	break;
	}
	catch (Exception e) {
		next_month.click();
	}
	}
}
}
