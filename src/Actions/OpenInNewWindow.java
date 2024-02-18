package Actions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNewWindow {
public static void main(String[] args) {
	String given_url="https://demowebshop.tricentis.com/books";
	//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into DWS page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String parent_handle = driver.getWindowHandle();
		System.out.println(parent_handle);
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		Actions acts = new Actions(driver);
		for (WebElement web : products) {
			acts.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
		}
		Set<String> child_handle = driver.getWindowHandles();
		for (String str : child_handle) {
			driver.switchTo().window(str);
			String current_url = driver.getCurrentUrl();
			if(given_url.equalsIgnoreCase(current_url)) {
				driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			}
		
		}		
				
}
}
