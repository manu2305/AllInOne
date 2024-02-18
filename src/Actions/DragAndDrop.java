package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	//open the browser
	ChromeDriver driver = new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into drag and drop demo page
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
	WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
//	new Actions(driver).dragAndDrop(source, target).build().perform();
	Actions acts = new Actions(driver);
	acts.clickAndHold(source).release(target).build().perform();
}
}
