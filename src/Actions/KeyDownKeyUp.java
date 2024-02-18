package Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUp {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into the DWS
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Actions acts = new Actions(driver);
	acts.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	acts.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).build().perform();
	//acts.keyUp(Keys.PAGE_DOWN).build().perform();
}
}
