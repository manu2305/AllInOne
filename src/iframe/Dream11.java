package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/");
	WebElement controller = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
	driver.switchTo().frame(controller);
	driver.findElement(By.id("regEmail")).sendKeys("7358001000");
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//div[@id='hamburger']")).click();
	
}
}
