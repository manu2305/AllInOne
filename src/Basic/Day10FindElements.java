package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10FindElements {
public static void main(String[] args) throws InterruptedException {
	//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
	    List<WebElement> community_pool = driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
	    for (WebElement web : community_pool) {
			web.click();
			Thread.sleep(1000);
		}
	    Thread.sleep(2000);
	    driver.close();
}
}
