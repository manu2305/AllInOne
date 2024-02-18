package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into Myntra page
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.myntra.com/");
	Actions actions = new Actions(driver);
	WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
	actions.moveToElement(men).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
