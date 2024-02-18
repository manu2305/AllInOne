package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
public static void main(String[] args) {
	//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into drag and drop demo page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search_field = driver.findElement(By.xpath("//input[@name='q']"));
		Actions acts = new Actions(driver);
		acts.moveToElement(search_field).click().sendKeys("manikanda").build().perform();
}
}
