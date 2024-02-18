package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	//open the browser
			WebDriver driver=new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//enter into Myntra page
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Actions actions = new Actions(driver);
			WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
			//actions.moveToElement(right_click).contextClick().build().perform();
			actions.contextClick(right_click).build().perform();
			WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
			if(edit.isDisplayed()) {
				System.out.println("script is Successfull");
			}
			else
				System.out.println("script is unsuccessfull");
}
}
